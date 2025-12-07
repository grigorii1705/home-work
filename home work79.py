#Напишите try...except для открытия несуществующего файла.
def open_non_existent_file(filename):
    try:
        # Попытка открыть файл в режиме чтения ('r')
        with open(filename, 'r', encoding='utf-8') as file:
            print(f"Файл '{filename}' успешно открыт.")
            # Читаем содержимое файла (если бы он существовал)
            content = file.read()
            print("Содержимое файла:")
            print(content)

    except FileNotFoundError:
        # Этот блок выполняется, если файла по указанному пути не существует
        print(f"Ошибка! Файл '{filename}' не найден.")
        print("Пожалуйста, проверьте правильность пути или наличие файла.")
    except Exception as e:
        # Общий обработчик для других возможных ошибок (например, нет прав доступа)
        print(f"Произошла непредвиденная ошибка при работе с файлом: {e}")
file_to_check = "non_existent_file.txt"

print(f"Попытка открыть файл: {file_to_check}")
open_non_existent_file(file_to_check)
print("\n---")