//public class Calculator {
//
//    // Храним последний результат
//    private int lastResult;
//
//    // Основной метод вычислений
//    public void calculate() {
//        int a = 10;
//        int b = 5;
//
//        lastResult = a * b + (a - b);
//
//        // Вызываем отдельный метод (он объявлен на уровне класса)
//        printResult();
//    }
//
//    // ✅ Правильное объявление метода — на уровне класса
//    public void printResult() {
//        System.out.println("Результат: " + lastResult);
//    }
//
////     🚀 Точка входа
//    public static void main(String[] args) {
//        new Calculator().calculate();
//    }
//}
