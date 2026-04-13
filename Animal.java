//class Animal {
//    int animalAge;        // не инициализируем
//    String animalName;    // не инициализируем
//}
// Базовый класс
//class Animal {
//    String petName;
//
//    void eat() {
//        System.out.println(petName + " ест.");
//    }
//}

// Дочерний класс
//class Cat extends Animal {
//
//    void meow() {
//        System.out.println(petName + " говорит: Мяу!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        // Создаем кота и задаем ему имя через поле petName
//        Cat cat = new Cat();
//        cat.petName = "Барсик";
//
//        // Вызываем действия кота в требуемом порядке
//        cat.eat();
//        cat.meow();
//    }
//}
// Базовый класс
//class Animal {
//    String petName;
//
//    void sleep() {
//        System.out.println(petName + " спит.");
//    }
//}

// Дочерний класс
//class Dog extends Animal {
//
//    void bark() {
//        System.out.println(petName + " говорит: Гав!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        // Создаем объект собаки
//        Dog dog = new Dog();
//
//        // Присваиваем имя питомцу
//        dog.petName = "Шарик";
//
//        // Демонстрируем наследуемое поведение сна
//        dog.sleep();
//
//        // Демонстрируем уникальное поведение собаки — лай
//        dog.bark();
//    }
//}