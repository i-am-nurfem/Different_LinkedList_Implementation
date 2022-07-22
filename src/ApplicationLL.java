import java.util.Arrays;

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

        /*

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

         */

        IntSet listSet1 = new LinkedBasedSet();
        listSet1.add(33);
        listSet1.add(23);
        listSet1.add(14);
        listSet1.add(1);
        listSet1.add(2);
        listSet1.add(23);
        listSet1.add(18);
        listSet1.add(33);
        listSet1.add(33);
        listSet1.add(33);

        System.out.println("listSet1:" + listSet1);

        if(listSet1.contains(44))
            System.out.println("Set1 contains 44");
        else
            System.out.println("Set1 doesn't contain 44");


        IntSet listSet2 = new LinkedBasedSet();
        listSet2.add(23);
        listSet2.add(18);
        listSet2.add(33);
        listSet2.add(33);
        listSet2.add(33);

        System.out.println("listSet2:" + listSet2);

        System.out.println("Difference of two linked based sets:" + Arrays.toString(listSet1.difference(listSet2).toArray()));
        System.out.println("Intersection of two linked based sets:" + Arrays.toString(listSet1.intersection(listSet2).toArray()));
        System.out.println("Union of two linked based sets:" + Arrays.toString(listSet1.union(listSet2).toArray()));


        IntSet arraySet1 = new ArrayBasedSet();
        arraySet1.add(221);
        arraySet1.add(23);
        arraySet1.add(104);
        arraySet1.add(1);


        System.out.println("\narraySet1:" + arraySet1);


        IntSet arraySet2 = new ArrayBasedSet();
        arraySet2.add(67);
        arraySet2.add(643);
        arraySet2.add(4);
        arraySet2.add(23);


        System.out.println("arraySet2:" + arraySet2);
        System.out.println("Difference of two array based sets: " + arraySet1.difference(arraySet2));
        System.out.println("Intersection of two array based sets: " + arraySet1.intersection(arraySet2));
        System.out.println("Union of two array based sets: " + arraySet1.union(arraySet2));




    }

}


