package package1;
import java.util.*;
import java.io.*;
class greatestno
{
    public static void main()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  first no.");
        int a=input.nextInt();
        System.out.println("Enter the  second no.");
        int b=input.nextInt();
        System.out.println("Enter the  first no.");
        int c=input.nextInt();
        if(a>b && a>c)
        {
            System.out.println("First no is greater"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Second no is greater"+b);
        }
        else
        {
            System.out.println("Third no is greater"+c);
        }
    }
}