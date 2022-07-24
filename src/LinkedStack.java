import javax.management.RuntimeErrorException;


public class LinkedStack<T> implements MyStack<T> {

    private Node<T> top=null;
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(T v) {
        Node n = new Node(v);
        n.next = top;
        top = n;
    }

    @Override
    public T pop() {
        if(isEmpty())
            throw new RuntimeErrorException(null, "Stack Underflow");
        T val=top.data;
        top=top.next;
        return val;
    }

    @Override
    public T itemAtTop() {
        if(isEmpty())
            throw new RuntimeErrorException(null, "Stack Underflow");
        T val=top.data;
        return val;
    }

}
