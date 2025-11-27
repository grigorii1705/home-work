#Фильтр чисел (*)
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
even_numbers = []
length = len(numbers)
i = 0
while i < length:
    current_number = numbers[i]
    if current_number % 2 == 0:
        even_numbers.append(current_number)
    i += 1
print(f"Чётные числа: {even_numbers}")