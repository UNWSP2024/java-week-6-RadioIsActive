package src.JavaWeek6Programs;

import java.util.Scanner;

public class Random {
    static Scanner userinput = new Scanner(System.in); 
     public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] wordArray = new char[10];
     
        for(int i = 0; i < 10; i++){
        int randomIndex = (int) (Math.random()*alphabet.length());
        wordArray[i] = alphabet.charAt(randomIndex);
        }

        System.out.println("Word #1: " + new String(wordArray));

        for (int i = 2; i <= 20; i++) {
            int randomPosition = (int) (Math.random() * wordArray.length);
            int randomLetterIndex = (int) (Math.random() * alphabet.length());
            char newRandomLetter = alphabet.charAt(randomLetterIndex);
            wordArray[randomPosition] = newRandomLetter;
            
            System.out.println("Word #" + i + ": " + new String(wordArray));
        }

        userinput.close();
    }
}
