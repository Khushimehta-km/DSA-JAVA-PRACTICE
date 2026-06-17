import java.util.Stack;                 //LIFO
public class LearnStack {

    public static void main(String[] args)
    {
        Stack <String> animals = new Stack <> ();
        animals.push("Lion");
        animals.push("Monkey");
        animals.push("Tiger");
        animals.push("Deer");
        animals.push("Cheetah");

        System.out.println("Stack : " + animals);

        //to check element at the top

        System.out.println(animals.peek());

        //pop : to remove the last element or top element

        System.out.println(animals.pop());
        System.out.println(animals.peek());




    }
    
}
