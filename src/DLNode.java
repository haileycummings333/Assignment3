public class DLNode {
    Book data;
    DLNode prev;
    DLNode next;

    public DLNode(Book data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}