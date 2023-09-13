package NesoAcademy;

import java.util.Arrays;

public class ArraysInJavaExercise5 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        // Separate even and odd numbers from the 'numbers' array
        int[] evenNumbers = getEvenNumbers(numbers);
        int[] oddNumbers = getOddNumbers(numbers);

        // Join even and odd numbers into a new array
        int[] newNumbers = joinEvenOddNum(evenNumbers, oddNumbers);

        // Display the original array and the new array
        displayNewNumbers(numbers, newNumbers);
    }

    // Method to get even numbers from the 'numbers' array
    private static int[] getEvenNumbers(int[] numbers) {
        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] evenNum = new int[count];
        int pos = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                evenNum[pos] = i;
                pos++;
            }
        }
        return evenNum;
    }

    // Method to get odd numbers from the 'numbers' array
    private static int[] getOddNumbers(int[] numbers) {
        int count = 0;
        for (int i : numbers) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] oddNum = new int[count];
        int pos = 0;
        for (int i : numbers) {
            if (i % 2 != 0) {
                oddNum[pos] = i;
                pos++;
            }
        }
        return oddNum;
    }

    // Method to join even and odd numbers into a new array
    private static int[] joinEvenOddNum(int[] evenNumbers, int[] oddNumbers) {
        int[] evenOddNum = new int[evenNumbers.length + oddNumbers.length];
        // Copy odd numbers first, then even numbers
        System.arraycopy(oddNumbers, 0, evenOddNum, 0, oddNumbers.length);
        System.arraycopy(evenNumbers, 0, evenOddNum, oddNumbers.length, evenNumbers.length);
        return evenOddNum;
    }

    // Method to display the original array and the new array
    private static void displayNewNumbers(int[] numbers, int[] newNumbers) {
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("New Array (Even and Odd Combined): " + Arrays.toString(newNumbers));
    }
}