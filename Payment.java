//abstract class Payment {
//
//    void printInfo() {
//        System.out.println("Платёж обрабатывается");
//    }
//
//    abstract void process();
//}
//
//class PaypalPayment extends Payment {
//
//    @Override
//    void process() {
//        System.out.println("Обработка платежа через PayPal");
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
// Абстрактный класс
abstract class Payment {
    // Абстрактный метод обработки платежа
    abstract void process();
}

// Оплата наличными
class CashPayment extends Payment {
    @Override
    void process() {
        System.out.println("Оплата наличными");
    }
}

// Онлайн-оплата
class OnlinePayment extends Payment {
    @Override
    void process() {
        System.out.println("Онлайн-оплата");
    }
}

// Main-класс
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
