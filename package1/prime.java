package package1;

import java.util.*;
class prime
{
    public static void main()
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("It is not a prime number");
        }
        else
        {
            System.out.println("It is a prime number");
        }
    }
}