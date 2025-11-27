#Дано: число `n` Нужно: с помощью `while` вывести числа от `n` до `1` в обратном порядке.
def countdown_from_n(n):
   current_number = n
   while current_number >= 1:
        print(current_number, end=' ')  
        current_number -= 1
n_value = 10
print(f"Обратный отсчет от {n_value} до 1:")
countdown_from_n(n_value)