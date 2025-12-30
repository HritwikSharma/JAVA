package collectionframework;
import java.util.*;
public class Linkedlist{
    public static void main(String args[]){
        LinkedList<Integer> arr=new LinkedList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
        arr.addFirst(11);
        System.out.println(arr);
        arr.add(0,15);
        System.out.println(arr);
    }
}