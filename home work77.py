#Поймайте ошибку при попытке преобразовать строку "abc" в int.
try:
    string_value = "abc"
    number = int(string_value)
    print(f"Преобразованное число: {number}")
except ValueError:
    print(f"Ошибка! Невозможно преобразовать строку '{string_value}' в целое число (int).")
    print("Убедитесь, что строка содержит только цифры.")
except Exception as e:
    print(f"Произошла непредвиденная ошибка: {e}")