public class SLList {
    /*
    3 (code) [20 points] Implement a Singly Linked List that stores Book instances
    You will implement two classes from scratch, SLNode and SLlist. Your SLList class must implement the
    following operations:

    • An empty constructor: Should create an empty SLList. This implies having a member data element
    Head of type SLNode initialized to NULL.

    • void listAdd(Book p): Should add a new SLNode with the given book to the end of the SLList and
    update the pointers appropriately.

    • void listRemove(int pos): Should remove the item at position pos from the SLList. This implies
    updating the pointers appropriately.

    • String toString(): This method should return a string containing all the elements in the SLList. Each
    element should be in a new line when the resulting String is printed.
     */

    private SLNode head;

    // empty constructor
    public SLList() {
        this.head = null;
    }

    // add book to end
    public void listAdd(Book book) {
        //create a new node using slnode class
        SLNode newNode = new SLNode(book);

        // check if list is empty, if so then set the new node as the head
        if (head == null) {
            head = newNode;
        }
        // if list isn't empty make current node the head
        else {
            SLNode current = head;
            // find the last node
            while (current.next != null) {
                current = current.next;
            }
            // add the new node at the end
            current.next = newNode;
        }


    }

    // remove book from pos
    public void listRemove(int pos) {
        //make sure pos is with bounds
        if (pos < 0 || (pos == 0 && head == null)) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // if removing the head
        if (pos == 0) {
            //make next node the head
            head = head.next;
        } else {
            //set currrent node as the head and prev as null to keep track
            SLNode current = head;
            SLNode prev = null;
            //count used to keep track of traversing
            int count = 0;

            // find the node at position
            while (count < pos && current != null) {
                //shift all the nodes
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

    // convert the sllist to string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        SLNode current = head;

        while (current != null) {
            result.append(current.data.toString()).append("\n");
            current = current.next;
        }

        return result.toString();
    }


}