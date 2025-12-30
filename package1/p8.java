package package1;
class p8
{
    public static void main()
    {
        int a=0;
         for(int i=5;i>0;i--)
         {
             for(int k=0;k<a;k++)
             {
                 System.out.print(' ');
             }
             for(int j=i;j>0;j--)
             {
                 System.out.print('*');
             }
             System.out.println();
             a++;
         }
    }
}