class Altonagalab4 {
    public static void main(String[] args) {

        String reverse = "";
        do {
            String s = "";
            reverse = "";
            int length = 0;
            int i = 0;
            char c;
            System.out.println("Enter a string: ");
            s = Input.readString();
            length = s.length();

            while (i < length) {
                // get character at index i
                c = s.charAt(i);
                // add character to reverse
                reverse = c + reverse;
                i++;
            }
            System.out.println("Reversed string: " + reverse);
            if (reverse.equals("quit")) {
                System.out.println("Exiting program...");
                break;
            }
        } while (reverse.equals("quit"));
        return;
    }
}