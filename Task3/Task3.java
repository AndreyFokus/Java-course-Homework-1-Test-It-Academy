package Task3;

public class Task3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив:");
        printArray(array);

        invertArray(array);

        System.out.println("Инвертированный массив:");
        printArray(array);
        System.out.println(array.length);
    }

    public static void invertArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int obmen = array[start];
            array[start] = array[end];
            array[end] = obmen;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}