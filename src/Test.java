public class Test {
    public static void main(String[] args) {
        class Alpha{
            boolean a;
            void show(){
                System.out.println("Alpha a: " + a);
            }
        }

        class Beta extends Alpha{
            int b;
            void display(){
                System.out.println("Beta b: " + b);
            }
            void show_sum(){
                if(a==true){
                    System.out.println("Beta a: " + b);
                }
                else{
                    System.out.println("Bsdfhsdfhsdhfeta b: " + b);
                }
            }
        }

        Beta beta = new Beta();
        beta.b = 2;
        beta.show_sum();
    }
}
