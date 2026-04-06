class Library {

    // Метод добавления свитка (пока пустой)
    void addScroll(String scrollTitle) {
        // логика может быть добавлена позже
    }

    // Внутренний класс
    class Scroll {
        private String scrollTitle;

        // Конструктор
        Scroll(String scrollTitle) {
            this.scrollTitle = scrollTitle;
        }

        void revealTitle() {
            System.out.println(scrollTitle);
        }
    }
}

