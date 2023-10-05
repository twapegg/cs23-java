class AltonagaLab2 {
    public static void main(String[] args) {
        double amount;
        int years;
        double interest = 0.10;
        double total = 0;

        // Ask and validate input (amount)
        do {
            System.out.print("Enter the amount you want to invest: ");
            amount = Input.readDouble();
            if (amount <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (amount <= 0);

        // Ask and validate input (years)
        do {
            System.out.print("Enter the number of years you want to invest: ");
            years = Input.readInt();
            if (years <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (years <= 0);

        // Calculate compound interest
        for (int i = 1; i <= years; i++) {
            // Math.pow is used to calculate the exponent
            total = amount * Math.pow(1 + interest, i);
            System.out.printf("Year %d: $%.2f\n", i, total);
        }

        System.out.printf("After %d years, you will have $%.2f.\n", years, total);
    }
}