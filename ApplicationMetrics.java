class ApplicationMetrics {
    // Приватное статическое поле — общее для всего приложения
    private static int activeUserCount = 10;

    // Публичный статический геттер для доступа к private static полю
    public static int getActiveUserCount() {
        return activeUserCount;
    }
}
