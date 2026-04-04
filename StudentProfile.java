class StudentProfile {
    private int studentAge;

    // Конструктор для инициализации возраста
    public StudentProfile(int studentAge) {
        this.studentAge = studentAge;
    }

    // Геттер для возраста
    public int getStudentAge() {
        return studentAge;
    }

    // Сеттер для возраста
    public void setStudentAge(int newAge) {
        this.studentAge = newAge;
    }
}
