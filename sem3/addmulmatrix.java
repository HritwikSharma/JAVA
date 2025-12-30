package sem3;
import java.util.*;
class addmulmatrix{
    public static void main(String args[]){
        int a[][]={{1,1},{1,1}};
        int b[][]={{2,2},{2,2}};
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("1 for add 2 for multiply");
        int c=sc.nextInt();
        if(c==1){
            if(a[0].length!=b[0].length || a.length!=b.length){
                System.out.println("Not compatible");
                System.exit(0);
            }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.print(a[i][j]+b[i][j]+" ");
                }
                System.out.println();
            }
        }
        else if(c==2){
            if(a[0].length!=b.length){
                System.out.println("Not compatible");
                System.exit(0);
            }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    sum=0;
                    for(int k=0;k<a[0].length;k++){
                        sum+=a[i][k]*b[k][j];
                    }
                    System.out.print(sum+" ");
                }
                System.out.println();
            } 
        }
    }
}