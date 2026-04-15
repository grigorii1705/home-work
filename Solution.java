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
public class Solution {
    public static void main(String[] args) {
        Animal mysteriousCreature = new Cat();
        mysteriousCreature.sleep();
    }
}
