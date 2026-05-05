// Абстрактный класс — общий шаблон устройства
//abstract class Appliance {
//
//    public void turnOn() {
//        System.out.println("Устройство включено");
//    }
//
//    // Абстрактный метод — каждая техника реализует сама
//    public abstract void work();
//}
//
//// Интерфейс — протокол зарядки
//interface Chargeable {
//    void charge();
//}
//
//// Смартфон — наследует поведение и добавляет новые возможности
//class SmartPhone extends Appliance implements Chargeable {
//
//    @Override
//    public void work() {
//        System.out.println("Смартфон работает");
//    }
//
//    @Override
//    public void charge() {
//        System.out.println("Смартфон заряжается");
//    }
//}

// MAIN
//public class Solution {
//    public static void main(String[] args) {
//        SmartPhone phone = new SmartPhone();
//
//        phone.turnOn();
//        phone.work();
//        phone.charge();
//    }
//}
//abstract class Appliance {
//
//    // Общая команда для всех приборов
//    public abstract void turnOn();
//}