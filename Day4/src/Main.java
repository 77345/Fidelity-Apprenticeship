import java.lang.reflect.Method;

public class Main{
    public static void main(String[] args) {
        System.out.println(MethodOverload.Add("Ravi","ranjan"));
        MethodOverload.Add(10,20,30);
        MethodOverload meth=new MethodOverload();
        meth.Add("x","y","z");
    }
}