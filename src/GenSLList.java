public class GenSLList<T> {

    private GenSLNode<T> head;

    // empty constructor
    public GenSLList() {
        this.head = null;
    }

    // add item to end
    public void listAdd(T item) {
        // create a new node using SLNode class
        GenSLNode<T> newNode = new GenSLNode<>(item);

        // check if list is empty, if so then set the new node as the head
        if (head == null) {
            head = newNode;
        }
        // if list isn't empty make current node the head
        else {
            GenSLNode<T> current = head;
            // find the last node
            while (current.next != null) {
                current = current.next;
            }
            // add the new node at the end
            current.next = newNode;
        }
    }

    // remove item from pos
    public void listRemove(int pos) {
        // make sure pos is within bounds
        if (pos < 0 || (pos == 0 && head == null)) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // if removing the head
        if (pos == 0) {
            // make next node the head
            head = head.next;
        } else {
            // set current node as the head and prev as null to keep track
            GenSLNode<T> current = head;
            GenSLNode<T> prev = null;
            // count used to keep track of traversing
            int count = 0;

            // find the node at position
            while (count < pos && current != null) {
                // shift all the nodes
                prev = current;
                current = current.next;
                count++;
            }

            // check if pos is out of bounds
            if (current == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }

            // remove the node at pos
            prev.next = current.next;
        }
    }

    // convert the SLList to a string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        GenSLNode<T> current = head;

        while (current != null) {
            result.append(current.data.toString()).append("\n");
            current = current.next;
        }

        return result.toString();
    }
}
