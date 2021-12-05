/*
 *  Assignment 6
 *  Description: Hex digit to decimal converter, Case Study 4.5.2
 *  Name: Rick
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class HexDigit2Dec {

    public static void main(String[] args) {

        // Declare object for input.
        Scanner input = new Scanner(System.in);

        // Display prompt for hex digit.
        System.out.print("Enter a hex digit: ");

        // Process input for hex var.
        String hexString = input.nextLine();

    // Check if var is just one character
    if (hexString.length() != 1) {

        // Display prompt if user entered digits longer than one character.
        System.out.println("You must enter exactly one character.");

        // Exit if more than one character.
        System.exit(1);
     }

    // Set character to uppercase, no matter what case it is.
    char ch = Character.toUpperCase(hexString.charAt(0));

    // Check if character falls within range of hexadecimal characters.
    if ('A' <= ch && ch <= 'F') {

        // Convert character from hex to int value.
        int value = ch - 'A' + 10;

        // Display the inital character and its hex value.
        System.out.println("The decimal value for hex digit "
                + ch + " is " + value);
   }

        // If not in the letter hex range, process number.
        else if (Character.isDigit(ch)){

        // Display entered character which was a number.
        System.out.println("The decimal value for hex digit" + ch + " is " + ch);
    }
        // Print error if not within 0-F hex range.
        else {

        // Display error message.
        System.out.println(ch + " is an invalid input.");
         }
    }
}

