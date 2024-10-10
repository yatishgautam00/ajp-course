

/*
Question3. Write a program to declare two variables num and n and take an input during compilation
        time to check whether the nth bit of the given number is set (1) or not (0).
*/


import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Declare variables
        int num, n;

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        System.out.print("Enter the bit position to check (0-based index): ");
        n = scanner.nextInt();

        // Checking if nth bit is set
        if ((num & (1 << n)) != 0) {
            System.out.println("The " + n + "th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0).");
        }

    }
}
