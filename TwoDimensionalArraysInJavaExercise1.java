/*
Write a program that prints the sum of each row in a 2d Array
 */

package NesoAcademy;

import java.util.Arrays;

public class TwoDimensionalArraysInJavaExercise1 {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3,4,5},
                {6,7,8,9},
                {10,20},
                {5,10,15,20,25}};

        printSumOfRows(numbers);
    }

    private static void printSumOfRows(int[][] numbers) {
        int rowPos = 0;
        for (int[] row : numbers){
            int sum = 0;
            for (int elements : row){
                sum += elements;
            }
            rowPos++;
            System.out.println("The sum of row " + rowPos + ": " + sum);
        }
    }
}
