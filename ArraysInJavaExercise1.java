package NesoAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJavaExercise1 {
    public static void main(String[] args) {

        int arrayLength;
        Scanner kbd = new Scanner(System.in);

        //Get an array length between 1-20 only
        arrayLength = getValidArrayLength(kbd);

        //Create an array with the length of the userInput
        int[] userArray = new int[arrayLength];

        //Fill the userArray
        fillUserArray(userArray, kbd);

        //Print the userArray
        printUserArray(userArray);
    }



    private static int getValidArrayLength(Scanner kbd) {
        int input;

        //prompts the user to enter the number of elements until a number between 1-20 is entered
        do {
            System.out.print("Enter the number of elements (Max: 20): ");
            if (kbd.hasNextInt()){
                input = kbd.nextInt();
                if (input > 0 && input < 21){
                    break;
                }
            }
            //consume invalid input
            kbd.nextLine();
        } while (true);

        return input;
    } //end of getValidArrayLength Method


    private static void fillUserArray(int[] userArray, Scanner kbd) {
        for (int i = 0; i < userArray.length; i++){
            System.out.print("\n\nEnter the element " + (i + 1) + ": ");
            userArray[i] = kbd.nextInt();
        }
    }


    private static void printUserArray(int[] userArray) {
        System.out.print("\n\nThe elements are: ");
        System.out.println(Arrays.toString(userArray));
    }
}