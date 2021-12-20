public class PrintArraySol
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"w", "x", "y", "z"};
        printArr(arr);
    }

    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(i + ". " + arr[i]);
        }
    }
}
