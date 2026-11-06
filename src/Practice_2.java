import javax.swing.JOptionPane;
import java.util.Scanner;
import static java.lang.Math.*;

public class Practice_2 {

    public static void Practice_2_1() {
        double time = 10;
        System.out.print("\nПервая задача: \n");
        System.out.println("Расстояние до молнии: " + time * 0.340 + " км");
    }

    public static void Practice_2_2() {
        JOptionPane.showMessageDialog(null, "Водитель: Бендер Остап Ибрагимович\nВозраст: 27 лет\nПрава категрии: B");
    }

    public static void Practice_2_3() {
        System.out.print("\nТретья задача: \n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.println("Сумма двух чисел равна " + (num1 + num2));
        System.out.println("Форматированный вывод:");
        System.out.printf("Сумма двух чисел равна %d\n", (num1 + num2));
    }

    public static void Practice_2_4() {
        System.out.print("\nЧетвертая задача: \n");
        double V = 100;
        double alpha = 30;
        final double g = 9.81;
        double gamma = 0.1;
        double m = 0.1;
        double t = 1;
        double x, y;
        alpha = toRadians(alpha);
        x = (V * m * cos(alpha) / gamma) * (1 - exp(-gamma * t/m));
        y = m * (V * sin(alpha) * gamma + m * g) / (gamma * gamma) * (1 - exp(-gamma * t/m)) - (m * g * t / gamma);
        System.out.printf("Координаты тела для t=%.1f сек:\n", t);
        System.out.printf("x = %f м\n", x);
        System.out.printf("y = %f м\n", y);
        System.out.print("Параметры:\n");
        System.out.printf("Угол alpha=%.1f градусов \n", toDegrees(alpha));
        System.out.printf("Скорость V=%.1f м/с\n", V);
        System.out.printf("Коэффициент сопротивления gamma=%.1f Н*с/м\n", gamma);
        System.out.printf("Масса тела m=%.1f кг\n", m);
    }

    public static void Practice_2_5() {
        System.out.print("\nПятая задача: \n");
        double R1 = 3;
        double R2 = 5;
        double R3 = 2;
        double R = 2;
        System.out.println("Значение сопротивлений резисторов:");
        System.out.printf("Первый R1=%.1f Ом\n", R1);
        System.out.printf("Второй R2=%.1f Ом\n", R2);
        System.out.printf("Третий R3=%.1f Ом\n", R3);
        System.out.printf("Основной R=%.1f Ом\n", R);
        double R_total_3 = R1 * R2 / (R1 + R2) + R3 * R / (R3 + R);
        double R_total_2 = R1 * R3 / (R1 + R3) + R2 * R / (R2 + R);
        double R_total_1 = R2 * R3 / (R2 + R3) + R1 * R / (R1 + R);
        String output_string = null;
        if (R_total_1 > R_total_2 && R_total_1 > R_total_3) output_string = "первый";
        if (R_total_2 > R_total_1 && R_total_2 > R_total_3) output_string = "второй";
        if (R_total_3 > R_total_1 && R_total_3 > R_total_2) output_string = "третий";
        System.out.printf("Во второй блок подключается %s резистор", output_string);
    }

    public static void main(String[] args) {
        Practice_2_1();
        Practice_2_2();
        Practice_2_3();
        Practice_2_4();
        Practice_2_5();
    }
}
