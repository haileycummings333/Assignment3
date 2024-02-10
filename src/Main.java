public class Main {

    /*1 (code) [7 points] Create a Book class that represents a book in the bookstore. The class should have
the following member data attributes: title(string), author(string), and price(double).
Example instance would have the following values:
title: Black Clover
author: Yuki Tabata
price: 20.49




2 (code) [20 points] Implement an Array-based List that stores Book instances
You will implement an AList class from scratch. Your AList class must implement the following
operations:
• An empty constructor: Should create an empty AList. This implies having an array initialized to an
initial maxSize and setting size to 0.
• void listAdd(Book p): Should add a new node with the given book to the AList and resize when
appropriate.
• void listRemove(int pos): Should remove the item at position pos from the AList. This implies
shuffling items if necessary and updating the size.
• String toString(): This method should return a string containing all the elements in the AList. Each
element should be in a new line when the resulting String is printed.




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


5 (code) [33 points] Implement a version of your AList, SLList, and DLList that uses generics and would
work with any type of object and not only Book
Example: Starting with an empty AList booksList = new AList();
A call to booksList.toString() returns:
Empty List
After the following calls:
booksList.listAdd(book1);
booksList.listAdd(book1);
booksList.listAdd(book2);
booksList.listAdd(book1);
A call to booksList.toString(list) returns:
{bookName:wireless networks, author:Anke Berr, price:14.99}
{bookName:wireless networks, author:Anke Berr, price:14.99}
{bookName:crème waffles for dummies, author:Piro Lane, price:24.79}
{bookName:wireless networks, author:Anke Berr, price:14.99}
After the following calls:
listRemove(1); // removes element at index 1
A call to booksList.toString(list) returns:
{bookName:wireless networks, author:Anke Berr, price:14.99}
{bookName:crème waffles for dummies, author:Piro Lane, price:24.79}
{bookName:wireless networks, author:Anke Berr, price:14.99}
Note: The example above would produce the same output after replacing the type of the booksList from
Alist to SLList or DLList.
    * */

}