package collectionframework;
import java.util.*;
public class Hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> arr=new HashMap<>();
        arr.put("One", 1);
        arr.put("Three", 3);
        arr.put("Two", 2);
        arr.put(null, 0);               // One null key
        arr.put("Four", null);        // Null value
        arr.put("Three", 3);
        System.out.println(arr);
        System.out.println(arr.get("One"));
        System.out.println(arr.remove(null));
        System.out.println(arr.containsKey("Two"));
        System.out.println(arr.containsValue(2));
        System.out.println(arr.size());
        System.out.println(arr.keySet());
        System.out.println(arr.values());
        System.out.println(arr.entrySet());
        System.out.println(arr);
        for(Map.Entry<String,Integer>arr1:arr.entrySet()){
            System.out.println(arr1.getKey());
            System.out.println(arr1.getValue());
        }
    }
}