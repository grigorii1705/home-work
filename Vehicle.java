// Базовый класс
//class Vehicle {
//    String vehicleModel;
//
//    void start() {
//        System.out.println(vehicleModel + " заводится.");
//    }
//}

// Дочерний класс
//class Car extends Vehicle {
//    // Пока без дополнительных методов
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
//class Vehicle {
//    Vehicle(String brandName) {
//        System.out.println("Транспорт: " + brandName);
//    }
//}
//
//class Car extends Vehicle {
//
//    Car(String carBrand, int manufacturingYear) {
//        super(carBrand); // вызов конструктора родителя
//        System.out.println("Машина " + carBrand + ", год: " + manufacturingYear);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Car car = new Car("BMW", 2023);
//    }
//}
//class Vehicle {
//    void move() {
//        System.out.println("Транспорт движется.");
//    }
//}
//
//class Car extends Vehicle {
//    void beep() {
//        System.out.println("Машина сигналит: Бип-бип!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.move();
//        car.beep();
//    }
//}
//class Vehicle {
//    void move() {
//        System.out.println("Транспорт движется.");
//    }
//}
//
//class Car extends Vehicle {
//    @Override
//    void move() {
//        System.out.println("Машина едет.");
//    }
//}
//
//class Bicycle extends Vehicle {
//    @Override
//    void move() {
//        System.out.println("Велосипед едет.");
//    }
//}
//
//class Scooter extends Vehicle {
//    @Override
//    void move() {
//        System.out.println("Самокат едет.");
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