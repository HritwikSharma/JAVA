package package2;
class tr{
    private int salary;
    tr(int n){
        salary=n;
    }
    int getsal(){
        return salary;
    }
}

public class encap2{
    public static void main(String args[]){
       tr a=new tr(1000);
       System.out.println(a.getsal());
    }
}