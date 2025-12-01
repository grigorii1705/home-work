#Объедините два словаря с товарами в один.
dict_fruit = {"Яблоко": 0.50, "Банан": 0.30}
dict_veg = {"Морковь": 0.80, "Картофель": 1.10}
combined_produce = {**dict_fruit, **dict_veg}
print(dict_fruit)
print(dict_veg)
print("Общий список")
print(combined_produce)