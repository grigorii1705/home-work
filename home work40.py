#У нас есть строка `text` Нужно: с помощью `while` создать новую строку без пробелов и вывести её.
text = "H E L L O   P Y T H O N"
new_string_without_spaces = ""
length = len(text)
i = 0
print(f"Исходная строка: \"{text}\"")
while i < length:
    current_char = text[i]
    if current_char != ' ':
        new_string_without_spaces += current_char
    i += 1
print(f"Новая строка без пробелов: \"{new_string_without_spaces}\"")