#Создайте словарь покупок и выведите "Product: X, Price: Y" для каждого элемента.
shopping_cart = {
    "Яблоки": 2.50,
    "Молоко": 1.20,
    "Хлеб": 0.99,
    "Сыр": 4.75
}

print("Список покупок:")
for product, price in shopping_cart.items():
    print(f"Product: {product}, Price: {price}")