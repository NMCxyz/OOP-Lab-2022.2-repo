package Lab01;

import javax.swing.JOptionPane;
public class MatrixAdd {
    public static void main(String[] args) {
        int rows, cols;

        String rowsInput = JOptionPane.showInputDialog("Enter the number of rows:");
        rows = Integer.parseInt(rowsInput);

        String colsInput = JOptionPane.showInputDialog("Enter the number of columns:");
        cols = Integer.parseInt(colsInput);
        int[][] matrix1 = new int[rows][cols];
        JOptionPane.showMessageDialog(null, "Enter the values for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String input = JOptionPane.showInputDialog("Enter the value for row " + (i+1) + " and column " + (j+1) + ":");
                matrix1[i][j] = Integer.parseInt(input);
            }
        }
        int[][] matrix2 = new int[rows][cols];
        JOptionPane.showMessageDialog(null, "Enter the values for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String input = JOptionPane.showInputDialog("Enter the value for row " + (i+1) + " and column " + (j+1) + ":");
                matrix2[i][j] = Integer.parseInt(input);
            }
        }
        int[][] resultMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        String resultString = "The result matrix is:\n";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultString += resultMatrix[i][j] + " ";
            }
            resultString += "\n";
        }
        JOptionPane.showMessageDialog(null, resultString);
    }
}

