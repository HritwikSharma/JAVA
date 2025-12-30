package package1;

class p13
{
    public static void main()
    {
        int a=1;
        for(int u=1;u<5;u++)
        {
            for(int o=0;o<u;o++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
        
        int p=0,i,j,k;
        for(i=0;i>0;i++)
        {
            for(j=0;j<p;j++)
            {
              System.out.print(' ');  
            }
            for(k=1;k>0;k--)
            {
                System.out.print('*');
            }
            System.out.println();
            k++;        
        }
    }
}