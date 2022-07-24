public class Node<T> {
    public T data;
    public  Node<T> next;
    public Node(T val) {
        this.data=val;
        this.next=null;
    }

}