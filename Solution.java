public class Solution {
    public static int calculateTotalGrades(int[] studentExamResults) {
        int total = 0;

        // Проходим циклом по всем элементам массива и суммируем их
        for (int grade : studentExamResults) {
            total += grade;
        }

        return total;
    }
}
