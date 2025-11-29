#Создать функцию, которая принимает словарь (**kwargs) и выводит ключи и значения.
def display_user_info(**kwargs):
    print("Полученные данные (ключ: значение):")
    for key, value in kwargs.items():
        print(f"{key}: {value}")
display_user_info(name="Григорий", age=43, city="Петрозаводск")