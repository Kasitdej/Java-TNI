import javax.swing.*;
import java.util.Scanner;
public class Lab401 {
    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog("Enter your full name:");

            if (input == null) return;

            input = input.trim();

            if (!input.contains(" ")) {
                JOptionPane.showMessageDialog(null,
                        "Invalid format. Please enter: [FirstName] [LastName]");
                continue;
            }

            String[] parts = input.split("\\s+", 2);

            String first = parts[0];
            String last = parts[1];

            String formatf = first.substring(0, 1).toUpperCase()
                    + (first.length() > 1 ? first.substring(1).toLowerCase() : "");

            String formatl = last.toUpperCase();

            JOptionPane.showMessageDialog(null,
                    "Welcome: " + formatf + " " + formatl); break;
        }
    }
}








