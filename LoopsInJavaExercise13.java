package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise13 {
    public static void main(String[] args) {

        int i;
        int j;
        int k;
        int userInput;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a number");
        userInput = scanner.nextInt();

        for (i = 1; i <= userInput; i++){
            for (j = i; j <= userInput - 1; j++){          //first spaces for each line
                System.out.print(" ");
            }
            for (k = 1; k <= ((2*i)-1); k++ ){
                if (i == userInput){
                    System.out.print("*");
                }
                else if ((k == 1) || (k == ((2*i)-1))){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

