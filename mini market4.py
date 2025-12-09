#Поиск товара
# Список товаров в магазине (товар -> {"цена": int, "категория": str})
products = {
    "яблоко": {"цена": 3, "категория": "фрукты"},
    "банан": {"цена": 5, "категория": "фрукты"},
    "молоко": {"цена": 12, "категория": "молочные продукты"},
    "хлеб": {"цена": 8, "категория": "выпечка"},
    "сыр": {"цена": 20, "категория": "молочные продукты"}
}

# Корзина: список словарей вида {"товар": str, "кол-во": int, "цена": int}
cart = []

# --- Все предыдущие функции (show_products, add_to_cart, show_cart, remove_from_cart, checkout, create_product, change_product_price, delete_product) остаются без изменений ---
# (Я их убрал для краткости ответа)

# ... (Предыдущие функции show_products, add_to_cart, show_cart, remove_from_cart, checkout, create_product, change_product_price, delete_product должны быть здесь) ...

def show_products():
    """Вывести список товаров магазина, с категорией"""
    print("\n--- Товары в магазине ---")
    for name, details in sorted(products.items()):
        print(f"{name.capitalize()} — {details['цена']}₪ (Категория: {details['категория']})")
    print()

def add_to_cart():
    """Добавить товар в корзину"""
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

    cart.append({"товар": item, "кол-во": qty, "цена": products[item]['цена']})
    print(f"{item} добавлен в корзину.")

def show_cart():
    """Показать корзину"""
    # ... (код функции show_cart) ...
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
    """Удалить товар по названию из корзины"""
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

def checkout():
    """Оплатить покупку"""
    # ... (код функции checkout) ...
    if not cart:
        print("Корзина пуста, нечего оплачивать!")
        return

    total = sum(c["кол-во"] * c["цена"] for c in cart)
    print(f"\nСумма к оплате: {total}₪")
    print("Спасибо за покупку!")
    cart.clear()

def create_product():
    """Создать новый товар"""
    # ... (код функции create_product) ...
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
    """Изменить цену существующего товара"""
    # ... (код функции change_product_price) ...
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
    """Удалить товар из магазина"""
    # ... (код функции delete_product) ...
    show_products()
    if not products:
        print("В магазине пока нет товаров для удаления.")
        return

    name = input("Введите название товара, который хотите удалить навсегда: ").lower()

    if name in products:
        del products[name] 
        print(f"Товар '{name}' удалён из магазина.")
    else:
        print(f"Товара с названием '{name}' не найдено.")


# --- Новая функция поиска товара ---

def find_products_by_name():
    """Найти товары по части названия"""
    print("\n--- Поиск товаров ---")
    query = input("Введите часть названия товара для поиска: ").lower()

    if not query:
        print("Строка поиска не может быть пустой.")
        return

    found_items = {}
    # Обходим все товары в словаре
    for name, details in products.items():
        # Проверяем, содержится ли строка поиска (query) в названии товара (name)
        if query in name:
            found_items[name] = details

    if not found_items:
        print(f"Товары, содержащие '{query}', не найдены.")
    else:
        print(f"Найденные товары по запросу '{query}':")
        for name, details in sorted(found_items.items()):
             print(f"{name.capitalize()} — {details['цена']}₪ (Категория: {details['категория']})")


# --- Обновленное основное меню ---

def menu():
    """Основное меню"""
    while True:
        print("\n=== МИНИ-МАГАЗИН ===")
        print("1. Показать товары")
        print("2. Найти товар по части названия") # Новый пункт
        print("3. Добавить в корзину")
        print("4. Показать корзину")
        print("5. Удалить из корзины (пользователь)")
        print("6. Оплатить")
        print("--- Админ-панель ---")
        print("7. Создать товар")
        print("8. Изменить цену товара")
        print("9. Удалить товар (админ)")
        print("10. Выйти") # Изменен номер выхода

        choice = input("Выберите пункт: ")

        if choice == "1":
            show_products()
        elif choice == "2":
            find_products_by_name() # Вызов новой функции поиска
        elif choice == "3":
            add_to_cart()
        elif choice == "4":
            show_cart()
        elif choice == "5":
            remove_from_cart()
        elif choice == "6":
            checkout()
        elif choice == "7":
            create_product()
        elif choice == "8":
            change_product_price()
        elif choice == "9":
            delete_product()
        elif choice == "10":
            print("Выход. До свидания!")
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

menu()
