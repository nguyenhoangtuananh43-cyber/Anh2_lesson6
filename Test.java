package LopTron;

public class Test {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.5, "blue");
        System.out.println(c1);

        Cylinder cy1 = new Cylinder(2.5, 5.0, "green");
        System.out.println(cy1);


        System.out.println("Thể tích hình trụ: " + cy1.getVolume());
    }
}