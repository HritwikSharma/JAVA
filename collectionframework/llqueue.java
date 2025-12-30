package collectionframework;
import java.util.*;
public class llqueue{
    public static void main(String args[]){
        Queue <Integer> arr=new LinkedList<>();
        arr.add(20);
        arr.add(30);
        arr.add(10);
        System.out.println(arr);
        System.out.println(arr.peek());
        System.out.println(arr);
        System.out.println(arr.element());
        System.out.println(arr);
        System.out.println(arr.remove());
        System.out.println(arr);
        System.out.println(arr.poll());
        System.out.println(arr);
    }
}