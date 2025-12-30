package package1;

interface calculate
{
    double area(double r);
    double perimeter(double r);
}
class circle implements calculate
{
    public double area(double r)
    {
        double a=(3.14*r*r);
        return a;
    }
    public double perimeter(double r)
    {
        double a1=2*3.14*r;
        return a1;
    }
}
class cal
{
    public static void main()
    {
        double a=2.5;
        calculate  b=new circle();
        System.out.println(b.area(a));
        System.out.println(b.area(a));
    }
}