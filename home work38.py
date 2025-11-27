#Дано: строка `text` и подстрока `word` Нужно: с помощью
def find_all_occurrences(text, word):
    indices = []
    start_index = 0
    word_length = len(word)
    while True:
        found_index = text.find(word, start_index)
        if found_index == -1:
            break
        indices.append(found_index)
        start_index = found_index + 1
    return indices
text1 = "error occurred. Another error"
word1 = "error"
result1 = find_all_occurrences(text1, word1)
print(f"Строка: \"{text1}\"")
print(f"Подстрока: \"{word1}\"")
print(f"Индексы вхождений: {result1}")