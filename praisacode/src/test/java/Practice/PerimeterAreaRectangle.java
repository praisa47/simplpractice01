package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PerimeterAreaRectangle {

    //Write a Java program to print the area and perimeter of a rectangle. Go to the editor
    //Test Data:
    //Width = 5.5 Height = 8.5
    //
    //Expected Output
    //Area is 5.6 * 8.5 = 47.60
    //Perimeter is 2 * (5.6 + 8.5) = 28.20

    public static void main(String[] args) {
        System.out.println("Enter the length");
        Scanner length= new Scanner(System.in);
        double l =length.nextDouble();
        System.out.println("Enter the breadth");
        Scanner breadth = new Scanner(System.in);
        double b = breadth.nextDouble();

        System.out.println("Test Data:");
        System.out.println("Width = "+l +" " + "Height = "+b);

        System.out.println("Area is " +l +" * " +b +" = "+(l*b));
        System.out.println("Perimeter is " +2 + " * " + "(" +l +" + " +b +")" + " = "+(2*(l+b)));


    }

}
