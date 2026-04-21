//class Employee {
//    void work() {
//        System.out.println("Сотрудник работает.");
//    }
//}
//
//class Developer extends Employee {
//    @Override
//    void work() {
//        System.out.println("Разработчик пишет код.");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Employee employee = new Developer();
//        employee.work();
//    }
//}
//class Employee {
//    void work() {
//        System.out.println("Сотрудник работает...");
//    }
//}
//
//class Manager extends Employee {
//    @Override
//    void work() {
//        System.out.println("Менеджер проводит совещание.");
//    }
//}
//
//class Developer extends Employee {
//    @Override
//    void work() {
//        System.out.println("Разработчик пишет код.");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Employee[] team = {
//                new Manager(),
//                new Developer()
//        };
//
//        for (Employee employee : team) {
//            employee.work();
//        }
//    }
//}
//class Employee {
//    void work() {
//        System.out.println("Сотрудник работает...");
//    }
//}
//
//class Manager extends Employee {
//    @Override
//    void work() {
//        System.out.println("Менеджер проводит совещание.");
//    }
//}
//
//class Developer extends Employee {
//    @Override
//    void work() {
//        System.out.println("Разработчик пишет код.");
//    }
//}
//
//class Tester extends Employee {
//    @Override
//    void work() {
//        System.out.println("Тестировщик ищет баги.");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Employee[] team = {
//                new Manager(),
//                new Developer(),
//                new Tester()
//        };
//
//        for (Employee e : team) {
//            e.work();
//        }
//    }
//}
//class Employee {
//    void work() {
//        System.out.println("Сотрудник работает...");
//    }
//}
//
//class Manager extends Employee {
//    @Override
//    void work() {
//        System.out.println("Менеджер проводит совещание.");
//    }
//}
//
//class Developer extends Employee {
//    @Override
//    void work() {
//        System.out.println("Разработчик пишет код.");
//    }
//}
//
//class Designer extends Employee {
//    @Override
//    void work() {
//        System.out.println("Дизайнер рисует макеты.");
//    }
//}
//
//class Intern extends Employee {
//    @Override
//    void work() {
//        System.out.println("Стажёр учится работать.");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Employee[] staff = new Employee[5];
//
//        staff[0] = new Employee();
//        staff[1] = new Manager();
//        staff[2] = new Developer();
//        staff[3] = new Designer();
//
//        printWorkForAll(staff);
//
//        // добавили нового сотрудника без изменения логики
//        staff[4] = new Intern();
//
//        printWorkForAll(staff);
//    }
//
//    private static void printWorkForAll(Employee[] staff) {
//        for (Employee e : staff) {
//            if (e != null) {
//                e.work();
//            }
//        }
//    }
//}
//abstract class Employee {
//    abstract void work();
//}
//
//class Manager extends Employee {
//    @Override
//    void work() {
//        System.out.println("Менеджер управляет проектами.");
//    }
//}
//
//class Developer extends Employee {
//    @Override
//    void work() {
//        System.out.println("Разработчик пишет код.");
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Employee[] team = new Employee[2];
//
//        team[0] = new Manager();
//        team[1] = new Developer();
//
//        for (Employee employee : team) {
//            employee.work();
//        }
//    }
//}
// Абстрактный базовый класс
//abstract class Employee {
//    String name;
//
//    // Конструктор
//    public Employee(String name) {
//        this.name = name;
//    }
//
//    // Геттер для имени
//    public String getName() {
//        return name;
//    }
//
//    // Абстрактный метод
//    public abstract double getSalary();
//}
//
//// Менеджер с фиксированной зарплатой
//class Manager extends Employee {
//    double baseSalary;
//
//    public Manager(String name, double baseSalary) {
//        super(name);
//        this.baseSalary = baseSalary;
//    }
//
//    @Override
//    public double getSalary() {
//        return baseSalary;
//    }
//}
//
//// Разработчик с почасовой оплатой
//class Developer extends Employee {
//    double hourlyRate;
//    int hoursWorked;
//
//    public Developer(String name, double hourlyRate, int hoursWorked) {
//        super(name);
//        this.hourlyRate = hourlyRate;
//        this.hoursWorked = hoursWorked;
//    }
//
//    @Override
//    public double getSalary() {
//        return hourlyRate * hoursWorked;
//    }
//}

// Main-класс
//public class Solution {
//    public static void main(String[] args) {
//        Employee[] staff = new Employee[2];
//
//        staff[0] = new Manager("Анна", 100000);
//        staff[1] = new Developer("Иван", 500, 160);
//
//        for (Employee e : staff) {
//            System.out.println("Имя: " + e.getName() +
//                    ", зарплата: " + e.getSalary());
//        }
//    }
//}
// Абстрактный класс
//abstract class Employee {
//    String name;
//
//    // Конструктор
//    public Employee(String name) {
//        this.name = name;
//    }
//
//    // Метод для получения имени
//    public String getName() {
//        return name;
//    }
//
//    // Абстрактный метод для зарплаты
//    public abstract double getSalary();
//}
//
//// Класс Manager
//class Manager extends Employee {
//    double salary;
//
//    public Manager(String name, double salary) {
//        super(name);
//        this.salary = salary;
//    }
//
//    @Override
//    public double getSalary() {
//        return salary;
//    }
//}

// Main-класс
//public class Solution {
//    public static void main(String[] args) {
//        // Создаём менеджера
//        Manager manager = new Manager("Ivan", 50000);
//
//        // Выводим имя и зарплату
//        System.out.println(manager.getName());
//        System.out.println(manager.getSalary());
//    }
//}