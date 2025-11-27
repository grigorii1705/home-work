#У нас есть строка "text" Нам нужно с помощью `while` вывести
text= "TEXT"
length = len(text)
current_index = length - 1
print(f"Исходная строка: \"{text}\"")
print("Строка в обратном порядке (посимвольно):")
while current_index >= 0:
    print(text[current_index], end='')
    current_index -= 1
print()