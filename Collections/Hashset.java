import java.util.*;

public class Hashset {

  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    // insert
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(5);

    // size of the hashset
    int size = set.size();
    System.out.println("Size of set is " + size);

    // print all elements
    System.out.println(set);

    // contains
    if (set.contains(1)) {
      System.out.println("set contain 1.");
    }
    if (!set.contains(9)) {
      System.out.println("does not contain.");
    }

    // delete
    set.remove(1);
    if (!set.contains(1)) {
      System.out.println("does not contain 1 we deleted it.");
    }

    // Iterator

    Iterator it = set.iterator();
    // System.out.println("Element" + it.next());
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}
