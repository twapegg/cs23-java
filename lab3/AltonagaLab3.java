class AltonagaLab3 {
    public static void main(String[] args) {
        int n;
        int first = 1;
        int second = 1;
        int next;

        // Ask and validate input (n)
        do {
            System.out.print("Enter a positive integer for N: ");
            n = Input.readInt();
            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (n <= 0);

        // Calculate and print the first n Fibonacci numbers
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        for (int i = 1; i <= n; i++) {
            // Print 1 for the first two numbers
            if (i <= 2) {
                System.out.print("1 ");
            } else {
                next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
        System.out.println();
    }
}