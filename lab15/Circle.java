public class Circle {
    // John Stanley Altonaga Lab 15
    private MyPoint center;
    private double radius;

    // default constructor
    public Circle() {
        center = new MyPoint();
        radius = 1.0;
    }

    // parameterized constructor
    public Circle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // parameterized constructor
    public Circle(int x, int y, double radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // setter to set center
    public void setCenter(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    // setter to set center
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    // setter to set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // getter to return center
    public MyPoint getCenter() {
        return this.center;
    }

    // getter to return radius
    public double getRadius() {
        return this.radius;
    }

    // override toString() method
    public String toString() {
        return "Center: " + this.center + ", Radius: " + this.radius;
    }

    // override equals() method
    public boolean equals(Object obj) {
        // check if obj is an instance of Circle class
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.center.equals(c.center) && this.radius == c.radius;
        }
        // else
        return false;
    }

    // method to calculate area
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}