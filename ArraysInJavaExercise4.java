package NesoAcademy;

import java.util.Scanner;

public class ArraysInJavaExercise4 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in); //Creating a Scanner Object

        int arraySize = getValidArraySize(kbd); //Get the valid Array Length from the user

        int[] userArray = new int[arraySize]; //Create an Array with the size the user entered
        fillUserArray(userArray, kbd); //Fill the array
        int maxValue = getMaxValue(userArray); //Get the maximum element value of the array
        int minValue = getMinValue(userArray); //Get the minimum element value of the array
        printResult(maxValue, minValue); //Print the maximum and minimum value of the array
    }

    private static int getValidArraySize(Scanner kbd) {
        int arraySize;
        do {
            System.out.print("Array size? (1-20 only): \n-->> ");
            if (kbd.hasNextInt()){
                arraySize = kbd.nextInt();
                if (arraySize > 0 && arraySize < 21){
                    break;
                }
            }
            System.out.println("\nInvalid. Enter a number between 1-20 only. ");
            kbd.nextLine();
        } while (true); //Loop until the user entered a number between 1-20
        return arraySize;
    } //End of getting the arraySize

    private static void fillUserArray(int[] userArray, Scanner kbd){
        System.out.println();
        for (int i = 0; i < userArray.length; i++){ //Iterate all the element index and fill each by a number
            System.out.print("Enter the element " + (i+1) + ": ");
            userArray[i] = kbd.nextInt();
        }
    } //End of the FillUserArray method

    private static int getMaxValue(int[] userArray) {
        int max = Integer.MIN_VALUE;
        for (int i : userArray){ //Iterate all the elements to find the maximum value of the array
            if (i > max){
                max = i;
            }
        }
        return max;
    } //End of the GetMaxValue method

    private static int getMinValue(int[] userArray) {
        int min = Integer.MAX_VALUE;
        for (int i : userArray){ //Iterate all the elements to find the maximum value of the array
            if (i < min){
                min = i;
            }
        }
        return min;
    } //End of the GetMaxValue method

    private static void printResult(int maxValue, int minValue) {
        System.out.println("\nThe maximum value is " + maxValue);
        System.out.print("The minimum value is " + minValue);
    }
} //End of the program
