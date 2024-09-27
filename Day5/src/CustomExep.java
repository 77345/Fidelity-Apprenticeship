import java.util.Scanner;

class AgeException extends Exception{
    public AgeException(String message){
        super(message);

    }

}
public class CustomExep {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new AgeException("you are not eligible");
            } else {
                System.out.println("you are eligible");
            }
        }
        catch (AgeException ex){
            System.out.println(ex);
        }
    }
}