package package1;
import java.util.*;
class bankingsystem{
    static String [] create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer name:");
        String name=sc.nextLine();
        System.out.println("Enter customer age:");
        String age=sc.nextLine();
        System.out.println("Enter Customer ID proof:");
        String id=sc.nextLine();
        System.out.println("Enter Customer address:");
        String address=sc.nextLine();
        System.out.println("Enter Customer Phone No.:");
        String phone=sc.nextLine();
        System.out.println("Enter Customer Email ID:");
        String email=sc.nextLine();
        System.out.println("Enter Customer D.O.B:");
        String dob=sc.nextLine();
        String [] ar=new String [7];
        ar[0]=name;
        ar[1]=age;
        ar[2]=id;
        ar[3]=address;
        ar[4]=phone;
        ar[5]=email;
        ar[6]=dob;
        return(ar);
    }
    static int deposit(int a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit");
        int bal=sc.nextInt();
        return bal;
    }
    static void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        
        String [][]arr=new String[8][100];
        int c=1;
        int balance=0;
        int cn=0;
        while(c!=0){
            System.out.println("Enter 1 to create account");
            System.out.println("Enter 2 for depositing in account");
            System.out.println("Enter 3 to display account balance");
            System.out.println("Enter 4 to withdraw from account");
            c=sc.nextInt();
            switch(c){
                case 0:
                    System.out.println("Process Terminated");
                case 1:
                    String data[]=create();
                    for(int i=0;i<=8;i++){
                        arr[cn][i]=data[i];
                    }
                    cn=cn+1;
                    break;
                case 2:
                    int a;
                    a=deposit(balance);
                    balance=balance+a;
                    break;
                case 3:
                    System.out.println("Enter Customer name");
                    String s=sc.nextLine();
                    for(int i=0;i<=cn;i++){
                        if(arr[][])
                    }
                    break;
                case 4:
                    withdraw();
                    break;
                default:
                    System.out.println("Enter valid input");
            }
            
            
            
            
            
        }
    }
}