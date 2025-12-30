package package1;
class p11
{
    public static void main()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        int d=4;
        for(int a=0;a<5;a++)
        {
            for(int c=d;c>0;c--)
            {
                System.out.print(' ');
            }
            for(int b=0;b<a;b++)
            {
                System.out.print('*');
            }
            System.out.println();
            d--;
        }
    }
}