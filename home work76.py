#Поймайте ошибку при делении на ноль.
try:
    x = int(input("Введите число: "))
    print(10 / x)
except ValueError:
    print("Ошибка: введено не число")
except ZeroDivisionError:
    print("Ошибка: деление на ноль")