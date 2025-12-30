package package1;
import java.lang.*;
public class factorial{
    public static void main(String[] args){
        int i=5;
        f a=new f();
        System.out.println(a.fact(i));
    }
}
class f{
    int fact(int n){
        int i;
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
}
}