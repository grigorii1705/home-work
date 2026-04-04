class SchoolStudent {
    private int currentAge;

    // Конструктор для начальной установки возраста
    public SchoolStudent(int currentAge) {
        this.currentAge = currentAge;
    }

    // Геттер для возраста
    public int getCurrentAge() {
        return currentAge;
    }

    // Сеттер с проверкой на отрицательное значение
    public void setCurrentAge(int potentialAge) {
        if (potentialAge < 0) {
            System.out.println("Внимание! Возраст студента не может быть отрицательным. Значение не обновлено.");
        } else {
            this.currentAge = potentialAge;
        }
    }
}
