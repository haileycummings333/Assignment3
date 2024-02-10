public class DLList {
    /*
    4 (code) [20 points] Implement a Doubly Linked List that stores Book instances
    You will implement two classes from scratch, DLNode and DLList. Your DLList class must implement
    the following operations:

    • An empty constructor: Should create an empty DLList. This implies having a member data element
    Head of type DLNode initialized to NULL.

    • void listAdd(Book p): Should add a new DLNode with the given book to the DLList and update
    the pointers appropriately.

    • void listRemove(int pos): Should remove the item at position pos from the DLList. This implies
    updating the pointers appropriately.

    • String toString(): This method should return a string containing all the elements in the DLList. Each
    element should be in a new line when the resulting String is printed.
     */
    private DLNode head;

    // constructor
    public DLList() {
        this.head = null;
    }

    // add a book to the end of dllist
    public void listAdd(Book book) {
        //make new node with book
        DLNode newNode = new DLNode(book);

        // if empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            DLNode current = head;
            // find the last node
            while (current.next != null) {
                current = current.next;
            }
            // new node at the end
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // remove a book from the dllist at pos
    public void listRemove(int pos) {
        //check pos is within bounds
        if (pos < 0 || (pos == 0 && head == null)) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // if removing the head
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            //make current node the head
            DLNode current = head;
            int count = 0;

            // find the node at pos
            while (count < pos && current != null) {
                current = current.next;
                count++;
            }

            // check if out of bounds
            if (current == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }

            // update the pointers to remove the node at pos
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    // convert the dllist to string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        DLNode current = head;

        while (current != null) {
            result.append(current.data.toString()).append("\n");
            current = current.next;
        }

        return result.toString();
    }

}