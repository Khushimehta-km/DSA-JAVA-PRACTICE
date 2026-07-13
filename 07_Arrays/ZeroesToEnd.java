import java.util.Scanner;
import java.util.ArrayList;


public class ZeroesToEnd {
    public void code(int n , int[] arr)
    {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        int nonzero = list.size();

        for (int i = 0 ; i < nonzero ; i++){
            arr[i] = list.get(i);

        }
        for (int i = nonzero ; i < n ; i++){
            arr[i] = 0;
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
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        ZeroesToEnd ze = new ZeroesToEnd();
        ze.code(n , arr);
    }
    
}
