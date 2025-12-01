#Используйте .get() для несуществующего ключа с текстом "Not found".
user_data = {
    "имя": "Алиса",
    "возраст": 30,
    "email": "alisa@example.com"
}
username = user_data.get("имя", "Not found")
print(f"Имя пользователя: {username}")
phone_number = user_data.get("телефон", "Not found")
print(f"Номер телефона: {phone_number}")
