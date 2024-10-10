//Question 2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.


import java.util.Scanner;

public class Question2 {

    private int numberFirst;
    private int numberSecond;

    private int maximum;
    public Question2(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question2 q2 = new Question2();

        //taking the input for both the numbers
        System.out.print("Please enter the first number: ");
        q2.numberFirst = sc.nextInt();
        System.out.print("Please enter the second number: ");
        q2.numberSecond = sc.nextInt();

        // using the Ternary Operator in java ,,, syntax:-- variable = (condition) ? expression1 : expression2
        q2.maximum = (q2.numberFirst>q2.numberSecond)? q2.numberFirst : q2.numberSecond;

        System.out.println("The maximum number finding by ternary opearator is: "+q2.maximum);

    }
}
