class SmartLamp {
    private boolean isCurrentlyOn;

    // Конструктор — по умолчанию лампа выключена
    public SmartLamp() {
        this.isCurrentlyOn = false;
    }

    // Геттер для boolean-поля — по соглашению называется is<FieldName>()
    public boolean isCurrentlyOn() {
        return isCurrentlyOn;
    }

    // Сеттер для изменения состояния лампы
    public void setCurrentlyOn(boolean newState) {
        this.isCurrentlyOn = newState;
    }
}
