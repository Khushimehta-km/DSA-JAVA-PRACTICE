import java.util.Comparator;
import java.util.PriorityQueue;
public class LearnPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue <Integer> pq = new PriorityQueue <>();
        pq.offer(40);
        pq.offer(12);
        pq.offer(67);
        pq.offer(78);
        pq.offer(23);
        pq.offer(43);

        System.out.println(pq);  //here priority queue will apply min heap itself while printing pq

        System.out.println(pq.poll()); //1st element of the min heap priority queue will be polled

        System.out.println(pq);  //again min heap will set the priority queue and now the min element will be shown
        System.out.println(pq.peek());

        // PriorityQueue <Integer> pq = new PriorityQueue <>(Comparator.reverseOrder());
        // pq.offer(40);
        // pq.offer(12);
        // pq.offer(67);
        // pq.offer(78);
        // pq.offer(23);
        // pq.offer(43);

        // System.out.println(pq);  //here priority queue will apply max heap itself while printing pq

        // System.out.println(pq.poll()); //1st element of the max heap priority queue will be polled

        // System.out.println(pq);  //again max heap will set the priority queue and now the max element will be shown
        // System.out.println(pq.peek());
    }
}
