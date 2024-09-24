public class Category extends Product {
    private int Catid;
    private String CatName;

    Category(int id,String name,double price,int catid,String catName) {
        super(id,name,price);
    }

    @Override
    public void Display() {
        System.out.println("Category Name: " + CatName+"\nCategory ID: " + Catid);
        super.Display();
    }

}
