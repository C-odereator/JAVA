
import java.util.Scanner;

class student {
    int rno;
    String name;
    double fee;

    public student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No");
        rno = sc.nextInt();
        System.out.print("Enter Name ");
        name = sc.next();
        System.out.print("Enter Fee ");
        fee = sc.nextInt();
        sc.close();
    }

    public void show() {
        System.out.println("Details are");
        System.out.println(rno + "\t" + name + "\t" + fee);
    }

}

public class constructor {
    public static void main(String[] args) {
        student s = new student();
        s.show();
    }

}
