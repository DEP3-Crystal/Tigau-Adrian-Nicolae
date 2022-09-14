package Exercise3;

//Implement the Rectangle class. It should extend the Shape class.
//        Implementation should meet the below criteria:
//        information about the width and length value as a double type non-arguments constructor which will set: the color field value to unknown , the isFilled field value to false and the width and length field value to 1
//        four-arguments constructor: color , isFilled , width i length
//        getter methods which will be responsible for returning the width and length value
//        setter methods which will be responsible for setting the width and length value
//        getArea method which will be responsible for calculating the surface area
//        getPerimeter method which will be responsible for calculating the circuit
//        toString method which should return the following information:
//        Rectangle with width=? and length=? which is a subclass off y , where ? is a placeholder for the width and length value accordingly and the y info should be a result of the toString execution from the base class





public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        setColor("unknown");
        setFilled(false);
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return (width * length);
    }

    public double getParameter() {
        return (2 * width + 2 * length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length=%f which is a subclass of %s", width, length, super.toString());
    }
}
