package OOP.Abstraction.Shape;

public class Square extends Shape {
    private final double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    protected double calculateArea(){
        return side * side;
    }

    @Override
    protected double calculatePerimeter(){
        return side * 4;
    }
}
