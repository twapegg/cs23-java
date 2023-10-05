class AltonagaLab10 {
    // class Rectangle
    private double length = 1;
    private double width = 1;

    // getter for length
    public double getLength() {
        return length;
    }

    // getter for width
    public double getWidth() {
        return width;
    }

    // setter that verifies if length is greater than or equal to 0.0 and less than
    // 20.0
    public void setLength(double l) {
        if (l >= 0.0 && l < 20.0) {
            length = l;
        } else {
            System.out.println("Invalid value");
        }
    }

    // setter that verifies if width is greater than or equal to 0.0 and less than
    // 20.0
    public void setWidth(double w) {
        if (w >= 0.0 && w < 20.0) {
            width = w;
        } else {
            System.out.println("Invalid value");
        }
    }

    // calculates the area of the rectangle
    public double getArea() {
        return length * width;
    }

    // calculates the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }
}