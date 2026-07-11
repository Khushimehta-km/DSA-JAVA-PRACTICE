import java.util.Scanner;
public class Second {
    public void largest(int n , int[] arr){
        int l = arr[0];
        int sl = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ; i++)
        {
            if (arr[i] > l)
            {
                sl = l;
                l = arr[i];
            }

            else if (arr[i] < l && arr[i] > sl){
                sl = arr[i];

            }
        }
        System.out.println("SecondLargest Element:" + sl);

    }

    public void smallest(int n , int[] arr){
        int s = arr[0];
        int ss = Integer.MAX_VALUE;;
        for (int i = 0 ; i < n ; i++)
        {
            if (arr[i] < s)
            {
                ss = s;
                s = arr[i];
            }

            else if (arr[i] > s && arr[i] < ss){
                ss = arr[i];

            }
        }
        System.out.println("SecondSmallest Element:" + ss);

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
        Second s = new Second();
        s.largest(n , arr);
        s.smallest(n , arr);
    }
    
}
