
public interface IntList {
    boolean 	add(int e);
    //Appends the specified element to the end of this list.

    void 	add(int index, int element);
    //Inserts the specified element at the specified position in this list.

    void 	clear();
    //Removes all of the elements from this list.

    boolean 	contains(int o);
    //Returns true if this list contains the specified element.

    int 	get(int index);
    //Returns the element at the specified position in this list.

    int 	indexOf(int e);
    //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not //contain the element.

    boolean 	isEmpty();
    //Returns true if this list contains no elements.

    void 	removeAt(int index);
    //Removes the element at the specified position in this list.

    boolean 	remove(int o);
    //Removes the first occurrence of the specified element from this list, if it is present.

    int size();

}
