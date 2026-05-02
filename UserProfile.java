//class UserProfile {
//
//    private String userIdentifier;
//    private String userName; // дополнительное поле для имени (используется только в конструкторе с параметром)
//
//    // Нестатический блок инициализации
//    {
//        userIdentifier = "DEFAULT_REG_ID";
//        System.out.println("Временный ID пользователя присвоен.");
//    }
//
//    // Конструктор без параметров (быстрая регистрация)
//    public UserProfile() {
//        System.out.println("Создан профиль без имени.");
//    }
//
//    // Конструктор с параметром (полная регистрация)
//    public UserProfile(String initialName) {
//        this.userName = initialName;
//        System.out.println("Создан профиль с именем: " + initialName);
//    }
//
//    // Геттер для userIdentifier (при желании можно использовать)
//    public String getUserIdentifier() {
//        return userIdentifier;
//    }
//
//    // Геттер для userName (при желании можно использовать)
//    public String getUserName() {
//        return userName;
//    }
//}
//record UserProfile(String name, int age) {
//
//    @Override
//    public String toString() {
//        return "Пользователь: " + name + " (" + age + " лет)";
//    }
//}
