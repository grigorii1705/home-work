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
//import java.util.*;
//
//abstract class Vehicle {
//    abstract void move();
//}
//
//class Car extends Vehicle {
//    @Override
//    void move() {
//        System.out.println("Машина едет по дороге");
//    }
//}
//
//class Bicycle extends Vehicle {
//    @Override
//    void move() {
//        System.out.println("Велосипед крутит педали");
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
// Абстрактный класс
//abstract class Vehicle {
//    // Абстрактный метод (без реализации)
//    abstract void move();
//}
//
//// Конкретный класс Car
//class Car extends Vehicle {
//    @Override
//    void move() {
//        System.out.println("Машина едет");
//    }
//}

// Main-класс
//public class Solution {
//    public static void main(String[] args) {
//        // Полиморфизм: ссылка типа Vehicle на объект Car
//        Vehicle car = new Car();
//
//        // Вызов метода
//        car.move(); // "Машина едет"
//    }
//}
import java.util.*;

// Абстрактный класс
//abstract class Vehicle {
//    String model;
//
//    // Конструктор
//    public Vehicle(String model) {
//        this.model = model;
//    }
//
//    // Абстрактный метод
//    abstract void move();
//}
//
//// Класс Car
//class Car extends Vehicle {
//
//    public Car(String model) {
//        super(model);
//    }
//
//    @Override
//    void move() {
//        System.out.println("Машина " + model + " едет");
//    }
//}
//
//// Класс Bicycle
//class Bicycle extends Vehicle {
//
//    public Bicycle(String model) {
//        super(model);
//    }
//
//    @Override
//    void move() {
//        System.out.println("Велосипед " + model + " едет");
//    }
//}

// Main-класс
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