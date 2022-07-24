import java.util.Arrays;

public class ApplicationLL {

    public static void main(String[] args) {

		LinkedBasedList l=new LinkedBasedList();
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

    }

}


