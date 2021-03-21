package Practice;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        System.out.println("Enter first variable");
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        System.out.println("Enter second variable");
        Scanner on = new Scanner(System.in);
        int y= on.nextInt();

        int z;

        z = x;
        x = y;
        y = z;

        System.out.println("The swapped value for x is "+x);
        System.out.println("The swapped value for y is "+y);

    }
}
