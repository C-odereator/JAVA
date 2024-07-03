
class AA {
    int a, b;

    public void getdata(int x, int y) {
        a = x;
        b = y;
    }
}

class BB extends AA {
    public void show() {
        int c = a + b;
        System.out.println("Addition is " + c);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        BB b = new BB();
        b.getdata(23, 32);
        b.show();
    }

}
