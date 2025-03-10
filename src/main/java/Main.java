package Lesson_8;

// Исключение для некорректного размера массива
class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Исключение для некорректных данных в массиве
class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "a", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        processAndPrint(validArray);
        processAndPrint(invalidSizeArray);
        processAndPrint(invalidDataArray);

        // Код для генерации и отлова ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[5];
            System.out.println(array[10]); // Нарушение границы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Выход за границы массива!");
        }
    }

    private static void processAndPrint(String[][] array) {
        try {
            System.out.println("Сумма элементов: " + processArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int processArray(String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4!");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Ошибка в ячейке [%d][%d]: %s", i, j, array[i][j]));
                }
            }
        }
        return sum;
    }
}
