
class ovd {
    int lngt, brdt, rds;

    public void cal(int x, int y) {
        lngt = x;
        brdt = y;
    }

    public void cal(int r) {
        rds = r;
    }

    public void cal() {
        System.out.println(lngt * brdt);
        System.out.println(Math.PI * rds * rds);
    }
}

public class methodovd {
    public static void main(String[] args) {
        ovd cal = new ovd();
        cal.cal(3, 6);
        cal.cal(5);
        cal.cal();
    }

}
