
class studentinfo {
    public int roll;
    String name;

    public void info(int x, String y) {
        roll = x;
        name = y;
    }
}

class StudentMarks extends studentinfo {
    int eng, hin, math;

    public void mrks(int a, int b, int c) {
        eng = a;
        hin = b;
        math = c;
    }
}

class studentdata extends StudentMarks {
    public void data() {
        System.out.println("Roll no " + roll);
        System.out.println("Student name " + name);
        System.out.println("English " + eng);
        System.out.println("Maths " + math);
        System.out.println("Hindi " + hin);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        studentdata d = new studentdata();
        d.mrks(78, 87, 98);
        d.info(1, "Ankit");
        d.data();
    }
}
