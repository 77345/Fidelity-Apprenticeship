import java.util.Scanner;
public class SquareandCube_2{
    public static double Square(double num) {
        return num * num;
    }

    public static double Cube(double num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double num=sc.nextDouble();
        double square=Square(num);
        double cube=Cube(num);
        System.out.println("Square of"+num+" is "+square);
        System.out.println("Cube of"+num+" is "+cube);
    }

}