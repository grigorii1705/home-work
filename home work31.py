text = "Hello Python Programming"
uppercase_indices = []
for index, char in enumerate(text):
    if char.isupper():
        uppercase_indices.append(index)
spaces_count = text.count(' ')
print(f"Исходная строка: \"{text}\"")
print(f"Индексы заглавных букв: {uppercase_indices}")
print(f"Количество пробелов: {spaces_count}")