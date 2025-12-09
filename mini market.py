#Добавление нового товара в магазин
# Список товаров в магазине (товар -> {"цена": int, "категория": str})
products = {
    "яблоко": {"цена": 3, "категория": "фрукты"},
    "банан": {"цена": 5, "категория": "фрукты"},
    "молоко": {"цена": 12, "категория": "молочные продукты"},
    "хлеб": {"цена": 8, "категория": "выпечка"}
}

# Корзина: список словарей вида {"товар": str, "кол-во": int, "цена": int}
cart = []

def show_products():
    """Вывести список товаров магазина, с категорией"""
    print("\n--- Товары в магазине ---")
    # Сортируем товары по названию для лучшего отображения
    for name, details in sorted(products.items()):
        print(f"{name.capitalize()} — {details['цена']}₪ (Категория: {details['категория']})")
    print()

def create_product():
    """Создать новый товар (Админ-панель)"""
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

    # Добавляем новый товар в словарь products
    products[name] = {"цена": price, "категория": category}
    print(f"Товар '{name}' успешно добавлен!")

# --- Остальные функции магазина (add_to_cart, show_cart, remove_from_cart, checkout) ---
# Они остаются почти без изменений, так как обращаются к price через products[item]['цена']

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

    # Обращаемся к цене через ключ 'цена'
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
    """Удалить товар по названию"""
    if not cart:
        print("Корзина пуста.")
        return

    show_cart()
    name = input("Введите название товара для удаления: ").lower()

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


def menu():
    """Основное меню"""
    while True:
        print("\n=== МИНИ-МАГАЗИН ===")
        print("1. Показать товары")
        print("2. Добавить в корзину")
        print("3. Показать корзину")
        print("4. Удалить из корзины")
        print("5. Оплатить")
        print("6. *Админ-панель: Создать товар*") # Новый пункт меню
        print("7. Выйти") # Изменен номер выхода

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
            create_product() # Вызов новой функции
        elif choice == "7":
            print("Выход. До свидания!")
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

menu()
