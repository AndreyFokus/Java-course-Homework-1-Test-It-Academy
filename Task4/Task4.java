package Task4;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    positive++;
                } else if (matrix[i][j] < 0) {
                    negative++;
                }
            }
        }

        if (positive > negative) {
            System.out.println("В массиве больше положительных чисел");
        } else if (positive < negative) {
            System.out.println("В массиве больше отрицательных чисел");
        } else {
            System.out.println("В массиве одинаковое количество положительных и отрицательных чисел");
        }
    }
}
