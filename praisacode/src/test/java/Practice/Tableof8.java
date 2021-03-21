package Practice;

import java.util.Scanner;

public class Tableof8 {

    //Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
    //Test Data:
    //Input a number: 8
    //Expected Output :
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 3 = 24
    //...
    //8 x 10 = 80

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The Multiple of " + n + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }


        //Scanner in = new Scanner(System.in);
        //  System.out.println("Input the Number: ");
        //  int n = in .nextInt();
        //  for (int i = 1; i <= 10; i++) {
        //   System.out.println(n + "*" + i + " = " + (n * i));
    }
}
