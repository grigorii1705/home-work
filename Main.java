import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//start
        //        int count = 3;
//
//        while (count >= 1) {
//            System.out.println(count);
//            count--;
//        }
//
//        System.out.println("Старт!");
 //       Scanner scanner = new Scanner(System.in);
  //      String password = "";

        // Цикл продолжается, пока введенная строка не будет равна "java"
 //       while (!password.equals("java")) {
 //           System.out.print("Введите пароль: ");
//            password = scanner.nextLine();
 //       }

 //       System.out.println("Смартфон разблокирован!");
//        scanner.close();
 //       Scanner scanner = new Scanner(System.in);
 //       String password;

//        do {
//            System.out.print("Введите пароль: ");
//            password = scanner.nextLine();
 //       } while (!password.equals("java"));

//        System.out.println("Смартфон разблокирован!");
//        scanner.close();
//        int seat = 2;
//
 //        while (seat <= 10) {
 //           System.out.println(seat);
 //           seat += 2; // Увеличиваем номер кресла на 2
//        }
//    }
// Цикл for: начинаем с 5, продолжаем пока i >= 1, на каждом шаге уменьшаем i на 1
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }

//        System.out.println("С Новым годом!");
//    }
//}
        // Цикл for: начинаем с 0, идем до 10 включительно, прибавляем по 2 на каждом шаге
//        for (int i = 0; i <= 10; i += 2) {
//            System.out.println(i);
//        }
//    }
//}
//        int n = 7; // Количество товаров
//        int totalSum = 0; // Переменная для хранения итоговой суммы

//        for (int i = 1; i <= n; i++) {
//            totalSum += i; // Прибавляем порядковый номер (цену) к общей сумме
//        }

//        System.out.println(totalSum);
//    }
//}
        // В цикле for можно инициализировать и изменять сразу несколько переменных
//        for (int i = 1, j = 5; i <= 5; i++, j--) {
//            System.out.println(i + " " + j);
//        }
//    }
//}
//        int gameVersion = 10;

//        do {
//            System.out.println("Загрузка данных...");
//            System.out.println(gameVersion);

//            // В данном примере мы не меняем условие внутри,
//            // чтобы цикл гарантированно выполнился только один раз
//        } while (gameVersion < 10);
//    }
//}
//        Scanner scanner = new Scanner(System.in);
//        int pin;

//        do {
//            System.out.print("Введите PIN-код: ");
//            pin = scanner.nextInt();
//        } while (pin <= 0); // Цикл продолжается, если число не положительное
//
 //                System.out.println("PIN-код принят");
//        scanner.close();
//    }
//}
//        Scanner scanner = new Scanner(System.in);
//        int choice;

//        do {
//            // Вывод меню на экран
//            System.out.println("Меню:");
//            System.out.println("1. Вывести приветствие");
//            System.out.println("2. Выйти");

//            // Чтение выбора пользователя
//            choice = scanner.nextInt();

//            // Обработка выбора
//            if (choice == 1) {
//                System.out.println("Привет!");
//            }

//        } while (choice != 2); // Цикл повторяется, пока пользователь не введет 2

//        scanner.close();
//    }
//}
//        Scanner scanner = new Scanner(System.in);
//        String password;

//        do {
//            System.out.print("Придумайте пароль (не менее 6 символов): ");
//            password = scanner.nextLine();
//        } while (password.length() < 6); // Повторять, если длина меньше 6

//        System.out.println("Пароль надёжен, аккаунт создан!");
//        scanner.close();
//    }
//}
//        Задача 2.
//        for (int i = 1; i <= 20; i++) {
//            // Если остаток от деления на 2 равен 0, то число чётное
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
// Задача 3
//        int n = 20; // Можно изменить на любое число

//        for (int i = 1; i <= n; i++) {
//            // Если число делится на 3 без остатка
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}
//            Задача 4
//        int n = 15; // Заданное число
//        int sum = 0; // Переменная для хранения суммы
//
 //        for (int i = 1; i <= n; i++) {
//            sum += i; // Прибавляем текущее число к общей сумме
//        }

//        System.out.println(sum);
//    }
//}
//        Задача 5
//        int n = 65787; // Исходное число
//        int count = 0;

//        // Если число равно 0, в нем 1 цифра
//        if (n == 0) {
//            count = 1;
//        } else {
//            // Работаем с абсолютным значением на случай отрицательного n
//            int temp = Math.abs(n);

//            while (temp > 0) {
//                temp /= 10; // Отсекаем последнюю цифру делением нацело
//                count++;    // Увеличиваем счетчик
//            }
//        }

//        System.out.println(count);
//    }
//}
//        Задача 6
//        int n = 5834; // Исходное число
//        int max = 0;

        // Работаем с положительным значением (на случай отрицательного n)
//        int temp = Math.abs(n);

        // Если число 0, то максимальная цифра 0
//        if (temp == 0) {
//            max = 0;
//        }

//        while (temp > 0) {
//            int currentDigit = temp % 10; // Получаем последнюю цифру

//            if (currentDigit > max) {
//                max = currentDigit; // Обновляем максимум, если текущая цифра больше
//            }

//            temp /= 10; // Убираем последнюю цифру
//        }

//        System.out.println(max);
//    }
//}
//        Задача 7
//        String str = "banana";
//        int count = 0;

        // Проходим циклом по всей длине строки
//        for (int i = 0; i < str.length(); i++) {
//            // Проверяем, является ли текущий символ буквой 'a'
//            if (str.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        Задача 8
//        String str = "hello";
//        String reversed = "";

        // Сначала сохраняем перевёрнутую строку в переменную
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }

        // Выводим результат в формате "исходное" -> "перевёрнутое"
//        System.out.println(str + " -> " + reversed);
//    }
//}
 //        Задача 9
//        int n = 5;

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " * " + i + " = " + (n * i));
//        }
//    }
//}
//        Задача 10
//                Scanner scanner = new Scanner(System.in);
//
 //                int max = -1;  // Изначально ставим меньше минимально возможной оценки
 //               int min = 101; // Изначально ставим больше максимально возможной оценки
//
 //                System.out.println("Вводите оценки (от 0 до 100). Для завершения введите -1:");
//
 //                while (true) {
//                    int grade = scanner.nextInt();
//
 //                    // Проверка на выход из цикла
//                    if (grade == -1) {
//                        break;
//                    }
//
                    // Проверка корректности диапазона (необязательно, но полезно)
//                    if (grade >= 0 && grade <= 100) {
//                        // Ищем максимум
//                        if (grade > max) {
//                            max = grade;
//                        }
                        // Ищем минимум
//                        if (grade < min) {
//                            min = grade;
//                        }
//                    } else {
//                        System.out.println("Пожалуйста, введите число от 0 до 100.");
//                    }
//                }

                // Проверяем, были ли введены оценки вообще
//                if (max == -1) {
//                    System.out.println("Оценки не были введены.");
//                } else {
//                    System.out.println("Максимальная оценка: " + max);
//                    System.out.println("Минимальная оценка: " + min);
//                }
//
 //                scanner.close();
//            }
//        }
//        Задача 11
//                Scanner scanner = new Scanner(System.in);
//
 //                double totalSum = 0;   // Общая сумма покупок
//                int count = 0;         // Количество товаров
//
 //                System.out.println("Введите цены товаров:");
//
 //                while (true) {
//                    double price = scanner.nextDouble();
//
                    // Проверяем, не превысит ли общая сумма 200 при добавлении этого товара
//                    if (totalSum + price > 200) {
//                        System.out.println("Лимит в 200 превышен. Последний товар не включен.");
//                        break; // Выход из цикла, товар не добавляется
//                    }
//
 //                    totalSum += price; // Добавляем цену к сумме
//                    count++;           // Увеличиваем счетчик товаров
//                }
//
 //                System.out.println("Общая сумма покупок: " + totalSum);
//
                // Расчет средней цены, если куплен хотя бы один товар
//                if (count > 0) {
//                    double average = totalSum / count;
//                    System.out.println("Средняя цена товара: " + average);
//                } else {
//                    System.out.println("Ни один товар не был куплен.");
//                }
//
 //                scanner.close();
//            }
//        }
//        Задача 12
//                Scanner scanner = new Scanner(System.in);
//
 //                // Инициализируем переменные.
//                // Для min и max используем крайние значения или флаг первого ввода.
//                double maxTemp = Double.NEGATIVE_INFINITY;
//                double minTemp = Double.POSITIVE_INFINITY;
//                int hotDaysCount = 0;
//                int inputCount = 0;
//
 //                System.out.println("Введите значения температуры (для выхода введите -99):");
//
 //                while (true) {
//                    double currentTemp = scanner.nextDouble();
//
 //                    // Проверка на выход
//                    if (currentTemp == -99) {
//                        break;
//                    }
//
 //                    // Находим максимум
//                    if (currentTemp > maxTemp) {
//                        maxTemp = currentTemp;
//                    }
//
 //                    // Находим минимум
//                    if (currentTemp < minTemp) {
//                        minTemp = currentTemp;
//                    }
//
 //                    // Считаем количество значений выше 30
//                    if (currentTemp > 30) {
//                        hotDaysCount++;
//                    }
//
 //                    inputCount++;
//                }
//
 //                // Проверяем, были ли введены данные перед выводом
//                if (inputCount > 0) {
//                    System.out.println("Самая высокая температура: " + maxTemp);
//                    System.out.println("Самая низкая температура: " + minTemp);
//                    System.out.println("Количество замеров выше 30 градусов: " + hotDaysCount);
//                } else {
//                    System.out.println("Данные не были введены.");
//                }
//
 //                scanner.close();
//            }
//        }
//        Задача 13
//                Scanner scanner = new Scanner(System.in);
//
 //                int ticketsAvailable = 50;
//                   int ticketPrice = 20;
//                int totalMoney = 0;

//                String bestCustomer = "Нет покупателей";
//                int maxTicketsBought = 0;

//                System.out.println("--- Система продажи билетов (2026) ---");

//                while (ticketsAvailable > 0) {
//                    System.out.println("\nОсталось билетов: " + ticketsAvailable);
//                    System.out.print("Введите ваше имя (или -99 для выхода): ");
//                    String name = scanner.next();

//                    if (name.equals("-99")) {
//                        break;
//                    }

//                    System.out.print("Сколько билетов вы хотите купить? ");
//                    int ticketsRequested = scanner.nextInt();

//                    if (ticketsRequested <= 0) {
//                        System.out.println("Ошибка: введите положительное число.");
//                        continue;
//                    }

//                    if (ticketsRequested <= ticketsAvailable) {
//                        // Покупка подтверждена
//                        ticketsAvailable -= ticketsRequested;
//                        int cost = ticketsRequested * ticketPrice;
//                        totalMoney += cost;
//
 //                        System.out.println("Покупка подтверждена, " + name + "! К оплате: " + cost + " шекелей.");
//
 //                        // Проверяем, является ли этот клиент рекордсменом
//                        if (ticketsRequested > maxTicketsBought) {
//                            maxTicketsBought = ticketsRequested;
//                            bestCustomer = name;
//                        }
//                    } else {
//                        System.out.println("Недостаточно билетов! Доступно только: " + ticketsAvailable);
//                    }
//                }

//                // Итоговые результаты
//                System.out.println("\n--- Работа программы завершена ---");
//                if (maxTicketsBought > 0) {
//                    System.out.println("Имя клиента с наибольшим кол-вом билетов: " + bestCustomer + " (" + maxTicketsBought + ")");
//                }
//                System.out.println("Общая сумма в кассе: " + totalMoney + " шекелей.");
//
 //                scanner.close();
 //           }
//        }
//      Задача персонаж
        // Базовые характеристики героя
//        byte characterLevel = 1;                    // Уровень персонажа
//        short armorRating = 50;                     // Показатель брони
//        int experiencePoints = 0;                  // Накопленный опыт
//        long goldCoins = 1000000L;                  // Несметные сокровища
//        float magicResistance = 15.5f;              // Сопротивление магии
//        double criticalHitChance = 0.05;            // Шанс критического удара

        // Вывод характеристик в консоль
//        System.out.println("--- Характеристики героя ---");
//        System.out.println("Уровень: " + characterLevel);
//        System.out.println("Броня: " + armorRating);
//        System.out.println("Опыт: " + experiencePoints);
//        System.out.println("Золото: " + goldCoins);
//        System.out.println("Сопротивление магии: " + magicResistance + "%");
//        System.out.println("Шанс крита: " + (criticalHitChance * 100) + "%");
//    }
//}
    // Gold
        // Огромный запас золота с использованием подчеркиваний и суффикса L
 //       long dragonHoard = 10_000_000_000L;

 //       System.out.println("В сокровищнице дракона: " + dragonHoard + " золотых монет!");
 //   }
//}
        // Объявляем загадочный символ
//        char mysteryCharacter = 'W';

        // Магическое преобразование char в int (неявное приведение)
//        int decryptedCode = mysteryCharacter;

        // Вывод результата исследования
 //       System.out.println("Код символа '" + mysteryCharacter + "': " + decryptedCode);
//    }
//}
        // Объявляем символ кириллицы
 //       char russianChar = 'Ж';

        // Превращаем символ в его числовое откровение
//        int characterCode = (int) russianChar;

        // Выводим результат
//        System.out.println("Код символа 'Ж': " + characterCode);
//    }
//}
        // Данные космического полета
//        double journeyDistance = 150.0;
//        double travelTime = 2.5;

        // Расчет средней скорости
//        double averageSpeed = journeyDistance / travelTime;

        // Вывод результата на экран навигатора
//        System.out.println("Средняя скорость полёта: " + averageSpeed + " св. лет за цикл");
 //   }
//}
        //программное обеспечение для нового, умного вендингового автомата.
 //       Scanner input = new Scanner(System.in);

 //       System.out.print("Введите сумму: ");

        // Считываем как текст и сразу превращаем в число
//        String data = input.next().replace(',', '.');
 //       double customerPayment = Double.parseDouble(data);

 //       System.out.println("Внесено средств: " + customerPayment);
 //   }
//}
        // Цена товара с лишними знаками
//        double productPrice = 1234.56789;

        // Форматированный вывод: % — начало, .2 — два знака, f — тип double/float
//        System.out.printf("Цена товара: %.2f", productPrice);
//    }
//}
        //яблоки
//        int totalApples = 7;
//        int numberOfFriends = 2;

        // Преобразуем totalApples в double, чтобы деление было точным
//        double applesPerFriend = (double) totalApples / numberOfFriends;

//        System.out.println("Доля каждого друга: " + applesPerFriend);
        // Смешиваем компоненты
//        double mixtureResult = 0.1 + 0.2;
//        double expectedConcentration = 0.3;

        // Сравниваем результат с ожиданием
//        boolean isEqual = (mixtureResult == expectedConcentration);

        // Выводим результаты на экран
//        System.out.println("Результат смешивания: " + mixtureResult);
//        System.out.println("Ожидаемая концентрация: " + expectedConcentration);
//        System.out.println("Равны ли значения? " + isEqual);
        // Симулируем выход за пределы понимания
//        double cosmicEvent = 1.0 / 0.0;

        // Выводим результат деления
//        System.out.println("Результат космического события: " + cosmicEvent);

        // Проверяем, является ли это бесконечностью
//        boolean isInfinite = Double.isInfinite(cosmicEvent);
//        System.out.println("Это бесконечность? " + isInfinite);
        // Пытаемся извлечь корень из отрицательного числа
//        double mysticAnomaly = Math.sqrt(-1);

        // Лицезрим результат
//        System.out.println("Значение мистической аномалии: " + mysticAnomaly);

        // Подтверждаем неопределенность
//        boolean isUncertain = Double.isNaN(mysticAnomaly);
//        System.out.println("Является ли это неопределенностью (NaN)? " + isUncertain);
        // Установка частот
//        double actualFrequency = 0.1 + 0.2;
//        double targetFrequency = 0.3;
//        double tolerance = 0.000001;

        // Если разница меньше допуска — всё отлично
//        if (Math.abs(actualFrequency - targetFrequency) < tolerance) {
//            System.out.println("Лазер откалиброван с допустимой точностью");
//        } else {
//            System.out.println("Требуется дополнительная калибровка");
//        }
//    }
//}
        // Исходный расчет металла
//        double rawMetalEstimate = 789.456;

        // Округляем до ближайшего целого (результат будет long)
//        long roundedMetalAmount = Math.round(rawMetalEstimate);

        // Вывод результата для отдела логистики
//        System.out.println("Необходимый объем металла для заказа: " + roundedMetalAmount + " тонн");
//    }
//}
// massivi
       // zadacha 1
        // Создаем рюкзак на 5 ячеек
//        int[] inventorySlots = new int[5];

        // Помещаем артефакт (7) в самую первую ячейку (индекс 0)
//        inventorySlots[0] = 7;

        // Проверяем содержимое первой ячейки
//        System.out.println("Предмет в первой ячейке: " + inventorySlots[0]);
//    }
//}
    // zadacha 2
        // Создаем массив для хранения трех наименований
        // Создаем массив для хранения трех строк
//        String[] favoriteLanguages = new String[3];

        // Заполняем каждую из трех ячеек
//        favoriteLanguages[0] = "Java";
//        favoriteLanguages[1] = "Java";
//        favoriteLanguages[2] = "Java";

        // Выводим размер массива с помощью свойства length
//        System.out.println("Количество записей в списке: " + favoriteLanguages.length);
//    }
//}
    // zadacha 3
        // Создаем массив для 4-х измерений
//        double[] sensorReadings = new double[4];

        // Обновляем показания третьего датчика (индекс 2)
//        sensorReadings[2] = 3.14;

        // Выводим все показания в одну строку через пробел
//        System.out.print(sensorReadings[0] + " ");
//        System.out.print(sensorReadings[1] + " ");
//        System.out.print(sensorReadings[2] + " ");
//        System.out.print(sensorReadings[3]);
//    }
//}
    // zadacha 4
        // Создаем массив для 10 раундов
//        int[] roundScores = new int[10];

        // Используем цикл для заполнения массива
//        for (int i = 0; i < roundScores.length; i++) {
            // Индекс i идет от 0 до 9, поэтому прибавляем 1, чтобы получить очки от 1 до 10
//            roundScores[i] = i + 1;
//        }

        // Используем цикл для вывода всех элементов в одну строку
//        for (int i = 0; i < roundScores.length; i++) {
//            System.out.print(roundScores[i] + " ");
//        }
//    }
//}
    // zadacha 5
        // Быстрая инициализация массива с 5 результатами
//        int[] gameHighScores = {10, 20, 30, 40, 50};

        // Используем цикл for-each для вывода каждого рекорда
//        for (int score : gameHighScores) {
            // System.out.println автоматически переносит текст на новую строку
//            System.out.println(score);
//        }
//    }
//}
    // zadacha 6
        // Создаем сканер для чтения ввода пользователя
//        Scanner input = new Scanner(System.in);

        // Создаем массив для 3-х названий фильмов
//        String[] favoriteMovies = new String[3];

//        System.out.println("Введите три ваших любимых фильма:");

        // Цикл для заполнения массива (от 0 до 2)
//        for (int i = 0; i < favoriteMovies.length; i++) {
//            favoriteMovies[i] = input.nextLine();
//        }

//        System.out.println("\nВаш список в обратном порядке:");

        // Цикл для вывода в обратном порядке
        // Начинаем с последнего индекса (2), идем пока i >= 0
//        for (int i = favoriteMovies.length - 1; i >= 0; i--) {
//            System.out.println(favoriteMovies[i]);
//        }

//        input.close();
//    }
//}
    // zadacha 7
        // Быстрая инициализация массива с ценами товаров
//        int[] itemPrices = {5, 7, 2, 9};

        // Переменная для хранения итоговой суммы
//        int totalSum = 0;

        // Проходим по массиву и прибавляем цену каждого товара к общей сумме
//        for (int price : itemPrices) {
//            totalSum += price;
//        }

        // Выводим результат покупателю
//        System.out.println("Общая сумма к оплате: " + totalSum + " кредитов");
//    }
//}
    // zadacha 8
        // Инициализируем массив с показаниями температуры
//        int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};

        // Предполагаем, что первое значение в массиве — максимальное
//        int maxTemp = hourlyTemperatures[0];

        // Проходим циклом по массиву, начиная со второго элемента
//        for (int i = 1; i < hourlyTemperatures.length; i++) {
            // Если текущее значение больше нашего максимума, обновляем максимум
//            if (hourlyTemperatures[i] > maxTemp) {
//                maxTemp = hourlyTemperatures[i];
//            }
//        }

        // Выводим результат
//        System.out.println("Самая высокая температура за день: " + maxTemp + "°C");
//    }
//}
        // Создаем массив, например, из 6 элементов
//        int[] numbers = new int[6];

        // 1. Распечатываем нулевой массив (состояние до заполнения)
//        System.out.println("До заполнения: " + Arrays.toString(numbers));

        // 2. Заполняем массив: значение элемента = его индекс
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i; // Здесь происходит магия: в ячейку 0 пишем 0, в 1 пишем 1 и т.д.
//        }

        // 3. Распечатываем массив после присвоения
//        System.out.println("После заполнения: " + Arrays.toString(numbers));
//    }
//}
    //practica
    // zadacha 1
        // 1. Создаем массив
//                int[] numbers = {1, 2, 3, 4, 5};

        // Заменяем элемент
//        numbers[2] = 10;

        // Просто выводим числа через пробел
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}
    //zadacha 2
//        int[] nums = {1, 2, 3, 4, 5};

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//}
    //zadacha 3
//        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//}
    //zadacha 4
//        int[] nums = {5, 10, 15, 20};
//        int sum = 0;

//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//        }

//        System.out.println(sum);
//    }
//}
    //zadacha 5
//        int[] nums = {2, 4, 6, 8, 10};
//        int sum = 0;

//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//        }

//        double average = (double) sum / nums.length;

//        System.out.println(average);
//    }
//}
    //zadacha 6
//        int[] nums = {3, 17, 5, 24, 8};
//        int max = nums[0]; // Предполагаем, что первое число — самое большое

//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i]; // Если нашли число больше, запоминаем его
//            }
//        }

//        System.out.println(max);
//    }
//}
    //zadacha 7
//        int[] nums = {12, 4, 56, 2, 8};
//        int min = nums[0]; // Берем первое число за образец

//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < min) {
//                min = nums[i]; // Если нашли число меньше, запоминаем его
//            }
//        }

//        System.out.println(min);
//    }
//}
    //zadacha 8
//        int[] nums = {1, 2, 3, 4, 5, 6, 8};
//        int count = 0;

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                count++;
//            }
//        }

//        System.out.println(count);
//    }
//}
    //zadacha 9
//        int[] nums = {15, -3, 7, -1, 0, -8};

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                nums[i] = 0;
//            }
//        }

        // Вывод результата
//        for (int x : nums) {
//            System.out.println(x);
//        }
//    }
//}
    //zadacha 10
//        int[] nums = {1, 2, 3, 4, 5};

        // Начинаем с последнего индекса (длина - 1)
        // Идем до нуля включительно (i >= 0)
//        for (int i = nums.length - 1; i >= 0; i--) {
//            System.out.println(nums[i]);
//        }
//    }
//}
    //zadacha 11
//        int[] nums = {5, 12, 7, 21, 8};
//        int x = 7;
//        boolean found = false;

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == x) {
//                found = true;
//                break; // Число найдено, дальше можно не искать
//            }
//        }

//        System.out.println(found);
//    }
//}
    //zadacha 12
//        int[] nums = {10, -5, 0, 0, 3, -2, 0};

//        int pos = 0; // Положительные
//        int neg = 0; // Отрицательные
//        int zeros = 0; // Нули

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                pos++;
//            } else if (nums[i] < 0) {
//                neg++;
//            } else {
//                zeros++;
//            }
//        }

//        System.out.println("Положительных: " + pos);
//        System.out.println("Отрицательных: " + neg);
//        System.out.println("Нулей: " + zeros);
//    }
//}
    //dvumernii massiv
    //zadacha 1
        // Создаем двумерный массив: 2 ряда, 3 места
//        int[][] theaterSeating = new int[2][3];

        // Заполняем массив числами от 1 до 6
//        theaterSeating[0][0] = 1;
//        theaterSeating[0][1] = 2;
//        theaterSeating[0][2] = 3;
//        theaterSeating[1][0] = 4;
//        theaterSeating[1][1] = 5;
//        theaterSeating[1][2] = 6;

        // Выводим только значение элемента по индексу [1][0]
//        System.out.println(theaterSeating[1][0]);
//    }
//}
    //zadacha 2
        // Создаем массив строк: 3 строки и 2 столбца
//        String[][] displayGrid = new String[3][2];

        // Присваиваем "Hello" последней ячейке (индексы 2 и 1)
//        displayGrid[2][1] = "Hello";

        // Выводим этот элемент на экран
//        System.out.println(displayGrid[2][1]);
//    }
//}
    //zadacha 3
//        int[][] warehouseInventory = new int[3][4];
//        int count = 1;

        // 1. Заполняем массив
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                warehouseInventory[i][j] = count;
//                count++;
//            }
//        }

        // 2. Выводим всю таблицу
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(warehouseInventory[i][j] + "\t"); // \t добавляет ровный отступ
//            }
//            System.out.println(); // Переход на новую строку после каждой строки массива
//        }

//        // 3. Отдельно выводим значение по запросу (2 строка, 3 столбец)
//        System.out.println("\nЗначение в [1][2]: " + warehouseInventory[1][2]);
//    }
//}
// zadacha 4
// Создаем массив датчиков: 2 ряда и 5 столбцов
//        int[][] sensorData = new int[2][5];
//        int val = 10;

        // Заполняем массив числами от 10 до 19
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 5; j++) {
//                sensorData[i][j] = val;
//                val++;
//            }
//        }

        // Выводим массив в виде таблицы
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(sensorData[i][j]);

                // Добавляем пробел, если это не последний элемент в строке
//                if (j < 4) {
//                    System.out.print(" ");
//                }
//            }
            // Переход на новую строку после завершения ряда
//            System.out.println();
//        }
//    }
//}
// Arrays
// zadacha 1
// Создаем массив с результатами забега
//        int[] raceTimes = {7, 2, 9, 4, 1};

        // Сортируем массив по возрастанию
//        Arrays.sort(raceTimes);

        // Выводим результат в красивом виде [1, 2, 4, 7, 9]
//        System.out.println(Arrays.toString(raceTimes));
//    }
//}
//zadacha 2
// Создаем массив строк на 6 элементов
//        String[] warehouseSlots = new String[6];

        // Заполняем весь массив значением "Empty"
//        Arrays.fill(warehouseSlots, "Empty");

        // Выводим массив в консоль в удобном формате
//        System.out.println(Arrays.toString(warehouseSlots));
//    }
//}
//zadacha 3
// Создаем массив с показаниями температур
//        int[] dailyTemperatures = {10, 20, 30, 40, 50, 60, 70};

        // Копируем диапазон: от индекса 2 (включительно) до индекса 5 (исключая его)
        // Будут скопированы элементы с индексами 2, 3 и 4
//        int[] reportData = Arrays.copyOfRange(dailyTemperatures, 2, 5);

        // Выводим новый массив на экран
//        System.out.println(Arrays.toString(reportData));
//    }
//}
// zadacha 4
// Создаем два массива с секретными кодами
//        int[] mainCode = {3, 6, 9, 12};
//        int[] backupCode = {3, 6, 9, 12};

        // Сравниваем содержимое массивов
//        boolean isIdentical = Arrays.equals(mainCode, backupCode);

        // Выводим результат сравнения на экран
//        System.out.println(isIdentical);
//    }
//}
