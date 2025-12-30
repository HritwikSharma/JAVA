package collectionframework;
import java.util.*;
public class Linkedhm{
    public static void main(String args[]){
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();

        // put()
        linkedMap.put("Apple", 10);
        linkedMap.put("Banana", 20);
        linkedMap.put("Mango", 30);
        linkedMap.put(null, 0);              // Null key allowed
        linkedMap.put("Banana", 25);         // Replace value
        linkedMap.put("Orange", null);       // Null value

        // get()
        System.out.println("Value for 'Mango': " + linkedMap.get("Mango"));

        // containsKey()
        System.out.println("Contains key 'Apple'? " + linkedMap.containsKey("Apple"));

        // containsValue()
        System.out.println("Contains value 25? " + linkedMap.containsValue(25));

        // remove()
        linkedMap.remove("Mango");

        // size()
        System.out.println("Size: " + linkedMap.size());

        // isEmpty()
        System.out.println("Is empty? " + linkedMap.isEmpty());

        // keySet()
        System.out.println("Keys: " + linkedMap.keySet());

        // values()
        System.out.println("Values: " + linkedMap.values());

        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}