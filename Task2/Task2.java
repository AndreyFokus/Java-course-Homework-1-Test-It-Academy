package Task2;
public class Task2 {
    public static void main(String[] args) {
        int n = 34;

        int sum = 0;
        int num1 = 0;
        int num2 = 1;

        while (num2 <= n) {
            if (num2 % 2 == 0) {
                sum += num2;
            }

            int nextFib = num1 + num2;
            num1 = num2;
            num2 = nextFib;
        }

        System.out.println("Сумма четных чисел в последовательности Фибоначчи равна: " + sum);
    }
}