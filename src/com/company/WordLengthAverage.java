package com.company;

import java.util.Scanner;

public class WordLengthAverage {
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for how many words they want to enter:
        System.out.print("How many words?: ");
        // Create an array with the equivalent length
        String[] words = new String[scanner.nextInt()];

        // Populate the array with the user's input.
        for (int i = 0; i < words.length; i++) {
            // Prompt the user to enter a word
            System.out.print("Enter a word: ");
            words[i] = scanner.next();
        }

        System.out.println("The average length of the strings in the array is: "
                + averageLength(words));
    }

    public static float averageLength(String[] wordArray) {
        // Initialize sum variable to zero
        float sum = 0;

        // Loop through and add the length of the words together
        for (int i = 0; i < wordArray.length; i++) {
            sum += wordArray[i].length();
        }

        // return the average
        return sum / wordArray.length;
    }
}
