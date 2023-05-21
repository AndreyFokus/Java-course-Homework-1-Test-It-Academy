package Task5;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0},
                {4, 0, 0},
                {4, 4, 0}
        };

        boolean isLowerTriangular = true;

        int countZeros = 0;

        int digitCount = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                digitCount += 1;
            }
        }

        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    countZeros += 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    isLowerTriangular = false;
                    break;
                }
            }
            if (!isLowerTriangular) {
                break;
            }
        }

        if (isLowerTriangular == true && countZeros == digitCount) {
            System.out.println("Нулевая треугольная матрица");
        } else if (isLowerTriangular){
            System.out.println("Матрица является нижней треугольной");
        } else {
            System.out.println("Матрица не является нижней треугольной");
        }
    }
}