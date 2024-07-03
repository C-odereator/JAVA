
class data {
    private int a, b;

    public void getdata(int x, int y) {
        a = x;
        b = y;
    }

    public void show() {
        System.out.println("Addition is " + (a + b));
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        data d = new data();
        d.getdata(2, 2);
        d.show();
    }
}
