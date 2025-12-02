import javax.swing.JOptionPane;
public class Lab302 {
    public static void main(String[] args) {

        double totalPrice = 0.0;
        String input;

        while (true) {

            input = JOptionPane.showInputDialog(
                    null,
                    "Input price [press 0 to stop]:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );
            if (input == null) {
                break;
            }

            int price = 0;
            try {
                price = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a number only!", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (price == 0) {
                break;
            }

            if (price < 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid price!!\nInput price [press 0 to stop]",
                        "Warning",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                totalPrice += price;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                String.format("Total price is %.2f baht.", totalPrice),
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}