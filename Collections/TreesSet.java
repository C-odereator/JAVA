import java.util.*;

public class TreesSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        //insert 
        // ts.add("D");
        // ts.add("E");
        // ts.add("C");
        // ts.add("F");
        // ts.add("B");
        // ts.add("A");
        // ts.add("G");
        // System.out.println(ts);


        ts.add(10);
        ts.add(56);
        ts.add(32);
        ts.add(67);
        ts.add(45);
        ts.add(98);
        ts.add(23);
        System.out.println(ts);

        // remove a single element
        ts.remove(10);
        System.out.println(ts);

        // delete all elemenets in array
        ts.clear();
        System.out.println(ts);

    }
}
