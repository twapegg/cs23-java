class AltonagaLab8 {
    public static void main(String[] args) {

        int num;
        char choice;

        do {
            System.out.print("Input a decimal number: ");
            num = Input.readInt();
            System.out.println(num + " in decimal is = to " + toBinary(num) + " in binary.");
            do {
                // Loop to trap invalid input for choice
                System.out.print("Try again? (y/n): ");
                choice = Input.readChar();
                if (choice == 'n' || choice == 'N') {
                    System.out.println("Exiting program...");
                    break;
                } else if (choice == 'y' || choice == 'Y') {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }
            } while (true);
        } while (choice == 'y' || choice == 'Y');
        return;
    }

    // Method to convert decimal to binary
    public static long toBinary(int num) {
        long binary = 0;
        int i = 1;
        while (num != 0) {
            // Add the last digit of num to binary
            binary = binary + (num % 2) * i;
            // Remove the last digit of num
            num = num / 2;
            // Multiply i by 10 to go to the next digit
            i = i * 10;
        }
        return binary;
    }
}
