package package2;
class mr1 extends Thread{
    public void run(){
        System.out.println("Running");
    }
}
public class mr{
    public static void main(String args[]){
        mr1 t=new mr1();
        t.start();
    }
}