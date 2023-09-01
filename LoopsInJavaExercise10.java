package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise10 {
    public static void main(String[] args) {

        String x = "";
        String userInput;
        boolean isPalindrome = true;

        Scanner scanner = new Scanner (System.in);
        userInput = scanner.nextLine();

        for (int i = userInput.length()-1; i >= 0; i--){
            x += userInput.charAt(i);
        }

        if (!userInput.equals(x)){;
            isPalindrome = false;
        }

        System.out.print(isPalindrome ? "Palindrome" : "Not a palindrome");
    }
}
