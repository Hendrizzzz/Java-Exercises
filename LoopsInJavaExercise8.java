package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise8 {
    public static void main(String[] args) {

        String userInput;
        char a;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a word: ");
        userInput = scanner.nextLine();

        for (int i = 0; userInput.length() > i; i++){
            System.out.print((userInput.charAt(i) + " "));
        }
    }
}