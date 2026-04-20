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