class C implements A, B {

    @Override
    public void show() {
        A.super.show(); // вызываем метод из интерфейса A
        B.super.show(); // вызываем метод из интерфейса B
    }
}
