
// abstraction = data hiding 
// 2 types : 1, interface 
// 100% abstraction pivde 
// 2. abstract class and abstract method

interface square {
    public void sarea(int x);
}

interface circle {
    final double pi = 3.14;
    public void carea(double x);
}

interface rect {
    public void rct(int x, int y);
}

class area implements square, circle, rect {
    @Override
    public void carea(double r) {
        System.out.println("Area of circle " + pi * r * r);
    }

    @Override
    public void sarea(int x) {
        System.out.println("Area of square " + x * x);
    }

    @Override
    public void rct(int x, int y) {
        System.out.println("Area of rectangle " + (x * y));
    }
}

public class Multipleinheritance {
    public static void main(String[] args) {
        area a = new area();
        a.carea(7);
        a.rct(12, 21);
        a.sarea(56);
    }

}
