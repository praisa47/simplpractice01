package Practice;

import java.util.Scanner;

public class TwoNumbers {

    //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
    //Test Data:
    //Input first number: 125
    //Input second number: 24
    //Expected Output :
    //125 + 24 = 149
    //125 - 24 = 101
    //125 x 24 = 3000
    //125 / 24 = 5
    //125 mod 24 = 5

    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner fNum = new Scanner(System.in);
        int First = fNum.nextInt();
        System.out.println("Enter second number");
        Scanner sNum= new Scanner(System.in);
        int Second = sNum.nextInt();
        System.out.println(First + " + " + Second + " = " +(First+Second));
        System.out.println(First + " - " + Second + " = " +(First-Second));
        System.out.println(First + " * " + Second + " = " +(First*Second));
        System.out.println(First + " / " + Second + " = " +(First/Second));
        System.out.println(First + " % " + Second + " = " +(First%Second));


    }
}
