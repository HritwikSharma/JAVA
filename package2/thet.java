package package2;
class a extends Thread{
    public void run(){
        System.out.println("ME-MAW");
    }
}
public class thet{
    public static void main(String args[]){
        a t=new a();
        a t1=new a();
        t.start();
        t1.start();
    }
}