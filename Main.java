import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

import static java.awt.Color.*;

public class Main {
    public static void main(String[] args) {
        // obertka
        // zadacha 1
        // 1. Создаем строковую переменную
//        String playerScoreText = "500";
//
//        // 2. Превращаем строку в целое число (Integer)
//        int actualPlayerScore = Integer.parseInt(playerScoreText);
//
//        // 3. Выводим результат, чтобы убедиться в успехе
//        System.out.println("Число успешно получено: " + actualPlayerScore);

        // zadacha 2
        // 1. Создаем переменную с символом
//        char symbol = '7';
//
//        // 2. Используем класс Character, чтобы проверить, является ли символ цифрой
//        boolean isDigit = Character.isDigit(symbol);
//
// 3. Выводим результат проверки
//        System.out.println("Является ли символ '" + symbol + "' цифрой? Ответ: " + isDigit);
        //zadacha 3
//        // 1. Обычная переменная (примитив)
//        double productPrice = 3.14;
//
//        // 2. Автоупаковка (Autoboxing): превращаем в объект Double
//        Double wrappedPrice = productPrice;
//
//        // 3. Автораспаковка (Unboxing): возвращаем обратно в простой тип double
//        double finalCalculatedPrice = wrappedPrice;
//
//        // Выводим результат на экран
//        System.out.println("Финальная цена после распаковки: " + finalCalculatedPrice);
        //zadacha 4
//        // 1. Строка от датчика с некорректным значением
//        String sensorReadingText = "NaN";
//
//        // 2. Преобразуем строку в double
//        double parsedSensorData = Double.parseDouble(sensorReadingText);
//
//        // 3. Проверяем, является ли число тем самым "не числом" (NaN)
//        boolean isError = Double.isNaN(parsedSensorData);
//
//        // 4. Выводим результат проверки
//        System.out.println("Полученные данные: " + parsedSensorData);
//        System.out.println("Это ошибка: " + isError);
        //konstanti
        //zadacha 1
        // Используем var вместо String.
        // Java сама поймет, что это строка, увидев текст в кавычках.
//        var welcomeMessage = "Привет, Java!";
//
//        // Выводим переменную на экран
//        System.out.println(welcomeMessage);
        // zadacha 2
//        // Объявляем константу с помощью ключевого слова final
//        final int DAYS_IN_CALENDAR_WEEK = 7;
//
//        // Выводим значение на экран
//        System.out.println("Количество дней в неделе: " + DAYS_IN_CALENDAR_WEEK);
//
//        // Если попытаться написать DAYS_IN_CALENDAR_WEEK = 8;
//        // Java выдаст ошибку еще на этапе сборки программы.
        // zadacha 3
//        class MathFormulas {
//            // public — доступна везде
//            // static — принадлежит классу (не нужно создавать объект)
//            // final — нельзя изменить
//            public static final double PI_VALUE = 3.1415926535;
//        }
//
//                // Обращаемся к константе напрямую через имя класса
//                System.out.println("Значение Пи из нашей библиотеки: " + MathFormulas.PI_VALUE);
//
//                // Пример использования в расчете:
//                double radius = 10;
//                double area = MathFormulas.PI_VALUE * (radius * radius);
//                System.out.println("Площадь круга с радиусом 10: " + area);
        // zadacha 4
//        // 1. Объявляем константу с лимитом игроков
//        final int MAX_PLAYERS_ON_SERVER = 100;
//
//        // 2. Выводим текущее значение
//        System.out.println("Лимит игроков установлен: " + MAX_PLAYERS_ON_SERVER);
//
//        // 3. ПОПЫТКА ИЗМЕНЕНИЯ (раскомментируй строку ниже, чтобы увидеть ошибку):
//         //MAX_PLAYERS_ON_SERVER = 200;
        // switch
        // zadacha 1
        // Создаем объект сканера
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите номер дня (1-3): ");
//
//        // Считываем целое число, которое ввел пользователь
//        int dayNumber = scanner.nextInt();
//
//        switch (dayNumber) {
//            case 1:
//                System.out.println("Понедельник");
//                break;
//            case 2:
//                System.out.println("Вторник");
//                break;
//            case 3:
//                System.out.println("Среда");
//                break;
//            default:
//                System.out.println("Неизвестный день");
//                break;
//        }
//
//        scanner.close(); // Закрываем сканер (хорошая привычка)
//    }
//}
        // zadacha 2
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите команду для робота (start, stop, exit): ");
//
//        // Считываем строку от пользователя и приводим её к нижнему регистру,
//        // чтобы команда "START" тоже сработала.
//        String command = scanner.nextLine().toLowerCase();
//
//        switch (command) {
//            case "start":
//                System.out.println("Запуск!");
//                break;
//            case "stop":
//                System.out.println("Остановка.");
//                break;
//            case "exit":
//                System.out.println("Выход.");
//                break;
//            default:
//                System.out.println("Неизвестная команда");
//                break;
//        }
//
//        scanner.close();
//    }
//}
        // zadacha 3
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите номер месяца (1-12): ");
//        int month = scanner.nextInt();
//
//        switch (month) {
//            // Группируем зимние месяцы
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Зима");
//                break;
//            // Группируем весенние месяцы
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна");
//                break;
//            // Группируем летние месяцы
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето");
//                break;
//            // Группируем осенние месяцы
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень");
//                break;
//            // Если введено что-то другое
//            default:
//                System.out.println("Некорректный номер месяца");
//                break;
//        }
//
//        scanner.close();
//    }
//}
        //zadacha 4
//        Scanner scanner = new Scanner(System.in);
//
//        // 1. Просим ввести числа
//        System.out.print("Введите первое целое число: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Введите второе целое число: ");
//        int num2 = scanner.nextInt();
//
//        // 2. Просим ввести символ операции
//        System.out.print("Введите операцию (+, -, *, /): ");
//        char operation = scanner.next().charAt(0);
//
//        // 3. Выполняем расчет через switch
//        switch (operation) {
//            case '+':
//                System.out.println("Результат: " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("Результат: " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("Результат: " + (num1 * num2));
//                break;
//            case '/':
//                // Простая защита от деления на ноль
//                if (num2 != 0) {
//                    System.out.println("Результат деления: " + (num1 / num2));
//                } else {
//                    System.out.println("Ошибка: Деление на ноль невозможно!");
//                }
//                break;
//            default:
//                System.out.println("Неизвестная операция");
//                break;
//        }
//
//        scanner.close();
//    }
//}
        //enum
        //zadacha 1
        // 1. Создаем перечисление (обычно пишется вне класса Main или в отдельном файле)
//        enum TrafficSignalState {
//            RED, YELLOW, GREEN
//        }
//
//                 // 2. Создаем переменную типа нашего перечисления
//                // Мы не можем присвоить сюда что-то другое, например "BLUE"
//                TrafficSignalState currentSignal = TrafficSignalState.RED;
//
//                // 3. Выводим текущее состояние на экран
//                System.out.println("Сейчас горит свет: " + currentSignal);
//
//                // Маленький пример проверки:
//                if (currentSignal == TrafficSignalState.RED) {
//                    System.out.println("Стой! Идти нельзя.");
//                }
//            }
//        }
        // zadacha 2
//        // 1. Объявляем перечисление сезонов
//        enum Season {
//            WINTER, SPRING, SUMMER, AUTUMN
//        }
//
//                // 2. Устанавливаем текущий сезон
//                Season currentSeason = Season.SUMMER;
//
//                // 3. Используем switch для выбора сообщения
//                switch (currentSeason) {
//                    case WINTER:
//                        System.out.println("Зима — пора сказок и горячего какао!");
//                        break;
//                    case SPRING:
//                        System.out.println("Весна — время пробуждения природы!");
//                        break;
//                    case SUMMER:
//                        System.out.println("Лето — время ярких отпусков и приключений!");
//                        break;
//                    case AUTUMN:
//                        System.out.println("Осень — золотая пора для уютных прогулок!");
//                        break;
//                }
//            }
//        }
        //zadacha 3
//        // 1. Объявляем перечисление всех дней недели
//        enum DayOfWeek {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//
//                System.out.println("Доступные дни для планирования:");
//
//                // 2. Используем цикл for-each для перебора всех значений enum
//                // Метод .values() возвращает массив всех констант по порядку
//                for (DayOfWeek day : DayOfWeek.values()) {
//                    System.out.println("- " + day);
//                }
//            }
//        }
        // zadacha 4
//        // 1. Объявляем перечисление небесных тел
//        enum CelestialBody {
//            EARTH, MARS, JUPITER
//        }
//
//                // --- ШАГ 1: Текущее направление ---
//                CelestialBody currentDestination = CelestialBody.MARS;
//
//                // --- ШАГ 2: Метод name() ---
//                // Возвращает точное имя константы в виде строки
//                System.out.println("Текущая цель (имя): " + currentDestination.name());
//
//                // --- ШАГ 3: Метод ordinal() ---
//                // Возвращает порядковый номер (начинается с 0: EARTH=0, MARS=1, JUPITER=2)
//                System.out.println("Порядковый номер в каталоге: " + currentDestination.ordinal());
//
//                // --- ШАГ 4: Метод valueOf() ---
//                // Представим, что команда пришла извне как текст
//                String incomingCommand = "JUPITER";
//
//                // Превращаем строку обратно в объект перечисления
//                CelestialBody newTarget = CelestialBody.valueOf(incomingCommand);
//
//                System.out.println("Навигация перенастроена на: " + newTarget);
//            }
//        }
        // switch NEW
        // zadacha 1
//        int httpStatusCode = 200;
//
//        // Используем switch как выражение (expression), которое возвращает строку
//        String responseMessage = switch (httpStatusCode) {
//            case 200 -> "OK";
//            case 400, 404 -> "Ошибка клиента";
//            case 500 -> "Ошибка сервера";
//            default -> "Неизвестный код";
//        }; // Точка с запятой здесь обязательна, так как это присваивание
//
//        // Выводим результат
//        System.out.println("Статус запроса: " + responseMessage);
//    }
//}
        // zadacha 2
//        // 1. Команда, пришедшая на дрон
//        String droneCommand = "pause";
//
//        // 2. Используем switch-выражение для получения статуса
//        String droneStatusMessage = switch (droneCommand) {
//            case "start" -> "Запуск!";
//            case "stop"  -> "Остановка!";
//            case "pause" -> "Пауза...";
//            default      -> "Неизвестная команда";
//        };
//
//        // 3. Выводим результат работы системы
//        System.out.println("Статус дрона: " + droneStatusMessage);
//    }
//}
        // zadacha 3
//        // 1. Входные данные (номер дня)
//        int dayNumber = 2;
//
//        // 2. Современное switch-выражение
//        // Мы сразу присваиваем результат в переменную dayNameString
//        String dayNameString = switch (dayNumber) {
//            case 1 -> "Понедельник";
//            case 2 -> "Вторник";
//            case 3 -> "Среда";
//            default -> "Неизвестный день";
//        }; // Не забываем точку с запятой после блока switch!
//
//        // 3. Вывод результата
//        System.out.println("Сегодня по плану: " + dayNameString);
//    }
//}
        // zadacha 4
//        // 1. Текущий балл студента
//        int studentScore = 9;
//
//        // 2. Используем современное switch-выражение с группировкой значений
//        String finalGrade = switch (studentScore) {
//            case 5, 6, 7  -> "Хорошо";
//            case 8, 9, 10 -> "Отлично";
//            default       -> "Нужно постараться";
//        };
//
//        // 3. Выводим результат на экран
//        System.out.println("Ваша оценка: " + finalGrade);
//    }
//}
        // praktika enum
//    // zadacha 1
//        // 1. Создаем перечисление
//        enum Season {
//            WINTER, SPRING, SUMMER, AUTUMN
//        }
//
//        // 2. Выводим SUMMER на экран
//                System.out.println(Season.SUMMER);
//            }
//        }
        // zadacha 2
//        // 1. Создаем перечисление всех дней недели
//        enum Day {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//
//        // 2. Используем цикл for-each для перебора всех значений
//                for (Day day : Day.values()) {
//                    System.out.println(day);
//                }
//            }
//        }
        // zadacha 3
//        enum TrafficLight {
//            RED, YELLOW, GREEN
//        }
//
//                TrafficLight light = TrafficLight.RED; // Выбираем цвет
//
//                // Просто выводим действие в зависимости от цвета
//                switch (light) {
//                    case RED    -> System.out.println("Стой!");
//                    case YELLOW -> System.out.println("Жди!");
//                    case GREEN  -> System.out.println("Езжай!");
//                }
//            }
//        }
        // zadacha 4
//        enum Planet {
//            MERCURY(0.33),
//            VENUS(4.87),
//            EARTH(5.97),
//            MARS(0.64),
//            JUPITER(1898.0); // Юпитер — настоящий гигант!
//
//            public final double mass; // Переменная для хранения массы
//
//            // Конструктор: берет число из скобок и сохраняет его
//            Planet(double mass) {
//                this.mass = mass;
//            }
//        }
//
//                // Выводим массу Земли
//                System.out.println("Масса Земли: " + Planet.EARTH.mass);
//
//
//            }
//        }
        // zadacha 5
//        enum Operation {
//            ADD {
//                public double apply(double a, double b) { return a + b; }
//            },
//            SUBTRACT {
//                public double apply(double a, double b) { return a - b; }
//            },
//            MULTIPLY {
//                public double apply(double a, double b) { return a * b; }
//            },
//            DIVIDE {
//                public double apply(double a, double b) { return a / b; }
//            };
//
//            // Объявляем абстрактный метод, который каждая операция реализует по-своему
//            public abstract double apply(double a, double b);
//        }
//
//
//                double x = 10;
//                double y = 5;
//
//                // Пример использования
//                System.out.println("Сложение: " + Operation.ADD.apply(x, y));
//                System.out.println("Умножение: " + Operation.MULTIPLY.apply(x, y));
//            }
//        }
        // SWITCH
        // zadacha 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите число от 1 до 7: ");
//        int dayNumber = scanner.nextInt();
//
//        // Используем современный switch для определения дня
//        String dayName = switch (dayNumber) {
//            case 1 -> "Понедельник";
//            case 2 -> "Вторник";
//            case 3 -> "Среда";
//            case 4 -> "Четверг";
//            case 5 -> "Пятница";
//            case 6 -> "Суббота";
//            case 7 -> "Воскресенье";
//            default -> "Некорректное число! Введите от 1 до 7.";
//        };
//
//        System.out.println("Результат: " + dayName);
//
//        scanner.close();
//    }
//}
        // zadacha 5
        Scanner scanner = new Scanner(System.in);
        int choice = -1; // Переменная для выбора пользователя

        // Цикл работает, пока пользователь не введет 0
        while (choice != 0) {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1 — Показать баланс");
            System.out.println("2 — Пополнить счёт");
            System.out.println("3 — Снять деньги");
            System.out.println("0 — Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            // Обрабатываем выбор через switch
            switch (choice) {
                case 1 -> System.out.println("Ваш баланс: 1000 руб.");
                case 2 -> System.out.println("Счёт успешно пополнен!");
                case 3 -> System.out.println("Возьмите ваши деньги.");
                case 0 -> System.out.println("Завершение работы. До свидания!");
                default -> System.out.println("Ошибка! Введите число от 0 до 3.");
            }
        }

        scanner.close();
    }
}