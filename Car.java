class Car {
    String carModel = "Неизвестно";

    // Нестатический блок инициализации
    {
        System.out.println("Создаётся объект Car, model = " + carModel);
    }
}
