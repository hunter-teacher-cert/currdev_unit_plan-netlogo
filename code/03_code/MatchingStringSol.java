public class MatchingString
{
    private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};

    public static int findString(String myString)
    {
        String word = null;

        for (int index = 0; index < arr.length; index++)
        {
            word = arr[index];

                if (word.equals(myString))
                {
                    return index;
                }
        }
        return -1;
    }
}
