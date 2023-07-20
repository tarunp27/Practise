import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        long factorial = FindFactorial(number);

        System.out.println("The factorial is: " + factorial);
    }

    private static long FindFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}