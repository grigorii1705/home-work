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
//abstract class Shape {
//    String name;
//
//    Shape(String name) {
//        this.name = name;
//    }
//
//    abstract double area();
//}
//
//class Circle extends Shape {
//    double radius;
//
//    Circle(String name, double radius) {
//        super(name);
//        this.radius = radius;
//    }
//
//    @Override
//    double area() {
//        return Math.PI * radius * radius;
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Circle circle = new Circle("Круг", 2.0);
//
//        System.out.println(circle.name);
//        System.out.println(circle.area());
//    }
//}
// Абстрактный класс
//abstract class Shape {
//    // Абстрактный метод
//    abstract double area();
//}
//
//// Класс Circle
//class Circle extends Shape {
//    double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    double area() {
//        return 3.14 * radius * radius;
//    }
//}

// Main-класс
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём круг радиуса 2.0
//        Circle circle = new Circle(2.0);
//
//        // Выводим площадь
//        System.out.println(circle.area()); // 12.56
//    }
//}