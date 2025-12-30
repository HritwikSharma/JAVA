package sem3;
import java.util.*;
class prime{
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        if(a==0){
            System.out.println("Not Prime");
            System.exit(0);
        }
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                System.out.println("Not Prime");
                System.exit(0);
                break;
            }
        }
        System.out.println("Prime");
    }
}