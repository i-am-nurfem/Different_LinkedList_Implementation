
public class LinkedBasedSet implements IntSet {

    private IntNode head = null;
    private final IntNode node;

    public LinkedBasedSet() {
        this.node = new IntNode();
    }

    @Override
    public String toString() {

        IntNode walk = head;

        String s = "";

        while (walk != null) {
            s =  s + " " + walk.data;
            walk = walk.next;
        }

        return s;
    }

    @Override
    public int size() {
        int size = 0;

        IntNode walk = head;

        while (walk != null) {
            size++;
            walk = walk.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(int anEntry) {

        IntNode walk = head;

        while (walk != null) {
            if (walk.data == anEntry) {
                return true;
            }
            walk = walk.next;
        }
        return false;
    }

    @Override
    public int[] toArray() {
        int[] listSet = new int[this.size()];

        IntNode walk = head;

        for (int i = 0; i < listSet.length; i++) {
            if (walk != null) {
                listSet[i] = walk.data;
                walk = walk.next;
            }
        }
        return listSet;
    }

    @Override
    public boolean add(int newEntry) {

        IntNode walk = head;

        if (head == null) {
            head = new IntNode(newEntry);
            return true;
        } else if (contains(newEntry)) {
            return false;
        } else {
            while (walk != null) {
                if (walk.next == null) {
                    break;
                }
                walk = walk.next;
            }
            walk.next = new IntNode(newEntry);

        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean remove(int anEntry) {
        IntNode walk = head;

        if(head == null){
            return false;
        }

        while (walk != null){
            if(walk.next.data == anEntry){
                walk.next = walk.next.next;
                break;
            }
            walk = walk.next;
        }

        return true;
    }

    @Override
    public IntSet union(IntSet arg) {

        IntNode walk = head;

        while(walk != null){
            if(!(arg.contains(walk.data))){
                arg.add(walk.data);
            }
            walk = walk.next;
        }

        return arg;
    }


    @Override
    public IntSet intersection(IntSet arg) {
        IntNode walk = head;

        while(walk != null){
            if(arg.contains(walk.data)){
                add(walk.data);
            }
            walk = walk.next;
        }
        return arg;
    }

    @Override
    public IntSet difference(IntSet arg) {
        IntNode walk = head;

        IntSet difference = new LinkedBasedSet();

        while(walk != null){
            if(!arg.contains(walk.data)){
                difference.add(walk.data);
                walk = walk.next;
            }

            else {
                walk = walk.next;
            }
        }
      return difference;
    }


}
