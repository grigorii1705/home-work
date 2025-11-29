#Создать функцию, которая принимает список чисел и возвращает максимальное число.
def find_max_number(numbers_list):
    if not numbers_list:
        return None
    max_num = numbers_list[0]
    for number in numbers_list[1:]:
        if number > max_num:
            max_num = number
    return max_num
list1 = [15, 9, 255, 53, 99]
max_result1 = find_max_number(list1)
print(f"В списке {list1} максимальное число: {max_result1}")