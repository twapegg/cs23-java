
public abstract class AltonagaLab6 {
    public static void main(String[] args) {
        int num;

        do {
            System.out.print("Enter a positive integer: ");
            num = Input.readInt();

            if (num < 0) {
                System.out.println("Invalid input. Please try again.");
            } else if (num == 555) {
                // Exit the program if the user enters 555
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("The factorial of " + num + " is " + getFactorial(num));
            }
        } while (num != 555 || num < 0);

    }

    /*
     * function to calculate the factorial of a number
     * @params num: The number to calculate the factorial of
    */
    public static double getFactorial(int num) {

        if (num == 0) {
            return 1;
        } else {
            // Recursively call getFactorial() until num == 0
            return num * getFactorial(num - 1);
        }
    }

}
