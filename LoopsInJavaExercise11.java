package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise11 {
    public static void main(String[] args) {

        int number;
        int i;
        int j;
        int x;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Give me a number: ");
        number = scanner.nextInt();

        for (i = 1; i <= number; i++){
            for (j = number - i; j < number; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

