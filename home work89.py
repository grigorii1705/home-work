#Создайте функцию деления, которая выбрасывает ZeroDivisionError, если делитель равен нулю.
def safe_divide(numerator, denominator):
    if denominator == 0:
        raise ZeroDivisionError("Делитель не может быть равен нулю!")
    result = numerator / denominator
    return result
#Пример: Деление на ноль (вызовет нашу ошибку)
try:
    result = safe_divide(10, 0)
    print(f"Результат деления 10 на 0: {result}")
except ZeroDivisionError as e:
    # Здесь мы ловим то самое исключение, которое сгенерировали
    print(f"Произошла ошибка: {e}")