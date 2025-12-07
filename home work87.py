#Поймайте TypeError, если пытаетесь вызвать метод у None.
def call_method_on_none(data):
    """
    Пытается вызвать метод 'upper()' у переданного объекта.
    """
    print(f"--- Попытка обработки данных: {data} ---")
    try:
        # Если 'data' равно None, эта строка вызовет TypeError
        result = data.upper() 
        print(f"Результат: {result}")
    
    except TypeError as e:
        # Этот блок выполняется, если возникает TypeError
        print(f"Ошибка (TypeError): {e}")
        print("Подробности: Вы попытались вызвать метод у объекта None.")
        print("Убедитесь, что ваша переменная содержит строку, а не None.")
    except Exception as e:
        # Общий перехватчик для любых других ошибок
        print(f"Произошла непредвиденная ошибка: {e}")
# Пример 2: Передача значения None (вызовет TypeError)
# Имитация ситуации, когда функция вернула None вместо ожидаемых данных
data_from_function = None 
call_method_on_none(data_from_function)