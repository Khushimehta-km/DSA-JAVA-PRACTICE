/*Left Rotate array by D places (Brute force) arr[]  = {1 , 2 , 3 , 4 , 5 , 6} */
import java.util.Scanner;
import java.util.ArrayList;

public class Rotate {
    public void rotated(int d , int n , int[] arr)
    {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0 ; i < d ; i++){
            list.add(arr[i]);
        }
        for (int i = d ; i < n ; i++){
            arr[i-d] = arr[i];
        }
        for (int i = n-d ; i < n ; i++)
        {
            arr[i] = list.get(i-(n-d));
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
        int d = sc.nextInt();
        Rotate r = new Rotate();
        r.rotated(d , n , arr);
        
    }

    
}
