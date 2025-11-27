#Нужно: с помощью while вывести все числа от 1 до n.
n = 5
current_number = 1
print(f"Вывод чисел от 1 до {n}:")
while current_number <= n:
    print(current_number, end=' ')
    current_number += 1
print()