public class Rectangle extends Shape implements Comparable<Shape> {

    //Attributes

    private double height;

    private double width;

    //Constructors

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //Getters and Setters

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Methods

    public double getArea() {
        return height * width;
    }

    public int getSideCount() {
        return 4;
    }

    public int compareTo(Shape other) {
        double area = other.getArea();
        double thisArea = this.getArea();
        if (thisArea < area) {
            return -1;
        } else if (thisArea > area) {
            return 1;
        } else {
            return Integer.compare(this.getSideCount(), other.getSideCount());
        }
    }

    //toString

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + this.getArea() +
                ", sideCount=" + this.getSideCount() +
                '}';
    }

}
