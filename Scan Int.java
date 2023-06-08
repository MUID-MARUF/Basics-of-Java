import java.util.Scanner;

public class ScanAndPrintInt {

    public static void main(String[] args) {

        // Create a Scanner object to scan user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.println("Enter an integer: ");

        // Scan the user input as an integer
        int number = scanner.nextInt();

        // Print the scanned integer
        System.out.println("You entered: " + number);
    }
}