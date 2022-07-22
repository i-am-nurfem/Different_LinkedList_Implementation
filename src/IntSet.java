/** An interface that describes the operations of a set of objects. */
public interface IntSet {
    int size();
    boolean isEmpty();

    /** Adds a new entry to this set, avoiding duplicates.
     @param newEntry The object to be added as a new entry.
     @return True if the addition is successful, or
     false if the item already is in the set. */
    boolean add(int newEntry);

    /** Removes a specific entry from this set, if possible.
     @param anEntry The entry to be removed.
     @return True if the removal was successful, or false if not. */
    boolean remove(int anEntry);

    void clear();//clears the content of set
    boolean contains(int anEntry); // return true if anEntry is currently in the Set
    int[] toArray(); //return all the items currently in the list as an array
    String toString();// returns the content of set as a string

    /*
    The union of two sets consists of their contents combined into a new set.
    Note that the union of two sets can not contain duplicate items.. Note that union does not affect the
    contents of set1 and set2.
    */
    IntSet union(IntSet arg);

    /*
    The intersection of two set is a new set of the entries that occur in both sets. That is, it contains the overlapping entries.
    */
    IntSet intersection(IntSet arg);

    /*
    The difference of two collections is a new collection of the entries that would be left in one collection after removing those that also occur in the second.
    */
    IntSet difference(IntSet arg);


}
