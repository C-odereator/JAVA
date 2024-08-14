import java.util.Scanner;

// Deletion of Element in Array .

public class Array_02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        
        System.out.println("Enter Five Elements : ");
        for(int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter index that you want to delete : ");
        int index = sc.nextInt();
        
        for(int i=index+1;i<=4;i++)
        {
            a[i-1] = a[i];
        }
        
        System.out.println("After Deletion of Element : ");
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
        }
    }
}
