
package package1;import java.util.*;
class fact
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,g=1;
        System.out.println("Enter the no");
        int s=sc.nextInt();
        for(i=1;i<=s;i++)
        {
            g=g*i;
        }
        System.out.println("The factorial is"+g);
    }
}