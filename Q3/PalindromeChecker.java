package Q3;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase(); // simply cleaning the input to not get false results because of capitalization or unneeded characters

        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleanedInput.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }
}