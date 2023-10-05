class AltonagaLab7 {
    public static void main(String args[]) {
        int num;
        do {
            System.out.print("Enter an integer (11 - 99999999): ");
            num = Input.readInt();
            if (num < 0) {
                System.out.println("Exiting program...");
                break;
            }
            if (num < 11 || num > 99999999) {
                System.out.println("Invalid input. Please try again.");
                continue;
            } else {
                System.out.println("The reverse of " + num + " is " + getReverse(num));
                continue;
            }
        } while (true);

        return;
    }

    public static long getReverse(int num) {
        long reverse = 0;
        // Loop through each digit of num
        while (num != 0) {
            // Multiply reverse by 10 to shift the digits to the left
            reverse = reverse * 10;
            // Add the last digit of num to reverse
            reverse = reverse + num % 10;
            // Remove the last digit of num
            num = num / 10;
        }
        return reverse;
    }
}