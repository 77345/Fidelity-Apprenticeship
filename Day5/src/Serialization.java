import java.io.*;

class product implements Serializable {
    int proid;
    String proname;

    public product(int proid, String proname) {
        this.proid = proid;
        this.proname = proname;
    }
}
public class Serialization {
    public static void main(String[] args) {
        try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("product.txt")))
        {
            product p1 =new product(1,"P1");
            obj.writeObject(p1);
            System.out.println("Seialization complete");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
        try(ObjectInputStream obj2=new ObjectInputStream(new FileInputStream("product.txt")))
        {
            product pro=(product) obj2.readObject();
            System.out.println("Deserialization completed: proid"+pro.proid+" proname"+pro.proname);
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}