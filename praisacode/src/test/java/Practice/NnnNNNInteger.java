package Practice;

import java.util.Scanner;

public class NnnNNNInteger {

    //Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
    //Sample Output:
    //
    //Input number: 5
    //5 + 55  + 555

    public static void main(String[] args) {

        //%s - Take the next argument and print it as a string
        //%d - Take the next argument and print it as an int

        System.out.println("Input number: ");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }
}
