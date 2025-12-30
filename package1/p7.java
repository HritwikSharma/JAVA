package package1;
class p7
{
    public static void main()
    {
        int a=5;
        for(int i=0;i<6;i++)
        {
            for(int k=a;k>0;k--)
            {
                System.out.print(' ');
            }
            for(int j=0;j<i;j++)
            {
                System.out.print('*');
                System.out.print(' ');
            }
            a--;
            System.out.println();
        }
    }
}