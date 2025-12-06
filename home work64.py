#Проверьте, является ли {1,2} подмножеством {1,2,3,4}.
subset_candidate = {1, 2}
main_set = {1, 2, 3, 4}
print(f"Проверяемое множество: {subset_candidate}")
print(f"Основное множество: {main_set}")
is_subset_operator = subset_candidate <= main_set
print(f"Результат проверки оператором (<=): {is_subset_operator}")