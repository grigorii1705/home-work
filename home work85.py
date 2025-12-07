#Используйте try для парсинга некорректного JSON.
import json

def parse_json_string(json_string):
    """
    Пытается распарсить строку JSON и обрабатывает ошибку декодирования.
    """
    print(f"--- Попытка парсинга строки: '{json_string}' ---")
    try:
        # Попытка преобразования строки в объект Python (словарь или список)
        data = json.loads(json_string)
        print("Успех (try): JSON успешно распарсен.")
        print("Полученные данные:", data)
        return data
    except json.JSONDecodeError as e:
        # Этот блок выполняется, если строка JSON некорректна
        print(f"Ошибка (except): Не удалось распарсить JSON строку.")
        print(f"Детали ошибки: {e}")
    except Exception as e:
        # Для любых других неожиданных ошибок
        print(f"Произошла непредвиденная ошибка: {e}")
# Пример: Некорректная строка JSON (отсутствуют кавычки вокруг ключа и двоеточие)
incorrect_json = "{name: 'Ivan', age: 30}"
parse_json_string(incorrect_json)
print("\n" + "="*40 + "\n")