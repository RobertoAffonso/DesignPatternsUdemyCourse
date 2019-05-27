public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalc = new AreaCalculator();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.length = 20;

        Circle circle = new Circle();
        circle.radius = 20;

        System.out.println(areaCalc.calculateShapeArea(rectangle));
        System.out.println(areaCalc.calculateShapeArea(circle));
    }
}

class Rectangle implements Shape{
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        double area = (length * width);
        return area;
    }
}

class Circle implements Shape{
    public double radius;

    @Override
    public double calculateArea() {
        double area = (22/7) * radius * radius;
        return  area;
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape){
        return shape.calculateArea();
    }
}

interface Shape {
     double calculateArea();
}
