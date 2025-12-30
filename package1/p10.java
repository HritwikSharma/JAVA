package package1;

class p10
{
    public static void main()
    {
        int a=1;
        for(int i=0;i<6;i++)
        {
            for(int j=a;j>0;j--)
            {
                System.out.print(j);
                System.out.print(" ");
            }
            a++;
            System.out.println();
        }
    }
}