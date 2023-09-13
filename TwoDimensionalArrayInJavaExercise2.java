/*
Write a program that prints tha maximum element value of each row in a 2d array
 */

package NesoAcademy;

public class TwoDimensionalArrayInJavaExercise2 {
    public static void main(String[] args) {

        int[][] numbers = {
                {10,20,30,10},
                {2,4,6,10,3},
                {15,4,18,20},
                {-1, -10, 20}
        };

        printMaximumOfEachRow(numbers);
        }

    private static void printMaximumOfEachRow(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            int max = numbers[row][0];
            for (int column = 0; column < numbers[row].length; column++){
                max = Math.max(numbers[row][column], max); //Returns the bigger value of the two values
            }
            System.out.println("The maximum value of Row " + row + ": " + max);
        }
    }
}