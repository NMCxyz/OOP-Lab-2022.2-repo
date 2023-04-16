import javax.swing.JOptionPane;

public class SecondDegreeEquationSolver {
    public static void main(String[] args) {
        // Get input values from user using JOptionPane
        String aString = JOptionPane.showInputDialog("Enter the coefficient of x^2:");
        String bString = JOptionPane.showInputDialog("Enter the coefficient of x:");
        String cString = JOptionPane.showInputDialog("Enter the constant:");

        // Convert input strings to double values
        double a = Double.parseDouble(aString);
        double b = Double.parseDouble(bString);
        double c = Double.parseDouble(cString);

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is negative
        if (discriminant < 0) {
            JOptionPane.showMessageDialog(null, "The equation has no real roots.");
        } else {
            // Calculate the two roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display the roots using JOptionPane
            JOptionPane.showMessageDialog(null, "The roots are " + root1 + " and " + root2);
        }
    }
}
