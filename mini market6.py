#Возможность изменить количество товара в корзине
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


# --- ОСНОВНЫЕ ФУНКЦИИ МАГАЗИНА ---

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

    # Улучшенная логика: если товар уже есть в корзине, обновляем кол-во
    for cart_item in cart:
        if cart_item["товар"] == item:
            cart_item["кол-во"] += qty
            print(f"Количество '{item}' обновлено в корзине.")
            return

    # Если товара нет, добавляем новую запись
    cart.append({"товар": item, "кол-во": qty, "цена": products[item]['цена']})
    print(f"{item} добавлен в корзину.")

def show_cart():
    """Показать корзину."""
    if not cart:
        print("\nКорзина пуста.\n")
        return

    print("\n--- Корзина ---")
    total = 0
    for c in cart:
        cost = c["кол-во"] * c["цена"]
        total += cost
        print(f"{c['товар']} x {c['кол-во']} = {cost}₪")

    print(f"Итого: {total}₪\n")

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
    """Оплатить покупку."""
    if not cart:
        print("Корзина пуста, нечего оплачивать!")
        return

    total = sum(c["кол-во"] * c["цена"] for c in cart)
    print(f"\nСумма к оплате: {total}₪")
    print("Спасибо за покупку!")
    cart.clear()


# --- АДМИН-ФУНКЦИИ ---

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


# --- СТУДЕНТ-ФУНКЦИИ (ПОИСК И СОРТИРОВКА) ---

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
            sorted_items = sorted(products.items(), key=lambda item: item[1]['цена'])
            show_products(sorted_items)
            break
        elif choice == "2":
            sorted_items = sorted(products.items(), key=lambda item: item[1]['цена'], reverse=True)
            show_products(sorted_items)
            break
        elif choice == "3":
            sorted_items = sorted(products.items(), key=lambda item: item[0]) # Сортировка по ключу (названию)
            show_products(sorted_items)
            break
        elif choice == "4":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


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
        print("6. Оплатить")
        print("7. Назад в главное меню")
        
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
            checkout()
        elif choice == "7":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def student_panel():
    """Панель студента (с доступом к сортировке)."""
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
    """Панель администратора (CRUD операции)."""
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
