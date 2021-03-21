package Practice;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class TrueForSumofTwo {

    //Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    //Sample Output:
    //
    //Input the first number : 5
    //Input the second number: 10
    //Input the third number : 15
    //The result is: true

    public static void main(String[] args) {
        System.out.println("Input the first number :");
        Scanner first = new Scanner(System.in);
        int num1 =  first.nextInt();

        System.out.println("Input the second number :");
        Scanner second = new Scanner(System.in);
        int num2 =  second.nextInt();

        System.out.println("Input the third number :");
        Scanner third = new Scanner(System.in);
        int num3 =  third.nextInt();

        int sum = num1 + num2;
        if (sum == num3){
            System.out.println("The result is: true");
        }else {
            System.out.println("The result is : false");
        }
    }
}
