class User {
    String userName;
    int userAge;

    // Конструктор без параметров
    User() {
        this.userName = "Unknown";
        this.userAge = 0;
    }

    // Конструктор с указанием только имени
    User(String name) {
        this.userName = name;
        this.userAge = 0;
    }
}
