
import java.util.*;
// error = 1. compile time error
//         2. runtime error
public class ExceptionError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number");
        int c[] = new int[10];
        try {

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Addition is " + (a / b));
            // c[13] = 3;
        } catch (Exception e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
        System.out.println("this message is out side of the code");

        // for specific exceptions

        // System.out.println("Enter two Number");
        // try
        // {
        // int a= sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println(a/b);
        // }
        // catch (ArithmeticException e)
        // {
        // System.out.println("Arithmetic error: "+e.getMessage());
        // }
        // System.out.println("this message is out side of the code");
        // System.out.println();
        // int c[] = new int[10];
        // try
        // {
        // c[13] = 3;
        // }
        // catch (ArrayIndexOutOfBoundsException e)
        // {
        // System.out.println("Size dekho bhai: "+e.getMessage());
        // }
        sc.close();
    }
}
