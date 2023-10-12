public class MyLine {
    // John Stanley Altonaga Lab 14
    private MyPoint p1;
    private MyPoint p2;

    // default constructor
    public MyLine() {
        p1 = new MyPoint();
        p2 = new MyPoint();
    }

    // parameterized constructor
    public MyLine(MyPoint p1, MyPoint p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // parameterized constructor
    public MyLine(int x1, int y1, int x2, int y2) {
        p1 = new MyPoint(x1, y1);
        p2 = new MyPoint(x2, y2);
    }

    // getter to return p1
    public MyPoint getPoint1() {
        return p1;
    }

    // getter to return p2
    public MyPoint getPoint2() {
        return p2;
    }

    // function to calculate a line's distance
    public double distance() {
        /*
         * get the difference of the x coordinates
         * get the difference of the y coordinates
         * square the differences
         * add the squares
         * square root the sum
         */
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    // function to display the points of a line
    public void display() {
        System.out.println(p1 + " , " + p2);
    }
}
