#Используйте finally, чтобы закрыть файл после чтения.
try:
    f = open("file.txt", "r")
    content = f.read()
except FileNotFoundError:
    print("Файл не найден")
finally:
    print("Блок finally выполнен")