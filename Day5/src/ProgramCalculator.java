import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double Division(int a, int b, double[] remainder) {
        if (b==0){
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        remainder[0] = a % b;
        return (double) a/b;
    }
}
public class ProgramCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter the operator(+,-,*,/):");
        char op = sc.next().charAt(0);
        System.out.println("Enter the first operand:");
        int operand1 = sc.nextInt();
        System.out.println("Enter the second operand:");
        int operand2 = sc.nextInt();
        switch(op){
            case '+':
                int sum=c.add(operand1, operand2);
                System.out.println("Result of"+operand1+"+"+operand2+"="+sum);
                break;
            case '-':
                int diff=c.subtract(operand1, operand2);
                System.out.println("Result of"+operand1+" -"+operand2+"="+diff);
                break;
            case '*':
                int prod=c.multiply(operand1, operand2);
                System.out.println("Result of"+operand1+"*"+operand2+"="+prod);
                break;
            case '/':
                if(operand2 != 0){
                    double[] remainder = new double[1];
                    double quotient = c.Division (operand1,operand2,remainder);
                    System.out.println("Result of"+operand1+"/"+operand2+"="+quotient);
                    System.out.println("remainder: "+remainder[0]);
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}