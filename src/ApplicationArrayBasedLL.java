public class ApplicationArrayBasedLL {
    public static void main(String [] args){
        ArrayBasedList list = new ArrayBasedList();
        System.out.println("\nIs list empty? " + list.isEmpty());

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        System.out.println("\nAfter appending elements to end: " + list);


        System.out.println("\nSize of the list: " +list.size());
        System.out.println("Index of  4: " + list.indexOf(4));
        System.out.println("Getting element at position 5: " + list.get(5) );

        System.out.println("\nIs list empty? " + list.isEmpty());


        System.out.println("\ncontains() methods");
        System.out.println("for 2: " + list.contains(2));
        System.out.println("for 38: " + list.contains(30));

        list.remove(4);
        System.out.println("\nList after remove() operation(first occurrence): " + list);

        list.removeAt(2);
        System.out.println("\nList after removeAt() operation, position 2: " + list);

        list.add(3, 8);
        System.out.println("\nAfter inserting an element, to specified position 3: " + list);

        list.clear();
        System.out.println("\nAfter clearing out thee list: " + list);

    }
}
