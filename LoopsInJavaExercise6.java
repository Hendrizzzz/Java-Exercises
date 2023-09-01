package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise6 {
    public static void main(String[]args) {

        //declaring variables
        String number;
        int digit;
        int sumOfDigits = 0;


        //creating a scanner method named 'scanner'
        Scanner scanner = new Scanner (System.in);

        //getting the number
        System.out.println("Enter a number: ");
        number = scanner.nextLine();

        int i;
        for (i = 0; number.length() > i; i++ ){
            char charDigit = number.charAt(i);
            int intDigit = Character.getNumericValue(charDigit);
            sumOfDigits += intDigit;
        }
        System.out.print("The sum of the digits of " + number + " is " + sumOfDigits + " ");
    }
}