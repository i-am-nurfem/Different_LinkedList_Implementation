
import java.util.Arrays;


public class ArrayBasedStack<T> implements MyStack<T> {
    private T[] items;
    private int MAX_SIZE;
    private int top = 0;

    public static final int INITIAL_ARRAY_SIZE = 16;

    public ArrayBasedStack() {
        this(INITIAL_ARRAY_SIZE);
    }

    public ArrayBasedStack(int size) {
        MAX_SIZE = size;
        items = (T[]) new Object[size];
    }

    @Override
    public void push(T v) {
        if (isFull()) {
            items = Arrays.copyOf(items, MAX_SIZE * 2 + 1);
        }
        items[top++] = v;

    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
        }

        T topItem = itemAtTop();
        items[--top] = null;
        return topItem;
    }

    @Override
    public T itemAtTop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
        }

        return items[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top + 1 > MAX_SIZE;
    }
}