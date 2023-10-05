class AltonagaLab10Test {
    public static void main(String[] args) {
        AltonagaLab10 r1 = new AltonagaLab10();
        AltonagaLab10 r2 = new AltonagaLab10();

        System.out.println(r1.getLength()); // outputs 1
        System.out.println(r1.getWidth()); // outputs 1
        System.out.println(r1.getArea()); // outputs 1
        System.out.println(r1.getPerimeter()); // outputs 4
        r2.setLength(20.0); // outputs "Invalid value"
        r2.setWidth(-1.0); // outputs "Invalid value"
        r2.setLength(2.0);
        r2.setWidth(1.0);

        System.out.println(r2.getArea()); // outputs 2
        System.out.println(r2.getPerimeter()); // outputs 6
        // r1.length = 5.0; // compile error
        // r1.width = 3.0; // compile error
    }
}