package Lesson_3;

public class SumSign {
    public static void checkSumSign() {
        int a = 5, b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
