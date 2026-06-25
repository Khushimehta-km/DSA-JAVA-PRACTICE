import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String[] args)
    {
        // int[] numbers = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        // int index = Arrays.binarySearch(numbers , 4);                                 /*Works only on a sorted array*/
        // System.out.println("The index of element 4 in the array is :" + index);

        Integer[] numbers = {10 , 12 , 54 , 6 , 34 , 87 , 76 , 66 , 34};
        Arrays.sort(numbers);
        for (int i : numbers)
        {
        System.out.print(i + " ");
        }
    }
}
