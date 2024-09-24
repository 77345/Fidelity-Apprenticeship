import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of pizzas: ");
        int numPizzas = scanner.nextInt();
        System.out.print("Enter the number of puffs: ");
        int numPuffs = scanner.nextInt();
        System.out.print("Enter the number of Pepsi cans: ");
        int numPepsi = scanner.nextInt();

        double pizzaCostPerItem = 200.0;
        double puffCostPerItem = 40.0;
        double pepsiCostPerItem = 120.0;

        double totalPizzaCost = numPizzas * pizzaCostPerItem;
        double totalPuffCost = numPuffs * puffCostPerItem;
        double totalPepsiCost = numPepsi * pepsiCostPerItem;

        double grandTotal = totalPizzaCost + totalPuffCost + totalPepsiCost;


        System.out.println("\n**Bill Details**");
        System.out.println("Number of pizzas: " + numPizzas);
        System.out.printf("Cost per pizza: Rs. %.2f\n", pizzaCostPerItem);
        System.out.println("Total pizza cost: Rs. " +totalPizzaCost);

        System.out.println("Number of puffs: " + numPuffs);
        System.out.printf("Cost per puff: Rs. %.2f\n", puffCostPerItem);
        System.out.println("Total puff cost: Rs. " +totalPuffCost);

        System.out.println("Number of Pepsi cans: " + numPepsi);
        System.out.printf("Cost per Pepsi can: Rs. %.2f\n", pepsiCostPerItem);
        System.out.println("Total Pepsi cost: Rs. " +  totalPepsiCost);

        System.out.println("\nGrand Total: Rs. " +  grandTotal);

    }
}
