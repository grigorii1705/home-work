import java.util.ArrayList;
import java.util.List;

// Контракт подписчика
//interface Subscriber {
//    void update(String news);
//}
//
//// Издатель новостей
//class NewsPublisher {
//    private List<Subscriber> subscribers = new ArrayList<>();
//
//    // Добавить подписчика
//    public void addSubscriber(Subscriber subscriber) {
//        subscribers.add(subscriber);
//    }
//
//    // Удалить подписчика
//    public void removeSubscriber(Subscriber subscriber) {
//        subscribers.remove(subscriber);
//    }
//
//    // Уведомить всех подписчиков
//    public void notifySubscribers(String news) {
//        for (Subscriber subscriber : subscribers) {
//            subscriber.update(news);
//        }
//    }
//}

// Конкретный подписчик
//class Person implements Subscriber {
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void update(String news) {
//        System.out.println(name + " получил новость: " + news);
//    }
//}

//public class Solution {
//    public static void main(String[] args) {
//        // Создаем издателя
//        NewsPublisher publisher = new NewsPublisher();
//
//        // Создаем подписчиков
//        Person andrey = new Person("Андрей");
//        Person boris = new Person("Борис");
//
//        // Подписываем их
//        publisher.addSubscriber(andrey);
//        publisher.addSubscriber(boris);
//
//        // Публикуем новость
//        publisher.notifySubscribers("Обновление курса Java!");
//    }
//}
