package package2;
class ck extends RuntimeException{
    ck(){
    }
    public ck(String m){
        super(m);
    }
    public void ck1(int age){
        if(age>18){
            System.out.println("OK");
        }
        else{
            throw new ck("NOPE");
        }
    }
}
public class exc2{
    public static void main(String args[]){
        try{
            ck ob=new ck();
            ob.ck1(18);
        }
        catch(ck e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Done");
        }
    }
}