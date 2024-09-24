public class Brand extends Category{
    String BrandName;
    Brand(int id,String Proname,double price,int cid,String catname,String Brandname){
        super(id,Proname,price,cid,catname);
        BrandName=Brandname;
    }
    @Override
    public void Display() {
        System.out.println("Brand: " + BrandName);
        super.Display();
    }
}
