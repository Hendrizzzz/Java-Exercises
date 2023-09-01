package NesoAcademy;
import java.util.Scanner;
public class LoopsInJavaExercise14 {
    public static void main(String[] args) {

        int userInput;
        int i;
        int j;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = scanner.nextInt();

        for (i = 1; i <= userInput; i++){
            for (j = 1; j <= userInput; j++){
                if (i == 1||i == userInput){
                    System.out.print("*");
                }
                else{
                    if (j == 1 || j == userInput){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
