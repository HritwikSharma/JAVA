package package2;
class mrw implements Runnable{
    public void run(){
        System.out.println("Hello World");
    }
}
public class mr2{
    public static void main(String args[]){
        mrw n=new mrw();
        Thread t=new Thread(n);
        t.start();
    }
}