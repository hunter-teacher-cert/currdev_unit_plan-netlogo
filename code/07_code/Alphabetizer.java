import java.util.*;

public class Alphabetizer{
  /**
  * Adds a new item as the last item in an of an array, preserving
  * location of earlier items.
  * Precondition: new_item is a string, an_array is an array of strings.
  * Post condition: an_array includes new_item as its final item

  */
  public static void append(String new_item, String[] an_array){
    // to be implemented
  }

  /**
  * Adds a new item at index i within an array, preserving
  * order of earlier and later items.
  * Precondition: new_item is a string, an_array is an array of strings.
  * Post condition: an_array includes new_item at index i

  */
  public static void insert(int i, String new_item, String[] an_array){
    // to be implemented
  }


  /**
  * Takes in a string and an alphabetized array, adds the string in the correct location
  * so as to preserve the ordering.
  * Precondition: new_item is a string, list_ordered is an alphabetized array or strings.
  * Postcondition: list_ordered now includes new_item, remains alphabetized
  */
  public static void add_ordered(String new_item, String[] ordered_list){
    int length = ordered_list.length;
    if (new_item.compareTo(ordered_list[length-1]) > 0){
      // in case new item comes after final item in ordered_list
      append(new_item, ordered_list);
    } else{
      //#traverses array; when an item is found that's higher in the alphaet than new item, new item is inserted at that index. 
      for (int i = 0; i < length; i ++){
        if (new_item.compareTo(ordered_list[i]) < 0){
          insert(i, new_item, ordered_list);
          break;
        }
      }
    }
  }


  public static void main(String[] args){
    String[] roster_ordered = {"Luis", "Maddox", "Rafiki", "Saad", "Sam", "Yosuf"};
    System.out.println("Roster before adding new name: " + Arrays.toString(roster_ordered));
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a new name to add: ");
    String new_name = input.nextLine();
    add_ordered(new_name, roster_ordered);
    System.out.println("Roster after adding new name: " + Arrays.toString(roster_ordered));


  }
}
