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
//class Person {
//
//    private String userName;
//
//    // Конструктор
//    Person(String userName) {
//        this.userName = userName;
//    }
//
//    // Внутренний класс
//    class Greeting {
//        void sayHello() {
//            System.out.println("Hello, " + userName);
//        }
//    }
//}
//class Person {
//    Person(String humanName) {
//        System.out.println("Создан человек: " + humanName);
//    }
//}
//
//class Student extends Person {
//
//    Student(String studentName, int studentGrade) {
//        super(studentName); // вызов конструктора родителя
//        System.out.println("Создан студент: " + studentName + ", класс: " + studentGrade);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Student anna = new Student("Анна", 3);
//    }
//}
//class Person {
//    void introduce() {
//        System.out.println("Я человек.");
//    }
//}
//
//class Student extends Person {
//}
//
//class SchoolStudent extends Student {
//    @Override
//    void introduce() {
//        System.out.println("Я школьник.");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        SchoolStudent schoolStudent = new SchoolStudent();
//        schoolStudent.introduce();
//    }
//}
//class Person {
//    Person(String humanName) {
//        System.out.println("Person создан: " + humanName);
//    }
//}
//
//class Student extends Person {
//
//    Student(String studentName) {
//        super(studentName); // сначала вызывается родитель
//        System.out.println("Student создан: " + studentName);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Student elena = new Student("Елена");
//    }
//}