import java.util.Scanner;

public class Reverse_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        System.out.println("The reversed string is: " );
        System.out.println(result.toString());
    }
}
