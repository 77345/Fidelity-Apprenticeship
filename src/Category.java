public class Category extends Product {
    private int cid;
    private String catName;

    Category(int id,String name,double price,int cid,String catName) {
        super(id,name,price);
        this.cid = cid;
        this.catName = catName;
    }

    @Override
    public void Display() {
        System.out.println("Category Name: " + catName+"\nCategory ID: " + cid);
        super.Display();
    }

}
