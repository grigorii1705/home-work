// Абстрактный класс
//abstract class Message {
//    String text;
//
//    // Конструктор
//    public Message(String text) {
//        this.text = text;
//    }
//
//    // Абстрактный метод отправки
//    abstract void send();
//}
//
//// Email-сообщение
//class EmailMessage extends Message {
//
//    public EmailMessage(String text) {
//        super(text);
//    }
//
//    @Override
//    void send() {
//        System.out.println("Отправка email: " + text);
//    }
//}
//
//// SMS-сообщение
//class SmsMessage extends Message {
//
//    public SmsMessage(String text) {
//        super(text);
//    }
//
//    @Override
//    void send() {
//        System.out.println("Отправка SMS: " + text);
//    }
//}

// Main-класс
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем сообщения
//        Message email = new EmailMessage("Привет!");
//        Message sms = new SmsMessage("Привет!");
//
//        // Отправляем
//        email.send();
//        sms.send();
//    }
//}
