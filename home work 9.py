integer = input("Введите число или слово: ")
integer = int(integer)
if integer % 2 == 0:
    print(f"Это число: {integer}. Оно четное.")
else:
    print(f"Это число: {integer}. Оно нечетное.")