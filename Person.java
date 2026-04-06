//class Person {
//    private String memberName;
//    private int memberAge;
//
//    // Конструктор
//    public Person(String memberName, int memberAge) {
//        this.memberName = memberName;
//        this.memberAge = memberAge;
//    }
//
//    // Геттеры
//    public String getMemberName() {
//        return memberName;
//    }
//
//    public int getMemberAge() {
//        return memberAge;
//    }
//
//    // Сеттер для имени
//    public void setMemberName(String newName) {
//        this.memberName = newName;
//    }
//
//    // Сеттер для возраста с проверкой
//    public void setMemberAge(int newAge) {
//        if (newAge < 0) {
//            System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
//            return;
//        }
//        this.memberAge = newAge;
//    }
//}
class Person {

    private String userName;

    // Конструктор
    Person(String userName) {
        this.userName = userName;
    }

    // Внутренний класс
    class Greeting {
        void sayHello() {
            System.out.println("Hello, " + userName);
        }
    }
}
