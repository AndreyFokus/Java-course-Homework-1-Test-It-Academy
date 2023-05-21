package Task1;

public class Task1 {

    public static int sum(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != n) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 3;
        int sum = sum(array, n);
        System.out.println("Сумма элементов массива без " + n + " равна: " + sum);
    }
}