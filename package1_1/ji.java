package package1_1
;
class ji
{
    public static void main()
    {
        int p=5;
        for(int i=1;i<5;i++)
        {
            for(int j=p;j>0;j--)
            {
              System.out.print(" ");  
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            p--;
        }
    }
}