class AltonagaLab9 {
    public static void main(String[] args) {

        double number;
        char choice;
        int power = 2; // Default power

        System.out.print("Enter a number: ");
        number = Input.readDouble();

        // Loop to check if user wants to enter power, trap invalid input
        do {
            System.out.print("Do you want to enter power (y/n)? ");
            choice = Input.readChar();

            if (choice == 'y' || choice == 'Y') {
                System.out.print("Enter the power to be raised: ");
                power = Input.readInt();
            }

            if (choice != 'y' && choice != 'n' && choice != 'Y' && choice != 'N') {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 'y' && choice != 'n' && choice != 'Y' && choice != 'N');

        System.out.printf("%.1f ^ %d (%.1f raised to the power of %d) = %.4f\n", number, power, number, power,
                getPower(number, power));
    }

    // Recursive method to calculate the power of a number
    public static double getPower(double n, int p) {
        // Base case
        if (p == 0) {
            return 1;
        }
        // Check if power is negative
        else if (p < 0) {
            return 1 / getPower(n, -p);
        }
        // Recursive case
        else {
            return n * getPower(n, p - 1);
        }
    }
}