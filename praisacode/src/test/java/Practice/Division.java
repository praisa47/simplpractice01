package Practice;

import java.util.Scanner;

public class Division {

    //Write a Java program to divide two numbers and print on the screen. Go to the editor
    //Test Data :
    //50/3
    //Expected Output :
    //16

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner fNum = new Scanner(System.in);
        int First = fNum.nextInt();
        System.out.println("Enter the second number");
        Scanner sNum = new Scanner(System.in);
        int Second = sNum.nextInt();
        System.out.println("The divison of two number is: " + First / Second);

    }

}
