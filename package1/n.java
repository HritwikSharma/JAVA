package package1;

class n
{
    void print(){
        System.out.println("n");
    }
}
class l extends n
{
    void p(){
        System.out.println("L");
    }
}
class m extends l
{
    void k(){
        System.out.println("m");
    }
}
class multi
{
    public static void main(){
        m a=new m();
        a.print();
        a.p();
        a.k();
    }
}