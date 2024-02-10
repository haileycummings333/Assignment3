public class GenAList <T>{
    private static final int INITIAL_CAPACITY = 15;
    private Object[] array;
    private int size;

    // empty constructor, initialized to an initial maxSize and sets size to 0
    public GenAList() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // add new node with the given item and resize if current size equals length to make room
    public void listAdd(T item) {
        // check if the array is already full, if so -> resize
        if (size == array.length) {
            resizeArray();
        }

        // now add the item to the end of the array
        array[size] = item;

        // increase size since added an element
        size++;
    }

    // removes item at pos
    public void listRemove(int pos) {
        // check to make sure pos is within bounds of array
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // shift items to fill the gap
        for (int i = pos; i < size - 1; i++) {
            // Move all items above pos back one spot
            array[i] = array[i + 1];
        }

        // null last element
        array[size - 1] = null;

        // decrease size since removed an element
        size--;
    }

    // resize array when full
    private void resizeArray() {
        // double capacity
        int newCapacity = array.length * 2;
        // make new array
        Object[] newArray = new Object[newCapacity];

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
