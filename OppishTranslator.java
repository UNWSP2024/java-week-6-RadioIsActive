package src.JavaWeek6Programs;

import java.util.Scanner;

public class OppishTranslator {
    static Scanner userinput = new Scanner(System.in); 
     public static void main(String[] args) {

        System.out.print("Enter a sentence in English: ");
        String sentence = userinput.nextLine();

        String translatedSentence = translateToOppish(sentence);
        System.out.println("Translated to Oppish: " + translatedSentence);
        userinput.close();
    }

    public static String translateToOppish(String s) {
        StringBuilder translated = new StringBuilder();
        String vowels = "aeiouyAEIOUY";

        int consonantCount = 0;

        for (int i = 0; i < s.length(); i++) {
            
            char currentChar = s.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (!vowels.contains(String.valueOf(currentChar))) {
                    translated.append(currentChar);
                    consonantCount++; 
                } else {
                    if (consonantCount > 0) {
                        translated.append("opp");
                        consonantCount = 0;  
                    }
                    translated.append(currentChar); 
                }
            } else if (currentChar == ' ') {
                if (consonantCount > 0) {
                    translated.append("opp");
                    consonantCount = 0;
                }
                translated.append('_');
            } else {
                translated.append(currentChar);
            }
        }

        if (consonantCount > 0) {
            translated.append("opp");
        
        }
            return translated.toString();

     }
}
