package package2;
abstract class a{
    abstract int eat(int a,int b);
    void he(){
        System.out.println("Hello World");
    }
}
class b extends a{
    int eat(int a,int b){
        return a+b;
    }
}
public class abstrac{
    public static void main(String args[]){
        b m=new b();
        System.out.println(m.eat(4,2));
        m.he();
    }
}