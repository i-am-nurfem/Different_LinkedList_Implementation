import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayBasedList implements IntList {
//to be implemented by you until 20/07/202

    private static final int DEFAULT_SIZE = 5;
    private final int maxSize;
    private int[] listArray;
    private int listSize;
    private final int curr;
    private int size;


    ArrayBasedList(int _size) {
        maxSize = _size;
        listSize = curr = 0;
        listArray = new int[_size];
    }

    ArrayBasedList() {
        this(DEFAULT_SIZE);
    }

    @Override
    public boolean add(int e) {
        if (listSize < maxSize) {
            listArray[listSize++] = e;
            return true;
        }

        int newSize = listSize + 1;
        int[] newArray;
        newArray = Arrays.copyOf(listArray, newSize);
        newArray[listSize++] = e;

        listArray = newArray;

        return false;
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public boolean contains(int o) {
        for (int i = 0; i < listSize; i++) {
            if (listArray[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(int e) {
        int index = 1;

        if (contains(e)) {
            for (int j : listArray) {
                if (j == e) {
                    return index;
                }
                index++;
            }

        }
        System.out.println("List does not contain " + e);
        return -1;
    }

    @Override
    public int get(int index) {
        if (index <= listSize) {
            return listArray[index - 1];
        }
        System.out.println("list is out of bounds for " + index);
        return -1;
    }

    @Override
    public int size() {
        size = 0;

        while (size != listSize) {
            size++;
        }
        return size;
    }

    @Override
    public void removeAt(int index) {

        int[] newArray = new int[listSize - 1];
        int n = 0;

        if (index > listSize) {
            System.out.println("Out of bounds");

        }

        for (int i = curr; i <= listSize; i++) {
            if (n <= listSize - 1) {
                newArray[i] = listArray[n];
            }
            if (i == index - 1) {
                newArray[i] = listArray[i + 1];
                n++;
            }
            n++;
        }
        listSize--;
        listArray = newArray;

    }


    @Override
    public boolean remove(int o) {

        int[] newArray = new int[listSize - 1];
        int count = 0, n = 0;

        if (contains(o)) {
            for (int i = curr; i < listSize - 1; i++) {
                newArray[i] = listArray[n];
                if (listArray[i] == o && count == 0) {
                    newArray[i] = listArray[i + 1];
                    count++;
                    n++;
                }
                n++;
            }
            listSize--;
            listArray = newArray;
            return true;
        }

        return false;
    }


    @Override
    public void clear() {
        listArray = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(listArray);
    }

    @Override
    public void add(int index, int element) {

        int newSize = listSize + 1;
        int[] newArray = new int[newSize];

        for (int i = 0; i < listSize; i++) {

            if (i == index - 1) {

                for (int j = i; j < listArray.length; j++) {
                    int temp = listArray[j];
                    newArray[i] = element;
                    newArray[j + 1] = temp;

                }
                listSize = curr;
                break;
            }
            newArray[i] = listArray[i];

        }

        listArray = newArray;
    }


}
