import java.util.Arrays;

public class ArrayBasedSet implements IntSet {

    private static final int DEFAULT_SIZE = 1;
    private final int maxSize;
    private final int curr;
    private int size;
    private int[] setList;
    private int setSize;


    public ArrayBasedSet(int _size) {
        maxSize = _size;
        setSize = curr = size = 0;
        setList = new int[_size];
    }

    public ArrayBasedSet() {
        this(DEFAULT_SIZE);
    }

    @Override
    public int size() {
        while (size != setSize) {
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return setSize == 0;
    }

    @Override
    public boolean contains(int anEntry) {

        for (int i = 0; i < setSize; i++) {
            if (setList[i] == anEntry) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean add(int newEntry) {

        if (contains(newEntry)) {
            return false;
        } else if (setSize < maxSize) {
            setList[setSize++] = newEntry;
            return true;
        } else {
            int newSize = setSize + 1;
            int[] newArray;
            newArray = Arrays.copyOf(setList, newSize);
            newArray[setSize++] = newEntry;

            setList = newArray;
            return true;
        }

    }

    @Override
    public boolean remove(int anEntry) {
        int[] newArray = new int[setSize - 1];
        int n = 0;

        if (contains(anEntry)) {
            for (int i = curr; i < setSize - 1; i++) {
                newArray[i] = setList[n];
                if (setList[i] == anEntry) {
                    newArray[i] = setList[i + 1];
                    n++;
                }
                n++;
            }
            setSize--;
            setList = newArray;
            return true;
        }

        return false;
    }

    @Override
    public void clear() {
        setList = new int[0];
    }

    @Override
    public int[] toArray() {
        int[] arraySet = new int[this.size()];

        if (setSize >= 0) System.arraycopy(setList, 0, arraySet, 0, setSize);

        return arraySet;
    }

    @Override
    public IntSet union(IntSet arg) {

        for (int i = 0; i < setSize; i++){
                if(!(arg.contains(setList[i]))){
                    arg.add(setList[i]);
                }
        }

        return arg;
    }

    @Override
    public IntSet intersection(IntSet arg) {

        int [] array = new int[arg.size()];

        int n = 0;

        for(int i = 0; i < size(); i++){
            if(arg.contains(setList[i])){
                array[n] = setList[i];
                n++;
            }
        }

        IntSet intersect = new ArrayBasedSet();
        for (int i = 0; i < n; i++) {
            intersect.add(array[i]);
        }
        return intersect;
    }

    @Override
    public IntSet difference(IntSet arg) {

        int [] array = new int[arg.size()];

        int n = 0;

        for(int i = 0; i < size(); i++){
            if(!arg.contains(setList[i])){
                array[n] = setList[i];
                n++;
            }
        }

        IntSet difference = new ArrayBasedSet();
        for (int i = 0; i < n; i++) {
            difference.add(array[i]);
        }
        return difference;
    }

    @Override
    public String toString() {

        String s = "";

        for(int element : setList){
            s =  s + " " + element;
        }

        return s;
    }
}
