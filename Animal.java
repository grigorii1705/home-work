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
//class Animal {
//    void makeSound() {
//        System.out.println("Some animal sound");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Woof!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
//class Animal {
//    void makeSound() {
//        System.out.println("Животное издаёт звук");
//    }
//}

//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        super.makeSound(); // вызов метода родителя
//        System.out.println("Собака лает");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
//class Animal {
//    String name = "Животное";
//}
//
//class Cat extends Animal {
//    String name = "Кошка";
//
//    void printNames() {
//        System.out.println("Имя из Cat: " + this.name);
//        System.out.println("Имя из Animal: " + super.name);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.printNames();
//    }
//}
//class Animal {
//    String petName;
//
//    void eat() {
//        System.out.println(petName + " ест.");
//    }
//}
//
//class Dog extends Animal {
//}

//public class Solution {
//    public static void main(String[] args) {
//        Dog bobik = new Dog();
//        bobik.petName = "Бобик";
//        bobik.eat();
//    }
//}
//class Animal {
//    String animalName;
//
//    void eat() {
//        System.out.println(animalName + " ест.");
//    }
//}
//
//class Mammal extends Animal {
//    void feedMilk() {
//        System.out.println(animalName + " кормит детёнышей молоком.");
//    }
//}

//class Cat extends Mammal {
//    @Override
//    void eat() {
//        System.out.println(animalName + " ест рыбу.");
//    }
//
//    void purr() {
//        System.out.println(animalName + " мурлычет.");
//    }
//

//public class Solution {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.animalName = "Мурка";
//
//        cat.eat();
//        cat.feedMilk();
//        cat.purr();
//    }
//}
//class Animal {
//}
//
//class Robot {
//}
//
//class Dog extends Animal {
//}
//
// ❌ Это вызовет ошибку компиляции
//class RoboDog extends Animal, Robot {
//}
//
//public class Solution {
//    public static void main(String[] args) {
//   }
//}
//class Animal {
//    void makeSound() {
//        System.out.println("Some sound");
//    }
//
//    void sleep() {
//        System.out.println("Animal is going to sleep...");
//        this.makeSound(); // динамический вызов
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Meow!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal mysteriousCreature = new Cat();
//        mysteriousCreature.sleep();
//    }
//}
//class Animal {
//    void makeSound() {
//        System.out.println("Какой-то звук...");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Гав!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal pet = new Dog();
//        pet.makeSound();
//    }
//}
//class Animal {
//    void makeSound() {
//        System.out.println("Какой-то звук...");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Мяу!");
//    }
//}
//
//class Cow extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Мууу!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal[] pen = { new Cat(), new Cow() };
//
//        for (Animal animal : pen) {
//            animal.makeSound();
//        }
//    }
//}
//class Animal {
//    void makeSound() {
//        System.out.println("Животное издаёт звук");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Гав!");
//    }
//}
//class Animal {
//    void makeSound() {
//        System.out.println("Животное издаёт звук");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        super.makeSound();
//        System.out.println("Мяу!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.makeSound();
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeSound();
//    }
//}
//class Animal {
//    void makeSound() {
//        System.out.println("Животное издает звук");
//    }
//}

//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Собака лает");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Кошка мяукает");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        dog.makeSound();
//        cat.makeSound();
//    }
//}
//abstract class Animal {
//    abstract void makeSound();
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Гав-гав!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal pet = new Dog();
//        pet.makeSound();
//    }
//}
//abstract class Animal {
//    String name;
//
//    Animal(String name) {
//        this.name = name;
//    }
//
//    abstract void makeSound();
//}
//
//class Cat extends Animal {
//
//    Cat(String name) {
//        super(name);
//    }
//
//    @Override
//    void makeSound() {
//        System.out.println(name + ": Мяу!");
//    }
//}
//
//class Cow extends Animal {
//
//    Cow(String name) {
//        super(name);
//    }
//
//    @Override
//    void makeSound() {
//        System.out.println(name + ": Мууу!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal[] animals = {
//                new Cat("Мурка"),
//                new Cow("Буренка")
//        };
//
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }
//    }
//}
//abstract class Animal {
//    abstract void makeSound();
//}
//
//// пример конкретного животного, чтобы можно было запустить
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Гав!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.makeSound();
//    }
//}
//abstract class Animal {
//    abstract void makeSound();
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Гав!");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.makeSound();
//    }
//}