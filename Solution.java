//public class Solution {
//    public static void main(String[] args) {
//        // Создаём товар
//        Product product = new Product(101, "Молоко");
//
//        // Получаем данные через геттеры
//        System.out.println(product.getProductID());
//        System.out.println(product.getProductName());
//
//        // ❌ Эти строки НЕ скомпилируются:
//        product.productID = 202;
//        product.productName = "Кефир";
//        product.setProductID(202);
//        product.setProductName("Кефир");
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        MagicCalculator calculator = new MagicCalculator();
//
//        // Вызываем публичный метод
//        int sum = calculator.addNumbers(10, 15);
//
//        // Выводим результат
//        System.out.println(sum);
//
//        // ❌ Это НЕ скомпилируется:
//        calculator.displayInternalResult(sum);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//
//        DigitalLibraryManager manager = new DigitalLibraryManager();
//
//        // ✅ Работает
//        manager.announceOpening();
//
//        // ✅ Работает (тот же пакет)
//        manager.conductStaffMeeting();
//
//        // ✅ Работает (тот же пакет)
//        manager.manageBookInventory();
//
//        // ❌ НЕ скомпилируется
//        manager.handleFinancialAudits();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем товар с исходным названием "Старый товар"
//        Product product = new Product("Старый товар");
//
//        // Переименовываем товар на "Новый товар" с помощью сеттера
//        product.setProductName("Новый товар");
//
//        // Выводим обновлённое название с помощью геттера
//        System.out.println(product.getProductName());
//    }
//}
//public class Solution {
    //    public static void main(String[] args) {
//        // Создаем объект профиля студента с начальным возрастом 18
//        StudentProfile profile = new StudentProfile(18);
//
//        // Обновляем возраст до 20 с помощью сеттера
//        profile.setStudentAge(20);
//
//        // Выводим текущий возраст, чтобы убедиться, что он обновился
//        System.out.println(profile.getStudentAge());
//    }
//}
//    public class Solution {
//        public static void main(String[] args) {
//            // Создаем объект "умной лампы" (по умолчанию выключена)
//            SmartLamp lamp = new SmartLamp();
//
//            // Включаем лампу
//            lamp.setCurrentlyOn(true);
//
//            // Проверяем состояние через boolean-геттер
//            System.out.println(lamp.isCurrentlyOn());
//        }
//    }
//}
//    public class Solution {
//        public static void main(String[] args) {
//            // Создаем студента с начальным возрастом 10
//            SchoolStudent student = new SchoolStudent(10);
//
//            // Пытаемся установить отрицательный возраст
//            student.setCurrentAge(-5);
//
//            // Проверяем, что возраст не изменился
//            System.out.println(student.getCurrentAge()); // Ожидается: 10
//
//            // Устанавливаем корректный возраст
//            student.setCurrentAge(15);
//
//            // Проверяем, что возраст обновился
//            System.out.println(student.getCurrentAge()); // Ожидается: 15
//        }
//    }
//
//public class Solution {
//    public static void main(String[] args) {
//        // Получаем значение статического поля через имя класса
//        System.out.println(ApplicationMetrics.getActiveUserCount());
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем удостоверение с именем "Алиса"
//        StudentIdentityCard card = new StudentIdentityCard("Алиса");
//
//        // Выводим имя студента через геттер
//        System.out.println(card.getStudentName());
//
//        // Попытка изменить имя невозможна:
//        // card.studentName = "Боб"; // Ошибка компиляции: поле private и final
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Выводим значение языка по умолчанию через имя класса
//        System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Обращаемся к константам напрямую через имя класса
//        System.out.println(GlobalConstants.MATH_PI);
//        System.out.println(GlobalConstants.CALENDAR_DAYS_IN_YEAR);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создание объекта спровоцирует загрузку класса и выполнение статического блока
//        new ApplicationModule();
//
//        // Никакого дополнительного вывода здесь быть не должно
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем два объекта ShelterPet
//        // Для каждого сначала отработает нестатический блок, затем конструктор
//        ShelterPet first = new ShelterPet();
//        ShelterPet second = new ShelterPet();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // Создаем два объекта SystemComponent
//        new SystemComponent();
//        new SystemComponent();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        // "Быстрая" регистрация
//        UserProfile fastRegistration = new UserProfile();
//
//        // "Полная" регистрация с именем
//        UserProfile fullRegistration = new UserProfile("Дарья");
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Box box = new Box();
//        Box.Label label = box.new Label();
//        label.printLabel();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Person person = new Person("Anna");
//        Person.Greeting greeting = person.new Greeting();
//        greeting.sayHello();
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Library library = new Library();
//        Library.Scroll scroll = library.new Scroll("Ancient Runes");
//        scroll.revealTitle();
//    }
//}
public class Solution {
    public static void main(String[] args) {
        House house = new House("Sunny Valley Lane");
        House.Room room = house.new Room("Master Bedroom");
        room.printAddresses();
    }
}