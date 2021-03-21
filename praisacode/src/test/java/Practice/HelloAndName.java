package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloAndName {
    //Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
    //Expected Output :
    //Hello
    //Alexandra Abramov

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Praisa Devbhandari");
        System.out.println("Hello\nPraisa Devbhandari!");

        System.out.println("What is you first name");
        Scanner fName= new Scanner(System.in);
        String firstname=fName.next();
        System.out.println("What is you last name");
        Scanner lName= new Scanner(System.in);
        String lastname= lName.next();

        System.out.println("Hello");
        System.out.print(firstname +" ");
        System.out.println(lastname);

    }

}
