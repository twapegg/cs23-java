class Test {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(10, 30);
        MyPoint q = new MyPoint(10, 20);
        MyPoint r = new MyPoint(10, 20);

        System.out.println("MyPoint p: " + p); //
        System.out.println("MyPoint q: " + q);
        System.out.println("MyPoint r: " + r);

        System.out.println(p.equals(q) ? "p == q" : "p != q");
        System.out.println(q.equals(r) ? "q == r" : "q != r");

        q.setX(10);
        q.setY(30);

        System.out.println("MyPoint q: " + q);
        System.out.println(p.equals(q) ? "p == q" : "p != q");

        System.out.println("p.getX(): " + p.getX());
        System.out.println("p.getY(): " + p.getY());
    }
}