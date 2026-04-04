class ApplicationModule {

    // Статическое поле для хранения статуса модуля
    static String moduleStatusMessage;

    // Статический блок инициализации
    static {
        moduleStatusMessage = "Приложение: Главный модуль готов к работе!";
        System.out.println(moduleStatusMessage);
    }

    // Конструктор без вывода
    public ApplicationModule() {
        // Ничего не выводим здесь
    }
}
