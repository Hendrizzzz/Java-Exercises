package NesoAcademy;

public class ArraysInJavaExercise2 {
    public static void main(String[] args) {

        int[] numbers = {10,1,2,3,5,7};

        int sum = calculateSumOfNumbers(numbers);
        int product = calculateProductOfNumbers(numbers);
        double average = calculateAverageOfNumbers(numbers);

        printResults(sum, average, product);
    }


    private static int calculateSumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum;
    }

    private static int calculateProductOfNumbers(int[] numbers) {
        int product = 1;
        for (int num : numbers){
            product *= num;
        }
        return product;
    }

    private static double calculateAverageOfNumbers(int[] numbers) {
        double sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum/(numbers.length - 1);
    }

    private static void printResults(int sum, double average, int product) {
        System.out.println("\nThe sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + average);
        System.out.print("The product of the numbers is " + product);
    }
}
