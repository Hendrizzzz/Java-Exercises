package NesoAcademy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraysInJavaExercise3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int arrayLength = getValidArrayLength(kbd); // Get an array length between 1-20 only

        int[] userArray = new int[arrayLength]; // Create an array with the length entered by the user

        fillUserArray(userArray, kbd); // Fill the userArray

        Set<Integer> uniqueElements = findUniqueElements(userArray); // Find unique elements

        printOccurrencesOfEachElement(uniqueElements, userArray); // Display the occurrences of each element
    }

    private static int getValidArrayLength(Scanner kbd) {
        int input;

        // Prompts the user to enter the number of elements until a number between 1-20 is entered
        do {
            System.out.print("Enter the number of elements (Max: 20): ");
            if (kbd.hasNextInt()) {
                input = kbd.nextInt();
                if (input > 0 && input <= 20) {
                    break;
                }
            }
            // Consume invalid input
            kbd.nextLine();
        } while (true);

        return input;
    }

    private static void fillUserArray(int[] userArray, Scanner kbd) {
        for (int i = 0; i < userArray.length; i++) {
            System.out.print("\n\nEnter the element " + (i + 1) + ": ");
            userArray[i] = kbd.nextInt();
        }
    }

    private static Set<Integer> findUniqueElements(int[] userArray) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : userArray) {
            uniqueElements.add(num);
        }
        return uniqueElements;
    }

    private static void printOccurrencesOfEachElement(Set<Integer> uniqueElements, int[] userArray) {
        for (int element : uniqueElements) {
            int count = 0;
            for (int num : userArray) {
                if (element == num) {
                    count++;
                }
            }
            System.out.println(element + " occurred " + count + " times");
        }
    }
}