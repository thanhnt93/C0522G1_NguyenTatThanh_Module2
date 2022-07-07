package ss6_inheritance.exercise.point2d_and_point3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.2f,2.4f,3.9f);
        System.out.println(point3D);

        point3D.setXYZ(3.3f,5.7f,3.4f);
        float[] arr = point3D.getXYZ();
        System.out.println(Arrays.toString(arr));
        System.out.println(point3D);
    }
}
