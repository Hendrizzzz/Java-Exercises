package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise12{
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int userInput;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number: ");
        userInput = scanner.nextInt();

        for (i = 1; i <= userInput; i++){            //for the amount of lines

            for (j = 1; j <= userInput - i; j++){    //for the amount of spaces in each line
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++){               //for the amount of asterisk in each line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}