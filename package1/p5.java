package package1;
class p5
{
    public static void main()
    {
        int a=5;
        for(int i=0;i<=5;i++)
        {
            for(int k=a;k>=0;k--)
            {
                System.out.print(' ');
            }
            for(int j=0;j<i;j++)
            {
                System.out.print('*');
            }
            a--;
            System.out.println();
        }
    }
}