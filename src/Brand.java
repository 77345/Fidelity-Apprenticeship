public class Brand extends Category{
    String BrandName;
    Brand(int id,String proname,double price,int cid,String Cname,String Brandname){
        super(id,proname,price,cid,Cname);
        BrandName=name;
    }
    @Override
    public void Display() {
        System.out.println("Brand: " + BrandName);
        super.Display();
    }
}
