//// Абстрактный класс
////abstract class Task {
////    String title;
////
////    // Конструктор
////    public Task(String title) {
////        this.title = title;
////    }
////
////    // Абстрактный метод
////    abstract void complete();
////}
////
////// Конкретная задача
////class SimpleTask extends Task {
////
////    public SimpleTask(String title) {
////        super(title);
////    }
////
////    @Override
////    void complete() {
////        System.out.println("Задача '" + title + "' выполнена");
////    }
////}
//
//// Main-класс
////public class Solution {
////    public static void main(String[] args) {
////        Task task = new SimpleTask("Купить кофе");
////        task.complete();
////    }
////}
////import java.util.*;
////
////// Абстрактная задача
////abstract class Task {
////    String title;
////    boolean completed = false;
////
////    public Task(String title) {
////        this.title = title;
////    }
////
////    public String getTitle() {
////        return title;
////    }
////
////    public abstract void complete();
////
////    @Override
////    public String toString() {
////        return "Task{title='" + title + "', completed=" + completed + "}";
////    }
////}
////
////// Простая задача
////class SimpleTask extends Task {
////
////    public SimpleTask(String title) {
////        super(title);
////    }
////
////    @Override
////    public void complete() {
////        completed = true;
////        System.out.println("Задача '" + title + "' выполнена");
////    }
////}
////
////// Репозиторий (контракт)
////interface TaskRepository {
////    void save(Task task);
////    Task findByTitle(String title);
////}
////
////// Реализация репозитория в памяти
////class InMemoryTaskRepository implements TaskRepository {
////    private List<Task> tasks = new ArrayList<>();
////
////    @Override
////    public void save(Task task) {
////        tasks.add(task);
////    }
////
////    @Override
////    public Task findByTitle(String title) {
////        for (Task task : tasks) {
////            if (task.getTitle().equals(title)) {
////                return task;
////            }
////        }
////        return null;
////    }
////}
////
////// Сервис
////class TaskService {
////    private TaskRepository repository;
////
////    public TaskService(TaskRepository repository) {
////        this.repository = repository;
////    }
////
////    public void addTask(Task task) {
////        repository.save(task);
////    }
////
////    public void completeTask(String title) {
////        Task task = repository.findByTitle(title);
////        if (task != null) {
////            task.complete();
////        } else {
////            System.out.println("Задача не найдена");
////        }
////    }
////}
//
//// Main
////public class Solution {
////    public static void main(String[] args) {
////        TaskRepository repository = new InMemoryTaskRepository();
////        TaskService service = new TaskService(repository);
////
////        // ВАЖНО: используем конкретный класс, а не абстрактный Task
////        Task task = new SimpleTask("Написать демо для TaskService");
////
////        service.addTask(task);
////
////        System.out.println("До выполнения:  " + task);
////
////        service.completeTask("Написать демо для TaskService");
////
////        System.out.println("После выполнения: " + task);
////    }
////}
////import java.util.*;
////
////// ===================== МОДЕЛЬ =====================
////abstract class Task {
////    String title;
////    boolean completed = false;
////
////    public Task(String title) {
////        this.title = title;
////    }
////
////    public String getTitle() {
////        return title;
////    }
////
////    public abstract void complete();
////
////    @Override
////    public String toString() {
////        return "Task{title='" + title + "', completed=" + completed + "}";
////    }
////}
////
////// Конкретная реализация задачи
////class SimpleTask extends Task {
////
////    public SimpleTask(String title) {
////        super(title);
////    }
////
////    @Override
////    public void complete() {
////        completed = true;
////        System.out.println("Задача '" + title + "' выполнена");
////    }
////}
////
////// ===================== REPOSITORY =====================
////interface TaskRepository {
////    void save(Task task);
////    Task findByTitle(String title);
////}
////
////class InMemoryTaskRepository implements TaskRepository {
////    private List<Task> tasks = new ArrayList<>();
////
////    @Override
////    public void save(Task task) {
////        tasks.add(task);
////    }
////
////    @Override
////    public Task findByTitle(String title) {
////        for (Task task : tasks) {
////            if (task.getTitle().equals(title)) {
////                return task;
////            }
////        }
////        return null;
////    }
////}
////
////// ===================== SERVICE =====================
////class TaskService {
////    private TaskRepository repository;
////
////    public TaskService(TaskRepository repository) {
////        this.repository = repository;
////    }
////
////    public void addTask(Task task) {
////        repository.save(task);
////    }
////
////    public void completeTask(String title) {
////        Task task = repository.findByTitle(title);
////        if (task != null) {
////            task.complete();
////        } else {
////            System.out.println("Задача не найдена");
////        }
////    }
////}
////
////// ===================== UI =====================
////class UserInterface {
////    private TaskService service;
////
////    public UserInterface(TaskService service) {
////        this.service = service;
////    }
////
////    public void addAndCompleteTask(String title) {
////        Task task = new SimpleTask(title);
////
////        service.addTask(task);
////        service.completeTask(title);
////    }
////}
//
//// ===================== MAIN =====================
////public class Solution {
////    public static void main(String[] args) {
////        TaskRepository repository = new InMemoryTaskRepository();
////        TaskService service = new TaskService(repository);
////        UserInterface ui = new UserInterface(service);
////
////        ui.addAndCompleteTask("Выучить внедрение зависимостей через конструктор");
////    }
////}
//import java.util.ArrayList;
//import java.util.List;
//
//// Абстрактный класс Task
//abstract class Task {
//    protected String title;
//
//    public Task(String title) {
//        this.title = title;
//    }
//
//    public abstract void complete();
//
//    public String getTitle() {
//        return title;
//    }
//}
//
//// Рабочая задача
//class WorkTask extends Task {
//    private String deadline;
//
//    public WorkTask(String title, String deadline) {
//        super(title);
//        this.deadline = deadline;
//    }
//
//    @Override
//    public void complete() {
//        System.out.println("Рабочая задача '" + title + "' выполнена (срок: " + deadline + ")");
//    }
//
//    @Override
//    public String toString() {
//        return "WorkTask: " + title + ", дедлайн: " + deadline;
//    }
//}
//
//// Домашняя задача
//class HomeTask extends Task {
//    private String location;
//
//    public HomeTask(String title, String location) {
//        super(title);
//        this.location = location;
//    }
//
//    @Override
//    public void complete() {
//        System.out.println("Домашняя задача '" + title + "' выполнена (место: " + location + ")");
//    }
//
//    @Override
//    public String toString() {
//        return "HomeTask: " + title + ", место: " + location;
//    }
//}
//
//// Интерфейс репозитория
//interface TaskRepository {
//    void add(Task task);
//    List<Task> getAll();
//}
//
//// Реализация репозитория в памяти
//class InMemoryTaskRepository implements TaskRepository {
//    private List<Task> tasks = new ArrayList<>();
//
//    @Override
//    public void add(Task task) {
//        tasks.add(task);
//    }
//
//    @Override
//    public List<Task> getAll() {
//        return tasks;
//    }
//}
//
//// Сервис
//class TaskService {
//    private TaskRepository repository;
//
//    public TaskService(TaskRepository repository) {
//        this.repository = repository;
//    }
//
//    // Вывод всех задач
//    public void printAllTasksInfo() {
//        for (Task task : repository.getAll()) {
//            System.out.println(task);
//        }
//    }
//
//    // Выполнить все задачи
//    public void completeAllTasks() {
//        for (Task task : repository.getAll()) {
//            task.complete(); // полиморфизм
//        }
//    }
//}

// MAIN
//public class Solution {
//    public static void main(String[] args) {
//        TaskRepository repository = new InMemoryTaskRepository();
//
//        // Добавляем задачи разных типов
//        repository.add(new WorkTask("Подготовить отчёт", "пятница 18:00"));
//        repository.add(new HomeTask("Помыть посуду", "кухня"));
//
//        TaskService service = new TaskService(repository);
//
//        // Вывод информации
//        service.printAllTasksInfo();
//
//        System.out.println();
//
//        // Выполнение задач
//        service.completeAllTasks();
//    }
//}