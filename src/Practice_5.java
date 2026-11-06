class Human{
    private String name;
    private int age;
    private boolean gender;
    private String address;

    public Human(String name, int age, boolean gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Practice_5 {
    static public  void main(String[] args){
        class Rectangle{
            private double length;
            private double width;
            private double perimeter;

            public double areaLW(double length, double width){
                return length * width;
            }

            public double areaLP(double length, double perimeter){
                return length * (perimeter -  length);
            }

            public double areaLW(double length){
                return length*length;
            }


            class Circle{
                private double radius;

                public Circle(double radius){
                    this.radius = radius;
                }

                static {
                    System.out.print("Круг создан");
                }
            }
        }
    }
}
