import java.util.Scanner;
public class LargestElement {

    public void code(int n , int[] arr)
    {
        int largest = arr[0];
        for (int i = 0 ; i < n-1 ; i++)
        {
            if (arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is:" + largest);
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

        LargestElement le = new LargestElement();
        le.code(n , arr);
    }
    
}
