package NesoAcademy;

import java.util.Scanner;

public class ArraysInJavaExercise3Pt2 {
    public static void main(String[] args) {

        int[] numbers = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9};   //The array
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1-9: ");     //Prompt to input for the element 1-9
        int element = input.nextInt();                  //Assign to the variable element

        checkOccurrencesOfElement(numbers, element);    //To check the occurrences of the element and display
    }

    private static void checkOccurrencesOfElement(int[] number, int element) {
        int count = 0;

        for(int i : number){
            if (element == i){
                count++;
            }
        }
        System.out.print(element + " occured " + count + " times");
    }
}
