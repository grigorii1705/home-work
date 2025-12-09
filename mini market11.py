#Меню с вложенными уровнями
# --- ГЛОБАЛЬНЫЕ ПЕРЕМЕННЫЕ ---

products = {
    "яблоко": {"цена": 3, "категория": "фрукты"},
    "банан": {"цена": 5, "категория": "фрукты"},
    "молоко": {"цена": 12, "категория": "молочные продукты"},
    "хлеб": {"цена": 8, "категория": "выпечка"},
    "сыр": {"цена": 20, "категория": "молочные продукты"},
    "апельсин": {"цена": 4, "категория": "фрукты"}
}

cart = []
promo_codes = {
    "sale10": {"type": "percent", "value": 10},
    "student": {"type": "percent", "value": 15}
}
current_discount_percent = 0.0
VAT_RATE = 17.0
purchase_history = []
ADMIN_CREDENTIALS = {
    "login": "admin",
    "password": "123"
}

# --- ОСНОВНЫЕ ФУНКЦИИ МАГАЗИНА (CRUD, логика) ---
# (show_products, add_to_cart, show_cart, remove_from_cart, edit_cart_item, checkout, 
# apply_promo_code, create_product, change_product_price, delete_product, 
# find_products_by_name, sort_products, view_history, admin_login)
# Код этих функций остается точно таким же, как в предыдущем ответе,
# поэтому я опускаю его здесь для краткости, чтобы показать только новую структуру меню.


def show_products(sorted_items=None):
    """Вывести список товаров магазина, с категорией."""
    print("\n--- Товары в магазине ---")
    if sorted_items is None:
        items_to_display = sorted(products.items())
    else:
        items_to_display = sorted_items
    if not items_to_display:
        print("В магазине пока нет товаров.")
        return
    for name, details in items_to_display:
        print(f"{name.capitalize()} — {details['цена']}₪ (Категория: {details['категория']})")
    print()

def add_to_cart():
    """Добавить товар в корзину."""
    show_products()
    item = input("Введите название товара: ").lower()
    if item not in products:
        print("Такого товара нет!")
        return
    try:
        qty = int(input("Количество: "))
        if qty <= 0:
            print("Количество должно быть положительным.")
            return
    except ValueError:
        print("Введите число!")
        return
    for cart_item in cart:
        if cart_item["товар"] == item:
            cart_item["кол-во"] += qty
            print(f"Количество '{item}' обновлено в корзине.")
            return
    cart.append({"товар": item, "кол-во": qty, "цена": products[item]['цена']})
    print(f"{item} добавлен в корзину.")

def show_cart():
    """Показать корзину с учетом скидок и НДС."""
    if not cart:
        print("\nКорзина пуста.\n")
        return
    print("\n--- Корзина ---")
    subtotal = 0
    for c in cart:
        cost = c["кол-во"] * c["цена"]
        subtotal += cost
        print(f"{c['товар']} x {c['кол-во']} = {cost}₪")
    print(f"Итого без скидки/налогов: {subtotal:.2f}₪")
    discount_amount = 0
    if current_discount_percent > 0:
        discount_amount = subtotal * (current_discount_percent / 100)
        print(f"Скидка ({current_discount_percent}%): -{discount_amount:.2f}₪")
    subtotal_after_discount = subtotal - discount_amount
    vat_amount = subtotal_after_discount * (VAT_RATE / 100)
    final_total = subtotal_after_discount + vat_amount
    print(f"Итого без НДС: {subtotal_after_discount:.2f}₪")
    print(f"НДС ({VAT_RATE:.1f}%): +{vat_amount:.2f}₪")
    print(f"Итоговая сумма (с НДС): {final_total:.2f}₪\n")

def remove_from_cart():
    """Удалить товар по названию из корзины."""
    if not cart:
        print("Корзина пуста.")
        return
    show_cart()
    name = input("Введите название товара для удаления из корзины: ").lower()
    for c in cart:
        if c["товар"] == name:
            cart.remove(c)
            print(f"{name} удалён из корзины.")
            return
    print("Такого товара в корзине нет.")

def edit_cart_item():
    """Изменить количество существующего товара в корзине."""
    if not cart:
        print("\nКорзина пуста.")
        return
    show_cart()
    name = input("Введите название товара в корзине, количество которого хотите изменить: ").lower()
    found_item = None
    for item in cart:
        if item["товар"] == name:
            found_item = item
            break
    if not found_item:
        print(f"Товар '{name}' не найден в корзине.")
        return
    print(f"\nТекущее количество '{name}': {found_item['кол-во']}")
    print("Выберите действие:")
    print("1. Увеличить количество")
    print("2. Уменьшить количество")
    print("3. Заменить количество на новое число")
    print("4. Отмена")
    choice = input("Ваш выбор: ")
    if choice == "4":
        print("Действие отменено.")
        return
    try:
        if choice in ["1", "2", "3"]:
            qty_input = int(input("Введите число: "))
            if qty_input <= 0:
                print("Количество должно быть положительным числом.")
                return
        else:
            print("Неверный выбор действия.")
            return
        if choice == "1":
            found_item["кол-во"] += qty_input
            print(f"Количество '{name}' увеличено до {found_item['кол-во']}.")
        elif choice == "2":
            if found_item["кол-во"] <= qty_input:
                print(f"Количество '{name}' стало бы <= 0. Товар удален из корзины.")
                cart.remove(found_item)
            else:
                found_item["кол-во"] -= qty_input
                print(f"Количество '{name}' уменьшено до {found_item['кол-во']}.")
        elif choice == "3":
            found_item["кол-во"] = qty_input
            print(f"Количество '{name}' заменено на {found_item['кол-во']}.")
    except ValueError:
        print("Ошибка ввода. Введите целое число!")

def checkout():
    """Оплатить покупку с учетом скидок и НДС и сохранить в историю."""
    global current_discount_percent, purchase_history
    if not cart:
        print("Корзина пуста, нечего оплачивать!")
        return

    subtotal = sum(c["кол-во"] * c["цена"] for c in cart)
    discount_amount = 0
    if current_discount_percent > 0:
        discount_amount = subtotal * (current_discount_percent / 100)
    subtotal_after_discount = subtotal - discount_amount
    vat_amount = subtotal_after_discount * (VAT_RATE / 100)
    final_total = subtotal_after_discount + vat_amount
    
    import copy
    purchase_record = {
        "final_total": round(final_total, 2),
        "items": copy.deepcopy(cart), 
        "discount_applied": current_discount_percent,
        "vat_rate": VAT_RATE
    }
    purchase_history.append(purchase_record)
    
    print(f"\nСумма к оплате (с НДС {VAT_RATE:.1f}%): {final_total:.2f}₪")
    print("Спасибо за покупку!")
    cart.clear()
    current_discount_percent = 0.0

def apply_promo_code():
    """Применить промокод к корзине."""
    global current_discount_percent
    if not cart:
        print("Корзина пуста, промокод применить нельзя.")
        return
    if current_discount_percent > 0:
        print(f"Скидка {current_discount_percent}% уже активна. Сначала оплатите предыдущую покупку или выйдите в меню.")
        return
    code = input("Введите промокод: ").lower()
    if code in promo_codes:
        promo_details = promo_codes[code]
        if promo_details["type"] == "percent":
            current_discount_percent = promo_details["value"]
            print(f"Промокод '{code}' активирован! Скидка {current_discount_percent}% применена.")
    else:
        print("Неверный или неактивный промокод.")

def create_product():
    """Создать новый товар."""
    print("\n--- Создание нового товара ---")
    name = input("Введите название товара: ").lower()
    if name in products:
        print(f"Товар '{name}' уже существует!")
        return
    try:
        price = int(input("Введите цену (число): "))
        if price <= 0:
            print("Цена должна быть положительной.")
            return
    except ValueError:
        print("Неверный ввод цены. Введите число!")
        return
    category = input("Введите категорию товара: ").lower()
    products[name] = {"цена": price, "категория": category}
    print(f"Товар '{name}' успешно добавлен!")

def change_product_price():
    """Изменить цену существующего товара."""
    show_products()
    name = input("Введите название товара, цену которого хотите изменить: ").lower()
    if name not in products:
        print("Такого товара нет!")
        return
    try:
        new_price = int(input(f"Введите новую цену для '{name}' (текущая: {products[name]['цена']}₪): "))
        if new_price <= 0:
            print("Цена должна быть положительной.")
            return
    except ValueError:
        print("Неверный ввод цены. Введите число!")
        return
    products[name]['цена'] = new_price
    print(f"Цена товара '{name}' изменена на {new_price}₪.")

def delete_product():
    """Удалить товар из магазина."""
    show_products()
    if not products:
        return
    name = input("Введите название товара, который хотите удалить навсегда: ").lower()
    if name in products:
        del products[name] 
        print(f"Товар '{name}' удалён из магазина.")
    else:
        print(f"Товара с названием '{name}' не найдено.")

def find_products_by_name():
    """Найти товары по части названия."""
    print("\n--- Поиск товаров ---")
    query = input("Введите часть названия товара для поиска: ").lower()
    if not query:
        print("Строка поиска не может быть пустой.")
        return
    found_items = {}
    for name, details in products.items():
        if query in name:
            found_items[name] = details
    if not found_items:
        print(f"Товары, содержащие '{query}', не найдены.")
    else:
        print(f"Найденные товары по запросу '{query}':")
        for name, details in sorted(found_items.items()):
             print(f"{name.capitalize()} — {details['цена']}₪ (Категория: {details['категория']})")

def sort_products():
    """Меню сортировки товаров."""
    while True:
        print("\n--- Сортировка товаров ---")
        print("1. По цене (возрастание)")
        print("2. По цене (убывание)")
        print("3. По названию (по алфавиту)")
        print("4. Назад")
        choice = input("Выберите тип сортировки: ")
        if choice == "1":
            sorted_items = sorted(products.items(), key=lambda item: item['цена'])
            show_products(sorted_items)
            break
        elif choice == "2":
            sorted_items = sorted(products.items(), key=lambda item: item['цена'], reverse=True)
            show_products(sorted_items)
            break
        elif choice == "3":
            sorted_items = sorted(products.items(), key=lambda item: item)
            show_products(sorted_items)
            break
        elif choice == "4":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

def view_history():
    """Просмотреть историю покупок."""
    print("\n--- История покупок ---")
    if not purchase_history:
        print("История покупок пуста.")
        return
    for index, purchase in enumerate(purchase_history):
        print(f"\n--- Покупка #{index + 1} (Итого: {purchase['final_total']}₪) ---")
        for item in purchase['items']:
            print(f"  - {item['товар']} x {item['кол-во']} по {item['цена']}₪")
        if purchase['discount_applied'] > 0:
            print(f"  (Скидка {purchase['discount_applied']}% применена)")

def admin_login():
    """Обрабатывает вход администратора."""
    print("\n--- Вход для администратора ---")
    login_attempt = input("Логин: ")
    password_attempt = input("Пароль: ")
    if login_attempt == ADMIN_CREDENTIALS["login"] and password_attempt == ADMIN_CREDENTIALS["password"]:
        print("Вход выполнен успешно!")
        admin_panel()
    else:
        print("Ошибка авторизации. Неверный логин или пароль.")


# --- НОВАЯ СТРУКТУРА ВЛОЖЕННЫХ МЕНЮ ---


def admin_panel():
    """Панель администратора (CRUD операции), доступная только после логина."""
    while True:
        print("\n=== АДМИН-ПАНЕЛЬ: ГЛАВНОЕ МЕНЮ ===")
        print("1. Управление товарами")
        print("2. Просмотреть историю покупок")
        print("3. Назад (Выйти из аккаунта)")
        
        choice = input("Выберите пункт: ")
        
        if choice == "1":
            admin_product_management_menu()
        elif choice == "2":
            view_history()
        elif choice == "3":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def admin_product_management_menu():
    """Вложенное меню управления товарами для админа."""
    while True:
        print("\n=== АДМИН-ПАНЕЛЬ: ТОВАРЫ ===")
        print("1. Показать все товары")
        print("2. Создать товар")
        print("3. Изменить цену товара")
        print("4. Удалить товар")
        print("5. Назад")
        
        choice = input("Выберите пункт: ")
        
        if choice == "1":
            show_products()
        elif choice == "2":
            create_product()
        elif choice == "3":
            change_product_price()
        elif choice == "4":
            delete_product()
        elif choice == "5":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def customer_flow():
    """Главное меню покупателя с вложенными подменю."""
    while True:
        print("\n=== ПОКУПАТЕЛЬ: ГЛАВНОЕ МЕНЮ ===")
        print("1. Товары")
        print("2. Корзина")
        print("3. Оплатить")
        print("4. История покупок")
        print("5. Назад в главное меню (Выбор роли)")
        
        choice = input("Выберите пункт: ")
        
        if choice == "1":
            customer_product_menu()
        elif choice == "2":
            customer_cart_menu()
        elif choice == "3":
            checkout()
        elif choice == "4":
            view_history()
        elif choice == "5":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def customer_product_menu():
    """Вложенное меню просмотра товаров для покупателя."""
    while True:
        print("\n=== ПОКУПАТЕЛЬ: ТОВАРЫ ===")
        print("1. Показать все товары")
        print("2. Найти товар по части названия")
        print("3. Добавить товар в корзину")
        print("4. Назад")

        choice = input("Выберите пункт: ")

        if choice == "1":
            show_products()
        elif choice == "2":
            find_products_by_name()
        elif choice == "3":
            add_to_cart()
        elif choice == "4":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def customer_cart_menu():
    """Вложенное меню корзины для покупателя."""
    while True:
        print("\n=== ПОКУПАТЕЛЬ: КОРЗИНА ===")
        print("1. Показать корзину (с НДС и скидкой)")
        print("2. Редактировать количество товара")
        print("3. Удалить товар из корзины")
        print("4. Применить промокод")
        print("5. Назад")

        choice = input("Выберите пункт: ")

        if choice == "1":
            show_cart()
        elif choice == "2":
            edit_cart_item()
        elif choice == "3":
            remove_from_cart()
        elif choice == "4":
            apply_promo_code()
        elif choice == "5":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def student_panel():
    """Панель студента (теперь тоже немного вложенная)."""
    while True:
        print("\n=== ПАНЕЛЬ СТУДЕНТА: ГЛАВНОЕ МЕНЮ ===")
        print("1. Просмотр и поиск товаров")
        print("2. Сортировка товаров")
        print("3. Назад в главное меню (Выбор роли)")
        
        choice = input("Выберите пункт: ")

        if choice == "1":
            # Студент может использовать меню товаров покупателя для просмотра/поиска
            customer_product_menu() 
        elif choice == "2":
            sort_products()
        elif choice == "3":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def menu():
    """Основное меню приложения с выбором роли."""
    while True:
        print("\n=== МИНИ-МАГАЗИН: ГЛАВНОЕ МЕНЮ (ВЫБОР РОЛИ) ===")
        print("1. Войти как покупатель")
        print("2. Войти как студент")
        print("3. Войти как админ")
        print("4. Выйти из магазина")

        choice = input("Выберите роль: ")

        if choice == "1":
            customer_flow()
        elif choice == "2":
            student_panel()
        elif choice == "3":
            admin_login()
        elif choice == "4":
            print("Выход. До свидания!")
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

# --- ЗАПУСК ПРОГРАММЫ ---
if __name__ == "__main__":
    menu()
