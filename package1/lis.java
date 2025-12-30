
package package1;
class D{
    void run(){
        System.out.println("I am parent ");
    }
}
public class lis extends D{
    void run(){
        System.out.println("I am child ");
    }
    public static void main(){
        lis obj=new lis();
        obj.run();    
    }
}