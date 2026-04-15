// Базовый класс
//class Fruit {
//    String fruitColor;
//
//    void printColor() {
//        System.out.println("Цвет: " + fruitColor);
//    }
//}

// Дочерние классы
//class Apple extends Fruit {
//}
//
//class Banana extends Fruit {
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
//class Fruit {
//}
//
//class Apple extends Fruit {
//}
//
//class Basket {
//    Fruit getFruit() {
//        return new Fruit();
//    }
//}

//class AppleBasket extends Basket {
//    @Override
//    Apple getFruit() { // ковариантный возвращаемый тип
//        return new Apple();
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