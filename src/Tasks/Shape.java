package Tasks;

import java.awt.geom.Area;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code
     */
    void calculateArea(double a);
    void calculatePerimeter(double a);
}

class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        System.out.println("The area of circle is "+(Math.PI*radius*radius));
    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("The perimeter of circle is "+(2*Math.PI*radius));
    }
}


class Square implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println("The area of square is "+(a*a));
    }

    @Override
    public void calculatePerimeter(double a) {
        System.out.println("The perimeter of square is "+(4*a));
    }
}
class TestShape{
    public static void main(String[] args) {


    Shape circle=new Circle();
    circle.calculateArea(5);
    circle.calculatePerimeter(5);

    Shape square=new Square();
    square.calculateArea(5);
    square.calculatePerimeter(5);
}}