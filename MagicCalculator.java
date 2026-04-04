class MagicCalculator {

    // Публичный метод
    public int addNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;

        // Внутренний вызов приватного метода
        displayInternalResult(result);

        return result;
    }

    // Приватный метод (доступен только внутри класса)
    private void displayInternalResult(int calculationResult) {
        System.out.println("Внутренний результат: " + calculationResult);
    }
}
