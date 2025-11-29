#Создать функцию, которая возвращает True, если число чётное, иначе False.
def is_even(number):
    if number % 2 == 0:
        return True
    else:
        return False
#Пример 1
num1 = 4
if is_even(num1):
    print(f"Число {num1} - четное: {is_even(num1)}")
else:
    print(f"Число {num1} - нечетное: {is_even(num1)}")
#Пример 2
num2 = 7
if is_even(num2):
    print(f"Число {num2} - четное: {is_even(num2)}")
else:
    print(f"Число {num2} - нечетное: {is_even(num2)}")