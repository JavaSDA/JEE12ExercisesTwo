package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class VowelCountMod {
    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for how many words they want to enter:
        System.out.print("Enter a string or sentence: ");
        // Create a String to put into the method.
//        String words = scanner.nextLine();

        System.out.println(Arrays.toString(vowelCount(scanner.nextLine())));

    }

    public static int[] vowelCount(String sentence) {
        // Initialize an empty int array to
        // hold the number of vowels occurring in each
        // sentence
        int[] noOfOccurrences = {0, 0, 0, 0, 0};
        char[] characters = sentence.toLowerCase().toCharArray();

        // Loop through the array and compare each
        // character with the five vowels.
        for (char character : characters) {
            switch (character) {
                case 'a':
                    noOfOccurrences[0]++;
                    break;
                case 'e':
                    noOfOccurrences[1]++;
                    break;
                case 'i':
                    noOfOccurrences[2]++;
                    break;
                case 'o':
                    noOfOccurrences[3]++;
                    break;
                case 'u':
                    noOfOccurrences[4]++;
                    break;
                default:
                    break;
            }
        }
        return noOfOccurrences;
    }
}
