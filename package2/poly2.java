package package2;
class make{
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
}
public class poly2{
    public static void main(String args[]){
        make o=new make();
        System.out.println(o.add(4,5));
        System.out.println(o.add(4,5,6));
    }
}