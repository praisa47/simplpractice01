package Practice;

import java.util.Scanner;

public class IntegerParseInt {

    //Write a Java program to convert a string to an integer in Java. Go to the editor
    //Sample Output:
    //
    //Input a number(string): 25
    //The integer value is: 25

    public static void main(String[] args) {
        System.out.println("Input a number(string):");
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("The integer value is: " + num);
    }
}
