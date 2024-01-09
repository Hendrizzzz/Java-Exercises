package OOP.Abstraction.Shape;

public class Rectangle extends Shape{
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    protected double calculateArea(){
        return length * width;
    }

    @Override
    protected double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
}
