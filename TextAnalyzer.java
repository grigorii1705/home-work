//import java.util.Scanner;
//
//public class TextAnalyzer {
//
//    // Метод-обработчик имени: внутри объявляем локальный класс и используем его
//    public void generateNameReport(String customerName) {
//
//        // Локальный класс
//        class NameStatistics {
//            private String originalCustomerName;
//
//            // Конструктор
//            public NameStatistics(String name) {
//                this.originalCustomerName = name;
//            }
//
//            // Вывод имени в верхнем регистре
//            public void printUpperCaseName() {
//                System.out.println(originalCustomerName.toUpperCase());
//            }
//
//            // Вывод длины имени
//            public void printNameLength() {
//                System.out.println(originalCustomerName.length());
//            }
//        }
//
//        // Создаем объект локального класса и последовательно вызываем методы отчета
//        NameStatistics stats = new NameStatistics(customerName);
//        stats.printUpperCaseName();
//        stats.printNameLength();
//    }
//
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        String name = console.nextLine();          // читаем имя с консоли
//        new TextAnalyzer().generateNameReport(name);
//    }
//}
