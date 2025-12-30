package package1;

import java.util.*;
class calc
{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a=sc.nextInt();
        System.out.println("Enter the second no.");
        int b=sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter your choice");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
