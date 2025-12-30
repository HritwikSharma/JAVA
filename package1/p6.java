package package1;
class p6
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
        for(int i=3;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}