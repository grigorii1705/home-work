#Найдите симметрическую разность двух множеств.
set_a = {1, 2, 3, 4}
set_b = {3, 4, 5, 6}
print(f"Множество A: {set_a}")
print(f"Множество B: {set_b}")
symmetric_diff_operator = set_a ^ set_b
print(f"\n Разность (оператор ^): {symmetric_diff_operator}")