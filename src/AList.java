public class AList {
    /*An empty constructor: Should create an empty AList. This implies having an array initialized to an
    initial maxSize and setting size to 0.

    • void listAdd(Book p): Should add a new node with the given book to the AList and resize when
    appropriate.

    • void listRemove(int pos): Should remove the item at position pos from the AList. This implies
    shuffling items if necessary and updating the size.

    • String toString(): This method should return a string containing all the elements in the AList. Each
    element should be in a new line when the resulting String is printed
     */

    private static final int INITIAL_CAPACITY = 15;
    private Book[] array;
    private int size;

    // empty constructor, initialized to an initial maxSize and sets size to 0
    public AList() {
        array = new Book[INITIAL_CAPACITY];
        size = 0;
    }

    // add new node with given book and resizes if current size equals length to make room
    public void listAdd(Book book) {
        // check if the array is already full, if so -> resize
        if (size == array.length) {
            resizeArray();
        }

        // now add the book to the end of the array
        array[size] = book;

        //increase size since added an element
        size++;
    }

    // removes book at pos
    public void listRemove(int pos) {
        //check to make sure pos is within bounds of array
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // shift items to fill gap
        for (int i = pos; i < size - 1; i++) {
            //move all items above pos back one spot
            array[i] = array[i + 1];
        }

        // null last element
        array[size - 1] = null;

        //decrease size since removed an element
        size--;
    }

    // resize array when full
    private void resizeArray() {
        //double capacity
        int newCapacity = array.length * 2;
        //make new array
        Book[] newArray = new Book[newCapacity];

        // copy elements to the new array
        System.arraycopy(array, 0, newArray, 0, size);

        // update array reference
        array = newArray;
    }

    // convert the list to a string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < size; i++) {
            result.append(array[i].toString()).append("\n");
        }

        return result.toString();
    }

}
