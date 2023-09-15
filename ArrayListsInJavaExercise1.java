/*
Create a list of unique elements taken from the user. Sort and print these elements without duplicate elements.
 */

package NesoAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListsInJavaExercise1 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        ArrayList<Integer> userArrList = getArrayList(kbd);
        sortArrayLis(userArrList);
        displaySortedArrayList(userArrList);
    }

    private static ArrayList<Integer> getArrayList(Scanner kbd) {
        ArrayList<Integer> userNumbers = new ArrayList<>();
        int size;
        do {
            System.out.print("Enter how many numbers: ");
            if (kbd.hasNextInt()){
                size = kbd.nextInt();
                if (size > 0) {
                    kbd.nextLine();
                    break;
                }
            }
            System.out.println("\nInvali    d input. Please Enter a valid quantity. ");
            kbd.nextLine();
        } while (true); //loop until kbd reads a valid array size

        System.out.println(); //To add some space

        int i;
        for (i = 1; i <= size; i++){
            System.out.print("Enter integer " + i + ": ");
            if (kbd.hasNextInt()) {
                int num = kbd.nextInt();
                if (!userNumbers.contains(num)) {
                    userNumbers.add(num);
                }
                kbd.nextLine();
                continue;
            }
            System.out.println("\nInvalid input. Please Enter a valid quantity. \n");
            kbd.nextLine();
            i--;
        }

        System.out.println(); //To add some space

        do {
            System.out.println("Do you want to add more? ");
            String userInput = kbd.nextLine();
            if (userInput.toLowerCase().trim().equals("no")){
                return userNumbers;
            } else if (userInput.toLowerCase().trim().equals("yes")) {
                System.out.print("Enter integer " + i++ + ": ");
                if (kbd.hasNextInt()) {
                    int num = kbd.nextInt();
                    if (!userNumbers.contains(num)) {
                        userNumbers.add(num);
                    }
                    System.out.println();
                    kbd.nextLine();
                    continue;
                }
                kbd.nextLine();
                System.out.println("\nInvalid input. Please enter an integer only. ");
                i--;
            }
        } while (true);
    }

    private static void sortArrayLis(ArrayList<Integer> userArrList) {
        Collections.sort(userArrList);
    }

    private static void displaySortedArrayList(ArrayList<Integer> userArrList) {
        System.out.println(userArrList);
    }
}
