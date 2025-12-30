
package package1;import java.util.*;
class fibbonaci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=0,i=1,s;
        s=sc.nextInt();
        while(i<=s)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}