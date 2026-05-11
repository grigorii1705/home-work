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
//// Класс-хранитель секрета
//class SecretKeeper {
//    // Приватное поле с секретом
//    private String hiddenSecret = "Java — круто!";
//
//    // Метод, внутри которого объявляется локальный класс
//    public void revealSecret() {
//
//        // Локальный класс
//        class TruthRevealer {
//            void printSecret() {
//                System.out.println(hiddenSecret);
//            }
//        }
//
//        // Создаём объект локального класса и раскрываем секрет
//        TruthRevealer revealer = new TruthRevealer();
//        revealer.printSecret();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Демонстрация работы специализированного калькулятора
//        SpecialCalculator calculator = new SpecialCalculator();
//        calculator.calculateAndDisplaySum(7, 13); // Ожидаемый вывод: 20
//    }
//}
//
//class SpecialCalculator {
//
//    public void calculateAndDisplaySum(int numA, int numB) {
//
//        // Локальный класс
//        class SumResultPrinter {
//            void printResult() {
//                System.out.println(numA + numB);
//            }
//        }
//
//        // Создаём объект и выводим результат
//        SumResultPrinter printer = new SumResultPrinter();
//        printer.printResult();
//    }
//}
//public class Solution {
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
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем объект DataPair для строк и передаем "Hello" и "World"
//        DataPair<String> pair = new DataPair<>("Hello", "World");
//
//        // Выводим оба значения через пробел
//        System.out.println(pair.getFirst() + " " + pair.getSecond());
//    }
//}
//public class Solution {
//
//    // Публичный статический (вложенный) класс с утилитарным методом
//    public static class DevUtils {
//
//        // Универсальный метод с дженериком: принимает параметр любого типа T
//        public static <T> void printTwice(T value) {
//            System.out.println(value);
//            System.out.println(value);
//        }
//    }
//
//    public static void main(String[] args) {
//        // Демонстрация универсальности: строка и число
//        DevUtils.printTwice("Java");
//        DevUtils.printTwice(100);
//    }
//}
//public class Solution {
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
//public class Solution {
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
//public class Solution {
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
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.draw();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Parent person = new Child();
//        person.greet();
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Car car = new Car("BMW", 2023);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.printNames();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Student anna = new Student("Анна", 3);
//    }
//}
//


//public class Solution {
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.move();
//        car.beep();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        SchoolStudent schoolStudent = new SchoolStudent();
//        schoolStudent.introduce();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.animalName = "Мурка";
//
//        cat.eat();
//        cat.feedMilk();
//        cat.purr();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Parent parent = new Parent();
//        parent.printSecret();
//
//        new Child().demo();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Student elena = new Student("Елена");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Animal mysteriousCreature = new Cat();
//        mysteriousCreature.sleep();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Animal pet = new Dog();
//        pet.makeSound();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Animal[] pen = { new Cat(), new Cow() };
//
//        for (Animal animal : pen) {
//            animal.makeSound();
//        }
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Employee employee = new Developer();
//        employee.work();
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        MessagePrinter printer = new MessagePrinter();
//
//        printer.printMessage("Привет, мир!");
//        printer.printMessage(10, 20);
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        Greetings robot = new Greetings();
//
//        robot.sayHello("Алекс");
//        robot.sayHello("Джон", "Доу");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Rectangle square = new Rectangle(5);
//        Rectangle rectangle = new Rectangle(10, 7);
//
//        System.out.println(square.width + " " + square.height);
//        System.out.println(rectangle.width + " " + rectangle.height);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        ColorPrinter printer = new ColorPrinter();
//
//        printer.print(5);
//        printer.print("Hello");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Shape shape = new Circle();
//        shape.draw();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.makeSound();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        dog.makeSound();
//        cat.makeSound();
//    }
//}
//public class Solution {
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
//public class Solution {
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
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        // Shape shape = new Shape(); // ❌ нельзя (абстрактный класс)
//
//        Shape shape = new Circle(); // ✅ можно через наследника
//        shape.draw();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Animal pet = new Dog();
//        pet.makeSound();
//    }
//}
//public class Solution {
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
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.makeSound();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.makeSound();
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        PaypalPayment payment = new PaypalPayment();
//
//        payment.printInfo();
//        payment.process();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.makeSound();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Phone phone = new Phone();
//
//        phone.turnOn();
//        phone.turnOff();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Circle circle = new Circle("Круг", 2.0);
//
//        System.out.println(circle.name);
//        System.out.println(circle.area());
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        // Полиморфизм: ссылка типа Vehicle на объект Car
//        Vehicle car = new Car();
//
//        // Вызов метода
//        car.move(); // "Машина едет"
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём менеджера
//        Manager manager = new Manager("Ivan", 50000);
//
//        // Выводим имя и зарплату
//        System.out.println(manager.getName());
//        System.out.println(manager.getSalary());
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём круг радиуса 2.0
//        Circle circle = new Circle(2.0);
//
//        // Выводим площадь
//        System.out.println(circle.area()); // 12.56
//    }
//}
//public class Solution {
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
//public class Solution {
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
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        Task task = new SimpleTask("Купить кофе");
//        task.complete();
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        TaskRepository repository = new InMemoryTaskRepository();
//        TaskService service = new TaskService(repository);
//        UserInterface ui = new UserInterface(service);
//
//        ui.addAndCompleteTask("Выучить внедрение зависимостей через конструктор");
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        // Полиморфизм: используем интерфейс как тип
//        Greetable someone = new Person();
//        someone.greet(); // Ожидаемый вывод: Hello!
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Универсальный инструмент для рисования
//        Drawable tool = new Circle();
//
//        // Полиморфный вызов
//        tool.draw(); // Ожидаемый вывод: Drawing a circle
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.printPi(); // Ожидаемый вывод: 3.14159
//    }
//}
//public class Solution {
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
//public class Solution {
//    public static void main(String[] args) {
//        // Полиморфизм: используем интерфейс как тип
//        Movable car = new Car();
//
//        // Вызов метода через интерфейс
//        car.move(); // Ожидаемый вывод: Машина едет
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Student student = new Student("Иван Петров");
//        student.printInfo(); // Имя: Иван Петров, ID: 42
//    }
//}
//
//    public class Solution {
//        public static void main(String[] args) {
//            MultiFunctionDevice device = new MultiFunctionDevice();
//
//            device.print();
//            device.scan();
//        }
//    }
//public class Solution {
//    public static void main(String[] args) {
//        SmartPhone phone = new SmartPhone();
//
//        phone.turnOn();
//        phone.work();
//        phone.charge();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Sketch sketch = new Sketch();
//
//        sketch.draw();
//        sketch.erase();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем пользователя
//        User user = new User("Алиса");
//
//        // Получаем имя
//        System.out.println(user.getName());
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем объект и вызываем метод
//        MultiAction action = new MultiAction();
//        action.doAction();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем объект и вызываем метод
//        MultiAction action = new MultiAction();
//        action.doAction();
//    }
//}
//public class Solution {
//
//    // Универсальный метод тестирования
//    public static void testDevice(Player p, Recorder r) {
//        p.play();
//        r.record();
//    }
//
//    public static void main(String[] args) {
//        // Создаём одно устройство
//        MediaDevice device = new MediaDevice();
//
//        // Один объект используется сразу как Player и как Recorder
//        testDevice(device, device);
//    }
//}
//@FunctionalInterface
//interface MessagePrinter {
//    void print(String message);
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        // Лямбда-выражение вместо класса
//        MessagePrinter printer = message -> System.out.println(message);
//
//        // Проверка работы
//        printer.print("Привет, Java!");
//    }
//}
//@FunctionalInterface
//interface NumberChecker {
//    boolean check(int n);
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        // Лямбда: проверяет, больше ли число 100
//        NumberChecker checker = n -> n > 100;
//
//        // Проверка значений
//        System.out.println(checker.check(50));   // false
//        System.out.println(checker.check(150));  // true
//    }
//}
//import java.util.function.Predicate;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Предикат проверяет, что длина строки больше 5 символов
//        Predicate<String> isLong = s -> s.length() > 5;
//
//        // Демонстрация работы на двух примерах
//        System.out.println(isLong.test("Java"));                  // false
//        System.out.println(isLong.test("FunctionalInterface"));   // true
//    }
//}
//@FunctionalInterface
//interface StringTransformer {
//    String transform(String s);
//
//    // default-метод, который использует функциональный метод transform
//    default void printTransformed(String s) {
//        System.out.println(transform(s));
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        // Лямбда-реализация: преобразует строку к нижнему регистру
//        StringTransformer transformer = s -> s.toLowerCase();
//
//        // Вызываем default-метод для строки "JAVA ROCKS"
//        transformer.printTransformed("JAVA ROCKS");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Демонстрация гибкости: две реализации одного интерфейса
//        Logger consoleLogger = new ConsoleLogger();
//        Logger fileLogger = new FileLogger();
//
//        String testMessage = "Тестовое сообщение";
//
//        // Один и тот же вызов — разное поведение
//        consoleLogger.log(testMessage);
//        fileLogger.log(testMessage);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Внедряем реализацию EmailSender в Notification
//        MessageSender emailSender = new EmailSender();
//        Notification notification = new Notification(emailSender);
//
//        // Тестируем отправку уведомления
//        notification.notifyUser("Привет!");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Greeter greeter = new Greeter();
//
//        // Сначала используем дружелюбную стратегию
//        greeter.setStrategy(new FriendlyGreeting());
//        greeter.greet("Вася");
//
//        // Затем переключаемся на формальную стратегию
//        greeter.setStrategy(new FormalGreeting());
//        greeter.greet("Вася");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем издателя
//        NewsPublisher publisher = new NewsPublisher();
//
//        // Создаем подписчиков
//        Person andrey = new Person("Андрей");
//        Person boris = new Person("Борис");
//
//        // Подписываем их
//        publisher.addSubscriber(andrey);
//        publisher.addSubscriber(boris);
//
//        // Публикуем новость
//        publisher.notifySubscribers("Обновление курса Java!");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        System.out.println("Use Main class to run the game.");
//    }

//public class Solution {
//    public static void main(String[] args) {
//
//        // Лямбда без параметров
//        Runnable action = () -> System.out.println("Лямбда без параметров!");
//
//        // Вызов действия
//        action.run();
//    }
//}
//import java.util.function.Consumer;

//public class Solution {
//    public static void main(String[] args) {
//
//        // Обработчик текста: переводит строку в верхний регистр и печатает
//        Consumer<String> textProcessor = text -> System.out.println(text.toUpperCase());
//
//        // Проверка
//        textProcessor.accept("java"); // вывод: JAVA
//    }
//}
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
//public class Solution {
//    public static void main(String[] args) {
//
//        C c = new C();
//        c.show();
//    }
//}
//public class Solution {
//
//    // Осмысленные имена полей
//    int value = 10;
//    String message = "Привет";
//
//    // Переименованный метод — понятно, что он делает
//    void printMessage() {
//        System.out.println(message + " " + value);
//    }
//
//    public static void main(String[] args) {
//        // Демонстрация
//        Solution app = new Solution();
//        app.printMessage();
//    }
//}
//public class Solution {
//
//    // Константа налоговой ставки
//    static final double INCOME_TAX_RATE = 0.13;
//
//    public static void main(String[] args) {
//
//        // Зарплата сотрудника
//        double employeeSalary = 5000.0;
//
//        // Расчёт налога с использованием константы
//        double calculatedTax = employeeSalary * INCOME_TAX_RATE;
//
//        // Вывод результата
//        System.out.println(calculatedTax);
//    }
//}
//import java.io.IOException;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        // Создаем две "проблемы"
//        IOException networkProblem = new IOException();
//        NullPointerException missingDataError = new NullPointerException();
//
//        // Получаем родительские классы
//        Class<?> parent1 = networkProblem.getClass().getSuperclass();
//        Class<?> parent2 = missingDataError.getClass().getSuperclass();
//
//        // Выводим имена родительских классов
//        System.out.println(parent1.getName());
//        System.out.println(parent2.getName());
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//
//        // Общее исключение (обрабатываемое)
//        Exception generalSystemIssue = new Exception();
//
//        // Фатальная ошибка (уровень JVM)
//        Error catastrophicFailure = new Error();
//
//        // Проверяем, являются ли они наследниками Throwable
//        boolean isGeneralThrowable =
//                Throwable.class.isAssignableFrom(generalSystemIssue.getClass());
//
//        boolean isCatastrophicThrowable =
//                Throwable.class.isAssignableFrom(catastrophicFailure.getClass());
//
//        // Выводим результат
//        System.out.println(isGeneralThrowable);
//        System.out.println(isCatastrophicThrowable);
//    }
//}
//import java.io.FileNotFoundException;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        // "Неожиданный сбой": RuntimeException — непроверяемое (unchecked) исключение
//        RuntimeException unexpectedGlitch = new RuntimeException();
//
//        // "Потерянный файл конфигурации": FileNotFoundException — проверяемое (checked) исключение
//        FileNotFoundException missingConfigurationFile = new FileNotFoundException();
//
//        // Выводим классификацию
//        System.out.println("RuntimeException — unchecked");
//        System.out.println("FileNotFoundException — checked");
//    }
//}
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class Solution {
//    public static void main(String[] args) {
//        try {
//            // Имитация поиска отчёта
//            throw new FileNotFoundException("Отчёт не найден!");
//
//        } catch (FileNotFoundException e) {
//            // Самый специфичный план
//            System.out.println("План 1: Отчёт не найден");
//
//        } catch (IOException e) {
//            // Более общий план
//            System.out.println("План 2: Проблемы с доступом к данным");
//
//        } catch (Exception e) {
//            // Самый общий план
//            System.out.println("План 3: Непредвиденная ситуация");
//        }
//    }
//}
// Собственное исключение
//class ScoreTooLowException extends Exception {
//    public ScoreTooLowException(String message) {
//        super(message);
//    }
//}
//
//public class Solution {
//
//    // Метод-«страж»
//    public static void checkPlayerScore(int score) throws ScoreTooLowException {
//        if (score < 10) {
//            throw new ScoreTooLowException("Счёт игрока слишком низкий!");
//        }
//    }
//
//    public static void main(String[] args) {
//
//        try {
//            // Пробуем проверить счёт
//            checkPlayerScore(5);
//
//            // Если всё ок
//            System.out.println("Счёт принят");
//
//        } catch (ScoreTooLowException e) {
//            // Обрабатываем нашу ошибку
//            System.out.println(e.getMessage());
//        }
//    }
//}
// Собственное проверяемое исключение
//class WeakPasswordException extends Exception {
//    public WeakPasswordException(String message) {
//        super(message);
//    }
//}
//
// "Страж паролей"
//class PasswordGuard {
//
//    public void enforcePasswordStrength(String password) throws WeakPasswordException {
//        if (password == null || password.length() < 6) {
//            throw new WeakPasswordException("Пароль слишком короткий!");
//        }
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//
//        PasswordGuard guard = new PasswordGuard();
//
//        try {
//            // Симуляция слабого пароля
//            guard.enforcePasswordStrength("123");
//
//        } catch (WeakPasswordException e) {
//            // Вывод предупреждения пользователю
//            System.out.println(e.getMessage());
//        }
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        int userAge = 14;
//        int requiredAge = 16;
//
//        try {
//            // Пытаемся пройти возрастной контроль
//            checkRideAge(userAge, requiredAge);
//            System.out.println("Добро пожаловать на аттракцион!");
//        } catch (InvalidAgeException e) {
//            // Показываем осмысленное сообщение
//            System.out.println("Отказ: " + e.getMessage());
//        }
//    }
//
//    // Метод проверки возраста
//    static void checkRideAge(int age, int minAge) throws InvalidAgeException {
//        if (age < minAge) {
//            throw new InvalidAgeException(
//                    "Вам должно быть не менее " + minAge +
//                            " лет для этого аттракциона (сейчас " + age + ")."
//            );
//        }
//    }
//}
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
//public class Solution {
//
//    // Метод добавления предметов
//    public static void tryAddItem(int value, int limit)
//            throws StorageCapacityExceededException {
//
//        if (value > limit) {
//            throw new StorageCapacityExceededException(
//                    "Превышена вместимость склада!",
//                    value,
//                    limit
//            );
//        }
//
//        System.out.println("Операция успешна!");
//    }
//
//    public static void main(String[] args) {
//        try {
//            tryAddItem(150, 100);
//
//        } catch (StorageCapacityExceededException e) {
//
//            System.out.println("Ошибка: " + e.getMessage());
//            System.out.println("Текущее значение: " + e.getCurrentItemCount());
//            System.out.println("Лимит: " + e.getMaximumCapacity());
//        }
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем "первопричину" — уже существующее исключение
//        Throwable rootCause = new NullPointerException("данные отсутствуют!");
//
//        // Создаем наше исключение и "прикрепляем" к нему первопричину
//        DataProcessingFailure failure =
//                new DataProcessingFailure("Ошибка генерации отчёта", rootCause);
//
//        // Выводим на экран первопричину через getCause()
//        System.out.println(failure.getCause());
//    }
//}
//import java.io.IOException;
//
//public class Solution {
//
//    // Этап 1: имитация сбоя при подготовке исходных данных
//    public static void prepareSourceData() throws IOException {
//        throw new IOException("Исходный файл не найден");
//    }
//
//    // Этап 2: загрузка/обработка сырых данных
//    public static void processRawData() throws DataLoadingError {
//        try {
//            prepareSourceData();
//        } catch (IOException e) {
//            // Переворачиваем в наше общее исключение, сохраняя первопричину
//            throw new DataLoadingError("Ошибка загрузки данных", e);
//        }
//    }
//
//    // Этап 3: генерация итогового отчёта
//    public static void generateFinalReport() throws DataLoadingError {
//        processRawData();
//    }
//
//    public static void main(String[] args) {
//        try {
//            generateFinalReport();
//        } catch (DataLoadingError e) {
//            // Сообщение верхнего уровня
//            System.out.println(e.getMessage());
//
//            // Первопричина
//            Throwable cause = e.getCause();
//            if (cause != null) {
//                System.out.println(cause.getMessage());
//            }
//        }
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        try {
//            // Симулируем "внешнюю ошибку" с причиной
//            throw new InputValidationException(
//                    "Внешняя ошибка обработки ввода",
//                    new IllegalArgumentException("Передан некорректный формат данных")
//            );
//
//        } catch (InputValidationException e) {
//            // 1) сообщение внешнего исключения
//            System.out.println(e.getMessage());
//
//            // 2) сообщение исключения-источника (корня)
//            System.out.println(e.getCause().getMessage());
//
//            // 3) имя класса исключения-источника
//            System.out.println(e.getCause().getClass().getName());
//        }
//    }
//}
//public class Solution {
//
//    public static void main(String[] args) {
//        try {
//            provokeLifeSupportCrisis();
//        } catch (ThirdSystemFailure e) {
//            e.printStackTrace();
//        }
//    }
//
//    // 1 уровень
//    public static void initiateSystemFailure() throws FirstSystemFailure {
//        throw new FirstSystemFailure("Проблема в ядре системы", null);
//    }
//
//    // 2 уровень
//    public static void triggerNavigationMalfunction() throws SecondSystemFailure {
//        try {
//            initiateSystemFailure();
//        } catch (FirstSystemFailure e) {
//            throw new SecondSystemFailure("Навигационная система отказала", e);
//        }
//    }
//
//    // 3 уровень
//    public static void provokeLifeSupportCrisis() throws ThirdSystemFailure {
//        try {
//            triggerNavigationMalfunction();
//        } catch (SecondSystemFailure e) {
//            throw new ThirdSystemFailure("Критический отказ системы жизнеобеспечения", e);
//        }
//    }
//}
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class Solution {
//    public static void main(String[] args) {
//        try {
//            // Пытаемся открыть файл и прочитать первую строку
//            BufferedReader reader = new BufferedReader(new FileReader("daily_transactions.txt"));
//            String line = reader.readLine();
//
//            // Пробуем преобразовать строку в число
//            int total = Integer.parseInt(line);
//
//            // Если всё успешно
//            System.out.println("Сумма транзакций: " + total);
//
//            reader.close();
//
//        } catch (FileNotFoundException e) {
//            // Файл не найден
//            System.out.println("Файл транзакций не найден!");
//
//        } catch (IOException e) {
//            // Ошибка чтения файла
//            System.out.println("Ошибка чтения данных из файла!");
//
//        } catch (NumberFormatException e) {
//            // Некорректный формат данных
//            System.out.println("В файле обнаружены некорректные финансовые данные!");
//        }
//    }
//}
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Solution {
//    public static void main(String[] args) {
//        try {
//            // Открываем файл и читаем первую строку
//            BufferedReader reader = new BufferedReader(new FileReader("game_config.txt"));
//            String line = reader.readLine();
//
//            // Пытаемся преобразовать строку в число (например, уровень сложности)
//            int difficulty = Integer.parseInt(line);
//
//            System.out.println("Уровень сложности: " + difficulty);
//
//            reader.close();
//
//        } catch (IOException | NumberFormatException e) {
//            // Один catch для нескольких типов ошибок
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//    }
//}
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        try {
//            // Пытаемся открыть файл — может возникнуть FileNotFoundException
//            FileInputStream fis = new FileInputStream("secret_document.txt");
//
//            // Читаем первый байт (простая проверка доступа)
//            int data = fis.read();
//
//            // Намеренно провоцируем общую IOException
//            if (data == -1) {
//                throw new IOException("Файл пуст или произошла ошибка чтения");
//            }
//
//            fis.close();
//
//        } catch (FileNotFoundException e) {
//            // Более специфичная ошибка
//            System.out.println("Секретный документ не найден!");
//
//        } catch (IOException e) {
//            // Более общая ошибка
//            System.out.println("Ошибка доступа к архиву!");
//        }
//    }
//}
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.StandardOpenOption;
//
//public class Solution {
//    public static void main(String[] args) {
//        System.out.println("Фоновая служба логирования запущена.");
//
//        try {
//            // Создаём временную директорию и используем её как "файл"
//            Path tempDir = Files.createTempDirectory("logs");
//
//            // Пытаемся записать в директорию как в файл → будет IOException
//            saveEvent("Важное событие", tempDir);
//
//            // До этой строки выполнение не дойдёт
//            System.out.println("Запись успешно выполнена.");
//
//        } catch (IOException e) {
//            // ВАЖНО: не игнорируем ошибку — выводим полный стек
//            e.printStackTrace();
//        }
//
//        System.out.println("Демонстрация завершена.");
//    }
//
//    // Бизнес-уровень
//    private static void saveEvent(String message, Path logFile) throws IOException {
//        writeLog(logFile, message);
//    }
//
//    // Низкоуровневая запись
//    private static void writeLog(Path logFile, String text) throws IOException {
//        Files.writeString(
//                logFile,
//                text + System.lineSeparator(),
//                StandardOpenOption.CREATE,
//                StandardOpenOption.APPEND
//        );
//    }
//}
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        try (BufferedReader reader = new BufferedReader(new FileReader("article_text.txt"))) {
//            // Читаем первую строку
//            String headline = reader.readLine();
//
//            // Выводим заголовок
//            System.out.println(headline);
//
//        } catch (IOException e) {
//            // Обработка любой ошибки чтения файла
//            System.out.println("Ошибка чтения статьи!");
//        }
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // try-with-resources гарантирует автоматический вызов close()
//        try (MagicArtifact artifact = new MagicArtifact()) {
//
//            System.out.println("Идёт работа с магическим артефактом");
//            // Здесь могла бы быть любая логика работы с артефактом
//
//        } // <-- здесь автоматически вызовется close()
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        try {
//            // Передаём заведомо некорректную строку
//            int value = parseMeasurementValue("123abc");
//
//            // До этой строки выполнение не дойдёт
//            System.out.println("Значение: " + value);
//
//        } catch (NumberFormatException e) {
//            // Понятное сообщение для пользователя
//            System.out.println("Ошибка преобразования числа: введены некорректные данные");
//        }
//    }
//
//    /**
//     * Преобразует строковое значение измерения в целое число.
//     *
//     * @param measurement строка с данными измерения
//     * @return целочисленное значение измерения
//     * @throws NumberFormatException если строка не является корректным числом
//     */
//    public static int parseMeasurementValue(String measurement) {
//        // Может выбросить NumberFormatException
//        return Integer.parseInt(measurement);
//    }
//}
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        try (
//                BufferedReader reader = new BufferedReader(new FileReader("ancient_manuscript.txt"));
//                BufferedWriter writer = new BufferedWriter(new FileWriter("digital_archive.txt"))
//        ) {
//            String line;
//
//            // Читаем построчно и сразу записываем
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.newLine(); // сохраняем перенос строки
//            }
//
//        } catch (IOException e) {
//            // Любая ошибка при работе с файлами
//            System.out.println("Ошибка копирования рукописи!");
//        }
//    }
//}
//import java.util.ArrayList;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем динамический список для хранения фруктов
//        ArrayList<String> fruits = new ArrayList<>();
//
//        // Добавляем фрукты в заданном порядке
//        fruits.add("Яблоко");
//        fruits.add("Банан");
//        fruits.add("Груша");
//
//        // Выводим весь список
//        System.out.println(fruits);
//    }
//}
//import java.util.HashMap;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем "картотеку" студентов
//        HashMap<String, Integer> students = new HashMap<>();
//
//        // Добавляем данные о студентах
//        students.put("Иван", 20);
//        students.put("Мария", 21);
//        students.put("Алексей", 19);
//
//        // Выводим полный список студентов и их возрастов
//        System.out.println(students);
//    }
//}
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Используем интерфейс List для хранения предметов
//        List<String> subjects = new ArrayList<>();
//
//        // Добавляем три основных предмета
//        subjects.add("Математика");
//        subjects.add("Физика");
//        subjects.add("Информатика");
//
//        // Вставляем "Английский" в начало списка
//        subjects.add(0, "Английский");
//
//        // Удаляем "Физика"
//        subjects.remove("Физика");
//
//        // Выводим итоговое расписание
//        for (String subject : subjects) {
//            System.out.println(subject);
//        }
//    }
//}
//import java.util.ArrayList;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем список фильмов
//        ArrayList<String> movies = new ArrayList<>();
//
//        // Добавляем фильмы
//        movies.add("Титаник");
//        movies.add("Матрица");
//        movies.add("Интерстеллар");
//
//        // По ошибке добавили "Матрица" снова
//        movies.add("Матрица");
//
//        // Ищем первое вхождение "Матрица"
//        int index = movies.indexOf("Матрица");
//        System.out.println("Первое вхождение 'Матрица': " + index);
//
//        // Проверяем наличие "Аватар"
//        boolean hasAvatar = movies.contains("Аватар");
//        System.out.println("Есть ли 'Аватар' в списке: " + hasAvatar);
//
//        // Очищаем список
//        movies.clear();
//
//        // Выводим список после очистки
//        System.out.println(movies);
//    }
//}
//import java.util.HashMap;
//import java.util.Map;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём Map: день недели -> номер
//        Map<String, Integer> daysOfWeek = new HashMap<>();
//
//        // Добавляем элементы
//        daysOfWeek.put("Monday", 1);
//        daysOfWeek.put("Tuesday", 2);
//        daysOfWeek.put("Wednesday", 3);
//
//        // Выводим все пары ключ-значение
//        for (Map.Entry<String, Integer> entry : daysOfWeek.entrySet()) {
//            System.out.println(
//                    "День: " + entry.getKey() +
//                            ", Номер: " + entry.getValue()
//            );
//        }
//    }
//}
//import java.util.Map;
//import java.util.TreeMap;
//
//public class Solution {
//    public static void main(String[] args) {
//        // TreeMap автоматически сортирует ключи по алфавиту
//        TreeMap<String, Integer> fruits = new TreeMap<>();
//
//        // Добавляем данные о фруктах
//        fruits.put("pear", 6);
//        fruits.put("apple", 2);
//        fruits.put("banana", 4);
//
//        // Выводим ассортимент в алфавитном порядке
//        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
//            System.out.println(
//                    "Фрукт: " + entry.getKey() +
//                            ", Количество: " + entry.getValue()
//            );
//        }
//    }
//}
//import java.util.TreeSet;
//
//public class Solution {
//    public static void main(String[] args) {
//        // TreeSet автоматически сортирует элементы и убирает дубликаты
//        TreeSet<String> participants = new TreeSet<>();
//
//        // Добавляем участников
//        participants.add("Борис");
//        participants.add("Алексей");
//        participants.add("Виктор");
//
//        // Выводим список участников
//        System.out.println(participants);
//    }
//}
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Исходный список с повторяющимися товарами
//        List<String> shoppingList = new ArrayList<>();
//
//        shoppingList.add("яблоко");
//        shoppingList.add("груша");
//        shoppingList.add("яблоко");
//        shoppingList.add("слива");
//        shoppingList.add("груша");
//
//        // Set автоматически удаляет дубликаты
//        Set<String> uniqueProducts = new HashSet<>(shoppingList);
//
//        // Выводим уникальные товары
//        System.out.println(uniqueProducts);
//    }
//}
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем каталог книг
//        List<Book> libraryCatalog = new ArrayList<>();
//
//        // Добавляем книги в каталог
//        libraryCatalog.add(new Book("1984", "Джордж Оруэлл"));
//        libraryCatalog.add(new Book("Мастер и Маргарита", "Михаил Булгаков"));
//
//        // Выводим информацию о каждой книге
//        for (Book book : libraryCatalog) {
//            System.out.println(
//                    "Название: " + book.getTitle() +
//                            ", Автор: " + book.getAuthor()
//            );
//        }
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем "универсальный сундук" для строк
//        UniversalChest<String> messageChest = new UniversalChest<>();
//        messageChest.put("Тайное послание: «Да пребудет с тобой Java!»");
//
//        // Создаем "универсальный сундук" для целых чисел
//        UniversalChest<Integer> numberChest = new UniversalChest<>();
//        numberChest.put(777);
//
//        // Извлекаем содержимое сундуков
//        String secretMessage = messageChest.take();
//        Integer magicNumber = numberChest.take();
//
//        // Выводим содержимое
//        System.out.println(secretMessage);
//        System.out.println(magicNumber);
//    }
//}
//import java.util.LinkedList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем палитру цветов
//        List<String> palette = new LinkedList<>();
//
//        // Добавляем цвета
//        palette.add("красный");
//        palette.add("зелёный");
//        palette.add("синий");
//
//        // Получаем второй элемент (индекс 1)
//        String selectedColor = palette.get(1);
//
//        // Выводим выбранный цвет
//        System.out.println(selectedColor);
//    }
//}
//iimport java.util.HashMap;
//import java.util.Map;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём словарь переводов: английское слово -> русский перевод
//        HashMap<String, String> dictionary = new HashMap<>();
//
//        // Заполняем словарь тремя парами
//        dictionary.put("dog", "собака");
//        dictionary.put("cat", "кошка");
//        dictionary.put("bird", "птица");
//
//        // Перебираем пары через for-each по entrySet()
//        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//            // Форматированный вывод в виде "ключ = значение"
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
//    }
//}
//import java.util.HashMap;
//import java.util.Map;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём словарь переводов: английское слово -> русский перевод
//        HashMap<String, String> dictionary = new HashMap<>();
//
//        // Заполняем словарь тремя парами
//        dictionary.put("dog", "собака");
//        dictionary.put("cat", "кошка");
//        dictionary.put("bird", "птица");
//
//        // Перебираем пары через for-each по entrySet()
//        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//            // Форматированный вывод в виде "ключ = значение"
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
//    }
//}
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем множество HashSet<String> для хранения технологий
//        Set<String> technologies = new HashSet<>();
//
//        // Добавляем названия технологий
//        technologies.add("java");
//        technologies.add("python");
//        technologies.add("c++");
//        technologies.add("javascript");
//
//        // Удаляем элементы, содержащие символ '+', используя итератор
//        Iterator<String> iterator = technologies.iterator();
//
//        while (iterator.hasNext()) {
//            String technology = iterator.next();
//
//            if (technology.contains("+")) {
//                iterator.remove();
//            }
//        }
//
//        // Выводим оставшиеся элементы множества, каждый на новой строке
//        for (String technology : technologies) {
//            System.out.println(technology);
//        }
//    }
//}
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем очередь задач на основе LinkedList
//        Queue<Integer> tasks = new LinkedList<>();
//
//        // Добавляем идентификаторы задач в указанном порядке
//        tasks.add(5);
//        tasks.add(15);
//        tasks.add(25);
//
//        // Получаем первый элемент без удаления из очереди
//        Integer nextTask = tasks.peek();
//
//        // Выводим идентификатор следующей задачи
//        System.out.println(nextTask);
//
//        // Выводим текущий размер очереди
//        System.out.println(tasks.size());
//    }
//}
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.Queue;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Очередь печати на базе ArrayDeque (FIFO)
//        Queue<String> queue = new ArrayDeque<>();
//
//        queue.add("Кот");
//        queue.add("Пёс");
//        queue.add("Мышь");
//
//        // Стек истории действий на базе ArrayDeque (LIFO)
//        Deque<Character> stack = new ArrayDeque<>();
//
//        // Используем push для добавления на вершину стека
//        stack.push('X');
//        stack.push('Y');
//        stack.push('Z');
//
//        // Вывод очереди
//        System.out.println("Очередь:");
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
//
//        // Вывод стека
//        System.out.println("Стек:");
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//    }
//}
//import java.util.NavigableMap;
//import java.util.TreeMap;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем NavigableMap, чтобы быстро находить порог по баллам
//        NavigableMap<Integer, String> levels = new TreeMap<>();
//
//        // Заполняем карту: ключ — минимальные баллы, значение — название уровня
//        levels.put(1, "бронзовый");
//        levels.put(3, "серебряный");
//        levels.put(5, "золотой");
//        levels.put(7, "платиновый");
//
//        // Количество баллов клиента
//        int points = 4;
//
//        // Находим наибольший ключ, не превышающий количество баллов
//        Integer key = levels.floorKey(points);
//
//        // Получаем и выводим название уровня
//        if (key != null) {
//            System.out.println(levels.get(key));
//        } else {
//            System.out.println("Уровень не найден");
//        }
//    }
//}
//import java.util.NavigableSet;
//import java.util.TreeSet;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Основной складской реестр
//        NavigableSet<Integer> warehouse = new TreeSet<>();
//
//        // Добавляем идентификаторы товаров
//        warehouse.add(10);
//        warehouse.add(20);
//        warehouse.add(30);
//        warehouse.add(40);
//        warehouse.add(50);
//
//        // Формируем "вид" на часть реестра: от 20 включительно до 50 исключительно
//        NavigableSet<Integer> shipment = warehouse.subSet(20, true, 50, false);
//
//        // Удаляем поврежденный товар 30 из временного списка
//        shipment.remove(30);
//
//        // Сначала выводим временный список отгрузки, затем основной реестр
//        System.out.println(shipment);
//        System.out.println(warehouse);
//    }
//}


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем изменяемый список с начальными значениями
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, -3, 8, -1, 0, 4, -7));
//
//        // Обходим список с помощью Iterator, чтобы безопасно удалять элементы во время обхода
//        Iterator<Integer> iterator = numbers.iterator();
//
//        while (iterator.hasNext()) {
//            Integer number = iterator.next();
//
//            if (number < 0) {
//                iterator.remove();
//            }
//        }
//
//        // Выводим обновленный список без отрицательных чисел
//        System.out.println(numbers);
//    }
//}
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем изменяемый список с исходными названиями животных
//        List<String> animals = new ArrayList<>();
//
//        animals.add("cat");
//        animals.add("elephant");
//        animals.add("dog");
//        animals.add("tiger");
//        animals.add("rat");
//        animals.add("lion");
//
//        // Удаляем все строки, длина которых меньше 4 символов
//        animals.removeIf(animal -> animal.length() < 4);
//
//        // Выводим обновленный список после фильтрации
//        System.out.println(animals);
//    }
//}
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем список студентов и наполняем его объектами Student с именами
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Иван"));
//        students.add(new Student("Мария"));
//        students.add(new Student("Петр"));
//
//        // Создаем новый список для хранения только имён студентов
//        List<String> names = new ArrayList<>();
//
//        // Преобразуем каждый объект Student в строку с именем и добавляем в список names
//        for (Student student : students) {
//            names.add(student.getStudentName());
//        }
//
//        // Выводим на экран список имён
//        System.out.println(names);
//    }
//}
//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём вложенный список сундуков с камнями
//        List<List<Integer>> treasureChests = List.of(
//                List.of(1, 2),
//                List.of(3, 4, 5),
//                List.of(6)
//        );
//
//        // Новый список, куда соберём все камни в исходном порядке
//        List<Integer> allGems = new ArrayList<>();
//
//        // Проходим по каждому "сундуку" и добавляем его содержимое
//        for (List<Integer> chest : treasureChests) {
//            allGems.addAll(chest);
//        }
//
//        // Выводим объединённый список
//        System.out.println(allGems);
//    }
//}
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Формируем исходный список животных
//        List<String> animals = new ArrayList<>();
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("bird");
//        animals.add("fish");
//
//        // Получаем ListIterator для безопасного прохода и модификации списка
//        ListIterator<String> iterator = animals.listIterator();
//
//        // Итерируемся по списку
//        while (iterator.hasNext()) {
//            String animal = iterator.next();
//
//            if (animal.length() == 3) {
//                iterator.remove();
//                iterator.add("pet");
//            }
//        }
//
//        // После обработки выводим итоговый список на экран
//        System.out.println(animals);
//    }
//}
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем и заполняем HashMap результатами участников
//        HashMap<String, Integer> results = new HashMap<>();
//        results.put("A", 1);
//        results.put("B", 2);
//        results.put("C", 3);
//        results.put("D", 4);
//
//        // Получаем итератор по набору записей (entrySet)
//        Iterator<Map.Entry<String, Integer>> iterator = results.entrySet().iterator();
//
//        // Идем по каждой паре "участник-балл"
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//
//            // Если балл четный — безопасно удаляем через итератор
//            if (entry.getValue() % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        // Выводим очищенную карту на экран
//        System.out.println(results);
//    }
//}
//import java.util.EnumSet;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем EnumSet только с выходными днями
//        EnumSet<Day> weekendDays = EnumSet.of(Day.SAT, Day.SUN);
//
//        // Выводим содержимое EnumSet на экран
//        System.out.println(weekendDays);
//    }
//}
//
// Перечисление с полным набором дней недели
//enum Day {
//    MON, TUE, WED, THU, FRI, SAT, SUN
//}
//import java.util.EnumMap;
//
//// Перечисление дней недели
//enum Day {
//    MON, TUE, WED, THU, FRI, SAT, SUN
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        // Специализированная карта для enum-ключей
//        EnumMap<Day, Integer> prices = new EnumMap<>(Day.class);
//
//        // Заполняем цены согласно условию
//        prices.put(Day.MON, 100);
//        prices.put(Day.TUE, 120);
//        prices.put(Day.SAT, 200);
//
//        // Получаем цену на субботу и выводим на экран
//        System.out.println(prices.get(Day.SAT));
//    }
//}
//import java.util.LinkedHashMap;
//
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем LinkedHashMap с "порядком по обращению" (accessOrder = true)
//        LinkedHashMap<String, Integer> products = new LinkedHashMap<>(16, 0.75f, true);
//
//        // Добавляем товары: ключ — код товара, значение — его id
//        products.put("a", 1);
//        products.put("b", 2);
//        products.put("c", 3);
//
//        // Имитация просмотра товара "b": доступ через get переносит "b" в конец
//        products.get("b");
//
//        // Выводим ключи в текущем порядке обхода: ожидается a, c, b
//        for (String key : products.keySet()) {
//            System.out.println(key);
//        }
//    }
//}
import java.util.LinkedHashMap;
import java.util.Map;

//public class Solution {
//    public static void main(String[] args) {
//        // Создаем кэш с порядком по доступу (LRU)
//        GameAssetCache cache = new GameAssetCache();
//
//        // Добавляем ассеты
//        cache.put(1, "one");
//        cache.put(2, "two");
//
//        // "Используем" ассет с ключом 1 — он становится самым недавно использованным
//        cache.get(1);
//
//        // Добавляем ассет 3 — удалится наименее недавно использованный ключ 2
//        cache.put(3, "three");
//
//        // Выводим ключи оставшихся ассетов
//        for (Integer id : cache.keySet()) {
//            System.out.println(id);
//        }
//    }
//}
//import java.util.HashSet;
//import java.util.Objects;
//
//public class Solution {
//    public static void main(String[] args) {
//        // HashSet хранит только уникальные элементы по equals/hashCode
//        HashSet<City> cities = new HashSet<>();
//
//        // Добавляем два разных объекта с одинаковыми значениями полей
//        cities.add(new City("Метрополис", 1_000_000));
//        cities.add(new City("Метрополис", 1_000_000));
//
//        // Если equals/hashCode реализованы корректно, размер будет 1
//        System.out.println(cities.size());
//    }
//}
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // Создаём два независимых объекта с одинаковыми значениями полей
        Employee first = new Employee("Алиса", 123);
        Employee second = new Employee("Алиса", 123);

        // HashMap, где ключом выступает Employee, а значением — роль
        Map<Employee, String> roles = new HashMap<>();

        // Кладём в карту пару
        roles.put(first, "Работник");

        // Получаем значение по логически равному ключу
        String role = roles.get(second);

        // Ожидаемый вывод: "Работник"
        System.out.println(role);
    }
}









