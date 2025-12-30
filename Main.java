import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int balance=Integer.parseInt(sc.nextLine().trim());
        int temp=balance,a=0,i,count=-1,count1=0;
        int n=Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> transactions=new ArrayList<>();
        ArrayList<Integer> commits=new ArrayList<>();
        
        for(i=0;i<n;i++){
            String s=sc.nextLine().trim();
            String s1[]=s.split(" ");
            
            switch(s1[0]){
                case "read":
                    System.out.println(temp);
                    break;
                case "credit":
                    a=Integer.parseInt(s1[1]);
                    transactions.add(a);
                    temp=temp+a;
                    count=count+1;
                    break;
                case "debit":
                    a=Integer.parseInt(s1[1]);
                    a=a*-1;
                    transactions.add(a);
                    temp=temp+a;
                    count=count+1;
                    break;
                case "rollback":
                    a=Integer.parseInt(s1[1])-1;
                    temp=commits.get(a);
                    balance=temp;
                    break;
                case "abort":
                    a=Integer.parseInt(s1[1])-1;
                    if(a>=count1){
                        temp=temp-transactions.get(a);
                        transactions.set(a,0);
                    }
                    break;
                case "commit":
                    balance=temp;
                    commits.add(balance);
                    count1=count;
                    break;
            }
        }
    }
}