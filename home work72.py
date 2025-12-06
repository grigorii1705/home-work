#Создайте множество из списка чисел и строк одновременно.
mixed_data_list = [10, "apple", 3.14, "banana", 10, "apple", True]
print(f"Исходный список: {mixed_data_list}")
print(f"Тип исходной переменной: {type(mixed_data_list)}")
mixed_set = set(mixed_data_list)
print(f"\nСмешанное множество: {mixed_set}")
print(f"Тип полученной переменной: {type(mixed_set)}")