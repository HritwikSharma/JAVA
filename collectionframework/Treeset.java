package collectionframework;
import java.util.*;
public class Treeset{
    public static void main(String args[]){
        TreeSet<Integer> arr=new TreeSet<>();
        arr.add(6);
        arr.add(7);
        arr.add(5);
        System.out.println(arr);
        System.out.println(arr.higher(6));
        System.out.println(arr.lower(6));
        System.out.println(arr.ceiling(6));
        System.out.println(arr);
        arr.add(8);
        arr.add(9);
        arr.add(0);
        System.out.println(arr);
        System.out.println(arr.first());
        System.out.println(arr.last());
        SortedSet<Integer> range15to45 = arr.subSet(15, 45);  // 15 (inclusive) to 45 (exclusive)
        System.out.println("Subset (15 to 45): " + range15to45);
        
        SortedSet<Integer> lessThan40 = arr.headSet(40);  // Elements less than 40
        System.out.println("HeadSet (less than 40): " + lessThan40);
        
        SortedSet<Integer> from20Onward = arr.tailSet(20);  // Elements >= 20
        System.out.println("TailSet (greater than or equal to 20): " + from20Onward);

    }
}