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
        //need to add nethod
    }

    // remove book from pos
    public void listRemove(int pos) {
        //need to add method
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