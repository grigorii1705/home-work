// Интерфейс — "способность издавать звук"
//interface Soundable {
//    void makeSound();
//}
//
//// Собака
//class Dog implements Soundable {
//
//    @Override
//    public void makeSound() {
//        System.out.println("Woof");
//    }
//}
//
//// Кошка
//class Cat implements Soundable {
//
//    @Override
//    public void makeSound() {
//        System.out.println("Meow");
//    }
//}

// MAIN
//public class Solution {
//    public static void main(String[] args) {
//        // "Зоопарк" — массив объектов, реализующих Soundable
//        Soundable[] zoo = new Soundable[2];
//
//        zoo[0] = new Dog();
//        zoo[1] = new Cat();
//
//        // Полиморфизм: у каждого вызовется своя реализация
//        for (Soundable animal : zoo) {
//            animal.makeSound();
//        }
//    }
//}
