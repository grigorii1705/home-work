//class Dog {
//    String dogName;
//    int dogAge;
//
//    // Конструктор для моментальной регистрации
//    Dog(String name, int age) {
//        this.dogName = name;
//        this.dogAge = age;
//    }
//}
//class Dog implements Animal {
//
//    @Override
//    public void voice() {
//        System.out.println("Woof");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Dog is sleeping");
//    }
//}
//class Dog extends Animal { // 💥 ОШИБКА
//    public void bark() {
//        System.out.println("Woof");
//    }
//}
//class Dog extends Animal {
//
//    // ❗ Это НЕ override — это новый метод (другие параметры)
//    public void makeSound(String intensity) {
//        System.out.println("Bark! " + intensity);
//    }
//}
//class Dog extends Animal {
//
//    public void bark() {
//        // ✔ доступ есть — мы наследники
//        makeSound();
//    }
//}
//class Dog extends Animal {
//
//    // ✔ обязаны реализовать метод
//    @Override
//    public void makeSound() {
//        System.out.println("Гав!");
//    }
//}
