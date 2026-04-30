class DemoResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}
