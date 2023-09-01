package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise12{
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int userInput;
        String x = "";
        String y = "";

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number: ");
        userInput = scanner.nextInt();

        for (i = 1; i <= userInput; i++){            //for the amount of lines

            for (j = 1; j <= userInput - i; j++){    //for the amount of spaces in each line
                x += " ";
            }
            for (k = 1; k <= i; k++){
                y += "*";
            }
            System.out.print(x + y);
            System.out.println();
            x = ""; y = "";
        }
    }
}