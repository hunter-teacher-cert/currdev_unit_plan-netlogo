  """
  * Takes in a string and an alphabetized array, adds the string in the correct location
  * so as to preserve the ordering.
  * Precondition: new_item is a string, ordered_list is an alphabetized list of strings.
  * Postcondition: list_ordered now includes new_item, remains alphabetized
  """
def add_ordered(new_item, ordered_list):
    length = len(ordered_list)
    if new_item > ordered_list[length - 1]:
        #in case new item comes after final item in list
        ordered_list.append(new_item)
    else:
        #traverses array; when an item is found that's higher in the alphaet
        #than new item, new item is inserted at that index.
        for i in range(length):
            if new_item < ordered_list[i]:
                ordered_list.insert(i, new_item)
                break



#input names in roster
roster = ["Sam", "Luis", "Yosuf", "Saad", "Maddox", "Rafiki"]

#sort roster alphabeticaly
roster.sort()

new_name = input("Enter a new name for the class: ")

add_ordered(new_name, roster)

print(roster)
