package OOP.Abstraction.Animal;

/*
Write a Java program to create an abstract class Animal with an abstract
method called sound(). Create subclasses Lion and Tiger that extend the
Animal class and implement the sound() method to make a specific sound for
each animal
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Animal[] animals = new Animal[3];
        int count = 0;
        int userChoice;

        while(count < 3) {
            try {
                System.out.println("""
                        What animal sound would you like to hear?
                        1. Lion
                        2. Dog
                        3. Cat
                        """);


                userChoice = Integer.parseInt(bufferedReader.readLine());

                switch (userChoice){
                    case 1 -> animals[count] = new Lion();
                    case 2 -> animals[count] = new Dog();
                    case 3 -> animals[count] = new Cat();
                    default -> {
                        System.out.println("Choice not found. Please try again");
                        count--;
                    }
                }

                count++;
            } catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter an integer. ");
            }
        }
        for(Animal a : animals){
            a.sound();
        }

    }
}
