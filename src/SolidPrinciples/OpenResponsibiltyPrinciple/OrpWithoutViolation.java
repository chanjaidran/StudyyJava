package SolidPrinciples.OpenResponsibiltyPrinciple;

public class OrpWithoutViolation {

    public static void main(String[] args) {

        Shape circle=new Circle(12);
        System.out.println(circle.calculateArea());
        AreaCalculator areaCalculator=new AreaCalculator();
        System.out.println(areaCalculator.calArea(circle));

    }
}


interface Shape
{
    double calculateArea();
}

class Circle implements Shape
{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}

class Rectangle implements Shape
{

    double length;
    double breadth;

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}

//Extension


class Triangle implements Shape
{
    //add logic

    @Override
    public double calculateArea() {
        return 0;
    }
}


class AreaCalculator
{
    public  double calArea(Shape shape)
    {
        return shape.calculateArea();
    }
}