class InsertionSorting 
{
    public static void main(String[] args) 
    {
        int a[] = { 4,6,5,7,2,3 };

        for(int i=0;i<a.length;i++)
        {
            int temp = 0;
            int min = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        
        System.out.print("Insertion Sorting : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
