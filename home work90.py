#Напишите try...except для безопасного деления числа на пользовательский ввод.
numerator = 10
user_input = input(f"Введите число, на которое будем делить {numerator}: ")
try:
    denominator = float(user_input)
    result = numerator / denominator
    print(f"Результат: {result}")
except ValueError:
    # Сработает, если пользователь ввел буквы или символы
    print("Ошибка: Вы ввели некорректное число.")
except ZeroDivisionError:
    # Сработает, если пользователь ввел 0
    print("Ошибка: Деление на ноль невозможно.")
except Exception as e:
    # Сработает при любых других неожиданных ошибках
    print(f"Произошла непредвиденная ошибка: {e}")
    