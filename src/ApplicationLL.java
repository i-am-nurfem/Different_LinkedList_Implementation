

public class ApplicationLL {

    public static void main(String[] args) {
		/*LinkedBasedList l=new LinkedBasedList();
		l.add(34);
		l.add(45);
		l.printList();
		System.out.println(l.contains(78));
		System.out.println(l.contains(45));
		l.add(0, 1);
		l.printList();
		l.add(2, 5);
		l.printList();
		System.out.println("remove method");
		l.remove(45);
		l.printList();
		l.remove(1);
		l.printList();
*/

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
