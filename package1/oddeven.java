package package1;

import java.util.*;
class oddeven
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no");
        int a=input.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}