class AltonagaLab1 {
    public static void main(String[] args) {

        int number;
        int total = 0;
        int largest = 0;
        int smallest = 0;
        int positive = 0;
        int negative = 0;
        int negativeCount = 0;
        int between = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            number = Input.readInt();

            // total
            total += number;

            if (i == 0) {
                largest = number;
                smallest = number;
            } else {
                // largest
                if (number > largest) {
                    largest = number;
                }

                // smallest
                if (number < smallest) {
                    smallest = number;
                }
            }

            // positive
            if (number > 0) {
                positive += number;
            }

            // negative
            if (number < 0) {
                negative += number;
            }

            // negative count
            if (number < 0) {
                negativeCount++;
            }

            // between
            if (number > 50 && number < 100) {
                between++;
            }

        }

        // print
        System.out.println("\nTotal: " + total);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Negative Count: " + negativeCount);
        System.out.println("Between 50 and 100: " + between);

    }
}
