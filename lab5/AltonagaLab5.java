class AltonagaLab5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            // If i is divisible by 3 and 5, print FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            // If i is divisible by 3, print Fizz
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            // If i is divisible by 5, print Buzz
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }

        return;
    }
}
