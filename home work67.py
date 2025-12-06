#Удалите элемент из множества с помощью discard.
my_set = {10, 20, 30, 40, 50}
print(f"Исходное множество: {my_set}")
element_to_remove = 40
my_set.discard(element_to_remove)
print(f"После удаления элемента {element_to_remove}: {my_set}")