import java.util.Scanner;

public class Bubble_sort
{
    public void selection(int n , int[] arr)
    {
        for (int i = 0 ; i < n-1 ; i++)
        {
            int max = i;
            for (int j = i+1; j < 0 ; j--)
            {
                if (arr[j] > arr[max]) 
                {
                    max = j;
                }
            
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bubble_sort ss = new Bubble_sort();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        ss.selection(n,arr);
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + ",");
        }
        
        
    }

}