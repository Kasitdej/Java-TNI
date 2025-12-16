import javax.swing.JOptionPane;

public class Lab502 {
    public static int input_score(String message, int limit_score) {
        int score;
        while (true) {
            score = Integer.parseInt(JOptionPane.showInputDialog(message));
            if (score >= 0 && score <= limit_score) {
                return score;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Score must be in range between 0 and " + limit_score);
            }
        }
    }
    public static int cal_score(int midterm, int fin) {
        return midterm + fin;
    }

    public static String find_grade(int score) {
        if (score >= 80) return "A";
        else if (score >= 70) return "B";
        else if (score >= 60) return "C";
        else if (score >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        while (true) {
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to check your score?",
                    "Check score",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!");
                break;
            }

            int midterm = input_score("Enter Midterm score ", 45);
            int fin = input_score("Enter Final score", 55);

            int total = cal_score(midterm, fin);
            String grade = find_grade(total);

            JOptionPane.showMessageDialog(null,
                    "Total score : " + total + "\nGrade : " + grade);
        }
    }
}


