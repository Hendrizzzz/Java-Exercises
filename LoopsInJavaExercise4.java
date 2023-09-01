package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise4 {
    public static void main (String[]args) {

        int userInput;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a positive Integer: ");
            if (input.hasNextInt()) {
                userInput = input.nextInt();
                if (userInput < 0) {
                    input.nextLine();
                    continue;
                }
                else if ((userInput == 0)||(userInput == 1)){
                    System.out.print(userInput + " is not a Prime Integer");
                    input.nextLine();
                        break;
                    }
                    for (int i = 2; userInput > i; i++){
                        if (userInput % i == 0){
                            System.out.print(userInput + " is not a Prime Integer ");
                            break;
                        }
                        else if(userInput -1 == i){
                            System.out.print(userInput + " is a Prime Integer ");
                            break;
                        }
                    }
                    break;
                }
            else{
                input.nextLine();
            }
        }
    }
}
