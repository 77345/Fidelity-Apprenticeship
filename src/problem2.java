import java.util.Scanner;
public class problem2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}