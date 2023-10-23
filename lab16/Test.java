public class Test {
    public static void main(String arg[]) {
        Quadratic q1 = new Quadratic(3, -3, -2, "Q1");
        Quadratic q2 = new Quadratic(3, -3, -2, "Q2");

        System.out.println("Initial " + q2); // Q2: 3x^2 - 3x - 2
        q2 = q1.derivative();
        System.out.println("Q2 derivative of " + q2); // Q2': 6x - 3

        Quadratic q3 = new Quadratic(2, 3, 3, "Q3");
        System.out.println("Q3.getValue(2) = " + q3.getValue(2)); // 17
        System.out.println("Q1 == Q2? " + q1.equals(q2)); // false

        System.out.println("\nDiscriminant of Q2 is " + q2.discriminant()); // 9
        System.out.println("First Root of Q2 is " + q2.firstRoot()); // 0
        System.out.println("Second Root of Q2 is " + q2.secondRoot()); // 0.5
        System.out.println("Q2 is Imaginary? " + q2.isImaginary()); // false
        System.out.println("Q2 is Perfect Square? " + q2.isPerfectSquare()); // false

        System.out.println("\nDiscriminant of Q3 is " + q3.discriminant()); // -15
        System.out.println("First Root of Q3 is " + q3.firstRoot()); // -1.5
        System.out.println("Second Root of Q3 is " + q3.secondRoot()); // -1
        System.out.println("Q3 is Imaginary? " + q3.isImaginary()); // true
        System.out.println("Q3 is Perfect Square? " + q3.isPerfectSquare()); // false
        System.out.println(q3); // Q3: 2x^2 + 3x + 3

        q1.addQuadratic(q2);
        System.out.println("\nValue of Q1 after adding Q2");
        System.out.println(q1);

        q1.subtractQuadratic(q2);
        System.out.println("\nValue of Q1 after subtracting Q2");
        System.out.println(q1);

    }
}
