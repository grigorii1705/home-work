my_list = {"apple", "banana", "cherry","python", "photo"}
print(f"Исходный список: {my_list}")
print('python' in my_list)
print('hello' in my_list)
new_word = input("Введите слово, которое хотите добавить: ")
my_list.append(new_word)
print(f"Обновлённый список: {my_list}")