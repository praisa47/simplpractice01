package Practice;

import java.util.Scanner;

public class Multiple {
   //Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
    //Test Data:
    //Input first number: 25
    //Input second number: 5
    //Expected Output :
    //25 x 5 = 125

   public static void main(String[] args) {
       System.out.println("Enter the first number");
       Scanner fNum= new Scanner(System.in);
       int First=fNum.nextInt();
       System.out.println("Enter the second number");
       Scanner sNum= new Scanner(System.in);
       int Second= sNum.nextInt();
       System.out.println("The product is: "+(First*Second));


   }
}
