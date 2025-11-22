matrix = [[1, 2], [3, 4], [5, 6]]
total_sum = 0
for row in matrix:
    for number in row:
        total_sum += number
print(total_sum)