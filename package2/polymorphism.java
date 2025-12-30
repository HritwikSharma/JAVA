package package2;
class a{
    void w(){
        System.out.print("Hello");
    }
    void w(int a){
        System.out.print(" World\n");
    }
}
class b{
    void we(){
        System.out.print("ME-");
    }
}
public class polymorphism extends b{
    void we(){
        System.out.print("MAW");
    }
    public static void main(String args[]){
        a m=new a();
        m.w();
        m.w(4);
        b n=new b();
        n.we();
        polymorphism l=new polymorphism();
        l.we();
    }
}