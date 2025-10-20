package Point;

public class TestPoint {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1.2f, 3.4f, 5.6f);
        System.out.println("Tọa độ Point3D: " + p3);

        p3.setXYZ(7.8f, 9.0f, 2.1f);
        System.out.println("Sau khi setXYZ: " + p3);
    }
}
