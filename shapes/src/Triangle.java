public class Triangle extends Shape implements Comparable<Shape> {

    //Attributes
    private double base;

    private double height;

    //Constructors

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Getters and Setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Methods

    public double getArea() {
        return (base * height) / 2;
    }

    public int getSideCount() {
        return 3;
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
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + this.getArea() +
                ", sideCount=" + this.getSideCount() +
                '}';
    }

}
