package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // we use a scanner to get user input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        if (PalindromeChecker.isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}