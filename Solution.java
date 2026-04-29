//public class Solution {

//    public static <T> void printArray(T[] array) {
//        for (T element : array) {
//            System.out.println(element);
//        }
//    }
//
//    public static void main(String[] args) {
//        Integer[] nums = {1, 2, 3};
//        String[] words = {"Hello", "Java"};
//
//        printArray(nums);
//        printArray(words);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Небольшая демонстрация работы доски объявлений
//        DisplayBoard board = new DisplayBoard();
//        board.showTemporaryMessage();
//    }
//}
//
//class DisplayBoard {
//
//    // Метод, внутри которого объявляется локальный класс
//    public void showTemporaryMessage() {
//
//        // Локальный класс
//        class GreetingDisplay {
//            void displayMessage() {
//                System.out.println("Привет из локального класса!");
//            }
//        }
//
//        // Создаем объект локального класса и вызываем его метод
//        GreetingDisplay greeting = new GreetingDisplay();
//        greeting.displayMessage();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Демонстрация работы SecretKeeper
//        SecretKeeper keeper = new SecretKeeper();
//        keeper.revealSecret();
//    }
//}
//

//import java.util.ArrayList;
//import java.util.List;
//
////// Класс-хранитель секрета
////class SecretKeeper {
////    // Приватное поле с секретом
////    private String hiddenSecret = "Java — круто!";
////
////    // Метод, внутри которого объявляется локальный класс
////    public void revealSecret() {
////
////        // Локальный класс
////        class TruthRevealer {
////            void printSecret() {
////                System.out.println(hiddenSecret);
////            }
////        }
////
////        // Создаём объект локального класса и раскрываем секрет
////        TruthRevealer revealer = new TruthRevealer();
////        revealer.printSecret();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Демонстрация работы специализированного калькулятора
////        SpecialCalculator calculator = new SpecialCalculator();
////        calculator.calculateAndDisplaySum(7, 13); // Ожидаемый вывод: 20
////    }
////}
////
////class SpecialCalculator {
////
////    public void calculateAndDisplaySum(int numA, int numB) {
////
////        // Локальный класс
////        class SumResultPrinter {
////            void printResult() {
////                System.out.println(numA + numB);
////            }
////        }
////
////        // Создаём объект и выводим результат
////        SumResultPrinter printer = new SumResultPrinter();
////        printer.printResult();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаём универсальную коробку без знания типа содержимого
////        StorageBox box = new StorageBox();
////
////        // Кладём внутрь строку
////        box.put("Привет из прошлого!");
////
////        // Извлекаем содержимое (тип Object) и выводим на экран
////        Object content = box.retrieve();
////        System.out.println(content);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаём коробку, которая может хранить только целые числа (Integer)
////        SmartBox<Integer> intBox = new SmartBox<>();
////
////        // Помещаем число 42 (автобоксинг int -> Integer)
////        intBox.store(42);
////
////        // Извлекаем содержимое и выводим на экран
////        Integer value = intBox.getContents();
////        System.out.println(value);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем объект DataPair для строк и передаем "Hello" и "World"
////        DataPair<String> pair = new DataPair<>("Hello", "World");
////
////        // Выводим оба значения через пробел
////        System.out.println(pair.getFirst() + " " + pair.getSecond());
////    }
////}
////public class Solution {
////
////    // Публичный статический (вложенный) класс с утилитарным методом
////    public static class DevUtils {
////
////        // Универсальный метод с дженериком: принимает параметр любого типа T
////        public static <T> void printTwice(T value) {
////            System.out.println(value);
////            System.out.println(value);
////        }
////    }
////
////    public static void main(String[] args) {
////        // Демонстрация универсальности: строка и число
////        DevUtils.printTwice("Java");
////        DevUtils.printTwice(100);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем кота и задаем ему имя через поле petName
////        Cat cat = new Cat();
////        cat.petName = "Барсик";
////
////        // Вызываем действия кота в требуемом порядке
////        cat.eat();
////        cat.meow();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем объект собаки
////        Dog dog = new Dog();
////
////        // Присваиваем имя питомцу
////        dog.petName = "Шарик";
////
////        // Демонстрируем наследуемое поведение сна
////        dog.sleep();
////
////        // Демонстрируем уникальное поведение собаки — лай
////        dog.bark();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем автомобиль, который наследует поведение от Vehicle
////        Car car = new Car();
////
////        // Указываем модель автомобиля
////        car.vehicleModel = "Lada";
////
////        // Запускаем автомобиль
////        car.start();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем объекты яблока и банана
////        Apple apple = new Apple();
////        Banana banana = new Banana();
////
////        // Задаем цвета для каждого фрукта (поле унаследовано от Fruit)
////        apple.fruitColor = "красный";
////        banana.fruitColor = "жёлтый";
////
////        // Выводим цвет каждого фрукта
////        apple.printColor();
////        banana.printColor();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Circle circle = new Circle();
////        circle.draw();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Dog dog = new Dog();
////        dog.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Parent person = new Child();
////        person.greet();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        AppleBasket appleBasket = new AppleBasket();
////
////        Fruit harvestedItem = appleBasket.getFruit();
////
////        if (harvestedItem instanceof Apple) {
////            System.out.println("Apple created");
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Dog dog = new Dog();
////        dog.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Car car = new Car("BMW", 2023);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Cat cat = new Cat();
////        cat.printNames();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Student anna = new Student("Анна", 3);
////    }
////}
////
//
//
////public class Solution {
////    public static void main(String[] args) {
////        Car car = new Car();
////        car.move();
////        car.beep();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        SchoolStudent schoolStudent = new SchoolStudent();
////        schoolStudent.introduce();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Cat cat = new Cat();
////        cat.animalName = "Мурка";
////
////        cat.eat();
////        cat.feedMilk();
////        cat.purr();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Parent parent = new Parent();
////        parent.printSecret();
////
////        new Child().demo();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Student elena = new Student("Елена");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal mysteriousCreature = new Cat();
////        mysteriousCreature.sleep();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal pet = new Dog();
////        pet.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal[] pen = { new Cat(), new Cow() };
////
////        for (Animal animal : pen) {
////            animal.makeSound();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Employee employee = new Developer();
////        employee.work();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Vehicle[] parade = {
////                new Car(),
////                new Bicycle(),
////                new Scooter()
////        };
////
////        for (Vehicle v : parade) {
////            v.move();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        MessagePrinter printer = new MessagePrinter();
////
////        printer.printMessage("Привет, мир!");
////        printer.printMessage(10, 20);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Multiplier multiplier = new Multiplier();
////
////        int intResult = multiplier.multiply(5, 4);
////        double doubleResult = multiplier.multiply(2.5, 3.0);
////
////        System.out.println(intResult);
////        System.out.println(doubleResult);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Greetings robot = new Greetings();
////
////        robot.sayHello("Алекс");
////        robot.sayHello("Джон", "Доу");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Rectangle square = new Rectangle(5);
////        Rectangle rectangle = new Rectangle(10, 7);
////
////        System.out.println(square.width + " " + square.height);
////        System.out.println(rectangle.width + " " + rectangle.height);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Dog dog = new Dog();
////        dog.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        ColorPrinter printer = new ColorPrinter();
////
////        printer.print(5);
////        printer.print("Hello");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Shape shape = new Circle();
////        shape.draw();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Cat cat = new Cat();
////        cat.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal dog = new Dog();
////        Animal cat = new Cat();
////
////        dog.makeSound();
////        cat.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Employee[] team = {
////                new Manager(),
////                new Developer()
////        };
////
////        for (Employee employee : team) {
////            employee.work();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Employee[] team = {
////                new Manager(),
////                new Developer(),
////                new Tester()
////        };
////
////        for (Employee e : team) {
////            e.work();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Employee[] staff = new Employee[5];
////
////        staff[0] = new Employee();
////        staff[1] = new Manager();
////        staff[2] = new Developer();
////        staff[3] = new Designer();
////
////        printWorkForAll(staff);
////
////        // добавили нового сотрудника без изменения логики
////        staff[4] = new Intern();
////
////        printWorkForAll(staff);
////    }
////
////    private static void printWorkForAll(Employee[] staff) {
////        for (Employee e : staff) {
////            if (e != null) {
////                e.work();
////            }
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Shape shape = new Shape(); // ❌ нельзя (абстрактный класс)
////
////        Shape shape = new Circle(); // ✅ можно через наследника
////        shape.draw();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal pet = new Dog();
////        pet.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Employee[] team = new Employee[2];
////
////        team[0] = new Manager();
////        team[1] = new Developer();
////
////        for (Employee employee : team) {
////            employee.work();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal[] animals = {
////                new Cat("Мурка"),
////                new Cow("Буренка")
////        };
////
////        for (Animal animal : animals) {
////            animal.makeSound();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal animal = new Dog();
////        animal.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal dog = new Dog();
////        dog.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        List<Vehicle> vehicles = new ArrayList<>();
////
////        vehicles.add(new Car());
////        vehicles.add(new Bicycle());
////
////        for (Vehicle vehicle : vehicles) {
////            vehicle.move();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        PaypalPayment payment = new PaypalPayment();
////
////        payment.printInfo();
////        payment.process();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Animal dog = new Dog();
////        dog.makeSound();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Phone phone = new Phone();
////
////        phone.turnOn();
////        phone.turnOff();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Circle circle = new Circle("Круг", 2.0);
////
////        System.out.println(circle.name);
////        System.out.println(circle.area());
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Employee[] staff = new Employee[2];
////
////        staff[0] = new Manager("Анна", 100000);
////        staff[1] = new Developer("Иван", 500, 160);
////
////        for (Employee e : staff) {
////            System.out.println("Имя: " + e.getName() +
////                    ", зарплата: " + e.getSalary());
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Полиморфизм: ссылка типа Vehicle на объект Car
////        Vehicle car = new Car();
////
////        // Вызов метода
////        car.move(); // "Машина едет"
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем объекты фигур
////        Figure square = new Square(4);
////        Figure circle = new Circle(3);
////
////        // Выводим площади
////        System.out.println(square.area());
////        System.out.println(circle.area());
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаём менеджера
////        Manager manager = new Manager("Ivan", 50000);
////
////        // Выводим имя и зарплату
////        System.out.println(manager.getName());
////        System.out.println(manager.getSalary());
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Массив базового типа
////        Payment[] payments = new Payment[] {
////                new CashPayment(),
////                new OnlinePayment()
////        };
////
////        // Полиморфизм в действии
////        for (Payment payment : payments) {
////            payment.process();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаём круг радиуса 2.0
////        Circle circle = new Circle(2.0);
////
////        // Выводим площадь
////        System.out.println(circle.area()); // 12.56
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем сообщения
////        Message email = new EmailMessage("Привет!");
////        Message sms = new SmsMessage("Привет!");
////
////        // Отправляем
////        email.send();
////        sms.send();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Динамический список
////        List<Vehicle> vehicles = new ArrayList<>();
////
////        vehicles.add(new Car("Lada"));
////        vehicles.add(new Bicycle("Stels"));
////
////        for (Vehicle v : vehicles) {
////            v.move();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Order[] orders = {
////                new OnlineOrder(100.0),
////                new OfflineOrder(50.0),
////                new OnlineOrder(299.99),
////                new OfflineOrder(75.5)
////        };
////
////        for (Order order : orders) {
////            order.process();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Task task = new SimpleTask("Купить кофе");
////        task.complete();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        TaskRepository repository = new InMemoryTaskRepository();
////        TaskService service = new TaskService(repository);
////
////        // ВАЖНО: используем конкретный класс, а не абстрактный Task
////        Task task = new SimpleTask("Написать демо для TaskService");
////
////        service.addTask(task);
////
////        System.out.println("До выполнения:  " + task);
////
////        service.completeTask("Написать демо для TaskService");
////
////        System.out.println("После выполнения: " + task);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        TaskRepository repository = new InMemoryTaskRepository();
////        TaskService service = new TaskService(repository);
////        UserInterface ui = new UserInterface(service);
////
////        ui.addAndCompleteTask("Выучить внедрение зависимостей через конструктор");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        TaskRepository repository = new InMemoryTaskRepository();
////
////        // Добавляем задачи разных типов
////        repository.add(new WorkTask("Подготовить отчёт", "пятница 18:00"));
////        repository.add(new HomeTask("Помыть посуду", "кухня"));
////
////        TaskService service = new TaskService(repository);
////
////        // Вывод информации
////        service.printAllTasksInfo();
////
////        System.out.println();
////
////        // Выполнение задач
////        service.completeAllTasks();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Полиморфизм: используем интерфейс как тип
////        Greetable someone = new Person();
////        someone.greet(); // Ожидаемый вывод: Hello!
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Универсальный инструмент для рисования
////        Drawable tool = new Circle();
////
////        // Полиморфный вызов
////        tool.draw(); // Ожидаемый вывод: Drawing a circle
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Calculator calculator = new Calculator();
////        calculator.printPi(); // Ожидаемый вывод: 3.14159
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // "Зоопарк" — массив объектов, реализующих Soundable
////        Soundable[] zoo = new Soundable[2];
////
////        zoo[0] = new Dog();
////        zoo[1] = new Cat();
////
////        // Полиморфизм: у каждого вызовется своя реализация
////        for (Soundable animal : zoo) {
////            animal.makeSound();
////        }
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Полиморфизм: используем интерфейс как тип
////        Movable car = new Car();
////
////        // Вызов метода через интерфейс
////        car.move(); // Ожидаемый вывод: Машина едет
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Student student = new Student("Иван Петров");
////        student.printInfo(); // Имя: Иван Петров, ID: 42
////    }
////}
////
////    public class Solution {
////        public static void main(String[] args) {
////            MultiFunctionDevice device = new MultiFunctionDevice();
////
////            device.print();
////            device.scan();
////        }
////    }
////public class Solution {
////    public static void main(String[] args) {
////        SmartPhone phone = new SmartPhone();
////
////        phone.turnOn();
////        phone.work();
////        phone.charge();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Sketch sketch = new Sketch();
////
////        sketch.draw();
////        sketch.erase();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем пользователя
////        User user = new User("Алиса");
////
////        // Получаем имя
////        System.out.println(user.getName());
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем объект и вызываем метод
////        MultiAction action = new MultiAction();
////        action.doAction();
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем объект и вызываем метод
////        MultiAction action = new MultiAction();
////        action.doAction();
////    }
////}
////public class Solution {
////
////    // Универсальный метод тестирования
////    public static void testDevice(Player p, Recorder r) {
////        p.play();
////        r.record();
////    }
////
////    public static void main(String[] args) {
////        // Создаём одно устройство
////        MediaDevice device = new MediaDevice();
////
////        // Один объект используется сразу как Player и как Recorder
////        testDevice(device, device);
////    }
////}
////@FunctionalInterface
////interface MessagePrinter {
////    void print(String message);
////}
////
////public class Solution {
////    public static void main(String[] args) {
////        // Лямбда-выражение вместо класса
////        MessagePrinter printer = message -> System.out.println(message);
////
////        // Проверка работы
////        printer.print("Привет, Java!");
////    }
////}
////@FunctionalInterface
////interface NumberChecker {
////    boolean check(int n);
////}
////
////public class Solution {
////    public static void main(String[] args) {
////        // Лямбда: проверяет, больше ли число 100
////        NumberChecker checker = n -> n > 100;
////
////        // Проверка значений
////        System.out.println(checker.check(50));   // false
////        System.out.println(checker.check(150));  // true
////    }
////}
////import java.util.function.Predicate;
////
////public class Solution {
////    public static void main(String[] args) {
////        // Предикат проверяет, что длина строки больше 5 символов
////        Predicate<String> isLong = s -> s.length() > 5;
////
////        // Демонстрация работы на двух примерах
////        System.out.println(isLong.test("Java"));                  // false
////        System.out.println(isLong.test("FunctionalInterface"));   // true
////    }
////}
////@FunctionalInterface
////interface StringTransformer {
////    String transform(String s);
////
////    // default-метод, который использует функциональный метод transform
////    default void printTransformed(String s) {
////        System.out.println(transform(s));
////    }
////}
////
////public class Solution {
////    public static void main(String[] args) {
////        // Лямбда-реализация: преобразует строку к нижнему регистру
////        StringTransformer transformer = s -> s.toLowerCase();
////
////        // Вызываем default-метод для строки "JAVA ROCKS"
////        transformer.printTransformed("JAVA ROCKS");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Демонстрация гибкости: две реализации одного интерфейса
////        Logger consoleLogger = new ConsoleLogger();
////        Logger fileLogger = new FileLogger();
////
////        String testMessage = "Тестовое сообщение";
////
////        // Один и тот же вызов — разное поведение
////        consoleLogger.log(testMessage);
////        fileLogger.log(testMessage);
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Внедряем реализацию EmailSender в Notification
////        MessageSender emailSender = new EmailSender();
////        Notification notification = new Notification(emailSender);
////
////        // Тестируем отправку уведомления
////        notification.notifyUser("Привет!");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        Greeter greeter = new Greeter();
////
////        // Сначала используем дружелюбную стратегию
////        greeter.setStrategy(new FriendlyGreeting());
////        greeter.greet("Вася");
////
////        // Затем переключаемся на формальную стратегию
////        greeter.setStrategy(new FormalGreeting());
////        greeter.greet("Вася");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        // Создаем издателя
////        NewsPublisher publisher = new NewsPublisher();
////
////        // Создаем подписчиков
////        Person andrey = new Person("Андрей");
////        Person boris = new Person("Борис");
////
////        // Подписываем их
////        publisher.addSubscriber(andrey);
////        publisher.addSubscriber(boris);
////
////        // Публикуем новость
////        publisher.notifySubscribers("Обновление курса Java!");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////        System.out.println("Use Main class to run the game.");
////    }
////}
////public class Solution {
////    public static void main(String[] args) {
////
////        // Лямбда без параметров
////        Runnable action = () -> System.out.println("Лямбда без параметров!");
////
////        // Вызов действия
////        action.run();
////    }
////}
//import java.util.function.Consumer;
//
////public class Solution {
////    public static void main(String[] args) {
////
////        // Обработчик текста: переводит строку в верхний регистр и печатает
////        Consumer<String> textProcessor = text -> System.out.println(text.toUpperCase());
////
////        // Проверка
////        textProcessor.accept("java"); // вывод: JAVA
////    }
////}
//import java.util.*;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        // Исходный список результатов спортсменов
//        List<Integer> scores = Arrays.asList(-5, 3, -2, 7, 0);
//
//        // Компаратор: сравниваем по абсолютному значению
//        Comparator<Integer> absComparator = (a, b) -> Integer.compare(Math.abs(a), Math.abs(b));
//
//        // Сортируем список
//        scores.sort(absComparator);
//
//        // Вывод результата
//        System.out.println(scores); // ожидаем: [0, -2, 3, -5, 7]
//    }
//}
//import java.util.function.Function;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        // Фиксированный префикс
//        String prefix = "Результат: ";
//
//        // Лямбда-функция: удваивает число и добавляет префикс
//        Function<Integer, String> formatter =
//                n -> prefix + (n * 2);
//
//        // Проверка
//        System.out.println(formatter.apply(7)); // Результат: 14
//    }
//}
//import java.util.function.Function;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        Function<Integer, String> converter = Integer::toHexString;
//
//        String result = converter.apply(255);
//
//        System.out.println(result);
//    }
//}
//import java.util.function.Consumer;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        // Ссылка на нестатический метод объекта System.out
//        Consumer<String> sender = System.out::println;
//
//        // Используем "отправителя"
//        sender.accept("Hello, method reference!");
//    }
//}
//import java.util.*;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        List<String> fruits = Arrays.asList("яблоко", "банан", "груша");
//
//        // Сортировка с использованием ссылки на метод сравнения строк
//        fruits.sort(String::compareTo);
//
//        // Вывод результата
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//    }
//}
//import java.util.function.Function;
//
//class Animal {
//    String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//
//        // Фабрика: создаёт Animal по имени
//        Function<String, Animal> factory = Animal::new;
//
//        // Создаём питомца
//        Animal pet = factory.apply("Барсик");
//
//        // Выводим имя
//        System.out.println(pet.name);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//
//        MyCounter device = new MyCounter();
//
//        device.increment(); // Counter incremented
//        device.reset();     // Counter reset
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//
//        Dog dog = new Dog();
//
//        dog.voice(); // Woof
//        dog.sleep(); // Dog is sleeping
//    }
//
//public class Solution {
//    public static void main(String[] args) {
//
//        ConsolePrinter printer = new ConsolePrinter();
//
//        printer.printTwice("Java");
//    }
public class Solution {
    public static void main(String[] args) {

        C c = new C();
        c.show();
    }
}
