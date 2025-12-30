package package1;

import java.util.*;
class fib
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int j=sc.nextInt();
        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<j;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
