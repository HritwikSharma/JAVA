package package1;
public abstract class ab{
    static int var;
    public ab(){
        System.out.println("Hello World\n\n"+" "+var);
    }
    public ab(int a){
        System.out.println("Hello Hritwik");
    }
    public void square(int a){
        var=a;
        System.out.println(a*a);
    }
}