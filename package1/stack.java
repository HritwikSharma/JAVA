package package1;
import java.util.*;
public class stack{
public static void main(){
    Scanner sc=new Scanner(System.in);
    int c=1;
    int ch=1;
    int [] arr=new int[500];
    int [] arr1=new int[500];
    int head=-1;
    int head1=-1;
    while(ch!=0){
        System.out.println("Enter 1 for stack 1");
        System.out.println("Enter 2 for stack 2");
        System.out.println("Enter 3 for merging both stacks");
        System.out.println("Enter 4  for printing stack 3");
        System.out.println("Enter 0 for termination()");
        int []arr3=new int[head+head1+2];
        ch=sc.nextInt();
        switch(ch){
            case 1:
                while(c!=0){
                System.out.println("Enter 1 for push()");
                System.out.println("Enter 2 for pop()");
                System.out.println("Enter 3 for print()");
                System.out.println("Enter 4 for search()");
                System.out.println("Enter 0 to Exit stack2");
                c=sc.nextInt();
                switch (c){
                case 0:
                    System.out.println("Executed stack 1 operations");
                    break;
                case 1:
                    head=head+1;
                    System.out.println("Enter the Element to push");
                    int a=sc.nextInt();
                    arr[head]=a;
                    break;
                case 2:
                    System.out.println("One Element from top removed");
                    head=head-1;
                    break;
                case 3:
                    for(int i=0;i<=head;i++){
                        System.out.println(arr[i]);
                    }
                    break;
                case 4:
                    System.out.println("Enter the element to be searched");
                    int s=sc.nextInt();
                    for(int i=0;i<=head;i++){
                        if(arr[i]==s){
                            System.out.println("Element found at position "+i);
                        }
                    }
                    break;
                default:
                    System.out.println("Enter a valid Input");
                }
                break;
            }
            case 2:
                while(c!=0){
                System.out.println("Enter 1 for push()");
                System.out.println("Enter 2 for pop()");
                System.out.println("Enter 3 for print()");
                System.out.println("Enter 4 for search()");
                System.out.println("Enter 0 to Exit stack2");
                c=sc.nextInt();
                switch (c){
                case 0:
                    System.out.println("Executed stack 2 operations");
                    break;
                case 1:
                    head1=head1+1;
                    System.out.println("Enter the Element to push");
                    int a=sc.nextInt();
                    arr1[head1]=a;
                    break;
                case 2:
                    System.out.println("One Element from top removed");
                    head1=head1-1;
                    break;
                case 3:
                    for(int i=0;i<=head1;i++){
                        System.out.println(arr1[i]);
                    }
                    break;
                case 4:
                    System.out.println("Enter the element to be searched");
                    int s=sc.nextInt();
                    for(int i=0;i<=head1;i++){
                        if(arr1[i]==s){
                            System.out.println("Element found at position "+i);
                        }
                    }
                    break;
                default:
                    System.out.println("Enter a valid Input");
                }
                break;
            }
            case 3:
                int m=0;
                for(int i=0;i<=head;i++)
                {
                    arr3[i]=arr[i];
                    m=i;
                }
                for(int i=0;i<=head1;i++)
                {
                    m=m+1;
                    arr3[m]=arr1[i];
                }
                break;
            case 4:
                int n=head+head1+2;
                for(int i=0;i<=n;i++)
                {
                    System.out.println(arr3[i]);
                }
                break;
            case 5:
                break;
            }
        }
    }
}