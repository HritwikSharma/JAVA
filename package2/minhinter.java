package package2;
interface printable
{
    void print();
}
interface showable
{
    void show();
    static int m(){
        System.out.print("ME-MAW");
        return 0;
    }
}
public class minhinter implements printable,showable
{
    public void print()
    {
        System.out.println("Hello");
    }
    public  void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String args[]){
        minhinter obj= new minhinter();
        obj.print();
        obj.show();
        showable.m();
    }
}