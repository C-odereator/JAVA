
import java.util.Scanner;

// Adding of Element in Array
public class Array_01 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        
        System.out.println("Enter Five Elements : ");
        for(int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter Index : ");
        int index = sc.nextInt();
        
        System.out.println("Enter Value : ");
        int value = sc.nextInt();
        
        for(int i=4;i>=index;i--)
        {
            a[i+1] = a[i];
        }
        a[index] = value;
        
        System.out.println("After Addition of Element : ");
        for(int i=0;i<6;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}

