
import java.util.*;

public class Hashmap {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // Insertion
    map.put("india", 120);
    map.put("us", 20);
    map.put("china", 150);
    map.put("japan", 200);

    System.out.println(map);

    map.put("us", 50);
    System.out.println(map);

    // search
    if (map.containsKey("china")) {
      System.out.println("key is present");
    } else {
      System.out.println("key is not present");
    }

    // second method to search
    System.out.println(map.get("china"));
    System.out.println(map.get("chinaa"));

    // for(int val : arr)

    System.out.println("Hello " + map.entrySet());
    // Iterator
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      System.out.print(e.getKey() + "  ");
      System.out.println(e.getValue());
    }

    // second method to iterate
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key + " " + map.get(key));
    }

    // remove the key and getValue

    map.remove("china");
    System.out.println(map);
  }

}
