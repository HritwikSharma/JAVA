import java.util.stream.*;
import java.util.*;
class streamred{
    public static void main(String args[]){
        List<Integer>a=new ArrayList<Integer>();
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        int sum=a.stream().reduce(0,Integer::sum);
        System.out.println(sum);
    }
}