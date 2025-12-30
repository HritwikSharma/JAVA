package package2;
public class exc1{
    public static void main(String args[])throws ArithmeticException{
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Done");
        }
    }
}