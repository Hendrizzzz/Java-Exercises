package OOP.Abstraction.Shape;

/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() 
and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and 
implement the respective methods to calculate the area and perimeter of each shape
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int calculator = getCalculator(bufferedReader);
            int shape = getShape(bufferedReader);

            if(calculator == 3) break;

            switch (shape)  {
                case 1 -> circleCalculator(calculator, bufferedReader);
                case 2 -> squareCalculator(calculator, bufferedReader);
                case 3 -> rectangleCalculator(calculator, bufferedReader);
                case 4 -> triangleCalculator(calculator, bufferedReader);
            }
        }

    }
    private static int getCalculator(BufferedReader bufferedReader) {
        while(true) {
            try {
                System.out.println("""
                        Choose a calculator:
                        1. Area calculator
                        2. Perimeter calculator
                        3. Exit
                        """);
                int userChoice = Integer.parseInt(bufferedReader.readLine());

                if (userChoice > 2 || userChoice < 1){
                    System.out.println("Choice not found. Please try again. ");
                    continue;
                }

                return userChoice;
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number. ");
            }catch (IOException e) {
                System.err.println("An error occurred while reading the input. Please try again. ");
            }
        }
    }

    private static int getShape(BufferedReader bufferedReader) {
        while(true){
            try{
                System.out.println("""
                        Choose a Shape:
                        1. Circle
                        2. Square
                        3. Rectangle
                        4. Triangle
                        """);
                int userChoice = Integer.parseInt(bufferedReader.readLine());

                if (userChoice > 4 || userChoice < 1){
                    System.out.println("Choice not found. Please try again. ");
                    continue;
                }

                return userChoice;
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number. ");
            } catch (IOException e) {
                System.err.println("An error occurred while reading the input. Please try again. ");
            }
        }
    }


    private static void circleCalculator(int calculator, BufferedReader bufferedReader) {
        double radius = getValidDimension("Radius", bufferedReader);
        Shape circle = new Circle(radius);

        if (calculator == 1) {
            System.out.println("The area of the circle is " + circle.calculateArea());
        } else System.out.println("The perimeter of the circle is " + circle.calculatePerimeter());
    }


    private static void squareCalculator(int calculator, BufferedReader bufferedReader) {
        double side = getValidDimension("Side", bufferedReader);
        Shape square = new Square(side);

        if (calculator == 1) {
            System.out.println("The area of the square is " + square.calculateArea());
        } else System.out.println("The perimeter of the square is " + square.calculatePerimeter());
    }

    private static void rectangleCalculator(int calculator, BufferedReader bufferedReader) {
        double length = getValidDimension("Length", bufferedReader);
        double width = getValidDimension("Width", bufferedReader);
        Shape rectangle= new Rectangle(length, width);

        if (calculator == 1) {
            System.out.println("The area of the rectangle is " + rectangle.calculateArea());
        } else System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimeter());
    }

    private static void triangleCalculator(int calculator, BufferedReader bufferedReader) {
        double base = getValidDimension("Base", bufferedReader);
        double height = getValidDimension("Height", bufferedReader);
        Shape triangle= new Triangle(base, height);

        if (calculator == 1) {
            System.out.println("The area of the triangle is " + triangle.calculateArea());
        } else System.out.println("The perimeter of the triangle is " + triangle.calculatePerimeter());
    }

    private static double getValidDimension(String dimensionString, BufferedReader bufferedReader) {
        while(true) {
            try {
                System.out.print(dimensionString + ": ");
                double dimension = Double.parseDouble(bufferedReader.readLine());
                if (dimension < 0) {
                    System.out.println("Invalid input. " + dimensionString + " cannot be negative. Please try again. ");
                    continue;
                }

                return dimension;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid " + dimensionString + ". ");
            } catch (IOException e) {
                System.err.println("An error occurred while reading the input. Please try again. ");
            }
        }
    }
}
