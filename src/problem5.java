public class problem5 {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements/numbers");
        int num = sc.nextInt();
        int[] myArray = new int[num];

        System.out.println("Enter the numbers one by one : ");
        System.out.println("Press Enter button after each number : ");

        for (int i = 0; i < num; i++) {
            myArray[i] = sc.nextInt();
        }

        double average = 0;
        for (int i = 0; i < num; i++) {
            average = average + myArray[i];
        }

        average = average / num;
        System.out.println("Average of given numbers :: " + average);
    }
}
