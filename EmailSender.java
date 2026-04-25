//interface MessageSender {
//    void send(String text);
//}
//
//// Конкретная реализация — отправка через Email
//class EmailSender implements MessageSender {
//    @Override
//    public void send(String text) {
//        System.out.println("Email отправлен: " + text);
//    }
//}
//
//// Класс уведомления НЕ знает, как именно отправляется сообщение
//class Notification {
//    private MessageSender sender;
//
//    // Внедрение зависимости через конструктор
//    public Notification(MessageSender sender) {
//        this.sender = sender;
//    }
//
//    // Делегируем отправку
//    public void notifyUser(String text) {
//        sender.send(text);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        // Внедряем реализацию EmailSender в Notification
//        MessageSender emailSender = new EmailSender();
//        Notification notification = new Notification(emailSender);
//
//        // Тестируем отправку уведомления
//        notification.notifyUser("Привет!");
//    }
//}
