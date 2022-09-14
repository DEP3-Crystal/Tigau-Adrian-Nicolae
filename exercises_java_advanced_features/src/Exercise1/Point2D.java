package Exercise1;

//Implement the Point2D class. It should contain:
//        two float fields : x , y
//        non-arguments constructor which will set x , y fields to 0
//        two-arguments constructor: float x , float y
//        getter methods which will be responsible for returning x , y fields values
//        getXY method which will return x , y values as two-element array
//        setter methods which will be responsible for setting x , y fields values
//        setXY method which will be responsible for setting x and y
//        toString method which should return string in the following format: (x,y)

public class Point2D {

    protected float x, y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {

        return new float[]{x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }


}

