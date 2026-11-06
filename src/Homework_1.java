import java.util.Scanner;

public class Homework_1 {
    public static void Homework_1_1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = scan.nextLine();
        System.out.print("Input age: ");
        int age = scan.nextInt();
        System.out.print("Input height: ");
        double height = scan.nextDouble();
        System.out.printf("Name: %s Age: %d Height: %.2f\n\n", name, age, height);
    }

    public static void Homework_1_2() {
        boolean a, b;
        System.out.printf("a\t\tb\t\tAND\t\tOR\t\tXOR\t\tNOT\n");
        a = true;
        b = true;
        System.out.printf("%b\t%b\t%b\t%b\t%b\t%b\n", a, b, a && b, a || b, a ^ b, !a);
        a = true;
        b = false;
        System.out.printf("%b\t%b\t%b\t%b\t%b\t%b\n", a, b, a && b, a || b, a ^ b, !a);
        a = false;
        b = true;
        System.out.printf("%b\t%b\t%b\t%b\t%b\t%b\n", a, b, a && b, a || b, a ^ b, !a);
        a = false;
        b = false;
        System.out.printf("%b\t%b\t%b\t%b\t%b\t%b\n", a, b, a && b, a || b, a ^ b, !a);
    }
    public static void main(String[] args) {
        Homework_1_1();
        Homework_1_2();
    }
}
