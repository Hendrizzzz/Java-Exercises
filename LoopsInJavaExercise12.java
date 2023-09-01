package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise12 {
    public static void main(String[] args) {

        int userNumber;
        int i;
        int j;
        String x = "";
        String asterisk = "*";
        String row = "";

        Scanner scanner = new Scanner (System.in);
        System.out.println("Give a number: ");
        userNumber = scanner.nextInt();

        for (i = 1; i <= userNumber; i++){
            for (j = i; j < userNumber; j++){
                x += (" ");
            }
            row = asterisk.repeat(i);
            System.out.println(x + row);
            x = "";
        }
        System.out.println("bye");

    }
}
