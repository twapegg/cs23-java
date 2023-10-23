public class Quadratic {
    // John Stanley Altonaga Lab 16

    private int a, b, c;
    private String name; // name of quadratic like Q1, Q2, etc.

    // parameterized constructor
    public Quadratic(int a, int b, int c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    // default constructor
    public Quadratic() {
        this(0, 0, 0, "Q");
    }

    // setter for a
    public void setA(int a) {
        this.a = a;
    }

    // setter for b
    public void setB(int b) {
        this.b = b;
    }

    // setter for c
    public void setC(int c) {
        this.c = c;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for a
    public int getA() {
        return a;
    }

    // getter for b
    public int getB() {
        return b;
    }

    // getter for c
    public int getC() {
        return c;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // method to calculate the discriminant
    public double discriminant() {
        return (b * b) - (4 * a * c);
    }

    // method to calculate the first root
    public double firstRoot() {
        return (-b + Math.sqrt(discriminant())) / (2 * a);
    }

    // method to calculate the second root
    public double secondRoot() {
        return (-b - Math.sqrt(discriminant())) / (2 * a);
    }

    // method to check if imaginary
    public boolean isImaginary() {
        return discriminant() < 0;
    }

    // method to check if perfect square
    public boolean isPerfectSquare() {
        return firstRoot() == secondRoot();
    }

    // method to add two quadratics
    public void addQuadratic(Quadratic q) {
        this.a += q.a;
        this.b += q.b;
        this.c += q.c;
    }

    // method to add two quadratics
    public void addQuadratic(Quadratic q1, Quadratic q2) {
        this.a = q1.a + q2.a;
        this.b = q1.b + q2.b;
        this.c = q1.c + q2.c;
    }

    // method to subtract two quadratics
    public void subtractQuadratic(Quadratic q) {
        this.a -= q.a;
        this.b -= q.b;
        this.c -= q.c;
    }

    // method to subtract two quadratics
    public void subtractQuadratic(Quadratic q1, Quadratic q2) {
        this.a = q1.a - q2.a;
        this.b = q1.b - q2.b;
        this.c = q1.c - q2.c;
    }

    // override toString method
    public String toString() {
        // if the value of either a,b,c is 0, then it will not be printed
        // if the value is 1, print only the variables

        String str = "";
        if (a != 0) {
            if (a == 1) {
                str += "x^2";
            } else {
                str += a + "x^2";
            }
        }

        if (b != 0) {
            if (b == 1) {
                str += " + x";
            } else if (b == -1) {
                str += " - x";
            } else {
                str += " + " + b + "x";
            }
        }

        if (c != 0) {
            if (c > 0) {
                str += " + " + c;
            } else {
                str += " - " + Math.abs(c);
            }
        }

        return name + ": " + str;
    }

    // override equals method
    public boolean equals(Object obj) {
        if (obj instanceof Quadratic) {
            Quadratic q = (Quadratic) obj;
            return this.a == q.a && this.b == q.b && this.c == q.c;
        }
        return false;
    }

    // method to return the derivative of the quadratic
    public Quadratic derivative() {
        Quadratic q = new Quadratic();
        q.a = 2 * a;
        q.b = b;
        q.c = 0;
        return q;
    }

    // method to return the value of the quadratic
    public int getValue(int x) {
        return (a * x * x) + (b * x) + c;
    }
}