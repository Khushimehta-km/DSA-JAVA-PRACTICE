import java.util.Scanner;
public class QuickSort {

    public int partition(int[] arr , int low , int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        
        while(i<j){
            while(arr[i]<=pivot && i <= high-1){
                i++;
            }
            while(arr[j]>pivot && j >= low+1){
                j--;
            }
            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
                
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }

    public void quicksort(int [] arr  , int low , int high)
    {
        if (low < high)
        {
            int partitionIndex = partition(arr , low , high);
            quicksort(arr , low , partitionIndex-1);
            quicksort(arr , partitionIndex+1 , high);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        QuickSort qs = new QuickSort();
        qs.quicksort(arr , 0 , n-1);

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " "); 
        }

        

    }
    
}
