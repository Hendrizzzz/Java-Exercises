package NesoAcademy;

import java.util.Scanner;

public class LoopsInJavaExercise7 {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        int z = 0;
        int input;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number in the fibonacci sequence: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input < 0) {
                    scanner.nextLine();
                    continue;
                }
                break;
            }
            scanner.nextLine();
        }

        if (input == 1 || input == 2) {
            System.out.print("1");
        }
        else if (input == 0) {
            System.out.print("0");
        }
        else{
            for (int i = 3; input >= i; i++){
                z = x + y;
                x = y;
                y = z;
            }
            System.out.print(z);
        }
    }
}
