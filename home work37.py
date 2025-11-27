#Дано: строка `text="Hello Python Programming”` Нужно: с помощью `while` пройти по всем символам и посчитать количество гласных (`a, e, i, o, u`). Пример вывода: "Количество гласных: 6"
def count_vowels_while(text):
    vowels = "aeiouAEIOU"
    vowel_count = 0
    index = 0
    text_length = len(text)
    while index < text_length:
      current_char = text[index]
      if current_char in vowels:
        vowel_count += 1
      index += 1
    return vowel_count
text = "Hello Python Programming"
result = count_vowels_while(text)
print(f"Строка: \"{text}\"")
print(f"Количество гласных: {result}")