import java.util.Scanner;

public class BooleanResult_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for X: ");
        int x = sc.nextInt();
        System.out.print("Enter the value for Y: ");
        int y = sc.nextInt();
        boolean result= x<y;
        System.out.println("the result of whether x is less than y is "+result);

    }
}
