user_input = input("Введите строку (например, hello world I am here): ")
words=user_input.split()
result_string = "|".join(words)
print(f"Результат: {result_string}")