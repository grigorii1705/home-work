#Итерацией по множеству посчитайте сумму чисел {1,2,3,4,5}.
numbers_set = {1, 2, 3, 4, 5}
total_sum = 0
for number in numbers_set:
    total_sum = total_sum + number
print(f"Множество: {numbers_set}")
print(f"Сумма всех чисел в множестве: {total_sum}")