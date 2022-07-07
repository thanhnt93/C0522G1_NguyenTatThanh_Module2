package ss6_inheritance.exercise.point2d_and_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXY(float x, float y, float z) {
        this.y = y;
        this.x = x;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {x, y, z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{ " +
                "x=" + x +
                ", y=" + y +
                ", z=" + z + " }";
    }
}
