
    import java.util.Scanner;
    public class usecase3 {
        public static void main(String[] args) {

            // Create Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Read string from user
            System.out.print("Enter a string: ");
            String original = scanner.nextLine();

            // Variable to store reversed string
            String reversed = "";

            // Reverse the string using for loop
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);   // String concatenation
            }

            // Compare original and reversed strings
            if (original.equals(reversed)) {
                System.out.println("The given string is a Palindrome.");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }

            scanner.close();
        }
    }


