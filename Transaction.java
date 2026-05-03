//record Transaction(String sender, String receiver, double amount) {
//
//    // Компактный конструктор с валидацией
//    public Transaction {
//        if (sender == null || sender.isBlank()) {
//            throw new IllegalArgumentException("Отправитель не может быть пустым");
//        }
//        if (receiver == null || receiver.isBlank()) {
//            throw new IllegalArgumentException("Получатель не может быть пустым");
//        }
//        if (amount <= 0) {
//            throw new IllegalArgumentException("Сумма должна быть больше 0");
//        }
//    }
//
//    // Метод описания транзакции
//    public String describe() {
//        return "Перевод " + amount + " от " + sender + " к " + receiver;
//    }
//}
