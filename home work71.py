#Проверьте, что frozenset нельзя изменить (попытка add).
my_frozenset = frozenset([1, 2, 3, 2])
print(f"Наше 'замороженное' множество: {my_frozenset}")
try:
    my_frozenset.add(4)
except AttributeError as e:
    print(f"\n>>>> ОШИБКА: {e} <<<<")
    print("Сообщение: 'frozenset' object has no attribute 'add'")
    print("Frozenset нельзя изменить.")
print(f"\nМножество осталось неизменным: {my_frozenset}")