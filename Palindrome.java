public class Palindrome {
    public static void main(String[] args) {
        String original = "level", reverse = "";
        int len = original.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Enter number is a palindorme");
        } else {
            System.out.println("Entered number is not a palindrome");
        }
    }
}