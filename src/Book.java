public class Book {
    /*
    create a Book class that represents a book in the bookstore. The class should have
    the following member data attributes: title(string), author(string), and price(double).
     */
    private String title, author;
    private double price;



    // constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }



    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }



    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    // toString method prints values like example provided
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }

}
