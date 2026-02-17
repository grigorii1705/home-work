public class StoreCashier {
    // Статический метод для расчета и вывода стоимости
    public static void calculateAndShowCost(int firstItemPrice, int secondItemPrice) {
        int total = firstItemPrice + secondItemPrice;
        System.out.println("Общая стоимость покупки: " + total);
    }
}
