public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = new int[] { 25, 2, 23, 77, 89, 54 };
        int max = arr[0];
        // int min = arr[0];
        int nextMax = 0;
        // max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    nextMax = arr[i];
                    arr[i] = arr[j];
                    arr[j] = nextMax;
                }
            }

        }

        System.out.println("The Second largest Number is:" + nextMax);
        System.out.println("The largest Number is:" + max);

        // min
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] < min) {
        // min = arr[j];
        // }
        // }
        // System.out.println(min);
    }

}
