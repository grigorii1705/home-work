#Создайте множество из 10 чисел с повторами, выведите только уникальные.
numbers_with_duplicates = [1, 2, 2, 3, 4, 4, 5, 6, 6, 7]
print(f"Исходный список с повторами: {numbers_with_duplicates}")
unique_numbers = set(numbers_with_duplicates)
print(f"Множество уникальных чисел: {unique_numbers}")
