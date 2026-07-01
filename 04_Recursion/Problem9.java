/*Reverse an Array using Recursion */

import java.util.Scanner;
public class Problem9
{
    public void rev(int n , int arr[] , int i)
    {
        if (i >= n/2)
        {
            return;
        }
        else
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n - i - 1] = temp;
            rev(n , arr , i+1);
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
    Problem9 p = new Problem9();
    p.rev(n , arr , 0);

    for (int i = 0 ; i < n ; i++)
    {
        System.out.print(arr[i] + " ");
    }
}
}