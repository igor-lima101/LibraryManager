public class Book {

    private String isbn;
    private String author;
    private String title;
    private int quantity;
    private Status loan;


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Status getLoan() {
        return loan;
    }

    public void setLoan(Status loan) {
        this.loan = loan;
    }

    public void removeQuantity(int value){
        this.quantity -= value;
    }

    public void addQuantity(int value){
        this.quantity += value;
    }

    public Book(String isbn, String author, String title, int quantity){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "ISBN: - {" + isbn + "}\n" +
                "Author: " + author + "\n" +
                "Title: " + title + "\n" +
                "Quantity: [" + quantity + "]\n" +
                "Status --- '" + loan + "'\n";
    }
}
