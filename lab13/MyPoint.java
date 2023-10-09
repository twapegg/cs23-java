public class MyPoint {
    // John Stanley Altonaga Lab 13
    private int x, y;

    // default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // parameterized constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // setter to set x
    public void setX(int x) {
        this.x = x;
    }

    // setter to set y
    public void setY(int y) {
        this.y = y;
    }

    // getter to return x
    public int getX() {
        return this.x;
    }

    // getter to return y
    public int getY() {
        return this.y;
    }

    // override toString() method
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    // override equals() method
    public boolean equals(Object obj) {
        // check if obj is an instance of MyPoint class
        if (obj instanceof MyPoint) {
            MyPoint p = (MyPoint) obj;
            return this.x == p.x && this.y == p.y;
        }
        // else
        return false;
    }
}