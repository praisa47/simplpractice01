package Practice;

import java.util.Scanner;

public class PerimeterAreaCircle {
    //Write a Java program to print the area and perimeter of a circle. Go to the editor
    //Test Data:
    //Radius = 7.5
    //Expected Output
    //Perimeter is = 47.12388980384689
    //Area is = 176.71458676442586

    public static void main(String[] args) {

        //double pi=3.14;
        System.out.println("Enter the radius?");
        Scanner radius= new Scanner(System.in);
        double r =radius.nextDouble();
        System.out.println("Radius = "+r);
        System.out.println("Area is = "+(2 * r * Math.PI));
        System.out.println("Perimeter is = "+(Math.PI * r * r));

    }

}

