package Exercise3;

public class Circle extends Shape {

    private double radius;


    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    public double getPerimeter() {

        return (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is subclass of %s", radius, super.toString());
    }
}
