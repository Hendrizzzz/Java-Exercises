package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise3 {
    public static void main (String[]args){

        int number;
        int sumOfStrictDivisors = 0;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number ");
        number = input.nextInt();

        for (int i = 1; number >= i; i++ ){
            if (number % i == 0) {
                System.out.print(i + " ");
                sumOfStrictDivisors += i;
            }
        }
        System.out.printf("%n" + sumOfStrictDivisors);
    }
}