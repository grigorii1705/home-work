//class Parent {
//    public void greet() {
//        System.out.println("Hello from Parent");
//    }
//}

//class Child extends Parent {
//    @Override
//    public void greet() {
//        System.out.println("Hello from Child");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Parent person = new Child();
//        person.greet();
//    }
//}
//class Parent {
//    private int familySecret = 42;
//
//    public void printSecret() {
//        System.out.println(familySecret);
//    }
//}
//
//class Child extends Parent {
//
//    void demo() {
//        // ❌ Ошибка: нет доступа к private полю родителя
//        System.out.println(familySecret);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Parent parent = new Parent();
//        parent.printSecret();
//
//        new Child().demo();
//    }
//}
