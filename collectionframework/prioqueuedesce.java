package collectionframework;
import java.util.*;
public class prioqueuedesce{
    public static void main(String args[]){
        PriorityQueue<Integer> arr=new PriorityQueue<>((a,b)->b-a);
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
        System.out.println(arr.size());
    }
}