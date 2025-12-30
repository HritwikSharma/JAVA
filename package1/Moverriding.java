package package1;

class B{
    void run(){
        System.out.println("I am parent ");
    }
}
public class Moverriding extends B{
    void run(){
        System.out.println("I am child ");
    }
    public static void main(){
        Moverriding obj=new Moverriding();
        B o=new B();
        obj.run();  
        o.run();
        B m=new Moverriding();
        m.run();
    }
}