import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

import static java.awt.Color.*;
import static java.util.concurrent.Future.State.CANCELLED;
import static javax.print.attribute.standard.PrinterState.PROCESSING;

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
//        // zadacha 5
//        Scanner scanner = new Scanner(System.in);
//        int choice = -1; // Переменная для выбора пользователя
//
//        // Цикл работает, пока пользователь не введет 0
//        while (choice != 0) {
//            System.out.println("\n--- МЕНЮ ---");
//            System.out.println("1 — Показать баланс");
//            System.out.println("2 — Пополнить счёт");
//            System.out.println("3 — Снять деньги");
//            System.out.println("0 — Выход");
//            System.out.print("Ваш выбор: ");
//
//            choice = scanner.nextInt();
//
//            // Обрабатываем выбор через switch
//            switch (choice) {
//                case 1 -> System.out.println("Ваш баланс: 1000 руб.");
//                case 2 -> System.out.println("Счёт успешно пополнен!");
//                case 3 -> System.out.println("Возьмите ваши деньги.");
//                case 0 -> System.out.println("Завершение работы. До свидания!");
//                default -> System.out.println("Ошибка! Введите число от 0 до 3.");
//            }
//        }
//
//        scanner.close();
//    }
//}
// isklucheniya
// zadacha 1
//              int totalEnergy = 100;
//              int divisor = 0;
//
//              System.out.println("Зорг нажимает на кнопку деления...");
//
//              // Попытка разделить на ноль
//              int result = totalEnergy / divisor;
//
//              // Этот код не выполнится
//              System.out.println("Результат: " + result);
//       }
//}
// zadacha 2
//              // Создаем рюкзак на 3 ячейки
//              int[] collectedGems = {10, 20, 30};
//
//              System.out.println("Герой открывает рюкзак...");
//
//              // Пытаемся достать кристалл из 5-й ячейки (которой нет)
//              int ghostGem = collectedGems[5];
//
//              // Этот код уже не сработает
//              System.out.println("Вы нашли кристалл ценностью: " + ghostGem);
//       }
//}
// zadacha 3
// 1. Объявляем строковую переменную с некорректным значением
//              String playerAgeInput = "abc";
//
//              System.out.println("Попытка преобразовать ввод игрока: " + playerAgeInput);
//
//              // 2. Пробуем преобразовать строку в число
//              int age = Integer.parseInt(playerAgeInput);
//
//              // 3. Этот текст не выведется, так как программа «упадет» строчкой выше
//              System.out.println("Преобразование успешно! Возраст: " + age);
//       }
//}
// zadacha 4
// 1. Создаем переменную, которая ни на что не указывает
//              String secretAgentName = null;
//
//              System.out.println("Попытка узнать длину имени секретного агента...");
//
//              // 2. Пытаемся вызвать метод length() у null
//              int nameLength = secretAgentName.length();
//
//              // 3. До этой строки код не дойдет
//              System.out.println("Длина имени: " + nameLength);
//       }
//}
// try-catch
// 1. Объявляем переменные
//              int totalDistance = 100;
//              int stepsPerUnit = 0;
//
//              // 2. Оборачиваем опасную операцию в try-catch
//              try {
//                     System.out.println("Робот пытается вычислить количество шагов...");
//                     int result = totalDistance / stepsPerUnit;
//
//                     // Эта строка не выполнится, если произойдет деление на ноль
//                     System.out.println("Результат: " + result);
//
//              } catch (ArithmeticException e) {
//                     // 3. Обрабатываем исключение и выводим дружелюбное сообщение
//                     System.out.println("Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры.");
//              }
//
//              System.out.println("Программа робота завершена корректно.");
//       }
//}
// zadacha 2
// 1. Создаем рюкзак на 3 слота и заполняем его ID предметов
//              int[] heroInventory = {101, 102, 103};
//
//              // 2. Оборачиваем попытку доступа в try-catch
//              try {
//                     System.out.println("Игрок пытается открыть 10-й слот рюкзака...");
//
//                     // Попытка обратится к индексу 10 (это 11-й элемент)
//                     int item = heroInventory[10];
//
//                     System.out.println("Вы достали предмет: " + item);
//              } catch (ArrayIndexOutOfBoundsException e) {
//                     // 3. Перехватываем ошибку границ массива
//                     System.out.println("Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива.");
//              }
//
//              System.out.println("Игра продолжается, инвентарь закрыт.");
//       }
//}
// zadacha 3
//              int totalScore = 50;
//              int numberOfPlayers = 0;
//
//              try {
//                     System.out.println("Вычисляем средний балл команды...");
//
//                     // Попытка деления на ноль
//                     int averageScore = totalScore / numberOfPlayers;
//
//                     System.out.println("Средний балл: " + averageScore);
//
//              } catch (ArithmeticException e) {
//                     // Используем e.getMessage(), чтобы получить системное описание ошибки
//                     System.out.println("Произошла ошибка! Системное сообщение: " + e.getMessage());
//              }
//
//              System.out.println("Программа завершила проверку данных.");
//       }
//}
// zadacha 4
// 1. Объявляем переменные для критической операции
//              int primaryValue = 10;
//              int secondaryValue = 0;
//
//              // 2. Изолируем опасный участок кода
//              try {
//                     System.out.println("Запуск вычислений...");
//                     int result = primaryValue / secondaryValue;
//                     System.out.println("Результат: " + result);
//              } catch (ArithmeticException e) {
//                     // 3. Обрабатываем сбой, не останавливая всю программу
//                     System.out.println("Ошибка деления. Продолжаем работу системы.");
//              }
//
//              // 4. Код вне блока try-catch, который выполнится в любом случае
//              System.out.println("Миссия завершена. Программа завершена.");
//       }
//}
//finally и throw: завершение и генерация исключений
// zadacha 1
//              int totalTasks = 10;
//              int tasksPerMinute = 2;
//
//              try {
//                     // Вычисляем время выполнения
//                     int timeNeeded = totalTasks / tasksPerMinute;
//                     System.out.println("Время выполнения уборки: " + timeNeeded + " мин.");
//
//              } catch (ArithmeticException e) {
//                     // На случай, если в будущем tasksPerMinute станет равно 0
//                     System.out.println("Ошибка: робот не может работать с нулевой скоростью!");
//
//              } finally {
//                     // Этот блок выполнится в любом случае
//                     System.out.println("Робот завершил свою работу. Выполнение завершено.");
//              }
//       }
//}
// zadacha 2
// 1. Первый вызов с корректным значением
//              System.out.println("--- Попытка 1: Положительный счет ---");
//              displayPositiveScore(50);
//
//              System.out.println("\n--- Попытка 2: Отрицательный счет ---");
//              // 2. Второй вызов оборачиваем в try-catch
//              try {
//                     displayPositiveScore(-5);
//              } catch (IllegalArgumentException e) {
//                     // Перехватываем наше исключение и выводим его сообщение
//                     System.out.println("Ошибка для игрока: " + e.getMessage());
//              }
//       }
//
//       /**
//        * Метод для отображения счета с проверкой на положительное значение
//        */
//       public static void displayPositiveScore(int currentScore) {
//              if (currentScore < 0) {
//                     // Вручную генерируем исключение, если условие нарушено
//                     throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
//              }
//              System.out.println("Текущий счет игрока: " + currentScore);
//       }
//}
// zadacha 3
//              System.out.println("--- Запуск критического модуля ---");
//
//              try {
//                     System.out.println("Попытка выполнить опасное вычисление...");
//                     // Намеренно вызываем ArithmeticException
//                     int result = 5 / 0;
//
//                     // Эта строка никогда не будет достигнута
//                     System.out.println("Результат: " + result);
//
//              } finally {
//                     // Этот блок выполнится ПЕРЕД тем, как программа «вылетит» с ошибкой
//                     System.out.println("Датчик сообщает: Работа finally завершена. Даже в случае аварии.");
//              }
//
//              // Эта строка НЕ выполнится, так как исключение не было поймано в catch
//              System.out.println("Этот текст вы не увидите в консоли.");
//       }
//}
// zadacha 4
//              System.out.println("--- Начало процесса регистрации ---");
//
//              try {
//                     // Вызываем метод с пустой строкой, что приведет к ошибке
//                     validateUserName("");
//              } catch (IllegalArgumentException e) {
//                     // Перехватываем исключение и выводим причину отказа
//                     System.out.println("Результат: " + e.getMessage());
//              }
//
//              System.out.println("--- Программа продолжает работу ---");
//       }
//
//       /**
//        * Метод для проверки имени пользователя
//        */
//       public static void validateUserName(String userName) {
//              try {
//                     if (userName == null || userName.isEmpty()) {
//                            // Вручную генерируем исключение для пустого имени
//                            throw new IllegalArgumentException("Регистрация отклонена: Имя пользователя не может быть пустым.");
//                     }
//                     System.out.println("Имя пользователя '" + userName + "' успешно прошло проверку.");
//              } finally {
//                     // Это сообщение появится ВСЕГДА, даже после throw
//                     System.out.println("Проверка имени пользователя завершена.");
//              }
//       }
//}
// Проброс исключений (throws)
// zadacha 1

//                            System.out.println("Попытка получить доступ к документу...");
//
//                            // Поскольку метод accessSecretDocument "обещает" выкинуть ошибку через throws,
//                            // Java ОБЯЗЫВАЕТ нас обернуть его вызов в try-catch в методе main.
//                            try {
//                                   accessSecretDocument("top_secret_plan.txt");
//                            } catch (FileNotFoundException e) {
//                                   System.out.println("Система безопасности: Файл не найден! Доступ заблокирован.");
//                                   System.out.println("Детали ошибки: " + e.getMessage());
//                            }
//                     }
//
//                     /**
//                      * Метод только ПРЕДУПРЕЖДАЕТ о возможной ошибке через throws.
//                      * Он не решает проблему сам, а пробрасывает её вызывающему коду.
//                      */
//                     public static void accessSecretDocument(String documentPath) throws FileNotFoundException {
//                            // Создание FileReader может вызвать FileNotFoundException
//                            FileReader reader = new FileReader(documentPath);
//
//                            // Если файл найден, код пойдет дальше (но в этой задаче файла нет)
//                            System.out.println("Документ успешно открыт.");
//                     }
//              }
// zadacha 2
//              System.out.println("Запуск анализатора системных логов...");
//
//              // 1. Пытаемся вызвать "опасный" метод
//              try {
//                     analyzeSystemLog("non_existent_log.txt");
//              } catch (IOException e) {
//                     // 2. Main берет на себя ответственность за обработку
//                     System.out.println("Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла.");
//              }
//
//              System.out.println("Работа утилиты завершена.");
//       }
//
//       /**
//        * Метод заявляет о возможном IOException.
//        * Он не обрабатывает ошибку сам, а делегирует её на уровень выше.
//        */
//       public static void analyzeSystemLog(String logFileName) throws IOException {
//              // Имитируем работу: создание потока чтения может вызвать IOException
//              FileReader fileReader = new FileReader(logFileName);
//              BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//              // Читаем первую строку (тоже потенциальный IOException)
//              String firstLine = bufferedReader.readLine();
//              System.out.println("Первая запись в логе: " + firstLine);
//
//              bufferedReader.close();
//       }
//}
// zadacha 3
//              String fileName = "data_source.txt";
//
//              System.out.println("Запуск конвейера обработки данных...");
//
//              try {
//                     extractFirstLineFromData(fileName);
//              } catch (FileNotFoundException e) {
//                     System.out.println("Критическая ошибка: Файл '" + fileName + "' не найден!");
//              } catch (IOException e) {
//                     System.out.println("Ошибка ввода-вывода: Проблема при чтении данных из файла.");
//              }
//       }
//
//       /**
//        * Метод извлекает первую строку.
//        * Он честно предупреждает о двух типах возможных проблем.
//        */
//       public static void extractFirstLineFromData(String dataFile)
//               throws FileNotFoundException, IOException {
//
//              // 1. Попытка открыть файл (может выбросить FileNotFoundException)
//              FileReader fileReader = new FileReader(dataFile);
//
//              // 2. Оборачиваем в BufferedReader для чтения строк
//              BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//              // 3. Попытка прочитать строку (может выбросить IOException)
//              String firstLine = bufferedReader.readLine();
//
//              System.out.println("Первая строка успешно извлечена: " + firstLine);
//
//              bufferedReader.close();
//       }
//}
// zadacha 4
//              System.out.println("--- Добро пожаловать в лавку обмена золота! ---");
//
//              // Имитируем некорректный ввод игрока
//              String inputFromPlayer = "десять золота";
//
//              try {
//                     // Пытаемся вызвать наш метод конвертации
//                     int amount = convertToGoldAmount(inputFromPlayer);
//                     System.out.println("Вы успешно обменяли " + amount + " золотых монет.");
//              } catch (NumberFormatException e) {
//                     // Перехватываем ошибку, если игрок ввел текст вместо цифр
//                     System.out.println("Игрок ввел неверное значение. Ошибка преобразования числа.");
//              }
//
//              System.out.println("--- Работа системы обмена завершена ---");
//       }
//
//       /**
//        * Метод преобразует строку в количество золота.
//        * Мы явно указываем throws NumberFormatException, чтобы предупредить о риске.
//        */
//       public static int convertToGoldAmount(String playerInput) throws NumberFormatException {
//              // Пробуем превратить строку в число.
//              // Если в строке буквы, Integer.parseInt сам "выбросит" исключение.
//              return Integer.parseInt(playerInput);
//       }
//}
//Stack Trace
// zadacha 1
//              System.out.println("Начинаем расчет порций...");
//
//              int ingredients = 10;
//              int perPortion = 0; // Ошибка: забыли указать количество
//
//              // Критическая точка: деление на ноль
//              int totalPortions = ingredients / perPortion;
//
//              System.out.println("Всего порций: " + totalPortions);
//       }
//}
// zadacha 2
// 1. Создаем инвентарь на 3 слота (индексы: 0, 1, 2)
//              int[] playerInventory = {777, 888, 999};
//
//              System.out.println("Игрок открывает рюкзак...");
//
//              // 2. Критическая ошибка: попытка обратится к индексу 5
//              int specialArtifact = playerInventory[5];
//
//              System.out.println("Вы получили артефакт: " + specialArtifact);
//       }
//}
// zadacha 3
//              System.out.println("--- Запуск системы отчётов ---");
//
//              // 1. Точка входа: вызываем первый модуль
//              calculateReportData();
//
//              System.out.println("--- Система завершила работу ---");
//       }
//
//       public static void calculateReportData() {
//              System.out.println("Модуль расчёта данных запущен...");
//
//              // 2. Промежуточный этап: вызываем обработку чисел
//              processRawNumbers();
//       }
//
//       public static void processRawNumbers() {
//              System.out.println("Обработка сырых чисел...");
//
//              // 3. Корень проблемы: деление на ноль
//              int result = 100 / 0;
//
//              System.out.println("Результат обработки: " + result);
//       }
//}
// zadacha 4
              System.out.println("1. [Main]: Получен запрос от пользователя. Начинаем цепочку...");

              // Запуск первого уровня
              processInitialRequest();

              System.out.println("5. [Main]: Запрос успешно обработан."); // Эта строка не выполнится
       }

       public static void processInitialRequest() {
              System.out.println("2. [Level 1]: Первичная обработка пройдена. Передаем управление...");
              handleIntermediateStep();
       }

       public static void handleIntermediateStep() {
              System.out.println("3. [Level 2]: Промежуточный этап выполнен. Выполняем финальное действие...");
              executeFinalAction();
       }

       public static void executeFinalAction() {
              System.out.println("4. [Level 3]: Попытка сохранить данные в массив...");

              // Создаем маленький массив
              int[] temporaryData = {10, 20};

              // КРИТИЧЕСКАЯ ОШИБКА: Доступ к индексу 10 (его не существует)
              int value = temporaryData[10];

              System.out.println("Значение получено: " + value);
       }
}