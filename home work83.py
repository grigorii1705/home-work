#Создайте собственное исключение и выбросьте его.
class InvalidFileExtensionError(Exception):
    pass
def check_file_extension(filename):
    expected_extension = ".txt"
    
    if not filename.endswith(expected_extension):
        error_message = f"Неверное расширение файла: '{filename}'. Ожидается '{expected_extension}'."
        raise InvalidFileExtensionError(error_message)
    else:
        print(f"Файл '{filename}' прошел проверку расширения.")
# 3. Используем программу с обработкой нашего исключения
print("--- Пример 1: Некорректный файл (вызовет ошибку) ---")
try:
    check_file_extension("image.jpg")
except InvalidFileExtensionError as e:
    # Мы ловим наше собственное, только что созданное исключение
    print(f"Перехвачено пользовательское исключение: {e}")

print("\n--- Пример 2: Корректный файл ---")
try:
    check_file_extension("document.txt")
except InvalidFileExtensionError as e:
    print(f"Перехвачено пользовательское исключение: {e}")