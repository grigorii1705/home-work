//class Printer {
//
//    void print(int x) {
//        System.out.println("Число: " + x);
//    }
//
//    void print(String y) {
//        System.out.println("Строка: " + y);
//    }
//}
//
//class ColorPrinter extends Printer {
//
//    @Override
//    void print(String y) {
//        System.out.println("Цветная строка: " + y);
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
//interface Printer {
//
//    void print(String message);
//
//    default void printTwice(String message) {
//        print(message);
//        print(message);
//    }
//}
//interface Printer {
//
//    void print(String message);
//
//    default void printTwice(String message) {
//        print(message);
//        print(message);
//    }
//}
//interface Printer {
//
//    void print(String text);
//
//    static void printHello(Printer printer) {
//        printer.print("Hello, world!");
//    }
//}