public class Product {
    private int Proid;
    private String ProName;
    private String ProPrice;

    Product(int proid, String ProName, double ProPrice){
        this.Proid=proid;
        this.ProName=ProName;
        this.ProPrice=ProPrice;
    }

    public void Display() {
        System.out.println("Product ID: " + Proid+"\nProduct name"+ProName+"\nProduct Price"+ProPrice);
    }
}
