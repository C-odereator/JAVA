
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new <String>ArrayList();

        // add data in array
        list.add("hello");
        list.add("public");
        list.add("array");
        list.add("list");
        System.out.println(list);

        // add data between the array
        list.add(2, "nothing");
        System.out.println(list);

        // second method
        list.set(0, "some");
        System.out.println(list);

        // get element from array
        String get = list.get(0);
        System.out.println(get);

        // remove the data from array
        list.remove(4);
        System.out.println(list);

        // get size of array list
        int size = list.size();
        System.out.println(size);

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting in arraylist
        Collections.sort(list);
        System.out.println(list);
    }
}
