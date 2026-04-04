class StudentIdentityCard {
    private final String studentName;

    // Конструктор для инициализации final-поля
    public StudentIdentityCard(String initialName) {
        this.studentName = initialName;
    }

    // Геттер для доступа к имени студента
    public String getStudentName() {
        return studentName;
    }
}
