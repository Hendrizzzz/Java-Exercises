package NesoAcademy;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsInJavaExercise2 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        ArrayList<Integer> userArrayList = new ArrayList<>();

        do {
            int userChoice = getUserChoice(kbd);

            switch (userChoice) {
                case 1 -> add(userArrayList, kbd);
                case 2 -> remove(userArrayList, kbd);
                case 3 -> display(userArrayList, kbd);
                default -> {
                    System.out.print("Bye. ");
                    return;
                }
            }
        } while (true);
    }

    private static int getUserChoice(Scanner kbd) {
        do {
            int userChoice = 0;
            System.out.println("\n1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Your choice: ");

            if (kbd.hasNextInt()){
                userChoice = kbd.nextInt();
                if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4){
                    kbd.nextLine();
                    return userChoice;
                }
            }
            kbd.nextLine();
            System.out.println("Invalid input. Input your choice 1-4. ");
        } while (true);
    }

    private static void add(ArrayList<Integer> userArrayList, Scanner kbd){
        do {
            System.out.print("\n\nEnter an Integer: ");

            if (kbd.hasNextInt()){
                userArrayList.add(kbd.nextInt());
                System.out.println("Added.");
                kbd.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer. ");
                kbd.nextLine();
            }
        } while (true);
    }

    private static void remove(ArrayList<Integer> userArrayList, Scanner kbd){
        do {
            int integer;
            System.out.println("\n\nEnter an integer to be Removed: ");

            if (kbd.hasNextInt()){
                integer = kbd.nextInt();
                if (userArrayList.contains(integer)) {
                    int elementPos = getElementPos(userArrayList, integer);
                    userArrayList.remove(elementPos);
                    System.out.println("Removed. ");
                    kbd.nextLine();
                    break;
                }
                System.out.println("Not Found. ");
                break;
            } else {
                System.out.println("Invalid input. Please enter an Integer. ");
                kbd.nextLine();
            }
        } while (true);

    }


    private static void display(ArrayList<Integer> userArrayList, Scanner kbd){
        System.out.println(userArrayList);
    }

    private static int getElementPos(ArrayList<Integer> userArrayList, int integer) {
        int elementPos = 0;
        for (int i = 0; i < userArrayList.size(); i++){
            if (userArrayList.get(i) == integer){
                elementPos = i;
            }
        }
        return elementPos;
    }
}