numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
print("Исходный список:", numbers)
even_numbers = [num for num in numbers if num % 2 == 0]
print("Чётные:", even_numbers)   
odd_numbers = [num for num in numbers if num % 2 != 0]
print("Нечётные:", odd_numbers)
divisible_by_3 = [num for num in numbers if num % 3 == 0]
print("Делятся на 3:", divisible_by_3)
reversed_numbers = numbers[::-1]
print("Список наоборот:", reversed_numbers)