
package package1;
class test
{
    public static void main()
    {
        box box1=new box();
        double vol;
        box1.width=1;
        box1.height=1;
        box1.length=45;
        vol=box1.width*box1.height*box1.length;
        box box2=new box();
        System.out.println("Volume of first box is"+vol);
        box2.width=2;
        box2.height=2;
        box2.length=1;
        vol=box2.width*box2.height*box2.length;
        System.out.println("Volume of second box is"+vol);
    }
}
class box
    {
        float width;
        float height;
        float length;
    }
