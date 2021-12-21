public class LessonFive{

  public static int max_val(int[] arr){
    int max_val = arr[0];
    for (int i = 1; i < arr.length; i++){
      if (arr[i] > max_val){
        max_val = arr[i];
      }
    }
    return max_val;
  }

  public static int find_num(String[] arr, String target){
    int counter = 0;
    for (String item : arr){
      if (item.equals(target)){
        counter++;
      }
    }
    return counter;
  }

  public static int[] move_right(int[] arr){
    int[] temp = new int[arr.length];
    for (int i =0; i < arr.length - 1; i++){
      temp[i+1] = arr[i];
    }
    temp[0]  = arr[arr.length-1];
    arr = temp;
    return arr;
  }
  
 public static String print_array(int[] arr){
   String str = "";
   for (int item : arr){
     str += item + ", ";
   }
   return str;
 }



  public static void main(String[] args){
    int[] nums = {2, 3, 5, 10, 1};
    System.out.println(max_val(nums));

    String[] letters = {"A", "B", "A", "A", "B"};
    System.out.println(find_num(letters, "A"));

    int[] my_array = {1,2,3,4,5};
    print_array(my_array);
    print_array(move_right(my_array));
  }
}
