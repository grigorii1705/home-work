#Создать функцию с default-параметром для приветствия.
def greet_user(name="гость"):
    message = f"Привет, {name}! Добро пожаловать."
    return message
greeting_default = greet_user()
print(f"Пример: {greeting_default}")