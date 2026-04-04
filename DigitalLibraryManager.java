class DigitalLibraryManager {

    // public — доступен всем
    public void announceOpening() {
        System.out.println("Библиотека открыта для посетителей!");
    }

    // protected — доступен в пакете и наследникам
    protected void conductStaffMeeting() {
        System.out.println("Проведено собрание персонала библиотеки.");
    }

    // package-private (без модификатора) — доступен только в пакете
    void manageBookInventory() {
        System.out.println("Инвентаризация книг завершена.");
    }

    // private — доступен только внутри класса
    private void handleFinancialAudits() {
        System.out.println("Финансовый аудит успешно завершен.");
    }
}
