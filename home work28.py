n = 7
fib_list = [0, 1]
if n <= 1:
    fib_list = [0]
elif n == 2:
    fib_list = [0, 1]
else:
    for i in range(2, n):
        next_fib = fib_list[-1] + fib_list[-2]
        fib_list.append(next_fib)
print(fib_list)