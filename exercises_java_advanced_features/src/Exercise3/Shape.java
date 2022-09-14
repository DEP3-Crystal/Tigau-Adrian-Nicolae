package Exercise3;

//Implement the Shape class. It should contain: color information
//        information if color should fill a shape
//        non-arguments constructor which will set: the color field to unknown and the isFilled field to false
//        two-arguments constructor: color , isFilled
//        getter methods which will be responsible for returning declared fields
//        setter methods which will be responsible for setting declared fields
//        toString method which should return the following information: Shape with color of ? and filled/NotFilled , where ? is a placeholder for the color and the filled / not filled info should be returned depending on the isFilled field



public class Shape {

    private String color;
    private boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s",color,isFilled ? "filled" : "NotFilled");

    }
}
