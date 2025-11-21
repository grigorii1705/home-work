name = input("Введите Ваше имя: ").strip()
age=input("Введите Ваш возраст")
age=int(age.strip())
age_in_five_years=age+5
output_phrase=f"Привет, {name}! Через 5 лет тебе будет {age_in_five_years} лет"
print(output_phrase)