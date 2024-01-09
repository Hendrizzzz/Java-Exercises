package OOP.Abstraction.Shape;

public class Triangle extends Shape{

    private final double base;
    private final double height;


    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    protected double calculateArea(){
        return (base * height)/2;
    }

    @Override
    protected double calculatePerimeter(){
        return Math.sqrt((height * height) + (base/2 + base/2));
    }
}
