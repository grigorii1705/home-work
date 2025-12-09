#Удаление товара из магазина
# Список товаров в магазине (товар -> {"цена": int, "категория": str})
products = {
    "яблоко": {"цена": 3, "категория": "фрукты"},
    "банан": {"цена": 5, "категория": "фрукты"},
    "молоко": {"цена": 12, "категория": "молочные продукты"},
    "хлеб": {"цена": 8, "категория": "выпечка"}
}

# Корзина: список словарей вида {"товар": str, "кол-во": int, "цена": int}
cart = []

# --- Все предыдущие функции (show_products, add_to_cart, show_cart, remove_from_cart, checkout, create_product, change_product_price) остаются без изменений ---
# (Я их убрал для краткости ответа, но в полном коде они должны быть выше функции menu())

def show_products():
    """Вывести список товаров магазина, с категорией"""
    print("\n--- Товары в магазине ---")
    for name, details in sorted(products.items()):
        print(f"{name.capitalize()} — {details['цена']}₪ (Категория: {details['категория']})")
    print()

def add_to_cart():
    """Добавить товар в корзину"""
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
    if not cart:
        print("Корзина пуста, нечего оплачивать!")
        return

    total = sum(c["кол-во"] * c["цена"] for c in cart)
    print(f"\nСумма к оплате: {total}₪")
    print("Спасибо за покупку!")
    cart.clear()

def create_product():
    """Создать новый товар"""
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

# --- Новая функция админ-панели ---

def delete_product():
    """Удалить товар из магазина (Админ-панель)"""
    show_products()
    if not products:
        print("В магазине пока нет товаров для удаления.")
        return

    name = input("Введите название товара, который хотите удалить навсегда: ").lower()

    # Проверка наличия товара в словаре
    if name in products:
        # Используем оператор del для удаления ключа из словаря
        del products[name] 
        print(f"Товар '{name}' удалён из магазина.")
    else:
        print(f"Товара с названием '{name}' не найдено.")


# --- Обновленное основное меню ---

def menu():
    """Основное меню"""
    while True:
        print("\n=== МИНИ-МАГАЗИН ===")
        print("1. Показать товары")
        print("2. Добавить в корзину")
        print("3. Показать корзину")
        print("4. Удалить из корзины (пользователь)")
        print("5. Оплатить")
        print("--- Админ-панель ---")
        print("6. Создать товар")
        print("7. Изменить цену товара")
        print("8. Удалить товар (админ)") # Новый пункт меню
        print("9. Выйти") # Изменен номер выхода

        choice = input("Выберите пункт: ")

        if choice == "1":
            show_products()
        elif choice == "2":
            add_to_cart()
        elif choice == "3":
            show_cart()
        elif choice == "4":
            remove_from_cart()
        elif choice == "5":
            checkout()
        elif choice == "6":
            create_product()
        elif choice == "7":
            change_product_price()
        elif choice == "8":
            delete_product() # Вызов новой функции
        elif choice == "9":
            print("Выход. До свидания!")
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

menu()
