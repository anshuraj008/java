public class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String ISBN;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    { //object initialisation block
        totalNoOfBooks++;
    }

    // Constractor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    Book(String ISBN){
    this(ISBN, "Unknown", "Unknown");   
    }

     static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }  else {
            this.isBorrowed = true;
            System.out.println("Enjoy" + this.title );
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Book is returned");
        } else {
            System.out.println("Book is not borrowed");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.returnBook();
        myBook.returnBook();
    }
}
