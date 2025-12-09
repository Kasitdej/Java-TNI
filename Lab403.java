import javax.swing.*;

public class Lab403 {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin1234";

    public static void main(String[] args) {

        while (true) {
            String user = JOptionPane.showInputDialog("Enter Username:");
            if (user == null) return;

            String pass = JOptionPane.showInputDialog("Enter Password:");
            if (pass == null) return;

            boolean userp = USERNAME.equalsIgnoreCase(user);
            boolean passp = PASSWORD.equals(pass);

            if (userp && passp) {
                JOptionPane.showMessageDialog(null,
                        "Login Success!!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login Fail..","Incorrect username of password",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

