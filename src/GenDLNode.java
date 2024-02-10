public class GenDLNode<T> {
    T data;
    GenDLNode<T> next;
    GenDLNode<T> prev;

    public GenDLNode(T data){
        this.data = data;
        this.next = null;
        this.prev =null;
    }
}
