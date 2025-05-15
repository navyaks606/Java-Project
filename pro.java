import java.util.HashMap;
import java.util.Scanner;

public class SimpleLoginSystem {

    public static void main(String[] args) {
        // Predefined usernames and passwords (can be replaced with file reading)
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("user1", "pass1");
        credentials.put("john", "john@123");

        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        System.out.println("=== Welcome to the Login System ===");

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Validate credentials
            if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
                System.out.println("Login successful! Welcome, " + username + ".");
                break;
            } else {
                attempts--;
                System.out.println("Invalid username or password. Attempts left: " + attempts);
                if (attempts == 0) {
                    System.out.println("Too many failed attempts. Access denied.");
                }
            }
        }

        scanner.close();
    }
}
