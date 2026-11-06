class Fruit{
    double weight;
    String color;
    Fruit(double weight, String color){
        this.weight = weight;
        this.color = color;
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Color: " + color);
    }
}

class Apple extends Fruit{
    String variety;
    Apple(double weight, String color,  String variety){
        super(weight, color);
        this.variety = variety;
        System.out.println("Variety: " + variety);
    }

    public void getVariety(String variety){
        this.variety = variety;
    }
}

class Figure{
    String name;
    String color;

    Figure(String name, String color){
        this.name = name;
        this.color = color;
        System.out.print(name + ", " + color);
    }
}

class Rectangle extends Figure{
    double width;
    double height;
    Rectangle(String name, String color, double width, double height){
        super(name, color);
        this.width = width;
        this.height = height;
        System.out.println(", длина = " + width + ", ширина = " + height);
    }
}

class Circle extends Figure{
    double radius;
    Circle(String name, String color, double radius){
        super(name, color);
        this.radius = radius;
        System.out.println(", радиус = " + radius);
    }
}

class Triangle extends Figure{
    double a, b, c;
    Triangle(String name, String color, double a, double b, double c){
        super(name, color);
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(", сторона A = " + a + ", сторона B = " + b + ", сторона C = " + c);
    }
}

public class Practice_6 {
    public static void main(String[] args) {
        Apple apple = new Apple(0.2, "red", "Gala");
        Rectangle rectangle = new Rectangle("Прямоугольник", "красный", 10, 5);
        Circle circle = new Circle("Круг", "синий", 7);
        Triangle triangle = new Triangle("Треугольник", "зеленый", 6, 8, 10);
    }
}
