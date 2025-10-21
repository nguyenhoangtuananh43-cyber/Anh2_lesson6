package TrienKhai;

import java.util.Random;

public class TestResizeablebe {
    public static void main(String[] args) {
        Random rand = new Random();

        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circlebe(5.0);
        shapes[1] = new Rectanglebe(4.0, 6.0);
        shapes[2] = new Squarbe(4.0);

        for (Resizeable shape : shapes) {
            double percent = 1 + rand.nextInt(100); // từ 1% - 100%
            System.out.println("----------------------------");
            System.out.println("Trước khi resize: " + shape);

            // Ép kiểu để in diện tích trước
            double oldArea = 0;
            if (shape instanceof Circlebe)
                oldArea = ((Circlebe) shape).getArea();
            else if (shape instanceof Rectanglebe)
                oldArea = ((Rectanglebe) shape).getArea();

            shape.resize(percent);

            double newArea = 0;
            if (shape instanceof Circlebe)
                newArea = ((Circlebe) shape).getArea();
            else if (shape instanceof Rectanglebe)
                newArea = ((Rectanglebe) shape).getArea();

            System.out.printf("Đã tăng kích thước thêm: %.0f%%\n", percent);
            System.out.printf("Diện tích trước: %.2f\n", oldArea);
            System.out.printf("Diện tích sau: %.2f\n", newArea);
        }
    }
}
