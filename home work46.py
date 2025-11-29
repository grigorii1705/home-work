#Создать функцию, которая суммирует любое количество чисел (*args).
def sum_all_numbers(*args):
    total = 0
    for number in args:
        total += number
    return total
result1 = sum_all_numbers(10, 20)
print(f"Сумма 10 и 20: {result1}")