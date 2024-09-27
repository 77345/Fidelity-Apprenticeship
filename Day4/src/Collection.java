import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("List: " + numbers);
        System.out.println("Elements at index 2: " + numbers.get(2));
        numbers.remove(1);
        System.out.println("numbers: " + numbers);
    }
}
