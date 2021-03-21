package Practice;

import java.util.Scanner;

public class ReverseString {

    //Write a Java program to reverse a string. Go to the editor
    //Input Data:
    //Input a string: The quick brown fox
    //Expected Output
    //
    //Reverse string: xof nworb kciuq ehT

    public static void main(String[] args) {
        System.out.println("Enter a word or sentence");
        Scanner word = new Scanner(System.in);
        char[] word1 = word.nextLine().toCharArray();
        System.out.println("Reverse word or sentence is:");
        for (int i = word1.length-1; i >= 0; i--) {
            System.out.print(word1[i]);
        }
    }
}

