#Напишите код, который ловит все ошибки одним блоком except Exception as e.
try:
    print(check_age(15))
except Exception as e:  # ловим любое исключение
    print("Ошибка:", e)