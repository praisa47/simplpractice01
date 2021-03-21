package Practice;

import java.util.Scanner;

public class ReverseWord {

    //Write a Java program to reverse a word.

    //Input a word: dsaf
    //Reverse word: fasd
    public static void main(String[] args) {
        System.out.println("Input a word:");
        Scanner in = new Scanner(System.in);
        char[] str= in.nextLine().toCharArray();
        System.out.println("Reverse word: ");
        for (int i=str.length-1;i>=0;i--){
            System.out.print(str[i]);
        }
    }


}
