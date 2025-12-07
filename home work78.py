#Создайте функцию проверки возраста, которая выбрасывает ValueError для <18.
def check_age(age):
    if age < 18:
        raise ValueError(f"Возраст должен быть не менее 18 лет. Введенный возраст: {age}")
    else:
        print(f"Возраст {age} прошел проверку. Доступ разрешен.")
print("Попытка 1:")
try:
    check_age(20)
except ValueError as e:
    print(f"Перехвачена ошибка: {e}")
print("-" * 20)
print("Попытка 2:")
try:
    check_age(16)
except ValueError as e:
    # Здесь мы ловим то самое исключение, которое сгенерировали внутри функции
    print(f"Перехвачена ошибка: {e}")
print("-" * 20)