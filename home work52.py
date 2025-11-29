#Создать функцию, которая возвращает длину строки.
def get_string_length(text):
    length = len(text)
    return length
string1 = "Привет, пользователь!"
length1 = get_string_length(string1)
print(f"Длина строки '{string1}': {length1} символов")