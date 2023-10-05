            if (num < 0) {
                System.out.println("Exiting program...");
                break;
            }
            if (num < 11 || num > 99999999) {
                System.out.println("Invalid input. Please try again.");
            } else {
                System.out.println("The reverse of " + num + " is " + getReverse(num));
                continue;
            }