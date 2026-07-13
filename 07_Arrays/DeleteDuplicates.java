import java.util.Scanner;;
public class DeleteDuplicates {

    int dlt(int n , int [] arr)
    {
    
        int i = 0;
        for (int j = i + 1 ; j < n ; j++)
        {
            if (arr[j] != arr[i])
            {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
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

        DeleteDuplicates dd = new DeleteDuplicates();
        int k = dd.dlt(n , arr);
        System.out.print("Unique Elements:");
        for (int i = 0 ; i < k ; i++){
        System.out.print(arr[i] + " ");
        }
    }
    
}
