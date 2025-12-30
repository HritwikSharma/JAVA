package collectionframework;
import java.util.*;
public class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> l1=new ArrayList<>();
        System.out.println(l1);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        System.out.println(l1);
        l1.set(0,8);
        System.out.println(l1);
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
    }
}