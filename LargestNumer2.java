public class LargestNumer2 {
    public static void main(String[] args) {
        findLargestAndSecondLargest(new int[] { 23, 4, 55, 6, 35, 82, 387, 2345, 77, 22 });
    }

    public static int[] findLargestAndSecondLargest(int[] nums) {
        if (nums.length < 2) {
            return new int[] { -1, -1 }; // Array doesn't have at least two elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = -1; // No second largest element found
        }

        return new int[] { largest, secondLargest };
    }
}
