package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise9 {
    public static void main(String[] args) {

        String text;
        char x;
        String y = "";

        Scanner scanner = new Scanner (System.in);
        text = scanner.nextLine();

        for (int i = (text.length()-1); i>=0; i--){
            y += text.charAt(i);
        }
        System.out.print(y);
    }
}
