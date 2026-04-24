//class User {
//    String userName;
//    int userAge;
//
//    // Конструктор без параметров
//    User() {
//        this.userName = "Unknown";
//        this.userAge = 0;
//    }
//
//    // Конструктор с указанием только имени
//    User(String name) {
//        this.userName = name;
//        this.userAge = 0;
//    }
//}
//import java.io.Serializable;
//
//// Контракт именования
//interface Nameable {
//    String getName();
//}
//
//// Класс User реализует два интерфейса:
//// 1) наш собственный Nameable
//// 2) стандартный Serializable
//class User implements Nameable, Serializable {
//
//    private String name;
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//}

// MAIN
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем пользователя
//        User user = new User("Алиса");
//
//        // Получаем имя
//        System.out.println(user.getName());
//    }
//}
