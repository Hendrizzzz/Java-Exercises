package NesoAcademy;

import java.awt.*;
import java.util.Scanner;

public class ArraysInJavaExercise1Pt2{
    public static void main(String[] args) {

        int arrayLength;
        Scanner kbd = new Scanner(System.in);

        //Get an array length between 1-20 only
        arrayLength = getValidArrayLength(kbd);

        //Create an array with the length of the userInput
        Point[] userPoint = new Point[arrayLength];

        //Fill the userPoint
        fillUserArray(userPoint, kbd);

        //Print the userPoint
        printUserArray(userPoint);
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


    private static void fillUserArray(Point[] userPoint, Scanner kbd) {
        for (int i = 0; i < userPoint.length; i++){
            System.out.println("\n\nEnter the x and y for point " + (i + 1) + ": ");
            userPoint[i] = new Point (kbd.nextInt(), kbd.nextInt());
        }
    }


    private static void printUserArray(Point[] userPoint) {
        System.out.println("\n\nThe elements are: ");
        for (Point point : userPoint) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }
    }
}