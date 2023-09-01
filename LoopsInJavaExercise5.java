package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise5 {
    public static void main (String[]args){
        int x = 0;
        int max = x;
        int min = x;

        Scanner scanner = new Scanner (System.in);

        while (true){
            System.out.println("Enter a number: ");
            x = scanner.nextInt();

            if (x < 0){
                break;
            }
            if (x > max) {
                max = x;
            }
            if (x < min){
                min = x;
            }
        }
        System.out.println(max + " is the maximum ");
        System.out.print(min + " is the minimum ");
    }
}
