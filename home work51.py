#Создать функцию, которая принимает два кортежа и возвращает их объединение.
def merge_tuples(tuple1, tuple2):
    merged_tuple = tuple1 + tuple2
    return merged_tuple
data_part1 = (1, 2, 3)
data_part2 = ('A', 'B', 'C')
result1 = merge_tuples(data_part1, data_part2)
print(f"Кортеж 1: {data_part1}")
print(f"Кортеж 2: {data_part2}")
print(f"Объединенный кортеж: {result1}")