package Practice;

import java.util.Scanner;

public class SumTwoNumbers {

    //Write a Java program to print the sum of two numbers. Go to the editor
    //Test Data:
    //74 + 36
    //Expected Output :
    //110
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("The sum is: " +c);

        System.out.println("Enter the first number?");
        Scanner number=new Scanner(System.in);
        int add = number.nextInt();

        System.out.println("Enter the second number?");
        Scanner secondNumber=new Scanner(System.in);
        int add1= secondNumber.nextInt();
        System.out.println("The total is: "+(add+add1));
    }
}
