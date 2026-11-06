import javax.swing.JOptionPane;
import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        int row,tuple;
        tuple=Integer.parseInt(JOptionPane.showInputDialog("Строк в массиве: "));
        row = Integer.parseInt(JOptionPane.showInputDialog("Столбцов в массиве: "));
        int [][] random_array = new int [tuple][row];
        for(int i=0;i<tuple;i++){
            for(int j=0;j<row;j++){
                random_array[i][j]=(int) (Math.random()*10);
            }
        }
        String text = Arrays.deepToString(random_array);
        JOptionPane.showMessageDialog(null, text, "Двумерный массив случайных чисел:", JOptionPane.INFORMATION_MESSAGE);
    }
}
