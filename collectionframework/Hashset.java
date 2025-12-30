package collectionframework;
import java.util.*;
class Hashset{
    public static void main(String args[]){
        HashSet<String> arr=new HashSet<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        System.out.println(arr);
        arr.remove("C");
        System.out.println(arr);
        System.out.println(arr.contains("D"));
        System.out.println(arr.size());
    }
}