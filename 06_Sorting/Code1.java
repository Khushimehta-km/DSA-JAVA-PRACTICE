import java.util.Scanner;
public class Code1 {
    public void m1(int n , int[] arr)
    {
        for (int i = 0 ; i < n-1 ; i++)
        {
            int min = i;
            for (int j = i + 1 ; j < n ; j++){
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            /*swapping*/

            int temp = arr[min] /*9*/ ;
            arr[min] = arr[i]; /*13*/
            arr[i] = temp;   /*9*/
        }

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
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
        Code1 c = new Code1();
        c.m1(n , arr);
    }
}
