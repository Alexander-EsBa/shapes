import java.util.Arrays;

public class Geometry {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[15];
        for (int i = 0; i < shapes.length; i++) {
            if (i % 3 == 0) {
                shapes[i] = new Circle(Math.random() * 10);
            } else if (i % 3 == 1) {
                shapes[i] = new Rectangle(Math.random() * 10, Math.random() * 10);
            } else {
                shapes[i] = new Triangle(Math.random() * 10, Math.random() * 10);
            }
        }
        Arrays.sort(shapes);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
