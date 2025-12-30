package package1;

import java.util.*;
import java.lang.*;
class array
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int r=sc.nextInt();
        int a[]=new int[r];
        for(int i=0;i<r;i++)
        {
            System.out.println("Enter the element for "+r+" position");
            a[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        switch(c){
            case 1:
                for(int i=0;i<r;i++){
                    System.out.println(a[i]);
                }
            case 2:
                for(int j=r-1;j>=0;j--){
                    System.out.println(a[j]);
                }
            case 3:
                int t=0;
                int m;
                for(int i=0;i<r;i++){
                    for(int j=i+1;j<r;j++){
                        if(a[i]>a[j]){
                            m=a[i];
                            a[i]=a[j];
                            a[j]=m;
                        }
                    }
                }
                for(int k=0;k<r;k++){
                    System.out.println(a[k]);
                }
                break;
            case 4:
                int sum=0;
                for(int i=0;i<r;i++){
                    sum=sum+a[i];
                }
                System.out.println("sum is ="+sum);
        }
    }
}