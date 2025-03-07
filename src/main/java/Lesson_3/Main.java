package Lesson_3;

import java.util.Arrays;

import static Lesson_3.Array.invertArray;
import static Lesson_3.Color.printColor;
import static Lesson_3.DiagonalMatrix.createDiagonalMatrix;
import static Lesson_3.FilledMatrix.createFilledArray;
import static Lesson_3.InRange.isSumInRange;
import static Lesson_3.ModifyArray.modifyArray;
import static Lesson_3.Multiple.printStringMultipleTimes;
import static Lesson_3.Negative.isNegative;
import static Lesson_3.PosOrNeg.printPositiveOrNegative;
import static Lesson_3.SequenceArray.createSequenceArray;
import static Lesson_3.SumSign.checkSumSign;
import static Lesson_3.ThreeWords.printThreeWords;
import static Lesson_3.TwoNumbers.compareNumbers;
import static Lesson_3.Year.isLeapYear;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        System.out.println(isSumInRange(5, 10)); // true
        printPositiveOrNegative(-3);
        System.out.println(isNegative(-5)); // true
        printStringMultipleTimes("Hello", 3);

        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(1900)); // false

        int[] binaryArray = {1, 1, 0, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        System.out.println(Arrays.toString(binaryArray));

        int[] sequenceArray = createSequenceArray(100);
        System.out.println(Arrays.toString(sequenceArray));

        int[] customArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArray(customArray);
        System.out.println(Arrays.toString(customArray));

        int[][] matrix = createDiagonalMatrix(5);
        printMatrix(matrix);

        int[] filledArray = createFilledArray(10, 7);
        System.out.println(Arrays.toString(filledArray));
    }

    private static void printMatrix(int[][] matrix) {
    }
}
