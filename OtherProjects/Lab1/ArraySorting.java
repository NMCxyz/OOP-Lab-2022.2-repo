import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array:"));
        int[] my_array = new int[size];

        for (int i = 0; i < size; i++) {
            my_array[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter element " + (i+1) + ":"));
        }
        Arrays.sort(my_array);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += my_array[i];
        }
        double avg = (double) sum / size;
        JOptionPane.showMessageDialog(null, "Sorted Array: " + Arrays.toString(my_array) + "\nSum: " + sum + "\nAverage: " + String.format("%.2f", avg));
    }
}
