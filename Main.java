//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Часть 1: Броски костей
        int firstRoll = 7, secondRoll = 3, totalScore = firstRoll + secondRoll;
        System.out.println(totalScore);

        // Часть 2: Распределение призов
        int prizes = 15;
        int teams = 4;

        System.out.println(prizes / teams); // Призов каждой команде
        System.out.println(prizes % teams); // Остаток призов

        // Часть 3: Персонаж
        int heroHealth = 10;

        // Увеличиваем на 1
        heroHealth++;
        System.out.println(heroHealth);

        // Уменьшаем на 1
        heroHealth--;
        System.out.println(heroHealth);

        // Часть 4: Будущее
        String futureMessage = "Good news everyone!";
        System.out.println(futureMessage);

        // Часть 5: Профиль для пользователя
        String firstName = "Luke";
        String lastName = "Skywalker";

        // Объединяем строки с пробелом и выводим на экран
        System.out.println(firstName + " " + lastName);

        // Часть 6: Поехали
        // Используем обратную косую черту для экранирования кавычек внутри строки
        String heroQuote = "\"Поехали!\"";

        System.out.println(heroQuote);

        // Часть 7: Минск
        // Создаем строку с пробелами в начале и конце
        String cityName = "  Minsk  ";

        // Выводим длину строки до удаления пробелов
        System.out.println(cityName.length());

        // Удаляем пробелы
        String trimmedCity = cityName.trim();

        // Выводим длину строки после удаления пробелов
        System.out.println(trimmedCity.length());

        // Выводим название города в верхнем регистре
        System.out.println(trimmedCity.toUpperCase());

        // Выводим название города в нижнем регистре
        System.out.println(trimmedCity.toLowerCase());

        // Часть 8: Код доступа
        // Создаем переменную типа int с кодом доступа
        int accessCode = 54321;

        // Преобразуем число в строку (используя метод String.valueOf)
        String codeMessage = String.valueOf(accessCode);

        // Выводим полученную строку на экран
        System.out.println(codeMessage);

        // Часть 9: Отслеживание рейса
        int flight = 123;
        String city = "Минска";

        // Объединяем переменные в одну строку и выводим на экран
        System.out.println("Рейс " + flight + " до " + city);

        // Часть 10: Название фильма
        // Создаем строковую переменную с годом
        String filmYearStr = "1999";

        // Преобразуем строку в число (тип int)
        int filmYear = Integer.parseInt(filmYearStr);

        // Выводим число на экран
        System.out.println(filmYear);

        // Часть 11: Очки в игре
        // Создаем строковые переменные
        String point1Str = "-10";
        String point2Str = "-25";

        // Преобразуем строки в целые числа
        int point1 = Integer.parseInt(point1Str);
        int point2 = Integer.parseInt(point2Str);

        // Складываем числа для получения общего счета
        int Score = point1 + point2;

        // Выводим результат на экран
        System.out.println(Score);
    }
}
