import java.util.TreeMap;
import java.util.Map;

public class LearnTreeMap {
    public static void main(String[] args)
    {
        Map <String , Integer> numbers = new TreeMap<>();                     //key : value
        numbers.put("One" , 1);
        numbers.put("Two" , 2);                                   /*sort values acc to alphabetical values */
        numbers.put("Three" , 3);
        numbers.put("Four" , 4);
        numbers.put("Five" , 5);
        // numbers.put("Two" , 23);   /*Override will update two:2 to two:23 */

        System.out.println(numbers);

        // /*now if we dont want it to update the key value then */
        // if (!numbers.containsKey("Two"))
        // {
        //     numbers.put("Two" , 23);
        // }
        //                      /*OR */                    /*These two methods will not override the value
        // numbers.putIfAbsent("Two" , 23);                 of the key if it was already present */

        /*How to Iterate*/

        for (Map.Entry<String , Integer> e : numbers.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        /*If only want keyset */

        for (String key : numbers.keySet())
        {
            System.out.println(key);
        }

        /*If only want valueSet */

        for (Integer value : numbers.values())
        {
            System.out.println(value);
        }

        /*to check value */

        System.out.println(numbers.containsValue(3));

        /*to check if value is empty */

        System.out.println(numbers.isEmpty());

        /*numbers.remove("key") */


        
    }
}


