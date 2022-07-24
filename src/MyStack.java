
public interface MyStack<T> {
    boolean isEmpty();
    boolean isFull();
    void push(T v);
    T pop();
    T itemAtTop();
}
