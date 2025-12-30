package package2;
class maker{
    void r(){
        System.out.println("Hello World");
    }
}
public class inh2 extends maker{
    void r(){
        System.out.println("Child");
    }
    public static void main(String args[]){
        inh2 n=new inh2();
        n.r();
        maker n1=new maker();
        n1.r();
        maker n2=new inh2();
        n2.r();
    }
}