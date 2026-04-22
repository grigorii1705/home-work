// Абстрактный класс
//abstract class Order {
//    double amount;
//
//    // Конструктор
//    public Order(double amount) {
//        this.amount = amount;
//    }
//
//    // Абстрактный метод
//    abstract void process();
//}
//
//// Онлайн-заказ
//class OnlineOrder extends Order {
//
//    public OnlineOrder(double amount) {
//        super(amount);
//    }
//
//    @Override
//    void process() {
//        System.out.println("Обработка онлайн-заказа на сумму " + amount);
//    }
//}
//
//// Оффлайн-заказ
//class OfflineOrder extends Order {
//
//    public OfflineOrder(double amount) {
//        super(amount);
//    }
//
//    @Override
//    void process() {
//        System.out.println("Обработка оффлайн-заказа на сумму " + amount);
//    }
//}

// Main-класс
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
