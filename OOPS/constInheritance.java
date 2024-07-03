
class empdata {
    public int empno;
    public String name;

    public empdata(int x, String y) {
        empno = x;
        name = y;
    }
}

class empdetails extends empdata {
    public int age, sal;
    long ctcNo;

    public empdetails(int x, String y, int a, int s, long n) {
        super(x, y);
        age = a;
        sal = s;
        ctcNo = n;
    }
}

class showEmp extends empdetails {
    public showEmp(int x, String y, int a, int s, long n) {
        super(x, y, a, s, n);
    }

    public void display() {
        System.out.println("Employee Id " + empno);
        System.out.println("Employee Name " + name);
        System.out.println("Age " + age);
        System.out.println("Contact Number " + ctcNo);
        System.out.println("Salary " + sal);
    }
}

public class constInheritance {
    public static void main(String[] args) {
        showEmp s = new showEmp(1, "Nothing", 23, 15000, 76535442662L);
        s.display();
    }

}
