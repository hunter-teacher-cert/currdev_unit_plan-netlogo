public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     double total = 0;
     for (int val : values)
     {
       total  = total + val;
     }
     return total / values.length;
   }
}
