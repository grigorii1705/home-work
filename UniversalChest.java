class UniversalChest<T> {
    // Поле для хранения предмета
    private T item;

    // Помещаем предмет в сундук
    public void put(T item) {
        this.item = item;
    }

    // Извлекаем предмет из сундука
    public T take() {
        T temp = item;
        item = null; // "опустошаем" сундук
        return temp;
    }
}
