#Сортировка товаров
# Список товаров в магазине (товар -> {"цена": int, "категория": str})
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

# --- Предыдущие функции (show_products, add_to_cart, show_cart, remove_from_cart, checkout, create_product, change_product_price, delete_product, find_products_by_name, sort_products) остаются без изменений ---
# (Я их убрал для краткости ответа)

def show_products(sorted_items=None):
    """Вывести список товаров магазина, с категорией."""
    print("\n--- Товары в магазине ---")
    if sorted_items is None:
        items_to_display = sorted(products.items())
    else:
        items_to_display = sorted_items

    for name, details in items_to_display:
        print(f"{name.capitalize()} — {details['цена']}₪ (Категория: {details['категория']})")
    print()

def sort_products():
    """Меню сортировки товаров."""
    while True:
        print("\n--- Сортировка товаров ---")
        print("1. По цене (возрастание)")
        print("2. По цене (убывание)")
        print("3. По названию (по алфавиту)")
        print("4. Назад в основное меню")
        
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

# ... (Остальные функции: add_to_cart, show_cart, remove_from_cart, checkout, create_product, change_product_price, delete_product, find_products_by_name) ...


def student_panel():
    """Панель студента (с доступом к сортировке)"""
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
            # Предположим, студент тоже может искать товары
            find_products_by_name()
        elif choice == "3":
            sort_products()
        elif choice == "4":
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def menu():
    """Основное меню (Админ/Покупатель)"""
    while True:
        print("\n=== МИНИ-МАГАЗИН: ГЛАВНОЕ МЕНЮ ===")
        print("1. Войти как покупатель")
        print("2. Войти как студент")
        print("3. Войти как админ (управление товарами)")
        print("4. Выйти из магазина")

        choice = input("Выберите роль: ")

        if choice == "1":
            # Покупатель (доступ только к корзине и покупкам)
            customer_flow()
        elif choice == "2":
            # Студент (доступ к просмотру и сортировке)
            student_panel()
        elif choice == "3":
            # Админ (доступ к CRUD товарами)
            admin_panel() # Нужно создать функцию admin_panel()
        elif choice == "4":
            print("Выход. До свидания!")
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")

def customer_flow():
    """Упрощенный интерфейс покупателя"""
    while True:
        print("\n=== ПОКУПАТЕЛЬ ===")
        print("1. Показать товары")
        print("2. Добавить в корзину")
        print("3. Показать корзину")
        print("4. Удалить из корзины")
        print("5. Оплатить")
        print("6. Назад в главное меню")
        
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
            break
        else:
            print("Неверный выбор, попробуйте ещё раз.")


def admin_panel():
    """Панель администратора (CRUD операции)"""
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

# Запуск приложения через главное меню
menu()
