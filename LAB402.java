import javax.swing.*;
import java.util.Scanner;

public class LAB402 {
    public static void  main(String[] args)  {
        String id;

        while (true) {
            id = JOptionPane.showInputDialog("Enter student-id:");

            if (id == null) return;

            id = id.trim();

            if (id.length() != 10) {
                JOptionPane.showMessageDialog(null,
                        "Enter student-id:");
                continue;
            }
            break;
        }

        String major;
        String code = id.substring(2, 5);

        switch (code) {
            case "131": major = "Information Technology (IT)"; break;
            case "132": major = "Multimedia Technology (MT)"; break;
            case "133": major = "Digital Business IT (BI)"; break;
            case "134": major = "Mass Communication (DC)"; break;
            case "135": major = "Data Science (DS)"; break;
            default: major = "Cannot found major"; break;
        }

        JOptionPane.showMessageDialog(null,
                "Student ID: " + id + 232 + "\nMajor: " + major);
    }
}