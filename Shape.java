//class Shape {
//    void draw() {
//        System.out.println("Drawing a shape");
//    }
//}
//
//class Circle extends Shape {
//    @Override
//    void draw() {
//        System.out.println("Drawing a circle");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.draw();
//    }
//}
//class Shape {
//    void draw() {
//        System.out.println("Рисуем фигуру");
//    }
//}
//
//class Circle extends Shape {
//    @Override
//    void draw() {
//        System.out.println("Рисуем круг");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Shape shape = new Circle();
//        shape.draw();
//    }
//}
//abstract class Shape {
//    abstract void draw();
//}
//
//class Circle extends Shape {
//    @Override
//    void draw() {
//        System.out.println("Рисуем круг");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        // Shape shape = new Shape(); // ❌ нельзя (абстрактный класс)
//
//        Shape shape = new Circle(); // ✅ можно через наследника
//        shape.draw();
//    }
//}