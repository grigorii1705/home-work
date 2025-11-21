integer = input("Введите число или слово: ")
length = len(integer)
count_e = integer.lower().count('e')
print(f"Это не число. Общая длина строки: {length} символов, букв 'e' (или 'E'): {count_e}.")