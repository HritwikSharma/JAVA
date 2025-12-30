package package2;

class ER extends Exception{
    ER(String m){
        super(m);
    }
}
class b{
    static void check(int age)throws ER{
        if(age>18){
            System.out.println("OF AGE");
        }
        else{
            throw new ER("NOT OF AGE");
        }
    }
}
public class exce{
    public static void main(String args[]){
        int age=28;
        b ob=new b();
        try{
            b.check(age);
        }
        catch(ER e){
           System.out.println(e.getMessage()); 
        }
    }
}