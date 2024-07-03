
public class Pattern1 {
    public static void main(String[] args) {
        // box Pattern
        // for(int i=0;i<5;i++)
        // {
        // for(int j=0;j<5;j++)
        // {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }

        // hollow box pattern
        // for(int i=0;i<5;i++)
        // {
        // for(int j=0;j<5;j++)
        // {
        // if(i==0 || i==4 || j==0 || j==4)
        // {
        // System.out.print("* ");
        // }
        // else
        // {
        // System.out.print(" ");
        // }
        // }
        // System.out.println("");
        // }

        // hollow right angle triangle
        // for(int i=0;i<5;i++)
        // {
        // for(int j=0;j<5;j++)
        // {
        // if(i==4 || i==j || j==0)
        // {
        // System.out.print("* ");
        // }
        // else
        // {
        // System.out.print(" ");
        // }
        // }
        // System.out.println("");
        // }

        // solid right angle triangle
        // for(int i=0;i<5;i++)
        // {
        // for(int j=0;j<=i;j++)
        // {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // }

        // opposite right angle triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
