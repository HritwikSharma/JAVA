import java.util.stream.Collectors;
import java.util.*;
class streamfor{
    public static void main(String args[]){
        List<Integer>a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        List<Integer>b=a.stream().filter(n->n%2==0).collect(Collectors.toList());
        for(Integer m:b){
            System.out.println(m);
        }
    }
}