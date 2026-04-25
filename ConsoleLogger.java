//interface Logger {
//    void log(String message);
//}
//
//// Реализация для вывода в консоль
//class ConsoleLogger implements Logger {
//    @Override
//    public void log(String message) {
//        System.out.println(message);
//    }
//}
//
//// Реализация для "записи в файл"
//class FileLogger implements Logger {
//    @Override
//    public void log(String message) {
//        System.out.println("Лог записан в файл: " + message);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        // Демонстрация гибкости: две реализации одного интерфейса
//        Logger consoleLogger = new ConsoleLogger();
//        Logger fileLogger = new FileLogger();
//
//        String testMessage = "Тестовое сообщение";
//
//        // Один и тот же вызов — разное поведение
//        consoleLogger.log(testMessage);
//        fileLogger.log(testMessage);
//    }
//}
