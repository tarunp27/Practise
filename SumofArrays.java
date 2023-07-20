import java.util.Scanner;

public class SumofArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            System.out.println("Elemnt" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        int sum = sumOfArrays(array);

        System.out.println("The sum of Array element is: " + sum);
    }

    public static int sumOfArrays(int[] array) {
        int sum = 0;

        for (int x : array) {
            sum += x;
        }
        return sum;
    }
}
