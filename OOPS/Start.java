
import java.util.*;
import java.lang.Integer;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new <Integer>ArrayList();
        int c, e = 0;
        do {
            System.out.println("Enter number");
            a.add(sc.nextInt());
            System.out.println("Do you want to continue");
            c = sc.nextInt();
        } while (c == 1);
        for (int i = 0; i < a.size(); i++) {
            int b = 0;
            for (int j = 1; j <= a.get(i); j++) {
                if (a.get(i) % j == 0) {
                    b++;
                }
            }
            if (b == 2) {
                e++;
                if (e == 1) {
                    System.out.println("Prime Numbers are");
                }
                System.out.println(a.get(i));
            }
        }

    }

}
