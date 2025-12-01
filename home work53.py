#Создайте словарь student с данными: имя, возраст, список экзаменов.
student = {
    "name": "Александр",
    "age": 21,
    "list of exams": ["Математика", "Физика", "Программирование", "История"]
}
print(f"Возраст: {student['age']}")
#Добавьте студенту ключ "city".
student["city"] = "Хайфа"
print(f"Студент живет в городе: {student['city']}")
#Удалите ключ "age".
print(student)
del student["age"]
print(student)