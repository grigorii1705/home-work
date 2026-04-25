//interface GreetingStrategy {
//    void greet(String name);
//}
//
//// Дружелюбная стратегия
//class FriendlyGreeting implements GreetingStrategy {
//    @Override
//    public void greet(String name) {
//        System.out.println("Привет, " + name + "!");
//    }
//}
//
//// Формальная стратегия
//class FormalGreeting implements GreetingStrategy {
//    @Override
//    public void greet(String name) {
//        System.out.println("Здравствуйте, " + name + ".");
//    }
//}

// Класс, использующий стратегию
//class Greeter {
//    private GreetingStrategy strategy;
//
//    // Устанавливаем стратегию
//    public void setStrategy(GreetingStrategy strategy) {
//        this.strategy = strategy;
//    }
//
//    // Делегируем приветствие выбранной стратегии
//    public void greet(String name) {
//        if (strategy != null) {
//            strategy.greet(name);
//        } else {
//            System.out.println("Стратегия приветствия не установлена");
//        }
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        Greeter greeter = new Greeter();
//
//        // Сначала используем дружелюбную стратегию
//        greeter.setStrategy(new FriendlyGreeting());
//        greeter.greet("Вася");
//
//        // Затем переключаемся на формальную стратегию
//        greeter.setStrategy(new FormalGreeting());
//        greeter.greet("Вася");
//    }
//}
