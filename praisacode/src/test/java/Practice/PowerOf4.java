package Practice;

import java.util.Scanner;

public class PowerOf4 {
    //110. Write a Java program to check whether a given integer is a power of 4 or not.
    //Given num = 64, return true. Given num = 6, return false.
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner in = new Scanner(System.in);
        int four=in.nextInt();
        if (four%4==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
