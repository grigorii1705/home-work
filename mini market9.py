#История покупок (внутри памяти, без файлов)
# --- ГЛОБАЛЬНЫЕ ПЕРЕМЕННЫЕ ---

# Список товаров в магазине (товар → {"цена": int, "категория": str})
products = {
    "яблоко": {"цена": 3, "категория": "фрукты"},
    "банан": {"цена": 5, "категория": "фрукты"},
    "молоко": {"цена": 12, "категория": "молочные продукты"},
    "хлеб": {"цена": 8, "категория": "выпечка"},
    "сыр": {"цена": 20, "категория": "молочные продукты"},
    "апельсин": {"цена": 4, "категория": "фрукты"}
}

# Корзина: список словарей вида {"товар": str, "кол-во": int, "цена": int}
cart = []

# Словарь промокодов
promo_codes = {
    "sale10": {"type": "percent", "value": 10},
    "student": {"type": "percent", "value": 15}
}

# Переменная для хранения текущей скидки (0.0 по умолчанию)
current_discount_percent = 0.0

# Ставка НДС (глобальная переменная, например, 17%)
VAT_RATE = 17.0

# --- НОВАЯ ГЛОБАЛЬНАЯ ПЕРЕМЕННАЯ ---
# История покупок: список словарей, каждый словарь описывает одну покупку
# Пример элемента: {"total": 120.50, "items": [{"товар": "яблоко", ...}, ...]}
purchase_history = []


# --- ОСНОВНЫЕ ФУНКЦИИ МАГАЗИНА ---
# (show_products, add_to_cart, show_cart, remove_from_cart, edit_cart_item, 
# create_product, change_product_price, delete_product, find_products_by_name, 
# sort_products, apply_promo_code остаются без изменений)


def show_products(sorted_items=None):
    # ... (код функции show_products) ...
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
    # ... (код функции add_to_cart) ...
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
    # ... (код функции show_cart) ...
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
    # ... (код функции remove_from_cart) ...
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
    # ... (код функции edit_cart_item) ...
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

    # 1. Расчеты
    subtotal = sum(c["кол-во"] * c["цена"] for c in cart)
    discount_amount = 0
    if current_discount_percent > 0:
        discount_amount = subtotal * (current_discount_percent / 100)
    subtotal_after_discount = subtotal - discount_amount
    vat_amount = subtotal_after_discount * (VAT_RATE / 100)
    final_total = subtotal_after_discount + vat_amount
        
    # 2. Сохранение истории (копируем содержимое корзины)
    # Используем list(cart)[:] или copy.deepcopy(cart), чтобы сохранить снимок корзины на момент покупки
    import copy
    purchase_record = {
        "final_total": round(final_total, 2),
        "items": copy.deepcopy(cart), 
        "discount_applied": current_discount_percent,
        "vat_rate": VAT_RATE
    }
    purchase_history.append(purchase_record)
    
    # 3. Вывод и очистка
    print(f"\nСумма к оплате (с НДС {VAT_RATE:.1f}%): {final_total:.2f}₪")
    print("Спасибо за покупку!")
    cart.clear()
    current_discount_percent = 0.0

def apply_promo_code():
    # ... (код функции apply_promo_code) ...
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


# --- НОВАЯ ФУНКЦИЯ ПРОСМОТРА ИСТОРИИ ---

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


# --- ПАНЕЛИ ПОЛЬЗОВАТЕЛЕЙ И ГЛАВНОЕ МЕНЮ ---

def customer_flow():
    """Упрощенный интерфейс покупателя."""
    while True:
        print("\n=== ПОКУПАТЕЛЬ ===")
        print("1. Показать товары")
        print("2. Добавить в корзину")
        print("3. Показать корзину")
        print("4. Редактировать товар в корзине")
        print("5. Удалить из корзины")
        print("6. Применить промокод")
        print("7. Показать историю покупок") # Новый пункт
        print("8. Оплатить")
        print("9. Назад в главное меню")
        
        choice = input("Выберите пункт: ")
        
        if choice == "1":
            show_products()
        elif choice == "2":
            add_to_cart()
        elif choice == "3":
            show_cart()
        elif choice == "4":
            edit_cart_item()
        elif choice == "5":
            remove_from_cart()
        elif choice == "6":
            apply_promo_code()
        elif choice == "7":
            view_history() # Вызов новой функции
        elif choice == "8":
            checkout()
        elif choice == "9":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

# ... (student_panel() и admin_panel() остаются прежними, их код опущен) ...

def student_panel():
    # ... (код student_panel) ...
    while True:
        print("\n=== ПАНЕЛЬ СТУДЕНТА ===")
        print("1. Показать товары (без сортировки)")
        print("2. Найти товар по части названия")
        print("3. Отсортировать товары")
        print("4. Вернуться в главное меню")
        choice = input("Выберите пункт: ")
        if choice == "1":
            show_products()
        elif choice == "2":
            find_products_by_name()
        elif choice == "3":
            sort_products()
        elif choice == "4":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def admin_panel():
    # ... (код admin_panel) ...
    while True:
        print("\n=== АДМИН-ПАНЕЛЬ ===")
        print("1. Показать все товары")
        print("2. Создать товар")
        print("3. Изменить цену товара")
        print("4. Удалить товар")
        print("5. Назад в главное меню")
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

def menu():
    """Основное меню приложения с выбором роли."""
    while True:
        print("\n=== МИНИ-МАГАЗИН: ГЛАВНОЕ МЕНЮ ===")
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
            admin_panel()
        elif choice == "4":
            print("Выход. До свидания!")
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

# --- ЗАПУСК ПРОГРАММЫ ---
if __name__ == "__main__":
    menu()
