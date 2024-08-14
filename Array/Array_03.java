import java.util.Scanner;

// Merging of Two Arrays

public class Array_03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        
        System.out.println("Enter 5 Elements in Array A : ");
        for(int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
            c[i] = a[i];
        }
        
        System.out.println("Enter 5 Elements in Array A : ");
        for(int i=0;i<5;i++)
        {
            b[i] = sc.nextInt();
            c[4+(i+1)] = b[i];
        }
        
        System.out.println("Print the elements : ");
        for(int i=0;i<10;i++)
        {
            System.out.println(c[i]);
        }
    }
}

