package package2; 
 
class a implements Runnable{
    public void run(){
        System.out.println("ME-MAW");
    }
}
public class thir{
    public static void main(String args[]){
        a m=new a();
        Thread t=new Thread(m);
        Thread t1=new Thread(m);
        t.start();
        t1.start();
    }
}
