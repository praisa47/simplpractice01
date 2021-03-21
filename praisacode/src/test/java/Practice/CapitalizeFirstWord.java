package Practice;

import java.util.Scanner;

public class CapitalizeFirstWord {

    //Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor

    //Input a Sentence: the quick brown fox jumps over the lazy dog.
    //The Quick Brown Fox Jumps Over The Lazy Dog.

    public static void main(String[] args) {
        System.out.println("Input a Sentence");
        Scanner in = new Scanner(System.in);
        String str=in.nextLine().toLowerCase();
        System.out.println(str);
    }
}

