public class GenDLList<T> {

    private GenDLNode<T> head;

    // constructor
    public GenDLList() {
        this.head = null;
    }

    // add an item to the end of the list
    public void listAdd(T item) {
        // make a new node with item
        GenDLNode<T> newNode = new GenDLNode<>(item);

        // if empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            GenDLNode<T> current = head;
            // find the last node
            while (current.next != null) {
                current = current.next;
            }
            // new node at the end
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // remove an item from the DLL at pos
    public void listRemove(int pos) {
        // check pos is within bounds
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
            // make current node the head
            GenDLNode<T> current = head;
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

    // convert the DLL to a string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        GenDLNode<T> current = head;

        while (current != null) {
            result.append(current.data.toString()).append("\n");
            current = current.next;
        }

        return result.toString();
    }
}
