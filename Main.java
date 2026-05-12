import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//              System.out.println("1. [Main]: Получен запрос от пользователя. Начинаем цепочку...");
//
//              // Запуск первого уровня
//              processInitialRequest();
//
//              System.out.println("5. [Main]: Запрос успешно обработан."); // Эта строка не выполнится
//       }
//
//       public static void processInitialRequest() {
//              System.out.println("2. [Level 1]: Первичная обработка пройдена. Передаем управление...");
//              handleIntermediateStep();
//       }
//
//       public static void handleIntermediateStep() {
//              System.out.println("3. [Level 2]: Промежуточный этап выполнен. Выполняем финальное действие...");
//              executeFinalAction();
//       }
//
//       public static void executeFinalAction() {
//              System.out.println("4. [Level 3]: Попытка сохранить данные в массив...");
//
//              // Создаем маленький массив
//              int[] temporaryData = {10, 20};
//
//              // КРИТИЧЕСКАЯ ОШИБКА: Доступ к индексу 10 (его не существует)
//              int value = temporaryData[10];
//
//              System.out.println("Значение получено: " + value);
//       }
//
//              Scanner scanner = new Scanner(System.in);
//
//              // Пример массива (можно заменить на null для проверки)
//              int[] arr = {10, 20, 30, 40, 50};
//
//              System.out.print("Введите индекс элемента: ");
//              int index = scanner.nextInt();
//
//              printArrayElement(arr, index);
//       }
//
//       public static void printArrayElement(int[] arr, int index) {
//              try {
//                     System.out.println("Элемент массива: " + arr[index]);
//              } catch (ArrayIndexOutOfBoundsException e) {
//                     System.out.println("Индекс вне диапазона");
//              } catch (NullPointerException e) {
//                     System.out.println("Массив не инициализирован");
//              }
//       }
//}
//              double balance = 100.0;
//
//              String[] tests = {
//                      "100",     // корректно
//                      "50.5",    // корректно
//                      "abc",     // не число
//                      "-30",     // отрицательная сумма
//                      "200"      // больше баланса
//              };
//
//              for (String test : tests) {
//                     try {
//                            System.out.println("\nТекущий баланс: " + balance);
//                            balance = processPayment(test, balance);
//                            System.out.println("Новый баланс: " + balance);
//
//                     } catch (IllegalArgumentException e) {
//                            System.out.println("Ошибка ввода: " + e.getMessage());
//
//                     } catch (ArithmeticException e) {
//                            System.out.println("Ошибка операции: " + e.getMessage());
//                     }
//              }
//       }
//
//       public static double processPayment(String amountText, double balance) {
//              double amount;
//
//              try {
//                     amount = Double.parseDouble(amountText);
//
//                     if (amount <= 0) {
//                            throw new IllegalArgumentException("Сумма должна быть больше нуля");
//                     }
//
//                     if (balance < amount) {
//                            throw new ArithmeticException("Недостаточно средств на счёте");
//                     }
//
//                     return balance - amount;
//
//              } catch (NumberFormatException e) {
//                     throw new IllegalArgumentException(
//                             "Сумма '" + amountText + "' не является числом"
//                     );
//              } finally {
//                     System.out.println("Попытка списания: " + amountText);
//              }
//       }
//}
// Stack Trace
// zadacha 1
//              int portions = 10 / 0;
//              System.out.println(portions);
//       }
//}
// zadacha 2
//              int[] playerInventory = {101, 202, 303};
//
//              // попытка получить "пятый" слот
//              System.out.println(playerInventory[5]);
//
//       }
//}
// zadacha 3
//              calculateReportData();
//       }
//
//       public static void calculateReportData() {
//              processRawNumbers();
//       }
//
//       public static void processRawNumbers() {
//              int result = 100 / 0; // намеренная ошибка
//              System.out.println(result);
//       }
//}
// zadacha 4
//              processInitialRequest();
//       }
//
//       public static void processInitialRequest() {
//              handleIntermediateStep();
//       }
//
//       public static void handleIntermediateStep() {
//              executeFinalAction();
//       }
//
//       public static void executeFinalAction() {
//              int[] temporaryData = {5, 10};
//              System.out.println(temporaryData[10]); // ошибка
//       }
//}
// создаём динамический список идентификаторов
    // ArrayList
    // zadacha 1
//              ArrayList<Integer> artifactIds = new ArrayList<>();
//
//              // добавляем новый артефакт
//              artifactIds.add(42);
//
//              // получаем первый элемент (индекс 0)
//              System.out.println(artifactIds.get(0));
//       }
//}
// zadacha 2
// создаём список фруктов
//              ArrayList<String> fruits = new ArrayList<>();
//
//              // добавляем начальные фрукты
//              fruits.add("Яблоко");
//              fruits.add("Банан");
//              fruits.add("Апельсин");
//
//              // заменяем "Банан" на "Груша"
//              fruits.set(1, "Груша");
//
//              // удаляем первый элемент ("Яблоко")
//              fruits.remove(0);
//
//              // выводим весь список
//              for (String fruit : fruits) {
//                     System.out.println(fruit);
//              }
//       }
//}
// zadacha 3
// создаём список приглашённых
//              ArrayList<String> guests = new ArrayList<>();
//
//              // добавляем имена
//              guests.add("Анна");
//              guests.add("Иван");
//              guests.add("Петр");
//              guests.add("Мария");
//
//              // проверяем наличие гостей
//              System.out.println(guests.contains("Петр"));
//              System.out.println(guests.contains("Сергей"));
//       }
//}
// zadacha 4
//              Scanner scanner = new Scanner(System.in);
//              ArrayList<String> tasks = new ArrayList<>();
//
//              while (true) {
//                     String task = scanner.nextLine();
//
//                     if (task.isEmpty()) {
//                            break;
//                     }
//
//                     tasks.add(task);
//              }
//
//              for (int i = tasks.size() - 1; i >= 0; i--) {
//                     System.out.println(tasks.get(i));
//              }
//       }
//}
//Свой словарь» — HashMap<K,V
    // zadacha 1

    //              public static void main(String[] args) {
//
//                     // создаем словарь
//                     HashMap<String, String> travelPhrasebook = new HashMap<>();
//
//                     // добавляем перевод
//                     travelPhrasebook.put("дом", "house");
//
//                     // получаем перевод и выводим на экран
//                     System.out.println(travelPhrasebook.get("дом"));
//              }
//       }
// zadacha 2
//       public static void main(String[] args) {
//
//              // создаем реестр пользователей
//              HashMap<Integer, String> userRegistry = new HashMap<>();
//
//              // добавляем пользователей
//              userRegistry.put(1, "Иван");
//              userRegistry.put(2, "Мария");
//
//              // удаляем пользователя с ID 1
//              userRegistry.remove(1);
//
//              // пытаемся получить пользователя с ID 1
//              System.out.println(userRegistry.get(1));
//       }
//}
// zadacha 3
//       public static void main(String[] args) {
//
//              // создаем журнал оценок
//              HashMap<String, Integer> studentGrades = new HashMap<>();
//
//              // добавляем оценку Анны
//              studentGrades.put("Анна", 5);
//
//              // проверяем, есть ли запись для Анны
//              if (studentGrades.containsKey("Анна")) {
//                     System.out.println("Оценка Анны: " + studentGrades.get("Анна"));
//              }
//       }
//}
// zadacha 4
//       public static void main(String[] args) {
//
//              String textContent = "java core java map";
//
//              // создаем словарь для подсчета слов
//              HashMap<String, Integer> wordCount = new HashMap<>();
//
//              // разбиваем строку на слова
//              String[] words = textContent.split(" ");
//
//              // считаем количество вхождений
//              for (String word : words) {
//                     if (wordCount.containsKey(word)) {
//                            wordCount.put(word, wordCount.get(word) + 1);
//                     } else {
//                            wordCount.put(word, 1);
//                     }
//              }
//
//              // выводим результат
//              for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//                     System.out.println(entry.getKey() + ": " + entry.getValue());
//              }
//       }
//}
// Знакомство с файлами и картинками
// zadacha 1
//       public static void main(String[] args) throws IOException {
//
//              // создаем путь к файлу
//              Path filePath = Path.of("note.txt");
//
//              // записываем строку в файл
//              Files.writeString(filePath, "Сегодня отличный день!");
//       }
//}
// zadacha 2
//       public static void main(String[] args) throws IOException {
//
//              // путь к файлу
//              Path filePath = Path.of("note.txt");
//
//              // читаем весь текст из файла
//              String content = Files.readString(filePath);
//
//              // выводим текст на экран
//              System.out.println(content);
//       }
//}
// zadacha 3
//       public static void main(String[] args) throws IOException {
//
//              // создаем массив байтов
//              byte[] letters = {72, 73, 74};
//
//              // путь к файлу
//              Path path = Path.of("letters.bin");
//
//              // записываем байты в файл
//              Files.write(path, letters);
//
//              // читаем байты обратно из файла
//              byte[] readLetters = Files.readAllBytes(path);
//
//              // выводим каждый байт как символ
//              for (byte b : readLetters) {
//                     System.out.print((char) b + " ");
//              }
//       }
//}
// zadacha 4
//       public static void main(String[] args) throws IOException {
//
//              // путь к исходному файлу
//              Path source = Path.of("letters.bin");
//
//              // путь к копии файла
//              Path copy = Path.of("letters_copy.bin");
//
//              // читаем все байты из исходного файла
//              byte[] data = Files.readAllBytes(source);
//
//              // записываем байты в новый файл
//              Files.write(copy, data);
//       }
//}
// Скачиваем картинки из интернета
// zadacha 1
//       public static void main(String[] args) throws IOException {
//
//           // создаем URL
//           URL url = new URL("https://httpbin.org/image/png");
//
//           // открываем поток данных
//           InputStream in = url.openStream();
//
//           // путь для сохранения файла
//           Path outputPath = Path.of("image01.png");
//
//           // копируем данные из потока в файл
//           Files.copy(in, outputPath);
//
//           // закрываем поток
//           in.close();
//
//           System.out.println("Изображение загружено!");
//       }
//}
// zadacha 2
//       public static void main(String[] args) throws IOException {
//
//           // URL изображения
//           URL url = new URL("https://httpbin.org/image/jpeg");
//
//           // путь для сохранения файла
//           Path outputPath = Path.of("image02.jpg");
//
//           // открываем входной и выходной потоки
//           try (InputStream in = url.openStream();
//                OutputStream out = Files.newOutputStream(outputPath)) {
//
//               // передаем данные напрямую
//               in.transferTo(out);
//           }
//
//           System.out.println("Изображение успешно загружено!");
//       }
//}
// zadacha 3
//       public static void main(String[] args) throws IOException, InterruptedException {
//
//           // создаем клиент
//           HttpClient client = HttpClient.newHttpClient();
//
//           // создаем запрос
//           HttpRequest request = HttpRequest.newBuilder()
//                   .uri(URI.create("https://httpbin.org/image/webp"))
//                   .build();
//
//           // отправляем запрос и получаем ответ как массив байтов
//           HttpResponse<byte[]> response = client.send(request,
//                   HttpResponse.BodyHandlers.ofByteArray());
//
//           // проверяем статус ответа
//           if (response.statusCode() == 200) {
//               // сохраняем файл
//               Files.write(Path.of("image03.webp"), response.body());
//               System.out.println("Файл успешно загружен!");
//           } else {
//               // выводим ошибку
//               System.out.println("Ошибка загрузки: код ответа " + response.statusCode());
//           }
//       }
//}
// zadacha 4
//       public static void main(String[] args) throws IOException, InterruptedException {
//
//           // создаем клиент
//           HttpClient client = HttpClient.newHttpClient();
//
//           // создаем запрос
//           HttpRequest request = HttpRequest.newBuilder()
//                   .uri(URI.create("https://httpbin.org/image/png"))
//                   .build();
//
//           // отправляем запрос
//           HttpResponse<byte[]> response = client.send(
//                   request,
//                   HttpResponse.BodyHandlers.ofByteArray()
//           );
//
//           // получаем тип содержимого
//           String contentType = response.headers()
//                   .firstValue("Content-Type")
//                   .orElse("неизвестно");
//
//           // получаем размер файла (по факту — длина массива байтов)
//           int size = response.body().length;
//
//           // выводим информацию
//           System.out.println("Тип: " + contentType + ", Размер: " + size + " байт");
//
//           // сохраняем файл
//           Files.write(Path.of("image04.png"), response.body());
//       }
//}
// Учимся работать с API и следим за МКС
// zadacha 1
//       public static void main(String[] args) throws IOException, InterruptedException {
//
//           // создаем HTTP-клиент
//           HttpClient client = HttpClient.newHttpClient();
//
//           // создаем GET-запрос
//           HttpRequest request = HttpRequest.newBuilder()
//                   .uri(URI.create("https://api.open-meteo.com/v1/forecast?latitude=50.45&longitude=30.52&current_weather=true"))
//                   .GET()
//                   .build();
//
//           // отправляем запрос и получаем ответ как строку
//           HttpResponse<String> response = client.send(
//                   request,
//                   HttpResponse.BodyHandlers.ofString()
//           );
//
//           // выводим JSON-ответ полностью
//           System.out.println(response.body());
//       }
//}
// zadacha 2
//       public static void main(String[] args) throws IOException, InterruptedException {
//
//           // создаем HTTP-клиент
//           HttpClient client = HttpClient.newHttpClient();
//
//           // создаем GET-запрос
//           HttpRequest request = HttpRequest.newBuilder()
//                   .uri(URI.create("http://api.open-notify.org/iss-now.json"))
//                   .GET()
//                   .build();
//
//           // отправляем запрос
//           HttpResponse<Void> response = client.send(
//                   request,
//                   HttpResponse.BodyHandlers.discarding() // тело не нужно
//           );
//
//           // выводим HTTP-статус
//           System.out.println(response.statusCode());
//       }
//}
// zadacha 3
//       public static void main(String[] args) throws IOException, InterruptedException {
//
//           // создаем HTTP-клиент
//           HttpClient client = HttpClient.newHttpClient();
//
//           // создаем GET-запрос
//           HttpRequest request = HttpRequest.newBuilder()
//                   .uri(URI.create("https://catfact.ninja/fact"))
//                   .GET()
//                   .build();
//
//           // отправляем запрос и получаем ответ как строку
//           HttpResponse<String> response = client.send(
//                   request,
//                   HttpResponse.BodyHandlers.ofString()
//           );
//
//           // выводим JSON-ответ
//           System.out.println(response.body());
//       }
//}
// zadacha 4
//       public static void main(String[] args) throws IOException, InterruptedException {
//
//           HttpClient client = HttpClient.newHttpClient();
//           HttpRequest request = HttpRequest.newBuilder()
//                   .uri(URI.create("http://api.open-notify.org/iss-now.json"))
//                   .GET()
//                   .build();
//
//           HttpResponse<String> response = client.send(
//                   request,
//                   HttpResponse.BodyHandlers.ofString()
//           );
//
//           String body = response.body();
//
//           // ключи без кавычек
//           String latKey = "\"latitude\":";
//           String lonKey = "\"longitude\":";
//
//           // извлекаем latitude
//           int latStart = body.indexOf(latKey);
//           if (latStart == -1) {
//               System.out.println("Ошибка: не удалось найти latitude");
//               return;
//           }
//           latStart += latKey.length();
//           int latEnd = body.indexOf(",", latStart);
//           String latitude = body.substring(latStart, latEnd).trim();
//
//           // извлекаем longitude
//           int lonStart = body.indexOf(lonKey);
//           if (lonStart == -1) {
//               System.out.println("Ошибка: не удалось найти longitude");
//               return;
//           }
//           lonStart += lonKey.length();
//           int lonEnd = body.indexOf("}", lonStart);
//           String longitude = body.substring(lonStart, lonEnd).trim();
//
//           System.out.println("Текущие координаты МКС: широта = "
//                   + latitude + ", долгота = " + longitude);
//       }
//}
//       public static void main(String[] args) throws IOException, InterruptedException {
//           String url = "https://api.open-meteo.com/v1/forecast?latitude=32.0853&longitude=34.7818&current_weather=true";
//           HttpClient client = HttpClient.newHttpClient();
//           HttpRequest req = HttpRequest.newBuilder(URI.create(url)).GET().build();
//           HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
//           String body = resp.body();
//
//           Pattern tempPattern = Pattern.compile("\"temperature\":\\s*([0-9.+-]+)");
//           Pattern windPattern = Pattern.compile("\"windspeed\":\\s*([0-9.+-]+)");
//
//           Matcher tempMatcher = tempPattern.matcher(body);
//           Matcher windMatcher = windPattern.matcher(body);
//
//           if (tempMatcher.find() && windMatcher.find()) {
//               String temperature = tempMatcher.group(1);
//               String windspeed = windMatcher.group(1);
//               System.out.println("Текущая температура в Тель-Авиве: " + temperature + "°C, ветер " + windspeed + " км/ч");
//           } else {
//               System.out.println("Не удалось получить данные о погоде.");
//           }
//       }
//}
// DATA I VREMYA
// zadacha 1
//       public static void main(String[] args) {
//
//           LocalDate currentCalendarDate = LocalDate.now();
//
//           System.out.println(currentCalendarDate);
//       }
//}
// zadacha 2
//       public static void main(String[] args) {
//
//           LocalDate today = LocalDate.now();
//           LocalDate yesterday = today.minusDays(1);
//
//           System.out.println(yesterday);
//       }
//}
// zadacha 3
//       public static void main(String[] args) {
//
//           LocalDate today = LocalDate.now();
//           LocalDate tomorrow = today.plusDays(1);
//
//           System.out.println(tomorrow);
//       }
//}
// zadacha 4
//       public static void main(String[] args) {
//
//           LocalDateTime historicMoment = LocalDateTime.of(2022, 3, 20, 10, 0);
//
//           System.out.println(historicMoment);
//       }
//}
// LocalDate, LocalTime, LocalDateTime
// zadacha 1
//       public static void main(String[] args) {
//
//           LocalTime currentTime = LocalTime.now();
//
//           int displayHours = currentTime.getHour();
//           int displayMinutes = currentTime.getMinute();
//           int displaySeconds = currentTime.getSecond();
//
//           System.out.println("Часы: " + displayHours +
//                   ", минуты: " + displayMinutes +
//                   ", секунды: " + displaySeconds);
//       }
//}
// zadacha 2
//       public static void main(String[] args) {
//
//           LocalDate userBirthDate = LocalDate.of(1990, 12, 15);
//
//           DayOfWeek dayOfWeek = userBirthDate.getDayOfWeek();
//
//           System.out.println(dayOfWeek);
//       }
//}
// zadacha 3
//       public static void main(String[] args) {
//
//           LocalTime morningMeeting = LocalTime.of(8, 0);
//           LocalTime afternoonPresentation = LocalTime.of(14, 30);
//
//           if (morningMeeting.isBefore(afternoonPresentation)) {
//               System.out.println("8:00 раньше 14:30");
//           } else {
//               System.out.println("8:00 не раньше 14:30");
//           }
//       }
//}
// zadacha 4
//       public static void main(String[] args) {
//
//           LocalDateTime missionBriefing = LocalDateTime.of(2025, 6, 1, 14, 0);
//
//           LocalDateTime finalMissionTime = missionBriefing
//                   .plusHours(2)
//                   .minusMinutes(30);
//
//           System.out.println(finalMissionTime);
//       }
//}
//ZonedDateTime, Instant, работа с таймзонами
// zadacha 1
//       public static void main(String[] args) {
//
//           ZonedDateTime currentTimeInMinsk = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));
//           ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
//           ZonedDateTime currentTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
//
//           System.out.println("Minsk: " + currentTimeInMinsk);
//           System.out.println("New York: " + currentTimeInNewYork);
//           System.out.println("Tokyo: " + currentTimeInTokyo);
//       }
//}
// zadacha 2
//       public static void main(String[] args) {
//
//           LocalDateTime conferenceStartLocal = LocalDateTime.of(2025, 6, 1, 14, 0);
//
//           ZonedDateTime conferenceStartMinskZoned =
//                   conferenceStartLocal.atZone(ZoneId.of("Europe/Minsk"));
//
//           System.out.println(conferenceStartMinskZoned);
//       }
//}
// zadacha 3
//       public static void main(String[] args) {
//
//           LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025, 6, 1, 18, 0);
//
//           ZonedDateTime teleportTimeMinskZoned =
//                   teleportScheduledLocal.atZone(ZoneId.of("Europe/Minsk"));
//
//           ZonedDateTime teleportTimeNewYorkZoned =
//                   teleportTimeMinskZoned.withZoneSameInstant(ZoneId.of("America/New_York"));
//
//           System.out.println("Minsk: " + teleportTimeMinskZoned);
//           System.out.println("New York: " + teleportTimeNewYorkZoned);
//       }
//}
// zadacha 4
//       public static void main(String[] args) {
//
//           ZonedDateTime originalEventTime =
//                   ZonedDateTime.of(2025, 6, 1, 12, 0, 0, 0, ZoneId.of("Europe/Minsk"));
//
//           Instant universalInstant = originalEventTime.toInstant();
//
//           ZonedDateTime eventTimeTokyoZoned =
//                   universalInstant.atZone(ZoneId.of("Asia/Tokyo"));
//
//           System.out.println("Original (Minsk): " + originalEventTime);
//           System.out.println("Instant: " + universalInstant);
//           System.out.println("Tokyo: " + eventTimeTokyoZoned);
//       }
//}
// Форматирование и парсинг дат: DateTimeFormatter
// zadacha 1
//       public static void main(String[] args) {
//
//           LocalDate currentReportDate = LocalDate.now();
//
//           DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//
//           String formattedReportDate = currentReportDate.format(formatter);
//
//           System.out.println(formattedReportDate);
//       }
//}
// zadacha 2
//       public static void main(String[] args) {
//
//           String inputDateString = "2024-12-31";
//
//           DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//
//           LocalDate parsedLocalDate = LocalDate.parse(inputDateString, formatter);
//
//           System.out.println(parsedLocalDate);
//       }
//}
// zadacha 3
//       public static void main(String[] args) {
//
//           LocalDate specificEventDate = LocalDate.of(2023, 3, 15);
//
//           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//
//           String friendlyDisplayDateString = specificEventDate.format(formatter);
//
//           System.out.println(friendlyDisplayDateString);
//       }
//}
// zadacha 4
//       public static void main(String[] args) {
//
//           String orderTimestampString = "01.06.2025 14:30";
//
//           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
//
//           LocalDateTime parsedOrderDateTime =
//                   LocalDateTime.parse(orderTimestampString, formatter);
//
//           System.out.println(parsedOrderDateTime);
//       }
//}
//Вычисления и сравнение дат, Duration, Period
// zadacha 1
//       public static void main(String[] args) {
//
//           LocalDate today = LocalDate.now();
//           LocalDate holidayCountdownStart = today.plusDays(10);
//
//           System.out.println(holidayCountdownStart);
//       }
//}
// zadacha 2
//       public static void main(String[] args) {
//
//           LocalDate today = LocalDate.now();
//           LocalDate futureMilestone = LocalDate.of(2025, 1, 1);
//
//           if (futureMilestone.isBefore(today)) {
//               System.out.println("2025 уже наступил");
//           } else {
//               System.out.println("2025 еще не наступил");
//           }
//       }
//}
// zadacha 3
//       public static void main(String[] args) {
//
//           LocalDate today = LocalDate.now();
//           LocalDate projectDeadline = LocalDate.of(2025, 5, 15);
//
//           long daysRemaining = Math.abs(ChronoUnit.DAYS.between(today, projectDeadline));
//
//           System.out.println("Days remaining: " + daysRemaining);
//       }
//}
// zadacha 4
//       public static void main(String[] args) {
//
//           LocalDate today = LocalDate.now();
//           LocalDate constructionDate = LocalDate.of(2000, 3, 20);
//
//           Period buildingAgePeriod = Period.between(constructionDate, today);
//
//           System.out.println("Возраст: "
//                   + buildingAgePeriod.getYears() + " лет, "
//                   + buildingAgePeriod.getMonths() + " месяцев, "
//                   + buildingAgePeriod.getDays() + " дней");
//       }
//}
//       public static void main(String[] args) {
//
//           LocalDateTime start = LocalDateTime.of(2025, 6, 1, 9, 30);
//           LocalDateTime end = LocalDateTime.of(2025, 6, 1, 17, 45);
//
//           Duration duration = Duration.between(start, end);
//
//           long hours = duration.toHours();
//           long minutes = duration.toMinutes() % 60;
//
//           System.out.println("Рабочее время: " + hours + " часов " + minutes + " минут");
//       }
//}
//       Понятие класса и объекта
//zadacha 1
//       class Dog {}
// zadacha 2
//       class Cat {}
//
//    public class Main {
//        public static void main(String[] args) {
//            Cat myCat = new Cat();
//        }
//    }
// zadacha 3
//       public static void main(String[] args) {
//           Book b = new Book();
//           b.title = "Java для начинающих";
//           b.pages = 350;
//           b.printInfo();
//       }
//}
// zadacha 4

    //        public static void main(String[] args) {
//            Student a = new Student(), b = new Student();
//
//            a.studentName = "Анна";
//            a.enrollmentYear = 2022;
//            b.studentName = "Иван";
//            b.enrollmentYear = 2023;
//
//            System.out.println("Имя: " + a.studentName + ", год поступления: " + a.enrollmentYear);
//            System.out.println("Имя: " + b.studentName + ", год поступления: " + b.enrollmentYear);
//        }
//    }
// Структура класса: поля, методы, конструкторы
// zadacha 1
//    public static void main(String[] args) {
//        Car c = new Car();
//        c.carBrand = "Toyota";
//        c.productionYear = 2020;
//        c.displayDetails();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Student s = new Student("Анна", 5);
//        System.out.println("Имя: " + s.studentName + ", оценка: " + s.studentGrade);
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Counter c = new Counter();
//        c.increment(); c.increment(); c.increment();
//        c.printValue();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        BankAccount a = new BankAccount("Анна", 1000);
//        BankAccount b = new BankAccount("Иван");
//
//        b.deposit(500);
//
//        a.printInfo();
//        b.printInfo();
//    }
//}
//Создание объектов с помощью new
// zadacha 1
//    public static void main(String[] args) {
//
//        Cat myCat = new Cat();
//        myCat.catName = "Барсик";
//        myCat.catAge = 3;
//
//        System.out.println("Имя: " + myCat.catName + ", возраст: " + myCat.catAge);
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//
//        // Регистрируем нового пса сразу с именем и возрастом
//        Dog newDog = new Dog("Шарик", 5);
//
//        System.out.println("Собаку зовут " + newDog.dogName + ", ей " + newDog.dogAge + " лет");
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//
//        Car car1 = new Car();
//        car1.carBrand = "Toyota";
//        car1.carYear = 2020;
//
//        Car car2 = new Car();
//        car2.carBrand = "Lada";
//        car2.carYear = 2010;
//
//        System.out.println("Марка: " + car1.carBrand + ", год выпуска: " + car1.carYear);
//        System.out.println("Марка: " + car2.carBrand + ", год выпуска: " + car2.carYear);
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//
//        // Первая книга — без данных
//        Book book1 = new Book();
//
//        // Вторая книга — с конкретными данными
//        Book book2 = new Book("Java для начинающих", 350);
//
//        System.out.println("Книга: " + book1.bookTitle + ", страниц: " + book1.numberOfPages);
//        System.out.println("Книга: " + book2.bookTitle + ", страниц: " + book2.numberOfPages);
//    }
//}
//Перегрузка конструкторов
// zadacha 1
//    public static void main(String[] args) {
//
//        // Регистрируем книгу только с названием
//        Book book1 = new Book("Загадочный роман");
//
//        // Регистрируем книгу с названием и количеством страниц
//        Book book2 = new Book("Путешествие по космосу", 500);
//
//        System.out.println("Книга: " + book1.bookTitle + ", страниц: " + book1.pageCount);
//        System.out.println("Книга: " + book2.bookTitle + ", страниц: " + book2.pageCount);
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//
//        // Регистрируем анонимного пользователя
//        User user1 = new User();
//
//        // Регистрируем пользователя с именем
//        User user2 = new User("Алиса");
//
//        System.out.println("Пользователь: " + user1.userName + ", возраст: " + user1.userAge);
//        System.out.println("Пользователь: " + user2.userName + ", возраст: " + user2.userAge);
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//
//        // Используем первый конструктор
//        Car car1 = new Car("Toyota", "Camry", 2022);
//
//        // Используем второй конструктор
//        Car car2 = new Car("Lada", "Granta");
//
//        // Используем третий конструктор
//        Car car3 = new Car();
//
//        // Вывод информации о машинах
//        System.out.println(car1.carBrand + " " + car1.carModel + " " + car1.productionYear);
//        System.out.println(car2.carBrand + " " + car2.carModel + " " + car2.productionYear);
//        System.out.println(car3.carBrand + " " + car3.carModel + " " + car3.productionYear);
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//
//        // 1. Полный профиль
//        Student s1 = new Student("Анна", "Группа A", 95);
//
//        // 2. Имя и группа
//        Student s2 = new Student("Борис", "Группа B");
//
//        // 3. Только имя
//        Student s3 = new Student("Виктор");
//
//        // 4. Без данных
//        Student s4 = new Student();
//
//        // Вывод информации о студентах
//        System.out.println(s1.studentName + ", " + s1.studentGroup + ", " + s1.studentScore);
//        System.out.println(s2.studentName + ", " + s2.studentGroup + ", " + s2.studentScore);
//        System.out.println(s3.studentName + ", " + s3.studentGroup + ", " + s3.studentScore);
//        System.out.println(s4.studentName + ", " + s4.studentGroup + ", " + s4.studentScore);
//    }
//}
//Инициализация объекта: порядок инициализации
// zadacha 1
//    public static void main(String[] args) {
//        Animal wildAnimal = new Animal();  // создаем животное
//
//        // Выводим значения полей по умолчанию
//        System.out.println("Возраст: " + wildAnimal.animalAge);
//        System.out.println("Имя: " + wildAnimal.animalName);
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Book standardBook = new Book(); // создаем книгу с базовыми параметрами
//
//        // выводим стандартные значения полей
//        System.out.println("Название книги: " + standardBook.bookTitle);
//        System.out.println("Количество страниц: " + standardBook.pageCount);
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//
//        // Запускаем "сборку" машины
//        Car newCar = new Car();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//
//        Student newStudent = new Student(); // создаем студента
//    }
//}
//inkapsulyaziya
// zadacha 1
//    public class Solution {
//        public static void main(String[] args) {
//            // Создаем экземпляр класса Person
//            Person person = new Person();
//
//            // Попытка прямого доступа (это НЕ скомпилируется)
//            person.memberName = "Alice"; // ❌ ошибка
//            person.memberAge = 30;       // ❌ ошибка
//
//            // Демонстрационное сообщение
//            System.out.println("Экземпляр Person создан. Прямой доступ к полям memberName и memberAge запрещён (private).");
//        }
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаем объект Person с именем "Анна" и возрастом 30
//        Person person = new Person("Анна", 30);
//
//        // Получаем данные через геттеры
//        System.out.println("Имя: " + person.getMemberName());
//        System.out.println("Возраст: " + person.getMemberAge());
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Создаём участника Иван, 25 лет
//        Person person = new Person("Иван", 25);
//
//        // Некорректный возраст
//        person.setMemberAge(-5);
//        System.out.println(person.getMemberAge()); // 25
//
//        // Корректный возраст
//        person.setMemberAge(35);
//        System.out.println(person.getMemberAge()); // 35
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // Создаём товар
//        Product product = new Product(101, "Молоко");
//
//        // Получаем данные через геттеры
//        System.out.println(product.getProductID());
//        System.out.println(product.getProductName());
//
//        // ❌ Эти строки НЕ скомпилируются:
//        product.productID = 202;
//        product.productName = "Кефир";
//        product.setProductID(202);
//        product.setProductName("Кефир");
//    }
//}
// Модификаторы доступа
// zadacha 1
//    public static void main(String[] args) {
//        // Создаем визитку
//        UserCard card = new UserCard("Элис");
//
//        // Получаем имя через геттер
//        System.out.println(card.getUserName());
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        MagicCalculator calculator = new MagicCalculator();
//
//        // Вызываем публичный метод
//        int sum = calculator.addNumbers(10, 15);
//
//        // Выводим результат
//        System.out.println(sum);
//
//        // ❌ Это НЕ скомпилируется:
//        calculator.displayInternalResult(sum);
//    }
//}
// zadacha3
//    public static void main(String[] args) {
//        com.mycompany.module.ModuleHelper helper = new com.mycompany.module.ModuleHelper();
//
//        // Доступ разрешён, так как тот же пакет
//        helper.provideInternalAssistance();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//
//        DigitalLibraryManager manager = new DigitalLibraryManager();
//
//        // ✅ Работает
//        manager.announceOpening();
//
//        // ✅ Работает (тот же пакет)
//        manager.conductStaffMeeting();
//
//        // ✅ Работает (тот же пакет)
//        manager.manageBookInventory();
//
//        // ❌ НЕ скомпилируется
//        manager.handleFinancialAudits();
//    }
//}
// Геттеры и сеттеры: синтаксис, best practices
// zadacha 1
//    public static void main(String[] args) {
//        // Создаем товар с исходным названием "Старый товар"
//        Product product = new Product("Старый товар");
//
//        // Переименовываем товар на "Новый товар" с помощью сеттера
//        product.setProductName("Новый товар");
//
//        // Выводим обновлённое название с помощью геттера
//        System.out.println(product.getProductName());
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаем объект профиля студента с начальным возрастом 18
//        StudentProfile profile = new StudentProfile(18);
//
//        // Обновляем возраст до 20 с помощью сеттера
//        profile.setStudentAge(20);
//
//        // Выводим текущий возраст, чтобы убедиться, что он обновился
//        System.out.println(profile.getStudentAge());
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Создаем объект "умной лампы" (по умолчанию выключена)
//        SmartLamp lamp = new SmartLamp();
//
//        // Включаем лампу
//        lamp.setCurrentlyOn(true);
//
//        // Проверяем состояние через boolean-геттер
//        System.out.println(lamp.isCurrentlyOn());
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // Создаем студента с начальным возрастом 10
//        SchoolStudent student = new SchoolStudent(10);
//
//        // Пытаемся установить отрицательный возраст
//        student.setCurrentAge(-5);
//
//        // Проверяем, что возраст не изменился
//        System.out.println(student.getCurrentAge()); // Ожидается: 10
//
//        // Устанавливаем корректный возраст
//        student.setCurrentAge(15);
//
//        // Проверяем, что возраст обновился
//        System.out.println(student.getCurrentAge()); // Ожидается: 15
//    }
//}
//Инициализация статических и final полей
// zadacha 1
//    public static void main(String[] args) {
//        // Получаем значение статического поля через имя класса
//        System.out.println(ApplicationMetrics.getActiveUserCount());
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаем удостоверение с именем "Алиса"
//        StudentIdentityCard card = new StudentIdentityCard("Алиса");
//
//        // Выводим имя студента через геттер
//        System.out.println(card.getStudentName());
//
//        // Попытка изменить имя невозможна:
//        // card.studentName = "Боб"; // Ошибка компиляции: поле private и final
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Выводим значение языка по умолчанию через имя класса
//        System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // Обращаемся к константам напрямую через имя класса
//        System.out.println(GlobalConstants.MATH_PI);
//        System.out.println(GlobalConstants.CALENDAR_DAYS_IN_YEAR);
//    }
//}
//Блоки инициализации
// zadacha 1
//    public static void main(String[] args) {
//        // Создание объекта спровоцирует загрузку класса и выполнение статического блока
//        new ApplicationModule();
//
//        // Никакого дополнительного вывода здесь быть не должно
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаем два объекта ShelterPet
//        // Для каждого сначала отработает нестатический блок, затем конструктор
//        ShelterPet first = new ShelterPet();
//        ShelterPet second = new ShelterPet();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Создаем два объекта SystemComponent
//        new SystemComponent();
//        new SystemComponent();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // "Быстрая" регистрация
//        UserProfile fastRegistration = new UserProfile();
//
//        // "Полная" регистрация с именем
//        UserProfile fullRegistration = new UserProfile("Дарья");
//    }
//}
//Внутренние классы (non-static inner)
// zadacha 1
//    public static void main(String[] args) {
//        Box box = new Box();
//        Box.Label label = box.new Label();
//        label.printLabel();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Person person = new Person("Anna");
//        Person.Greeting greeting = person.new Greeting();
//        greeting.sayHello();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Library library = new Library();
//        Library.Scroll scroll = library.new Scroll("Ancient Runes");
//        scroll.revealTitle();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        House house = new House("Sunny Valley Lane");
//        House.Room room = house.new Room("Master Bedroom");
//        room.printAddresses();
//    }
//}
//Статические вложенные классы (static nested)
// zadacha 1
//    public static void main(String[] args) {
//        Spellbook.BasicCharm charm = new Spellbook.BasicCharm();
//        charm.castSpell();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Vault.SecurityDisplayUnit display = new Vault.SecurityDisplayUnit();
//        display.showSecurityLevel();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        ArtifactChain chain = new ArtifactChain();
//
//        chain.addArtifact(5);
//        chain.addArtifact(10);
//        chain.addArtifact(15);
//
//        chain.displayChain(); // 15, 10, 5
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        System.out.println(
//                new Book.Builder()
//                        .setTitle("Java Basics")
//                        .setPages(500)
//                        .build()
//        );
//    }
//}
//Анонимные классы
// zadacha 1
//    void makeSound() {
//        System.out.println("Существо издаёт звук");
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//
//        new Communicator() {
//            public void greet() {
//                System.out.println("Привет, мир!");
//            }
//        }.greet();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        ProductionCounter counter = new ProductionCounter();
//        counter.startCountOperation();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//
//        // 1. Создаём объект
//        SecureLab lab = new SecureLab();
//
//        // 2. Вызываем метод
//        lab.revealSecret();
//    }
//}
//Локальные классы: объявление внутри методов
//zadacha 1
//    public static void main(String[] args) {
//        // Небольшая демонстрация работы доски объявлений
//        DisplayBoard board = new DisplayBoard();
//        board.showTemporaryMessage();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Демонстрация работы SecretKeeper
//        SecretKeeper keeper = new SecretKeeper();
//        keeper.revealSecret();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Демонстрация работы специализированного калькулятора
//        SpecialCalculator calculator = new SpecialCalculator();
//        calculator.calculateAndDisplaySum(7, 13); // Ожидаемый вывод: 20
//    }
//}
// zadacha 4
//    ublic static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        String name = console.nextLine();          // читаем имя с консоли
//        new TextAnalyzer().generateNameReport(name);
//    }
//}
// Знакомство с дженериками
// zadacha 1
//    public static void main(String[] args) {
//        // Создаём универсальную коробку без знания типа содержимого
//        StorageBox box = new StorageBox();
//
//        // Кладём внутрь строку
//        box.put("Привет из прошлого!");
//
//        // Извлекаем содержимое (тип Object) и выводим на экран
//        Object content = box.retrieve();
//        System.out.println(content);
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаём коробку, которая может хранить только целые числа (Integer)
//        SmartBox<Integer> intBox = new SmartBox<>();
//
//        // Помещаем число 42 (автобоксинг int -> Integer)
//        intBox.store(42);
//
//        // Извлекаем содержимое и выводим на экран
//        Integer value = intBox.getContents();
//        System.out.println(value);
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Создаем объект DataPair для строк и передаем "Hello" и "World"
//        DataPair<String> pair = new DataPair<>("Hello", "World");
//
//        // Выводим оба значения через пробел
//        System.out.println(pair.getFirst() + " " + pair.getSecond());
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // Демонстрация универсальности: строка и число
//        Solution.DevUtils.printTwice("Java");
//        Solution.DevUtils.printTwice(100);
//    }
//}
// Nasledovanie
// zadacha 1
//    public static void main(String[] args) {
//        // Создаем кота и задаем ему имя через поле petName
//        Cat cat = new Cat();
//        cat.petName = "Барсик";
//
//        // Вызываем действия кота в требуемом порядке
//        cat.eat();
//        cat.meow();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаем объект собаки
//        Dog dog = new Dog();
//
//        // Присваиваем имя питомцу
//        dog.petName = "Шарик";
//
//        // Демонстрируем наследуемое поведение сна
//        dog.sleep();
//
//        // Демонстрируем уникальное поведение собаки — лай
//        dog.bark();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Создаем автомобиль, который наследует поведение от Vehicle
//        Car car = new Car();
//
//        // Указываем модель автомобиля
//        car.vehicleModel = "Lada";
//
//        // Запускаем автомобиль
//        car.start();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // Создаем объекты яблока и банана
//        Apple apple = new Apple();
//        Banana banana = new Banana();
//
//        // Задаем цвета для каждого фрукта (поле унаследовано от Fruit)
//        apple.fruitColor = "красный";
//        banana.fruitColor = "жёлтый";
//
//        // Выводим цвет каждого фрукта
//        apple.printColor();
//        banana.printColor();
//    }
//}
//Переопределение методов (override), аннотация @Override
// zadacha 1
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.draw();
//    }
//}
// zadacha 2
//
//        public static void main(String[] args) {
//            Dog dog = new Dog();
//            dog.makeSound();
//        }
//    }
// zadacha 3
//    public static void main(String[] args) {
//        Parent person = new Child();
//        person.greet();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        AppleBasket appleBasket = new AppleBasket();
//
//        Fruit harvestedItem = appleBasket.getFruit();
//
//        if (harvestedItem instanceof Apple) {
//            System.out.println("Apple created");
//        }
//    }
//}
//Использование super: вызов конструктора и методов базового класса
// zadacha 1
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Car car = new Car("BMW", 2023);
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.printNames();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Student anna = new Student("Анна", 3);
//    }
//}
//Создание иерархии классов, примеры из жизни
// zadacha 1
//    public static void main(String[] args) {
//        Dog bobik = new Dog();
//        bobik.petName = "Бобик";
//        bobik.eat();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.move();
//        car.beep();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        SchoolStudent schoolStudent = new SchoolStudent();
//        schoolStudent.introduce();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.animalName = "Мурка";
//
//        cat.eat();
//        cat.feedMilk();
//        cat.purr();
//    }
//}
//Проблемы и ограничения наследования
// zadacha 1
//    public static void main(String[] args) {
//    }
//}
//    java: '{' expected
//❌ нельзя наследоваться от нескольких классов
//✅ можно наследовать только от одного класса
// zadacha 2
//    public static void main(String[] args) {
//        Parent parent = new Parent();
//        parent.printSecret();
//
//        new Child().demo();
//    }
//}
// java: '{' expected
//private → доступ только внутри того же класса
//даже Child (наследник) НЕ имеет доступа
// zadacha 3
//    public static void main(String[] args) {
//        Student elena = new Student("Елена");
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Animal mysteriousCreature = new Cat();
//        mysteriousCreature.sleep();
//    }
//}
//Понятие полиморфизма, зачем он нужен
// zadacha 1
//    public static void main(String[] args) {
//        Animal pet = new Dog();
//        pet.makeSound();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Animal[] pen = { new Cat(), new Cow() };
//
//        for (Animal animal : pen) {
//            animal.makeSound();
//        }
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Employee employee = new Developer();
//        employee.work();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Vehicle[] parade = {
//                new Car(),
//                new Bicycle(),
//                new Scooter()
//        };
//
//        for (Vehicle v : parade) {
//            v.move();
//        }
//    }
//}
// Перегрузка методов (overloading)
// zadacha 1
//    public static void main(String[] args) {
//        MessagePrinter printer = new MessagePrinter();
//
//        printer.printMessage("Привет, мир!");
//        printer.printMessage(10, 20);
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Multiplier multiplier = new Multiplier();
//
//        int intResult = multiplier.multiply(5, 4);
//        double doubleResult = multiplier.multiply(2.5, 3.0);
//
//        System.out.println(intResult);
//        System.out.println(doubleResult);
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Greetings robot = new Greetings();
//
//        robot.sayHello("Алекс");
//        robot.sayHello("Джон", "Доу");
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Rectangle square = new Rectangle(5);
//        Rectangle rectangle = new Rectangle(10, 7);
//
//        System.out.println(square.width + " " + square.height);
//        System.out.println(rectangle.width + " " + rectangle.height);
//    }
//}
//Переопределение методов (overriding): отличие от перегрузки
//zadacha 1
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        ColorPrinter printer = new ColorPrinter();
//
//        printer.print(5);
//        printer.print("Hello");
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Shape shape = new Circle();
//        shape.draw();
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.makeSound();
//    }
//}
// Использование полиморфизма на практике
// zadacha 1
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        dog.makeSound();
//        cat.makeSound();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Employee[] team = {
//                new Manager(),
//                new Developer()
//        };
//
//        for (Employee employee : team) {
//            employee.work();
//        }
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Employee[] team = {
//                new Manager(),
//                new Developer(),
//                new Tester()
//        };
//
//        for (Employee e : team) {
//            e.work();
//        }
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Employee[] staff = new Employee[5];
//
//        staff[0] = new Employee();
//        staff[1] = new Manager();
//        staff[2] = new Developer();
//        staff[3] = new Designer();
//
//        printWorkForAll(staff);
//
//        // добавили нового сотрудника без изменения логики
//        staff[4] = new Intern();
//
//        printWorkForAll(staff);
//    }
//
//    private static void printWorkForAll(Employee[] staff) {
//        for (Employee e : staff) {
//            if (e != null) {
//                e.work();
//            }
//        }
//    }
//}
//Связь полиморфизма и абстрактных классов
// zadacha 1
//    public static void main(String[] args) {
//        // Shape shape = new Shape(); // ❌ нельзя (абстрактный класс)
//
//        Shape shape = new Circle(); // ✅ можно через наследника
//        shape.draw();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Animal pet = new Dog();
//        pet.makeSound();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Employee[] team = new Employee[2];
//
//        team[0] = new Manager();
//        team[1] = new Developer();
//
//        for (Employee employee : team) {
//            employee.work();
//        }
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Animal[] animals = {
//                new Cat("Мурка"),
//                new Cow("Буренка")
//        };
//
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }
//    }
//}
// Абстракция в ООП: зачем и как применять
// zadacha 1
//    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.makeSound();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.makeSound();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        List<Vehicle> vehicles = new ArrayList<>();
//
//        vehicles.add(new Car());
//        vehicles.add(new Bicycle());
//
//        for (Vehicle vehicle : vehicles) {
//            vehicle.move();
//        }
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        PaypalPayment payment = new PaypalPayment();
//
//        payment.printInfo();
//        payment.process();
//    }
//}
//    Абстрактные классы и методы: синтаксис, примеры
// zadacha 1
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.makeSound();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Phone phone = new Phone();
//
//        phone.turnOn();
//        phone.turnOff();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Circle circle = new Circle("Круг", 2.0);
//
//        System.out.println(circle.name);
//        System.out.println(circle.area());
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Employee[] staff = new Employee[2];
//
//        staff[0] = new Manager("Анна", 100000);
//        staff[1] = new Developer("Иван", 500, 160);
//
//        for (Employee e : staff) {
//            System.out.println("Имя: " + e.getName() +
//                    ", зарплата: " + e.getSalary());
//        }
//    }
//}
// Реализация абстракций и иерархий
// zadacha 1
//    public static void main(String[] args) {
//        // Полиморфизм: ссылка типа Vehicle на объект Car
//        Vehicle car = new Car();
//
//        // Вызов метода
//        car.move(); // "Машина едет"
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаем объекты фигур
//        Figure square = new Square(4);
//        Figure circle = new Circle(3);
//
//        // Выводим площади
//        System.out.println(square.area());
//        System.out.println(circle.area());
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Создаём менеджера
//        Manager manager = new Manager("Ivan", 50000);
//
//        // Выводим имя и зарплату
//        System.out.println(manager.getName());
//        System.out.println(manager.getSalary());
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // Массив базового типа
//        Payment[] payments = new Payment[] {
//                new CashPayment(),
//                new OnlinePayment()
//        };
//
//        // Полиморфизм в действии
//        for (Payment payment : payments) {
//            payment.process();
//        }
//    }
//}
//Примеры построения абстракций в реальных задачах
// zadacha 1
//    public static void main(String[] args) {
//        // Создаём круг радиуса 2.0
//        Circle circle = new Circle(2.0);
//
//        // Выводим площадь
//        System.out.println(circle.area()); // 12.56
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Создаем сообщения
//        Message email = new EmailMessage("Привет!");
//        Message sms = new SmsMessage("Привет!");
//
//        // Отправляем
//        email.send();
//        sms.send();
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        // Динамический список
//        List<Vehicle> vehicles = new ArrayList<>();
//
//        vehicles.add(new Car("Lada"));
//        vehicles.add(new Bicycle("Stels"));
//
//        for (Vehicle v : vehicles) {
//            v.move();
//        }
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        Order[] orders = {
//                new OnlineOrder(100.0),
//                new OfflineOrder(50.0),
//                new OnlineOrder(299.99),
//                new OfflineOrder(75.5)
//        };
//
//        for (Order order : orders) {
//            order.process();
//        }
//    }
//}
// Упрощение сложных систем с помощью абстракций
// zadacha 1
//    public static void main(String[] args) {
//        Task task = new SimpleTask("Купить кофе");
//        task.complete();
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        TaskRepository repository = new InMemoryTaskRepository();
//        TaskService service = new TaskService(repository);
//
//        // ВАЖНО: используем конкретный класс, а не абстрактный Task
//        Task task = new SimpleTask("Написать демо для TaskService");
//
//        service.addTask(task);
//
//        System.out.println("До выполнения:  " + task);
//
//        service.completeTask("Написать демо для TaskService");
//
//        System.out.println("После выполнения: " + task);
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        TaskRepository repository = new InMemoryTaskRepository();
//        TaskService service = new TaskService(repository);
//        UserInterface ui = new UserInterface(service);
//
//        ui.addAndCompleteTask("Выучить внедрение зависимостей через конструктор");
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        TaskRepository repository = new InMemoryTaskRepository();
//
//        // Добавляем задачи разных типов
//        repository.add(new WorkTask("Подготовить отчёт", "пятница 18:00"));
//        repository.add(new HomeTask("Помыть посуду", "кухня"));
//
//        TaskService service = new TaskService(repository);
//
//        // Вывод информации
//        service.printAllTasksInfo();
//
//        System.out.println();
//
//        // Выполнение задач
//        service.completeAllTasks();
//    }
//}
//    Понятие интерфейса, синтаксис объявления
// zadacha 1
//    public static void main(String[] args) {
//        // Полиморфизм: используем интерфейс как тип
//        Greetable someone = new Person();
//        someone.greet(); // Ожидаемый вывод: Hello!
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        // Универсальный инструмент для рисования
//        Drawable tool = new Circle();
//
//        // Полиморфный вызов
//        tool.draw(); // Ожидаемый вывод: Drawing a circle
//    }
//}
// zadacha 3
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.printPi(); // Ожидаемый вывод: 3.14159
//    }
//}
// zadacha 4
//    public static void main(String[] args) {
//        // "Зоопарк" — массив объектов, реализующих Soundable
//        Soundable[] zoo = new Soundable[2];
//
//        zoo[0] = new Dog();
//        zoo[1] = new Cat();
//
//        // Полиморфизм: у каждого вызовется своя реализация
//        for (Soundable animal : zoo) {
//            animal.makeSound();
//        }
//    }
//}
//Отличие интерфейсов от абстрактных классов
// zadacha 1
//    public static void main(String[] args) {
//        // Полиморфизм: используем интерфейс как тип
//        Movable car = new Car();
//
//        // Вызов метода через интерфейс
//        car.move(); // Ожидаемый вывод: Машина едет
//    }
//}
// zadacha 2
//    public static void main(String[] args) {
//        Student student = new Student("Иван Петров");
//        student.printInfo(); // Имя: Иван Петров, ID: 42
//    }
//}
// zadacha 3

    //        public static void main(String[] args) {
//            MultiFunctionDevice device = new MultiFunctionDevice();
//
//            device.print();
//            device.scan();
//        }
//    }
// zadacha 4
//public static void main(String[] args) {
//    SmartPhone phone = new SmartPhone();
//
//    phone.turnOn();
//    phone.work();
//    phone.charge();
//}
//}
//Множественная реализация интерфейсов
// zadacha 1
//public static void main(String[] args) {
//    Sketch sketch = new Sketch();
//
//    sketch.draw();
//    sketch.erase();
//}
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем пользователя
//    User user = new User("Алиса");
//
//    // Получаем имя
//    System.out.println(user.getName());
//}
//}
// zadacha 3
//public static void main(String[] args) {
//    // Создаем объект и вызываем метод
//    MultiAction action = new MultiAction();
//    action.doAction();
//}
//}
// zadacha 4
// Универсальный метод тестирования
//public static void testDevice(Player p, Recorder r) {
//    p.play();
//    r.record();
//}
//
//    public static void main(String[] args) {
//        // Создаём одно устройство
//        MediaDevice device = new MediaDevice();
//
//        // Один объект используется сразу как Player и как Recorder
//        testDevice(device, device);
//    }
//}
// # **Функциональные интерфейсы: @FunctionalInterface**
// zadacha 1
//public static void main(String[] args) {
//    // Лямбда-выражение вместо класса
//    MessagePrinter printer = message -> System.out.println(message);
//
//    // Проверка работы
//    printer.print("Привет, Java!");
//}
//}
// zadacha 2
//public static void main(String[] args) {
//    // Лямбда: проверяет, больше ли число 100
//    NumberChecker checker = n -> n > 100;
//
//    // Проверка значений
//    System.out.println(checker.check(50));   // false
//    System.out.println(checker.check(150));  // true
//}
//}
// zadacha 3
//public static void main(String[] args) {
//    // Предикат проверяет, что длина строки больше 5 символов
//    Predicate<String> isLong = s -> s.length() > 5;
//
//    // Демонстрация работы на двух примерах
//    System.out.println(isLong.test("Java"));                  // false
//    System.out.println(isLong.test("FunctionalInterface"));   // true
//}
//}
// zadacha 4
//public static void main(String[] args) {
//    // Лямбда-реализация: преобразует строку к нижнему регистру
//    StringTransformer transformer = s -> s.toLowerCase();
//
//    // Вызываем default-метод для строки "JAVA ROCKS"
//    transformer.printTransformed("JAVA ROCKS");
//}
//}
//Интерфейсы в архитектуре Java, паттерны проектирования
//zadacha 1
//public static void main(String[] args) {
//    // Демонстрация гибкости: две реализации одного интерфейса
//    Logger consoleLogger = new ConsoleLogger();
//    Logger fileLogger = new FileLogger();
//
//    String testMessage = "Тестовое сообщение";
//
//    // Один и тот же вызов — разное поведение
//    consoleLogger.log(testMessage);
//    fileLogger.log(testMessage);
//}
//}
// zadacha 2
//public static void main(String[] args) {
//    // Внедряем реализацию EmailSender в Notification
//    MessageSender emailSender = new EmailSender();
//    Notification notification = new Notification(emailSender);
//
//    // Тестируем отправку уведомления
//    notification.notifyUser("Привет!");
//}
//}
// zadacha 3
//public static void main(String[] args) {
//    Greeter greeter = new Greeter();
//
//    // Сначала используем дружелюбную стратегию
//    greeter.setStrategy(new FriendlyGreeting());
//    greeter.greet("Вася");
//
//    // Затем переключаемся на формальную стратегию
//    greeter.setStrategy(new FormalGreeting());
//    greeter.greet("Вася");
//}
//}
// zadacha 4
//public static void main(String[] args) {
//    // Создаем издателя
//    NewsPublisher publisher = new NewsPublisher();
//
//    // Создаем подписчиков
//    Person andrey = new Person("Андрей");
//    Person boris = new Person("Борис");
//
//    // Подписываем их
//    publisher.addSubscriber(andrey);
//    publisher.addSubscriber(boris);
//
//    // Публикуем новость
//    publisher.notifySubscribers("Обновление курса Java!");
//}
//}
// PROGECT
//import java.util.List;
//
//    public class Main {
//
//        public static void main(String[] args) {
//
//            Warrior w = new Warrior("Thor");
//            Mage m = new Mage("Merlin");
//            Robot r = new Robot("X-99");
//
//            Game game = new Game();
//            game.add(w);
//            game.add(m);
//            game.add(r);
//
//            System.out.println("=== START ===");
//            game.showAll();
//
//            System.out.println("\n=== BATTLE ===");
//            simulateFight(w, m);
//
//            System.out.println("\n=== HEAL MAGES ===");
//            healAllMages(game.getAll());
//
//            System.out.println("\n=== TOURNAMENT ===");
//            runTournament(game.getAll());
//
//            System.out.println("\n=== ATTACK WEAKEST ===");
//            attackWeakest(game, w);
//
//            System.out.println("\n=== REPORT ===");
//            printBattleReport(game);
//        }
//
//        // ===== TASKS =====
//
//        public static void simulateFight(GameCharacter a, GameCharacter b) {
//            if (!a.isAlive() || !b.isAlive()) {
//                System.out.println("Fight cancelled: dead fighter");
//                return;
//            }
//
//            System.out.println("Fight: " + a.getName() + " vs " + b.getName());
//
//            a.attack(b);
//            if (b.isAlive()) {
//                b.attack(a);
//            }
//
//            System.out.println("Result:");
//            a.showInfo();
//            b.showInfo();
//        }
//
//        public static void healAllMages(List<GameCharacter> list) {
//            for (GameCharacter c : list) {
//                if (c instanceof Mage) {
//                    ((Mage) c).heal(15);
//                }
//            }
//        }
//
//        public static void runTournament(List<GameCharacter> list) {
//            for (int i = 0; i < list.size(); i++) {
//                for (int j = i + 1; j < list.size(); j++) {
//
//                    GameCharacter a = list.get(i);
//                    GameCharacter b = list.get(j);
//
//                    if (!a.isAlive() || !b.isAlive()) continue;
//
//                    simulateFight(a, b);
//                }
//            }
//        }
//
//        public static void attackWeakest(Game game, GameCharacter attacker) {
//            GameCharacter weakest = null;
//
//            for (GameCharacter c : game.getAll()) {
//                if (c == attacker || !c.isAlive()) continue;
//
//                if (weakest == null || c.getHealth() < weakest.getHealth()) {
//                    weakest = c;
//                }
//            }
//
//            if (weakest == null) {
//                System.out.println("No targets available");
//                return;
//            }
//
//            System.out.println(attacker.getName() + " attacks weakest " + weakest.getName());
//            attacker.attack(weakest);
//        }
//
//        public static void printBattleReport(Game game) {
//            int alive = 0;
//            int dead = 0;
//
//            GameCharacter strongest = null;
//            GameCharacter weakestAlive = null;
//
//            for (GameCharacter c : game.getAll()) {
//
//                if (c.isAlive()) {
//                    alive++;
//
//                    if (weakestAlive == null || c.getHealth() < weakestAlive.getHealth()) {
//                        weakestAlive = c;
//                    }
//                } else {
//                    dead++;
//                }
//
//                if (strongest == null || c.getHealth() > strongest.getHealth()) {
//                    strongest = c;
//                }
//            }
//
//            System.out.println("\n=== BATTLE REPORT ===");
//            System.out.println("Alive: " + alive);
//            System.out.println("Dead: " + dead);
//
//            if (strongest != null) {
//                System.out.println("Strongest: " + strongest.getName() + " | HP: " + strongest.getHealth());
//            }
//
//            if (weakestAlive != null) {
//                System.out.println("Weakest: " + weakestAlive.getName() + " | HP: " + weakestAlive.getHealth());
//            }
//        }
//    }
//
// Введение в лямбда-выражения
// zadacha 1
//public static void main(String[] args) {
//
//    // Лямбда без параметров
//    Runnable action = () -> System.out.println("Лямбда без параметров!");
//
//    // Вызов действия
//    action.run();
//}
// zadacha 2
//public static void main(String[] args) {
//
//    // Обработчик текста: переводит строку в верхний регистр и печатает
//    Consumer<String> textProcessor = text -> System.out.println(text.toUpperCase());
//
//    // Проверка
//    textProcessor.accept("java"); // вывод: JAVA
//}
// zadacha 3
//public static void main(String[] args) {
//
//    // Исходный список результатов спортсменов
//    List<Integer> scores = Arrays.asList(-5, 3, -2, 7, 0);
//
//    // Компаратор: сравниваем по абсолютному значению
//    Comparator<Integer> absComparator = (a, b) -> Integer.compare(Math.abs(a), Math.abs(b));
//
//    // Сортируем список
//    scores.sort(absComparator);
//
//    // Вывод результата
//    System.out.println(scores); // ожидаем: [0, -2, 3, -5, 7]
//}
// zadacha 4
//public static void main(String[] args) {
//
//    // Фиксированный префикс
//    String prefix = "Результат: ";
//
//    // Лямбда-функция: удваивает число и добавляет префикс
//    Function<Integer, String> formatter =
//            n -> prefix + (n * 2);
//
//    // Проверка
//    System.out.println(formatter.apply(7)); // Результат: 14
//}
// Method References (::): ссылки на методы
// zadacha 1
//public static void main(String[] args) {
//
//    Function<Integer, String> converter = Integer::toHexString;
//
//    String result = converter.apply(255);
//
//    System.out.println(result);
//}
// zadacha 2
//public static void main(String[] args) {
//
//    // Ссылка на нестатический метод объекта System.out
//    Consumer<String> sender = System.out::println;
//
//    // Используем "отправителя"
//    sender.accept("Hello, method reference!");
//}
// zadacha 3
//public static void main(String[] args) {
//
//    List<String> fruits = Arrays.asList("яблоко", "банан", "груша");
//
//    // Сортировка с использованием ссылки на метод сравнения строк
//    fruits.sort(String::compareTo);
//
//    // Вывод результата
//    for (String fruit : fruits) {
//        System.out.println(fruit);
//    }
//}
// zadacha 4
//public static void main(String[] args) {
//
//    // Фабрика: создаёт Animal по имени
//    Function<String, Animal> factory = Animal::new;
//
//    // Создаём питомца
//    Animal pet = factory.apply("Барсик");
//
//    // Выводим имя
//    System.out.println(pet.name);
//}
// Default-методы в интерфейсах
// zadacha 1
//public static void main(String[] args) {
//
//    MyCounter device = new MyCounter();
//
//    device.increment(); // Counter incremented
//    device.reset();     // Counter reset
//}
// zadacha 2
//public static void main(String[] args) {
//
//    Dog dog = new Dog();
//
//    dog.voice(); // Woof
//    dog.sleep(); // Dog is sleeping
//}
// zadacha 3
//public static void main(String[] args) {
//
//    ConsolePrinter printer = new ConsolePrinter();
//
//    printer.printTwice("Java");
//}
// zadacha 4
//public static void main(String[] args) {
//
//    C c = new C();
//    c.show();
//}
// Static-методы в интерфейсах
// zadacha 1
//public static void main(String[] args) {
//
//    System.out.println(StringChecker.isEmpty(""));     // true
//    System.out.println(StringChecker.isEmpty("Java")); // false
//}
// zadacha 2
//public static void main(String[] args) {
//
//    Printer printer = new ConsolePrinter();
//
//    Printer.printHello(printer);
//}
// zadacha 3
//public static void main(String[] args) {
//
//    NumberPrinter printer = new NumberPrinter();
//
//    printer.printSquare(5);   // 25
//    MathHelper.printCube(3);  // 27
//}
// zadacha 4
//public static void main(String[] args) {
//
//    Logger.info("Start");
//    Logger.error("Failure");
//}
//Интерфейсы из стандартной библиотеки: Comparable, Serializable и др.
// zadacha 1
//public static void main(String[] args) {
//
//    NumberBox boxA = new NumberBox(10);
//    NumberBox boxB = new NumberBox(5);
//
//    int result = boxA.compareTo(boxB);
//
//    System.out.println(result);
//}
// zadacha 2
//import java.util.*;
//
//
//    public static void main(String[] args) {
//
//        List<City> cities = new ArrayList<>();
//        cities.add(new City("Нью-Йорк", 8400000));
//        cities.add(new City("Лондон", 8900000));
//        cities.add(new City("Париж", 2100000));
//
//        Collections.sort(cities);
//
//        for (City city : cities) {
//            System.out.println(city);
//        }
//    }
// zadacha 3
//import java.util.*;
//
//
//    public static void main(String[] args) {
//
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Телевизор", 55000));
//        products.add(new Product("Телефон", 35000));
//        products.add(new Product("Ноутбук", 80000));
//
//        // Сортировка по названию через анонимный класс
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.name.compareTo(p2.name);
//            }
//        });
//
//        // Вывод результата
//        for (Product p : products) {
//            System.out.println(p);
//        }
//    }
// zadacha 4
//public static void main(String[] args) {
//
//    try (DemoResource resource = new DemoResource()) {
//        System.out.println("Работа с ресурсом");
//    }
//
//}
// Record: синтаксис, преимущества
// zadacha 1
//public static void main(String[] args) {
//
//    BookCard favorite = new BookCard("Мастер и Маргарита", "Михаил Булгаков");
//
//    System.out.println("Название: " + favorite.title());
//    System.out.println("Автор: " + favorite.author());
//}
// zadacha 2
//public static void main(String[] args) {
//
//    Student student = new Student("Иван Петров", 20);
//
//    System.out.println(student.name());
//    System.out.println(student.age());
//}
// zadacha 3
//public static void main(String[] args) {
//
//    City city1 = new City("Paris", 2148327);
//    City city2 = new City("Paris", 2148327);
//
//    boolean areEqual = city1.equals(city2);
//
//    System.out.println(areEqual);
//}
// zadacha 4
//import java.util.*;
//
//
//    public static void main(String[] args) {
//
//        Map<User, String> roles = new HashMap<>();
//
//        roles.put(new User("Алиса", 1L), "администратор");
//        roles.put(new User("Боб", 2L), "модератор");
//        roles.put(new User("Ева", 3L), "гость");
//
//        User lookup = new User("Боб", 2L);
//
//        String role = roles.get(lookup);
//
//        System.out.println(role);
//    }
// Immutability — неизменяемость record-классов
// zadacha 1
//public static void main(String[] args) {
//
//    Book favoriteBook = new Book("Effective Java", "Joshua Bloch");
//
//    System.out.println("Название: " + favoriteBook.title());
//    System.out.println("Автор: " + favoriteBook.author());
//}
// zadacha 2
//public static void main(String[] args) {
//
//    HistoricalFigure figure = new HistoricalFigure("Леонардо да Винчи", 67);
//
//    System.out.println("Исходные данные: " + figure);
//    System.out.println("Имя: " + figure.name() + ", возраст: " + figure.age());
//
//    // ❌ Попытка изменить (раскомментируй — будет ошибка компиляции)
//    // figure.name = "Микеланджело";
//    // figure.setName("Микеланджело");
//
//    System.out.println("После попыток изменения объект не изменился: " + figure);
//}
// zadacha 3
//public static void main(String[] args) {
//
//    // Начальная точка
//    Point start = new Point(3, 7);
//
//    // "Перемещение" — создаём НОВЫЙ объект
//    Point moved = new Point(start.horizontal() + 2, start.vertical());
//
//    // Вывод
//    System.out.println(start);
//    System.out.println(moved);
//}
// zadacha 4
//public static void main(String[] args) {
//
//    int[] readings = {10, 20, 30};
//
//    IntArrayRecord container = new IntArrayRecord(readings);
//
//    // Меняем исходный массив
//    readings[0] = 99;
//
//    // Смотрим, что внутри record
//    System.out.println(container.values()[0]);
//}
//# **equals, hashCode, toString: автогенерация**
// zadacha 1
//public static void main(String[] args) {
//
//    Book book = new Book("Чистый код", "Роберт Мартин");
//
//    // Автоматически вызывается toString()
//    System.out.println(book);
//}
// zadacha 2
//public static void main(String[] args) {
//
//    Point point1 = new Point(40.7128, -74.0060);
//    Point point2 = new Point(40.7128, -74.0060);
//
//    boolean equalsResult = point1.equals(point2);
//    boolean sameHash = point1.hashCode() == point2.hashCode();
//
//    System.out.println(equalsResult);
//    System.out.println(sameHash);
//}
// zadacha 3
//public static void main(String[] args) {
//
//    UserProfile user = new UserProfile("Алиса", 25);
//
//    System.out.println(user);
//}
// zadacha 4
//public static void main(String[] args) {
//
//    Product p1 = new Product("Кружка", 199.99);
//    Product p2 = new Product("Кружка", 149.49);
//
//    System.out.println(p1.equals(p2));
//    System.out.println(p1.hashCode() == p2.hashCode());
//}
//# **Record с методами**
// zadacha 1
//public static void main(String[] args) {
//
//    Temperature boiling = Temperature.fromFahrenheit(212);
//
//    System.out.println(boiling.celsius());
//}
// zadacha 2
//public static void main(String[] args) {
//
//    // ✅ Корректный email
//    Email good = new Email("student@example.com");
//    System.out.println("Создан корректный адрес: " + good.address());
//
//    // ❌ Некорректный email
//    Email bad = new Email("student.example.com");
//
//    // Эта строка не выполнится
//    System.out.println(bad.address());
//}
// zadacha 3
//public static void main(String[] args) {
//
//    Person ivan = new Person("Иван", 25);
//
//    System.out.println(ivan.greeting());
//}
// zadacha 4
//public static void main(String[] args) {
//
//    Transaction ok = new Transaction("Иван Петров", "Мария Смирнова", 12500.75);
//    System.out.println(ok.describe());
//
//    // Ошибка — отрицательная сумма
//    Transaction bad = new Transaction("Иван Петров", "Мария Смирнова", -100.0);
//
//    System.out.println(bad.describe()); // не выполнится
//}
// Отличия record и class, ограничения record
// zadacha 1
//public static void main(String[] args) {
//
//    Book favorite = new Book("Мастер и Маргарита", "Михаил Булгаков");
//
//    System.out.println("Книга: " + favorite.title());
//    System.out.println("Автор: " + favorite.author());
//
//    // Можно так:
//    // System.out.println(favorite);
//}
// zadacha 2
//public static void main(String[] args) {
//
//    Point p1 = new Point(10, 20);
//    Point p2 = new Point(10, 20);
//
//    boolean same = p1.equals(p2);
//
//    System.out.println(same);
//}
// zadacha 3
//public static void main(String[] args) {
//
//    Printable doc = new Document("Привет из record-класса!");
//
//    doc.print();
//}
// zadacha 4
//public static void main(String[] args) {
//
//    // 🔄 Mutable object
//    FlexibleUser flexible = new FlexibleUser("Иван", 30);
//    System.out.println("Гибкий профиль (до изменений): " + flexible);
//
//    flexible.setName("Пётр");
//    flexible.setAge(25);
//
//    System.out.println("Гибкий профиль (после изменений): " + flexible);
//
//    // ❄️ Immutable record
//    FixedUser fixed = new FixedUser("Анна", 28);
//    System.out.println("Фиксированный профиль (record): " + fixed);
//
//    // ❌ Попытки изменения невозможны:
//    // fixed.setName("Мария"); // нет сеттера
//    // fixed.name = "Мария";   // поле final
//}
//    ООП -типичные ошибки и best practices
// Ошибки при объявлении классов и объектов
// zadacha 1
// public class Student {
//
//    String studentName;
//
//}
// zadacha 2
//public static void main(String[] args) {
//
//    // Объявляем переменную, но НЕ создаем объект
//    Book libraryBook = null;
//
//    // Пытаемся использовать "несуществующий" объект
//    System.out.println(libraryBook.getTitle()); // 💥 ошибка
//}
// zadacha 3
//public static void main(String[] args) {
//    new Calculator().calculate();
//}
// zadacha 4
//public static void main(String[] args) {
//
//    // ✅ Создаём товар с именем
//    Product milk = new Product("Молоко");
//
//    // Выводим имя товара
//    System.out.println("Товар: " + milk.getProductName());
//
//    // ❌ Так нельзя — будет ошибка компиляции:
//    // Product p = new Product();
//}
// Ошибки с наследованием и перегрузкой методов
// zadacha 1
//    class Dog extends Animal { // 💥 ОШИБКА
//        public void bark() {
//            System.out.println("Woof");
//        }
//
// zadacha 2
//public static void main(String[] args) {
//
//    Dog dog = new Dog();
//
//    dog.makeSound();           // метод из Animal
//    dog.makeSound("громко");   // метод из Dog
//}
// zadacha 3
//public static void main(String[] args) {
//
//    Cat cat = new Cat("Барсик");
//
//    System.out.println(cat.getName());
//}
// zadacha 4
//public static void main(String[] args) {
//
//    OverloadDemo demo = new OverloadDemo();
//
//    long value = 5L;
//
//    demo.print(value); // 👈 интересный момент
//}
//Ошибки с модификаторами доступа
// zadacha 1
//public static void main(String[] args) {
//
//    // Создаем новый автомобиль
//    Car newCar = new Car();
//
//    // Заполняем данные
//    newCar.carBrand = "Toyota";
//    newCar.productionYear = 2022;
//
//    // Выводим информацию
//    System.out.println("Марка: " + newCar.carBrand);
//    System.out.println("Год выпуска: " + newCar.productionYear);
//}
// zadacha 2
//public static void main(String[] args) {
//
//    Product product = new Product();
//
//    // Устанавливаем цену
//    product.setPrice(49.99);
//
//    // Получаем цену
//    double currentPrice = product.getPrice();
//
//    System.out.println(currentPrice);
//}
// zadacha 3
//public static void main(String[] args) {
//
//    User user = new User();
//
//    // ❌ Ошибка компиляции
//    user.userPassword = "12345";
//}
// zadacha 4
//public static void main(String[] args) {
//
//    Animal animal = new Animal();
//
//    // ❌ Ошибка доступа
//    animal.makeSound();
//}
// Проблемы полиморфизма и абстракций
// zadacha 1
//public static void main(String[] args) {
//
//    Dog dog = new Dog();
//    dog.makeSound();
//}
// zadacha 2
//public static void main(String[] args) {
//
//    Shape[] canvas = new Shape[2];
//
//    canvas[0] = new Circle();
//    canvas[1] = new Square();
//
//    for (Shape shape : canvas) {
//        shape.printType();
//    }
//}
// zadacha 3
//public static void main(String[] args) {
//
//    Appliance homeAppliance = new Kettle();
//
//    if (homeAppliance instanceof Kettle) {
//        Kettle kettle = (Kettle) homeAppliance;
//        kettle.boil();
//    }
//}
// zadacha 4
//public static void main(String[] args) {
//
//    Programmer programmer = new Programmer("Алиса");
//
//    programmer.work();
//    programmer.report();
//}
// Стиль и читаемость кода, code conventions
// zadacha 1
//public static void main(String[] args) {
//
//    // Объявляем переменную
//    int inputNumber = 10;
//
//    // Проверяем, положительное ли число
//    if (inputNumber > 0) {
//        System.out.println("Положительное");
//    } else {
//        System.out.println("Не положительное");
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // Демонстрация
//    Solution app = new Solution();
//    app.printMessage();
//}
// zadacha 3
//    public class Main {
//
//        static final double INCOME_TAX_RATE = 0.13;
//
//        public static void main(String[] args) {
//
//            double employeeSalary = 5000.0;
//
//            double calculatedTax = employeeSalary * INCOME_TAX_RATE;
//
//            System.out.println(calculatedTax);
//        }
//    }
// zadacha 4
//public static void main(String[] args) {
//
//    Product banana = new Product("Банан");
//    System.out.println(banana.getProductName());
//}
// Продвинутая работа с исключениями
// Иерархия исключений в Java
// zadacha 1
//public static void main(String[] args) {
//
//    // Создаем две "проблемы"
//    IOException networkProblem = new IOException();
//    NullPointerException missingDataError = new NullPointerException();
//
//    // Получаем родительские классы
//    Class<?> parent1 = networkProblem.getClass().getSuperclass();
//    Class<?> parent2 = missingDataError.getClass().getSuperclass();
//
//    // Выводим имена родительских классов
//    System.out.println(parent1.getName());
//    System.out.println(parent2.getName());
//}
// zadacha 2
//public static void main(String[] args) {
//
//    // Общее исключение (обрабатываемое)
//    Exception generalSystemIssue = new Exception();
//
//    // Фатальная ошибка (уровень JVM)
//    Error catastrophicFailure = new Error();
//
//    // Проверяем, являются ли они наследниками Throwable
//    boolean isGeneralThrowable =
//            Throwable.class.isAssignableFrom(generalSystemIssue.getClass());
//
//    boolean isCatastrophicThrowable =
//            Throwable.class.isAssignableFrom(catastrophicFailure.getClass());
//
//    // Выводим результат
//    System.out.println(isGeneralThrowable);
//    System.out.println(isCatastrophicThrowable);
//}
// zadacha 3
//public static void main(String[] args) {
//
//    // "Неожиданный сбой": RuntimeException — непроверяемое (unchecked) исключение
//    RuntimeException unexpectedGlitch = new RuntimeException();
//
//    // "Потерянный файл конфигурации": FileNotFoundException — проверяемое (checked) исключение
//    FileNotFoundException missingConfigurationFile = new FileNotFoundException();
//
//    // Выводим классификацию
//    System.out.println("RuntimeException — unchecked");
//    System.out.println("FileNotFoundException — checked");
//}
// zadacha 4
//public static void main(String[] args) {
//    try {
//        // Имитация поиска отчёта
//        throw new FileNotFoundException("Отчёт не найден!");
//
//    } catch (FileNotFoundException e) {
//        // Самый специфичный план
//        System.out.println("План 1: Отчёт не найден");
//
//    } catch (IOException e) {
//        // Более общий план
//        System.out.println("План 2: Проблемы с доступом к данным");
//
//    } catch (Exception e) {
//        // Самый общий план
//        System.out.println("План 3: Непредвиденная ситуация");
//    }
//}
// # **Создание собственных исключений**
// zadacha 1
//public static void main(String[] args) {
//
//    try {
//        // Пробуем проверить счёт
//        Solution.checkPlayerScore(5);
//
//        // Если всё ок
//        System.out.println("Счёт принят");
//
//    } catch (ScoreTooLowException e) {
//        // Обрабатываем нашу ошибку
//        System.out.println(e.getMessage());
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//
//    PasswordGuard guard = new PasswordGuard();
//
//    try {
//        // Симуляция слабого пароля
//        guard.enforcePasswordStrength("123");
//
//    } catch (WeakPasswordException e) {
//        // Вывод предупреждения пользователю
//        System.out.println(e.getMessage());
//    }
//}
// zadacha 3
//    public class Solution {
//        public static void main(String[] args) {
//            int userAge = 14;
//            int requiredAge = 16;
//
//            try {
//                // Пытаемся пройти возрастной контроль
//                checkRideAge(userAge, requiredAge);
//                System.out.println("Добро пожаловать на аттракцион!");
//            } catch (InvalidAgeException e) {
//                // Показываем осмысленное сообщение
//                System.out.println("Отказ: " + e.getMessage());
//            }
//        }
//
//        // Метод проверки возраста
//        static void checkRideAge(int age, int minAge) throws InvalidAgeException {
//            if (age < minAge) {
//                throw new InvalidAgeException(
//                        "Вам должно быть не менее " + minAge +
//                                " лет для этого аттракциона (сейчас " + age + ")."
//                );
//            }
//        }
//    }
//
// Пользовательское исключение
//class InvalidAgeException extends Exception {
//
//    // "безмолвный" конструктор
//    public InvalidAgeException() {
//        super("Проблема с возрастом");
//    }
//
//    // конструктор с подробным сообщением
//    public InvalidAgeException(String message) {
//        super(message);
//    }
//}
// zadacha 4
//public static void main(String[] args) {
//    try {
//        Solution.tryAddItem(150, 100);
//
//    } catch (StorageCapacityExceededException e) {
//
//        System.out.println("Ошибка: " + e.getMessage());
//        System.out.println("Текущее значение: " + e.getCurrentItemCount());
//        System.out.println("Лимит: " + e.getMaximumCapacity());
//    }
//}
// Цепочки исключений (Exception Chaining)
// zadacha 1
//public static void main(String[] args) {
//    // Создаем "первопричину" — уже существующее исключение
//    Throwable rootCause = new NullPointerException("данные отсутствуют!");
//
//    // Создаем наше исключение и "прикрепляем" к нему первопричину
//    DataProcessingFailure failure =
//            new DataProcessingFailure("Ошибка генерации отчёта", rootCause);
//
//    // Выводим на экран первопричину через getCause()
//    System.out.println(failure.getCause());
//}
// zadacha 2
//public static void main(String[] args) {
//    try {
//        Solution.generateFinalReport();
//    } catch (DataLoadingError e) {
//        // Сообщение верхнего уровня
//        System.out.println(e.getMessage());
//
//        // Первопричина
//        Throwable cause = e.getCause();
//        if (cause != null) {
//            System.out.println(cause.getMessage());
//        }
//    }
//}
// zadacha 3
//public static void main(String[] args) {
//    try {
//        // Симулируем "внешнюю ошибку" с причиной
//        throw new InputValidationException(
//                "Внешняя ошибка обработки ввода",
//                new IllegalArgumentException("Передан некорректный формат данных")
//        );
//
//    } catch (InputValidationException e) {
//        // 1) сообщение внешнего исключения
//        System.out.println(e.getMessage());
//
//        // 2) сообщение исключения-источника (корня)
//        System.out.println(e.getCause().getMessage());
//
//        // 3) имя класса исключения-источника
//        System.out.println(e.getCause().getClass().getName());
//    }
//}
// zadacha 4
//public static void main(String[] args) {
//    try {
//        provokeLifeSupportCrisis();
//    } catch (ThirdSystemFailure e) {
//        e.printStackTrace();
//    }
//}
//
//            // 1 уровень
//            public static void initiateSystemFailure() throws FirstSystemFailure {
//                throw new FirstSystemFailure("Проблема в ядре системы", null);
//            }
//
//            // 2 уровень
//            public static void triggerNavigationMalfunction() throws SecondSystemFailure {
//                try {
//                    initiateSystemFailure();
//                } catch (FirstSystemFailure e) {
//                    throw new SecondSystemFailure("Навигационная система отказала", e);
//                }
//            }
//
//            // 3 уровень
//            public static void provokeLifeSupportCrisis() throws ThirdSystemFailure {
//                try {
//                    triggerNavigationMalfunction();
//                } catch (SecondSystemFailure e) {
//                    throw new ThirdSystemFailure("Критический отказ системы жизнеобеспечения", e);
//                }
//            }
// Сложная обработка исключений и лучшие практики
// zadacha 1
//public static void main(String[] args) {
//    try {
//        // Пытаемся открыть файл и прочитать первую строку
//        BufferedReader reader = new BufferedReader(new FileReader("daily_transactions.txt"));
//        String line = reader.readLine();
//
//        // Пробуем преобразовать строку в число
//        int total = Integer.parseInt(line);
//
//        // Если всё успешно
//        System.out.println("Сумма транзакций: " + total);
//
//        reader.close();
//
//    } catch (FileNotFoundException e) {
//        // Файл не найден
//        System.out.println("Файл транзакций не найден!");
//
//    } catch (IOException e) {
//        // Ошибка чтения файла
//        System.out.println("Ошибка чтения данных из файла!");
//
//    } catch (NumberFormatException e) {
//        // Некорректный формат данных
//        System.out.println("В файле обнаружены некорректные финансовые данные!");
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    try {
//        // Открываем файл и читаем первую строку
//        BufferedReader reader = new BufferedReader(new FileReader("game_config.txt"));
//        String line = reader.readLine();
//
//        // Пытаемся преобразовать строку в число (например, уровень сложности)
//        int difficulty = Integer.parseInt(line);
//
//        System.out.println("Уровень сложности: " + difficulty);
//
//        reader.close();
//
//    } catch (IOException | NumberFormatException e) {
//        // Один catch для нескольких типов ошибок
//        System.out.println("Ошибка: " + e.getMessage());
//    }
//}
// zadacha 3
//public static void main(String[] args) {
//
//    try {
//        // Пытаемся открыть файл — может возникнуть FileNotFoundException
//        FileInputStream fis = new FileInputStream("secret_document.txt");
//
//        // Читаем первый байт (простая проверка доступа)
//        int data = fis.read();
//
//        // Намеренно провоцируем общую IOException
//        if (data == -1) {
//            throw new IOException("Файл пуст или произошла ошибка чтения");
//        }
//
//        fis.close();
//
//    } catch (FileNotFoundException e) {
//        // Более специфичная ошибка
//        System.out.println("Секретный документ не найден!");
//
//    } catch (IOException e) {
//        // Более общая ошибка
//        System.out.println("Ошибка доступа к архиву!");
//    }
//}
// zadacha 4
//public static void main(String[] args) {
//    System.out.println("Фоновая служба логирования запущена.");
//
//    try {
//        // Создаём временную директорию и используем её как "файл"
//        Path tempDir = Files.createTempDirectory("logs");
//
//        // Пытаемся записать в директорию как в файл → будет IOException
//        saveEvent("Важное событие", tempDir);
//
//        // До этой строки выполнение не дойдёт
//        System.out.println("Запись успешно выполнена.");
//
//    } catch (IOException e) {
//        // ВАЖНО: не игнорируем ошибку — выводим полный стек
//        e.printStackTrace();
//    }
//
//    System.out.println("Демонстрация завершена.");
//}
//
//            // Бизнес-уровень
//            private static void saveEvent(String message, Path logFile) throws IOException {
//                writeLog(logFile, message);
//            }
//
//            // Низкоуровневая запись
//            private static void writeLog(Path logFile, String text) throws IOException {
//                Files.writeString(
//                        logFile,
//                        text + System.lineSeparator(),
//                        StandardOpenOption.CREATE,
//                        StandardOpenOption.APPEND
//                );
//            }
// Исключения как часть API и try-with-resources
// zadacha 1
//public static void main(String[] args) {
//
//    try (BufferedReader reader = new BufferedReader(new FileReader("article_text.txt"))) {
//        // Читаем первую строку
//        String headline = reader.readLine();
//
//        // Выводим заголовок
//        System.out.println(headline);
//
//    } catch (IOException e) {
//        // Обработка любой ошибки чтения файла
//        System.out.println("Ошибка чтения статьи!");
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // try-with-resources гарантирует автоматический вызов close()
//    try (MagicArtifact artifact = new MagicArtifact()) {
//
//        System.out.println("Идёт работа с магическим артефактом");
//        // Здесь могла бы быть любая логика работы с артефактом
//
//    } // <-- здесь автоматически вызовется close()
//}
// zadacha 3
//public static void main(String[] args) {
//    try {
//        // Передаём заведомо некорректную строку
//        int value = parseMeasurementValue("123abc");
//
//        // До этой строки выполнение не дойдёт
//        System.out.println("Значение: " + value);
//
//    } catch (NumberFormatException e) {
//        // Понятное сообщение для пользователя
//        System.out.println("Ошибка преобразования числа: введены некорректные данные");
//    }
//}
//
//            /**
//             * Преобразует строковое значение измерения в целое число.
//             *
//             * @param measurement строка с данными измерения
//             * @return целочисленное значение измерения
//             * @throws NumberFormatException если строка не является корректным числом
//             */
//            public static int parseMeasurementValue(String measurement) {
//                // Может выбросить NumberFormatException
//                return Integer.parseInt(measurement);
//            }
// zadacha 4
//public static void main(String[] args) {
//
//    try (
//            BufferedReader reader = new BufferedReader(new FileReader("ancient_manuscript.txt"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("digital_archive.txt"))
//    ) {
//        String line;
//
//        // Читаем построчно и сразу записываем
//        while ((line = reader.readLine()) != null) {
//            writer.write(line);
//            writer.newLine(); // сохраняем перенос строки
//        }
//
//    } catch (IOException e) {
//        // Любая ошибка при работе с файлами
//        System.out.println("Ошибка копирования рукописи!");
//    }
//}
// Обзор коллекций Java — зачем нужны коллекции
// zadacha1
//public static void main(String[] args) {
//    // Создаем динамический список для хранения фруктов
//    ArrayList<String> fruits = new ArrayList<>();
//
//    // Добавляем фрукты в заданном порядке
//    fruits.add("Яблоко");
//    fruits.add("Банан");
//    fruits.add("Груша");
//
//    // Выводим весь список
//    System.out.println(fruits);
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем "картотеку" студентов
//    HashMap<String, Integer> students = new HashMap<>();
//
//    // Добавляем данные о студентах
//    students.put("Иван", 20);
//    students.put("Мария", 21);
//    students.put("Алексей", 19);
//
//    // Выводим полный список студентов и их возрастов
//    System.out.println(students);
//}
// List: ArrayList и LinkedList, основные операции
// zadacha 1
//public static void main(String[] args) {
//    // Используем интерфейс List для хранения предметов
//    List<String> subjects = new ArrayList<>();
//
//    // Добавляем три основных предмета
//    subjects.add("Математика");
//    subjects.add("Физика");
//    subjects.add("Информатика");
//
//    // Вставляем "Английский" в начало списка
//    subjects.add(0, "Английский");
//
//    // Удаляем "Физика"
//    subjects.remove("Физика");
//
//    // Выводим итоговое расписание
//    for (String subject : subjects) {
//        System.out.println(subject);
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем список фильмов
//    ArrayList<String> movies = new ArrayList<>();
//
//    // Добавляем фильмы
//    movies.add("Титаник");
//    movies.add("Матрица");
//    movies.add("Интерстеллар");
//
//    // По ошибке добавили "Матрица" снова
//    movies.add("Матрица");
//
//    // Ищем первое вхождение "Матрица"
//    int index = movies.indexOf("Матрица");
//    System.out.println("Первое вхождение 'Матрица': " + index);
//
//    // Проверяем наличие "Аватар"
//    boolean hasAvatar = movies.contains("Аватар");
//    System.out.println("Есть ли 'Аватар' в списке: " + hasAvatar);
//
//    // Очищаем список
//    movies.clear();
//
//    // Выводим список после очистки
//    System.out.println(movies);
//}
// Map: HashMap и TreeMap, ключи и значения
// zadacha 1
//public static void main(String[] args) {
//    // Создаём Map: день недели -> номер
//    Map<String, Integer> daysOfWeek = new HashMap<>();
//
//    // Добавляем элементы
//    daysOfWeek.put("Monday", 1);
//    daysOfWeek.put("Tuesday", 2);
//    daysOfWeek.put("Wednesday", 3);
//
//    // Выводим все пары ключ-значение
//    for (Map.Entry<String, Integer> entry : daysOfWeek.entrySet()) {
//        System.out.println(
//                "День: " + entry.getKey() +
//                        ", Номер: " + entry.getValue()
//        );
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // TreeMap автоматически сортирует ключи по алфавиту
//    TreeMap<String, Integer> fruits = new TreeMap<>();
//
//    // Добавляем данные о фруктах
//    fruits.put("pear", 6);
//    fruits.put("apple", 2);
//    fruits.put("banana", 4);
//
//    // Выводим ассортимент в алфавитном порядке
//    for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
//        System.out.println(
//                "Фрукт: " + entry.getKey() +
//                        ", Количество: " + entry.getValue()
//        );
//    }
//}
//Set: HashSet и TreeSet, уникальность элементов
// zadacha 1
//public static void main(String[] args) {
//    // TreeSet автоматически сортирует элементы и убирает дубликаты
//    TreeSet<String> participants = new TreeSet<>();
//
//    // Добавляем участников
//    participants.add("Борис");
//    participants.add("Алексей");
//    participants.add("Виктор");
//
//    // Выводим список участников
//    System.out.println(participants);
//}
// zadacha 2
//public static void main(String[] args) {
//    // Исходный список с повторяющимися товарами
//    List<String> shoppingList = new ArrayList<>();
//
//    shoppingList.add("яблоко");
//    shoppingList.add("груша");
//    shoppingList.add("яблоко");
//    shoppingList.add("слива");
//    shoppingList.add("груша");
//
//    // Set автоматически удаляет дубликаты
//    Set<String> uniqueProducts = new HashSet<>(shoppingList);
//
//    // Выводим уникальные товары
//    System.out.println(uniqueProducts);
//}
// Generics: зачем нужны, базовый синтаксис
// zadacha 1
//public static void main(String[] args) {
//    // Создаем каталог книг
//    List<Book> libraryCatalog = new ArrayList<>();
//
//    // Добавляем книги в каталог
//    libraryCatalog.add(new Book("1984", "Джордж Оруэлл"));
//    libraryCatalog.add(new Book("Мастер и Маргарита", "Михаил Булгаков"));
//
//    // Выводим информацию о каждой книге
//    for (Book book : libraryCatalog) {
//        System.out.println(
//                "Название: " + book.getTitle() +
//                        ", Автор: " + book.getAuthor()
//        );
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем "универсальный сундук" для строк
//    UniversalChest<String> messageChest = new UniversalChest<>();
//    messageChest.put("Тайное послание: «Да пребудет с тобой Java!»");
//
//    // Создаем "универсальный сундук" для целых чисел
//    UniversalChest<Integer> numberChest = new UniversalChest<>();
//    numberChest.put(777);
//
//    // Извлекаем содержимое сундуков
//    String secretMessage = messageChest.take();
//    Integer magicNumber = numberChest.take();
//
//    // Выводим содержимое
//    System.out.println(secretMessage);
//    System.out.println(magicNumber);
//}
//Интерфейсы Collection, List, Set, Map: иерархия
// zadacha 1
//public static void main(String[] args) {
//    // Создаем палитру цветов
//    List<String> palette = new LinkedList<>();
//
//    // Добавляем цвета
//    palette.add("красный");
//    palette.add("зелёный");
//    palette.add("синий");
//
//    // Получаем второй элемент (индекс 1)
//    String selectedColor = palette.get(1);
//
//    // Выводим выбранный цвет
//    System.out.println(selectedColor);
//}
// zadacha 2
//public static void main(String[] args) {
//    // List хранит все предметы, включая повторы
//    List<Integer> allItems = new ArrayList<>();
//
//    // Set хранит только уникальные предметы
//    Set<Integer> uniqueItems = new HashSet<>();
//
//    // Добавляем идентификаторы 3, 7, 3, 9 в обе коллекции
//    allItems.add(3);
//    allItems.add(7);
//    allItems.add(3);
//    allItems.add(9);
//
//    uniqueItems.add(3);
//    uniqueItems.add(7);
//    uniqueItems.add(3);
//    uniqueItems.add(9);
//
//    // Выводим количество: сначала общее, затем уникальное
//    System.out.println(allItems.size());
//    System.out.println(uniqueItems.size());
//}
//Iterable и Iterator: перебор коллекций
// zadacha 1
//public static void main(String[] args) {
//    // Создаём словарь переводов: английское слово -> русский перевод
//    HashMap<String, String> dictionary = new HashMap<>();
//
//    // Заполняем словарь тремя парами
//    dictionary.put("dog", "собака");
//    dictionary.put("cat", "кошка");
//    dictionary.put("bird", "птица");
//
//    // Перебираем пары через for-each по entrySet()
//    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//        // Форматированный вывод в виде "ключ = значение"
//        System.out.println(entry.getKey() + " = " + entry.getValue());
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем множество HashSet<String> для хранения технологий
//    Set<String> technologies = new HashSet<>();
//
//    // Добавляем названия технологий
//    technologies.add("java");
//    technologies.add("python");
//    technologies.add("c++");
//    technologies.add("javascript");
//
//    // Удаляем элементы, содержащие символ '+', используя итератор
//    Iterator<String> iterator = technologies.iterator();
//
//    while (iterator.hasNext()) {
//        String technology = iterator.next();
//
//        if (technology.contains("+")) {
//            iterator.remove();
//        }
//    }
//
//    // Выводим оставшиеся элементы множества, каждый на новой строке
//    for (String technology : technologies) {
//        System.out.println(technology);
//    }
//}
// Queue, Deque, Stack: работа с очередями и стеками
// zadacha 1
//public static void main(String[] args) {
//    // Создаем очередь задач на основе LinkedList
//    Queue<Integer> tasks = new LinkedList<>();
//
//    // Добавляем идентификаторы задач в указанном порядке
//    tasks.add(5);
//    tasks.add(15);
//    tasks.add(25);
//
//    // Получаем первый элемент без удаления из очереди
//    Integer nextTask = tasks.peek();
//
//    // Выводим идентификатор следующей задачи
//    System.out.println(nextTask);
//
//    // Выводим текущий размер очереди
//    System.out.println(tasks.size());
//}
// zadacha 2
//public static void main(String[] args) {
//    // Очередь печати на базе ArrayDeque (FIFO)
//    Queue<String> queue = new ArrayDeque<>();
//
//    queue.add("Кот");
//    queue.add("Пёс");
//    queue.add("Мышь");
//
//    // Стек истории действий на базе ArrayDeque (LIFO)
//    Deque<Character> stack = new ArrayDeque<>();
//
//    // Используем push для добавления на вершину стека
//    stack.push('X');
//    stack.push('Y');
//    stack.push('Z');
//
//    // Вывод очереди
//    System.out.println("Очередь:");
//    while (!queue.isEmpty()) {
//        System.out.println(queue.poll());
//    }
//
//    // Вывод стека
//    System.out.println("Стек:");
//    while (!stack.isEmpty()) {
//        System.out.println(stack.pop());
//    }
//}
//NavigableSet/NavigableMap
// zadacha 1
//public static void main(String[] args) {
//    // Создаем NavigableMap, чтобы быстро находить порог по баллам
//    NavigableMap<Integer, String> levels = new TreeMap<>();
//
//    // Заполняем карту: ключ — минимальные баллы, значение — название уровня
//    levels.put(1, "бронзовый");
//    levels.put(3, "серебряный");
//    levels.put(5, "золотой");
//    levels.put(7, "платиновый");
//
//    // Количество баллов клиента
//    int points = 4;
//
//    // Находим наибольший ключ, не превышающий количество баллов
//    Integer key = levels.floorKey(points);
//
//    // Получаем и выводим название уровня
//    if (key != null) {
//        System.out.println(levels.get(key));
//    } else {
//        System.out.println("Уровень не найден");
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // Основной складской реестр
//    NavigableSet<Integer> warehouse = new TreeSet<>();
//
//    // Добавляем идентификаторы товаров
//    warehouse.add(10);
//    warehouse.add(20);
//    warehouse.add(30);
//    warehouse.add(40);
//    warehouse.add(50);
//
//    // Формируем "вид" на часть реестра: от 20 включительно до 50 исключительно
//    NavigableSet<Integer> shipment = warehouse.subSet(20, true, 50, false);
//
//    // Удаляем поврежденный товар 30 из временного списка
//    shipment.remove(30);
//
//    // Сначала выводим временный список отгрузки, затем основной реестр
//    System.out.println(shipment);
//    System.out.println(warehouse);
//}
// Фильтрация элементов коллекций
// zadacha 1
//public static void main(String[] args) {
//    // Создаем изменяемый список с начальными значениями
//    List<Integer> numbers = new ArrayList<>(Arrays.asList(5, -3, 8, -1, 0, 4, -7));
//
//    // Обходим список с помощью Iterator, чтобы безопасно удалять элементы во время обхода
//    Iterator<Integer> iterator = numbers.iterator();
//
//    while (iterator.hasNext()) {
//        Integer number = iterator.next();
//
//        if (number < 0) {
//            iterator.remove();
//        }
//    }
//
//    // Выводим обновленный список без отрицательных чисел
//    System.out.println(numbers);
//}
//zadacha 2
//public static void main(String[] args) {
//    // Создаем изменяемый список с исходными названиями животных
//    List<String> animals = new ArrayList<>();
//
//    animals.add("cat");
//    animals.add("elephant");
//    animals.add("dog");
//    animals.add("tiger");
//    animals.add("rat");
//    animals.add("lion");
//
//    // Удаляем все строки, длина которых меньше 4 символов
//    animals.removeIf(animal -> animal.length() < 4);
//
//    // Выводим обновленный список после фильтрации
//    System.out.println(animals);
//}
//Преобразование коллекций
// zadacha 1
//public static void main(String[] args) {
//    // Создаем список студентов и наполняем его объектами Student с именами
//    List<Student> students = new ArrayList<>();
//    students.add(new Student("Иван"));
//    students.add(new Student("Мария"));
//    students.add(new Student("Петр"));
//
//    // Создаем новый список для хранения только имён студентов
//    List<String> names = new ArrayList<>();
//
//    // Преобразуем каждый объект Student в строку с именем и добавляем в список names
//    for (Student student : students) {
//        names.add(student.getStudentName());
//    }
//
//    // Выводим на экран список имён
//    System.out.println(names);
//}
//zadacha 2
//public static void main(String[] args) {
//    // Создаём вложенный список сундуков с камнями
//    List<List<Integer>> treasureChests = List.of(
//            List.of(1, 2),
//            List.of(3, 4, 5),
//            List.of(6)
//    );
//
//    // Новый список, куда соберём все камни в исходном порядке
//    List<Integer> allGems = new ArrayList<>();
//
//    // Проходим по каждому "сундуку" и добавляем его содержимое
//    for (List<Integer> chest : treasureChests) {
//        allGems.addAll(chest);
//    }
//
//    // Выводим объединённый список
//    System.out.println(allGems);
//}
//Безопасное удаление элементов
//zadacha 1
//public static void main(String[] args) {
//    // Формируем исходный список животных
//    List<String> animals = new ArrayList<>();
//    animals.add("cat");
//    animals.add("dog");
//    animals.add("bird");
//    animals.add("fish");
//
//    // Получаем ListIterator для безопасного прохода и модификации списка
//    ListIterator<String> iterator = animals.listIterator();
//
//    // Итерируемся по списку
//    while (iterator.hasNext()) {
//        String animal = iterator.next();
//
//        if (animal.length() == 3) {
//            iterator.remove();
//            iterator.add("pet");
//        }
//    }
//
//    // После обработки выводим итоговый список на экран
//    System.out.println(animals);
//}
//zadacha 2
//public static void main(String[] args) {
//    // Создаем и заполняем HashMap результатами участников
//    HashMap<String, Integer> results = new HashMap<>();
//    results.put("A", 1);
//    results.put("B", 2);
//    results.put("C", 3);
//    results.put("D", 4);
//
//    // Получаем итератор по набору записей (entrySet)
//    Iterator<Map.Entry<String, Integer>> iterator = results.entrySet().iterator();
//
//    // Идем по каждой паре "участник-балл"
//    while (iterator.hasNext()) {
//        Map.Entry<String, Integer> entry = iterator.next();
//
//        // Если балл четный — безопасно удаляем через итератор
//        if (entry.getValue() % 2 == 0) {
//            iterator.remove();
//        }
//    }
//
//    // Выводим очищенную карту на экран
//    System.out.println(results);
//}
//EnumSet/EnumMap
//zadacha 1
//public static void main(String[] args) {
//    // Создаем EnumSet только с выходными днями
//    EnumSet<Day> weekendDays = EnumSet.of(Day.SAT, Day.SUN);
//
//    // Выводим содержимое EnumSet на экран
//    System.out.println(weekendDays);
//}
//
//
//            // Перечисление с полным набором дней недели
//            enum Day {
//                MON, TUE, WED, THU, FRI, SAT, SUN
//            }
//zadacha 2
//public static void main(String[] args) {
//    // Специализированная карта для enum-ключей
//    EnumMap<Day, Integer> prices = new EnumMap<>(Day.class);
//
//    // Заполняем цены согласно условию
//    prices.put(Day.MON, 100);
//    prices.put(Day.TUE, 120);
//    prices.put(Day.SAT, 200);
//
//    // Получаем цену на субботу и выводим на экран
//    System.out.println(prices.get(Day.SAT));
//}
//LinkedHashSet/LinkedHashMap
//zadacha 1
//public static void main(String[] args) {
//    // Создаем LinkedHashMap с "порядком по обращению" (accessOrder = true)
//    LinkedHashMap<String, Integer> products = new LinkedHashMap<>(16, 0.75f, true);
//
//    // Добавляем товары: ключ — код товара, значение — его id
//    products.put("a", 1);
//    products.put("b", 2);
//    products.put("c", 3);
//
//    // Имитация просмотра товара "b": доступ через get переносит "b" в конец
//    products.get("b");
//
//    // Выводим ключи в текущем порядке обхода: ожидается a, c, b
//    for (String key : products.keySet()) {
//        System.out.println(key);
//    }
//}
//zadacha 2
//public static void main(String[] args) {
//    // Создаем кэш с порядком по доступу (LRU)
//    GameAssetCache cache = new GameAssetCache();
//
//    // Добавляем ассеты
//    cache.put(1, "one");
//    cache.put(2, "two");
//
//    // "Используем" ассет с ключом 1 — он становится самым недавно использованным
//    cache.get(1);
//
//    // Добавляем ассет 3 — удалится наименее недавно использованный ключ 2
//    cache.put(3, "three");
//
//    // Выводим ключи оставшихся ассетов
//    for (Integer id : cache.keySet()) {
//        System.out.println(id);
//    }
//}
//Контракты equals и hashCode
//zadacha 1
//public static void main(String[] args) {
//    // HashSet хранит только уникальные элементы по equals/hashCode
//    HashSet<City> cities = new HashSet<>();
//
//    // Добавляем два разных объекта с одинаковыми значениями полей
//    cities.add(new City("Метрополис", 1_000_000));
//    cities.add(new City("Метрополис", 1_000_000));
//
//    // Если equals/hashCode реализованы корректно, размер будет 1
//    System.out.println(cities.size());
//}
//zadacha 2
//public static void main(String[] args) {
//    // Создаём два независимых объекта с одинаковыми значениями полей
//    Employee first = new Employee("Алиса", 123);
//    Employee second = new Employee("Алиса", 123);
//
//    // HashMap, где ключом выступает Employee, а значением — роль
//    Map<Employee, String> roles = new HashMap<>();
//
//    // Кладём в карту пару
//    roles.put(first, "Работник");
//
//    // Получаем значение по логически равному ключу
//    String role = roles.get(second);
//
//    // Ожидаемый вывод: "Работник"
//    System.out.println(role);
//}
//Класс Objects: методы equals, hashCode, hash
// zadacha 1
//public static void main(String[] args) {
//    // Создаем книгу с конкретными названием и автором
//    Book book = new Book("Clean Code", "Robert C. Martin");
//
//    // Выводим вычисленный хеш-код объекта Book
//    System.out.println(book.hashCode());
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем двух участников
//    Person anna = new Person("Анна");
//    Person boris = new Person("Борис");
//
//    // Создаем компаратор по имени
//    PersonByNameComparator comparator = new PersonByNameComparator();
//
//    // Сравниваем через Objects.compare, передавая компаратор
//    int result = Objects.compare(anna, boris, comparator);
//
//    // Выводим вердикт по результату сравнения
//    if (result < 0) {
//        System.out.println("Анна идет раньше Бориса");
//    } else if (result > 0) {
//        System.out.println("Борис идет раньше Анны");
//    } else {
//        System.out.println("Имена совпадают");
//    }
//}
//Интерфейс Comparable: реализация, compareTo
//zadacha 1
//public static void main(String[] args) {
//    // Создаем динамический список для хранения книг
//    List<Book> catalog = new ArrayList<>();
//
//    // Добавляем три книги; у двух — одинаковый год издания, но разные названия
//    catalog.add(new Book("Компиляторы", 1990));
//    catalog.add(new Book("Алгоритмы", 2000));
//    catalog.add(new Book("Структуры данных", 2000));
//
//    // Сортируем список согласно логике compareTo в классе Book
//    Collections.sort(catalog);
//
//    // Выводим названия книг по порядку после сортировки
//    for (Book book : catalog) {
//        System.out.println(book.getBookTitle());
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем два разных объекта City с одинаковыми значениями полей
//    City city1 = new City("Springfield", 100_000);
//    City city2 = new City("Springfield", 100_000);
//
//    // TreeSet автоматически сортирует элементы и не добавляет дубликаты
//    TreeSet<City> cities = new TreeSet<>();
//    cities.add(city1);
//    cities.add(city2);
//
//    // Ожидаем размер 1
//    System.out.println(cities.size());
//}
//Интерфейс Comparator: создание, использование
// zadacha 1
//public static void main(String[] args) {
//    // Создаем динамический список для хранения участников
//    List<Person> attendees = new ArrayList<>();
//
//    // Заполняем список объектами Person с разными возрастами
//    attendees.add(new Person("Иван", 21));
//    attendees.add(new Person("Анна", 19));
//    attendees.add(new Person("Сергей", 30));
//    attendees.add(new Person("Мария", 25));
//    attendees.add(new Person("Дмитрий", 22));
//
//    // Сортируем список по возрасту с помощью анонимного класса Comparator
//    attendees.sort(new Comparator<Person>() {
//        @Override
//        public int compare(Person first, Person second) {
//            return Integer.compare(first.personAge, second.personAge);
//        }
//    });
//
//    // Выводим результат
//    for (Person p : attendees) {
//        System.out.println(p.personName + ", " + p.personAge);
//    }
//}
// zadacha 2
//public static void main(String[] args) {
//    // Создаем динамический список участников
//    List<Person> participants = new ArrayList<>();
//
//    // Заполняем список объектами Person с именами разной длины
//    participants.add(new Person("Ева"));
//    participants.add(new Person("Анна"));
//    participants.add(new Person("Александр"));
//    participants.add(new Person("Илья"));
//    participants.add(new Person("Максим"));
//
//    // Сортируем по возрастанию длины personName с помощью лямбда-выражения
//    participants.sort((p1, p2) ->
//            Integer.compare(p1.getPersonName().length(), p2.getPersonName().length())
//    );
//
//    // Выводим только имена участников, по одному на строке
//    for (Person p : participants) {
//        System.out.println(p.getPersonName());
//    }
//}
//Поиск и сортировка элементов в коллекциях Java
// zadacha 1
//public static void main(String[] args) {
//    // Создаем список наблюдений животных
//    List<String> animalSightings = new ArrayList<>();
//
//    // Заполняем список в нужном порядке
//    animalSightings.add("кот");
//    animalSightings.add("пёс");
//    animalSightings.add("кот");
//    animalSightings.add("мышь");
//
//    // Находим индекс первого появления "кот"
//    int firstIndex = animalSightings.indexOf("кот");
//
//    // Находим индекс последнего появления "кот"
//    int lastIndex = animalSightings.lastIndexOf("кот");
//
//    // Выводим оба индекса через пробел
//    System.out.println(firstIndex + " " + lastIndex);
//}
// zadacha 2
public static void main(String[] args) {
    // Создаем список playerScores и заполняем его в указанном порядке
    List<Integer> playerScores = Arrays.asList(7, 2, 10, 4, 10, 1);

    // Используем Collections.max и Collections.min для поиска экстремумов
    int highestScore = Collections.max(playerScores);
    int lowestScore = Collections.min(playerScores);

    // Выводим максимум и минимум через пробел
    System.out.println(highestScore + " " + lowestScore);
}