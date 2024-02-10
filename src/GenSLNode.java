public class GenSLNode<T> {
    T data;
    GenSLNode<T> next;

    public GenSLNode(T data) {
        this.data = data;
        this.next = null;
    }
}
