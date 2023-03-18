public class Circle extends Shape implements Comparable<Shape> {

    //Attributes

    private double radius;

    //Constructors

    public Circle(double radius) {
        this.radius = radius;
    }

    //Getters and Setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Methods
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getSideCount() {
        return 0;
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
        return "Circle{" +
                "radius=" + radius +
                ", area=" + this.getArea() +
                ", sideCount=" + this.getSideCount() +
                '}';
    }

}
