package OOP.Exercises.Person;

/*
Write a Java program to create a class called "Person" with a name
and age attribute. Create two instances of the "Person" class, set
their attributes using the constructor, and print their name and age.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){

        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))){
            Person person = getPerson(buffer);

            System.out.println("Hi " + person.getName() + ", you are " + person.getAge() + " years old! ");
        } catch (IOException e){
            System.out.println("An error occurred while closing the BufferedReader " + e.getMessage());
        }
    }

    private static Person getPerson(BufferedReader buffer) {
        String name = getName(buffer);
        int age = getAge(buffer);
        return new Person(name, age);
    }

    private static int getAge(BufferedReader buffer) {
        while(true){
            try{
                System.out.print("What is your age? ");
                int age = Integer.parseInt(buffer.readLine());

                if(age > 0) return age;
                else System.out.println("Invalid input. Please enter a valid age. ");
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter an integer. ");
            } catch (IOException e) {
                System.out.println("An error occurred while reading the age. ");
            }
        }
    }

    private static String getName(BufferedReader buffer) {
        while(true){
            try {
                System.out.print("What is your name? ");
                return buffer.readLine().trim();
            } catch (IOException e){
                System.out.println("An error occurred while reading the input. Please try again");
            }
        }
    }
}
