package baitap02;

public class Point3D extends Point2D {
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{
                getX(),
                getY(),
                getZ()
        };
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        super.setXY(x, y);
    }

    @Override
    public String toString() {
        return "(x, y, z) = "+"("+getX()+", "+getY()+", "+getZ()+")";
    }
}
