public class BaseCondition
{
    int count = 0;
    public void function()
    {
        if (count == 3)
        {
            return;
        }
        else
        {
            System.out.println(count);
            count++;
            function();
        }
    }

    public static void main(String[] args)
    {
        BaseCondition bc = new BaseCondition();
        bc.function();
    }
}
