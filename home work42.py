#Подсчёт уникальных слов
text = "apple banana apple cherry banana orange apple"
words_list = text.split()
word_counts = {}
i = 0
length = len(words_list)
while i < length:
    current_word = words_list[i]
    if current_word in word_counts:
        word_counts[current_word] += 1
    else:
        word_counts[current_word] = 1
    i += 1
print(f"Исходная строка: \"{text}\"")
print(f"Количество каждого слова: {word_counts}")