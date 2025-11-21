n = int(input("Введите четырехзначное число: "))
if not (1000 <= n <= 9999):print("Пожалуйста, введите корректное четырехзначное число.")
else: 
    if n % 2 == 0:print("Число четное.")
d1 = n // 1000
d2 = (n // 100) % 10
d3 = (n // 10) % 10
d4 = n % 10
sum_of_digits = d1 + d2 + d3 + d4
print(f"Сумма всех цифр: {sum_of_digits}")
sum_of_other_digits = d1 + d2 + d3
if d4 == sum_of_other_digits: print("Магическое число!")