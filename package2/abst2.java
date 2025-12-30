package package2;
abstract class mo{
    abstract int m(int x,int y);
}
class mo1 extends mo{
    int m(int x,int y){
        return x*y;
    }
}
public class abst2{
    public static void main(String args[]){
        mo1 m=new mo1();
        System.out.println(m.m(4,5));
    }
}