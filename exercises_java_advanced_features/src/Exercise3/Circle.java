package Exercise3;

//Implement the Circle class. It should extend the Shape class. Implementation should meet the below criteria:
//        information about the radius value
//        non-arguments constructor which will set: the color field value to unknown , the isFilled field value to false and the radius field value to 1
//        three-arguments constructor: color , isFilled , radius
//        getter methods which will be responsible for returning the radius value setter methods which will be responsible for setting the radius value
//        getArea method which will be responsible for calculating the surface area
//        getPerimeter method which will be responsible for calculating the circuit
//        toString method which should return the following information: Circle with radius=? which is a subclass off y , where ? is a placeholder for the radius value and the y info should be a result of the toString execution from the base class


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
