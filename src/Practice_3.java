import javax.swing.*;
import java.util.Arrays;

public class Practice_3 {
    public static void Practice_3_1() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Числитель:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Знаменатель:"));
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Результат деления: деление на ноль!");
        }
        else {
            double result = a / b;
            JOptionPane.showMessageDialog(null, "Результат деления: " + a + "/" + b + "=" + result);
        }
    }

    public static void Practice_3_2() {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Введите целое число от 0 до 10:"));
        String s;
        switch(i) {
            case 0 -> s = "Вы ввели нулевое значение!";
            case 1 -> s = "Вы ввели единичное значение!";
            case 2, 4, 6, 8 -> s = "Вы ввели четное число!";
            case 3, 5, 7 -> s = "Вы ввели простое число!";
            default -> s = "Вы ввели число 9 или выходящее за пределы диапазона!\n";
        }
            JOptionPane.showMessageDialog(null, s);
    }

    public static void Practice_3_3() {
        System.out.print("\nТретья задача: \n");
        System.out.println(1);
        for (int i = 1, j = 1; j <= 30;) {
            int s = i + j;
            System.out.println(j);
            i = j;
            j = s;
        }
    }

    public static void Practice_3_4() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Укажите размер массива:"));
        int j = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = j;
            j += 2;
        }
        JOptionPane.showMessageDialog(null, "Массив нечетных чисел:\n" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Practice_3_1();
        Practice_3_2();
        Practice_3_3();
        Practice_3_4();
    }
}
