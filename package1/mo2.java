package package1;

class mo2
{
    void multiply(int a,int b)
    {
        int c=a*b;
        System.out.println(c);
    }
    void multiply(double a, double b)
    {
        double c=a*b;
        System.out.println(c);
    }
    public static void main()
    {
        mo2 la=new mo2();
        la.multiply(5,5);
        la.multiply(1.2,5.2);
    }
}