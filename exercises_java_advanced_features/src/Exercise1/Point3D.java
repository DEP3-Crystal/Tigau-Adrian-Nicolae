package Exercise1;


//Using the Point2D class implement the Point3D class. It should extend the Point2D class. It should contain:
//        private float field: z
//        three-arguments constructor: float x , float y , float z
//        getter method which will be responsible for returning the z field value getXYZ method which will return x , y , z values as three-element array setter method which will be responsible for setting the z eld value setXYZ method which will be responsible for setting x , y , z
//        toString method which should return string in the following format: (x, y, z)
//        Please provide an example usage of above implementation.


public class Point3D extends Point2D {

    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float[] getXYZ() {

        return new float[]{x, y, z};
    }

    public void setXYZ(float x, float y, float z) {

        this.setXY(x, y);
        this.z = z;
    }


    @Override
    public String toString() {
        return String.format("(%f,%f,%f)", x, y, z);
    }

}

