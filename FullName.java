package src.JavaWeek6Programs;

import java.util.Scanner;

public class FullName {
    static Scanner userinput = new Scanner(System.in); 
     public static void main(String[] args) {

        String first;
        String middle;
        String last;
        String full;

        System.out.print("First name: ");
        first = userinput.nextLine();
        System.out.print("Middle name: ");
        middle = userinput.nextLine();
        System.out.print("Last name: ");
        last = userinput.nextLine();

        full = first + " " + middle + " " + last;

        System.out.println("\nWelcome, "+full+".");

        userinput.close();


     }
}
