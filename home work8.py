check_num = 50
range_status = "Число входит в диапазон" if 1 <= check_num <= 100 else "Число не входит в диапазон"
print(f"Число {check_num}  в диапазоне от 1 до 100?: {range_status}")