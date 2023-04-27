import javax.swing.JOptionPane;

public class LinearTwoVariables {

    public static void main(String[] args) {

        String equation1 = JOptionPane.showInputDialog("Enter equation 1 in the form ax + by = c:");
        String equation2 = JOptionPane.showInputDialog("Enter equation 2 in the form ax + by = c:");

        // Parse coefficients and constants from input strings
        double a1 = Double.parseDouble(equation1.substring(0, equation1.indexOf("x")).trim());
        double b1 = Double.parseDouble(equation1.substring(equation1.indexOf("x") + 1, equation1.indexOf("y")).trim());
        double c1 = Double.parseDouble(equation1.substring(equation1.indexOf("=") + 1).trim());

        double a2 = Double.parseDouble(equation2.substring(0, equation2.indexOf("x")).trim());
        double b2 = Double.parseDouble(equation2.substring(equation2.indexOf("x") + 1, equation2.indexOf("y")).trim());
        double c2 = Double.parseDouble(equation2.substring(equation2.indexOf("=") + 1).trim());

        // Solve for x and y
        double x = (c1*b2 - c2*b1) / (a1*b2 - a2*b1);
        double y = (a1*c2 - a2*c1) / (a1*b2 - a2*b1);

        // Display solution
        JOptionPane.showMessageDialog(null, "Solution: x = " + x + ", y = " + y);
    }
}
