package Practice;

import java.util.Scanner;

public class Average {

    //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner input1 = new Scanner(System.in);
        int fNum=input1.nextInt();

        System.out.println("Enter number 2");
        Scanner input2 = new Scanner(System.in);
        int sNum=input2.nextInt();

        System.out.println("Enter number 3");
        Scanner input3 = new Scanner(System.in);
        int tNum=input3.nextInt();

        System.out.println("The average of 3 numbers are: "+ ((fNum+sNum+tNum)/3));

    }

}
