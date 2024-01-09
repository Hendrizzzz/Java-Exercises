package OOP.Abstraction.Shape;

public class Circle extends Shape{

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    protected double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    protected double calculatePerimeter() {
        return Math.PI * (2 * radius);
    }
}
