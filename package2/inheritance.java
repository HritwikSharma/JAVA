package package2;
public class inheritance{
    public static void main(String args[]){
        dog m=new dog();
        m.eat();
        m.sleeps();
        m.barks();
    }
}
class animal{
    void eat(){
        System.out.println("Eats");
    }
    void sleeps(){
        System.out.println("sleeps");
    }
}
class dog extends animal{
    void barks(){
        System.out.println("BAW-BAW");
    }
}