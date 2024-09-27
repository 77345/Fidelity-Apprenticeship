import java.util.Scanner;

abstract class Shape {
     abstract double calculateVolume();
}

class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;

    }

    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Cube extends Shape{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }
}
public class AbstractDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a shape: 1.cylinder/2.cube");
        int choice = sc.nextInt();
        Shape shape= null;
        switch(choice){
            case 1:
                System.out.println("Enter radius:");
                double radius = sc.nextDouble();
                System.out.println("Enter height:");
                double height = sc.nextDouble();
                shape = new Cylinder(radius, height);
                break;
            case 2:
                System.out.println("Enter side:");
                double side = sc.nextDouble();
                shape = new Cube(side);
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
        }
        double volume = shape.calculateVolume();
        System.out.println("volume: "+volume);

    }

}