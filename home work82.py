#Используйте raise для проброса ошибки внутри except.
def read_and_re_raise(filename):
    try:
        f = open(filename, 'r')
        content = f.read()
        f.close()
        print("Файл успешно прочитан.")
    except FileNotFoundError:
        print(f"[Функция] Ошибка! Не могу найти файл '{filename}'.")
        raise
print("Запуск программы...")
try:
    read_and_re_raise("i_do_not_exist.txt")
except FileNotFoundError:
    print("[Основная программа] Я тоже поймал эту ошибку. Программа завершается корректно.")