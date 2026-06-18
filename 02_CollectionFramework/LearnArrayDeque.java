import java.util.ArrayDeque;     //helps to push data from both the start and end
public class LearnArrayDeque 
{
    public static void main (String[] args)
    {
        ArrayDeque <Integer> ad = new ArrayDeque <> ();

        ad.offer(12);                  //will work as normal priorityqueue
        ad.offerFirst(34);             //will push element at first
        ad.offerLast(87);              //will push element at last

        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        System.out.println(ad.poll());
        System.out.println("Poll : " + ad);
        System.out.println(ad.pollFirst());
        System.out.println("Poll First : " + ad);
        System.out.println(ad.pollLast());
        System.out.println("Poll Last : " + ad);
        


    }
}
