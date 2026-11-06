public class Practice_7 {
    public static void main(String[] args) {
        class BaseClass{
            void printMessage(){
                System.out.println("Метод базового класса");
            }
        }

        class DerivedClassFirst extends BaseClass{
            @Override
            void printMessage(){
                System.out.println("Метод первого производного класса");
            }
        }

        class DerivedClassSecond extends BaseClass{
            @Override
            void printMessage(){
                System.out.println("Метод второго производного класса");
            }
        }

        System.out.println("Первое задание практики\n");

        BaseClass base = new BaseClass();
        DerivedClassFirst derived = new DerivedClassFirst();

        base.printMessage();
        derived.printMessage();

        System.out.println("\nВторое задание практики\n");

        BaseClass A = new BaseClass();
        DerivedClassFirst B = new DerivedClassFirst();
        DerivedClassSecond C = new DerivedClassSecond();
        BaseClass r;
        r = A;
        r.printMessage();
        r = B;
        r.printMessage();
        r = C;
        r.printMessage();

    }
}
