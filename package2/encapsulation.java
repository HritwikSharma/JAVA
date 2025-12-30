package package2;
class emp{
    private int salary;
    private String name;
    private static int count;
    int gets(){
        return salary;
    }
    String getn(){
        return name;
    }
    void sets(int salary){
        this.salary=salary;
    }
    void setn(String name){
        this.name=name;
        count++;
    }
    int c(){
        return count;
    }
}
public class encapsulation{
    public static void main(String args[]){
        emp m=new emp();
        m.sets(100);
        m.setn("Hritwik");
        System.out.println(m.gets());
        System.out.println(m.getn());
        m.sets(200);
        m.setn("Aman");
        System.out.println(m.gets());
        System.out.println(m.getn());
        System.out.println(m.c());
    }
}