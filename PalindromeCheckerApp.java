public class PalindromeCheckerApp {

   public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }

    }
}