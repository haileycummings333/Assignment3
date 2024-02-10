public class TestingGenerics {
    public static void main(String[] args) {
        Book book1 = new Book("wireless networks", "Anke Berr", 14.99);
        Book book2 = new Book("crème waffles for dummies", "Piro Lane", 24.79);

        // using generics
        GenAList<Book> booksList = new GenAList<>();
        //GenSLList<Book> booksList = new GenSLList<>();
        //GenDLList<Book> booksList = new GenDLList<>();

        // add books to list
        booksList.listAdd(book1);
        booksList.listAdd(book2);
        booksList.listAdd(book1);
        booksList.listAdd(book2);

        // print list
        System.out.println("Original AList:");
        System.out.println(booksList.toString());

        // remove element at pos 1
        booksList.listRemove(1);

        // print new list
        System.out.println("AList after removing the element at position 1:");
        System.out.println(booksList.toString());

    }
}