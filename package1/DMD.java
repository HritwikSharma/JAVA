
package package1;
class C{
    void run(){
        System.out.println("I am parent ");
    }
}
public class DMD extends C{
    void run(){
        System.out.println("I am child ");
    }
    public static void main(){
        C obj=new DMD();
        obj.run();    
    }
}