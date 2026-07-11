import java.util.Scanner;
import java.util.ArrayList;
public class MergeSort {

    public void mergeSort(int[] arr , int low , int high)
    {
        if (low >= high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr ,low ,mid);
        mergeSort(arr ,mid+1 ,high);
        merge(arr , low , mid , high);
    }

    public void merge(int[] arr , int low , int mid , int high)
    {
        ArrayList <Integer> temp = new ArrayList<>();
        
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high)
        {
            if (arr[left] < arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }

        


        }
            while(left <= mid)
            {
                temp.add(arr[left]);
                left++;
            }

            while(right <= high)
            {
                temp.add(arr[right]);
                right++;
            }

            for (int i = low; i <= high; i++) {
                    arr[i] = temp.get(i - low);
            }

            for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
            System.out.print(arr[i]+" ");
}

        

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr , 0 , n-1);
        
        
    }


    
}
