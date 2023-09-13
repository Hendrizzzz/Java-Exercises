/*
Write a program that prints the sum of each column in a 2d Array
 */

package NesoAcademy;

public class TwoDimensionalArraysInJavaExercise1Version2 {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {10,20,30,40,50},
                {5,10,15,20,25}};
        printSumOfColumns(numbers);
    }

    private static void printSumOfColumns(int[][] numbers) {
        for (int columns = 0; columns < numbers[0].length; columns++){
            int sum = 0;
            for (int[] row : numbers) {
                sum += row[columns];
            }
            System.out.print("The sum of column " + (columns + 1) + ": " + sum);
            System.out.println();
        }
    }
}
