import java.util.HashMap;

public class Library {

    private HashMap<String, Book> hashMap = new HashMap<>();

    public void addBook(Book book){
        if(hashMap.putIfAbsent(book.getIsbn(), book) == null){
            book.setLoan(Status.AVAILABLE);
            System.out.println("Book added: " + book.getTitle());
        }
        else{
            System.out.println("Error: book with this 'ISBN', Already exists...");
        }
    }

    public void removeBook(String isbn){
        Book book = hashMap.remove(isbn);
        if(book == null){
            System.out.println("Error: product not found...");
        }
        else{
            System.out.println("Book removed: " + book.getTitle());
        }
    }

    public void findBookByISBN(String isbn){
        Book book = hashMap.get(isbn);
        if(book == null){
            System.out.println("Book not found...");
        }
        else{
            System.out.println("Found: " + book.getTitle());
        }
    }

    public void loanBook(String isbn) {
        Book book = hashMap.get(isbn);
        if (book == null) {
            System.out.println("Error: book not found...");
            return;
        }
        if (book.getQuantity() <= 0) {
            System.out.println("Book unavailable: " + book.getTitle());
            book.setLoan(Status.UNAVAILABLE);
            return;
        }
        book.removeQuantity(1);
        if (book.getQuantity() == 0) {
            book.setLoan(Status.UNAVAILABLE);
        }
        System.out.println("Loan completed: " + book.getTitle());
    }

    public void backBook(String isbn) {
        Book book = hashMap.get(isbn);
        if (book == null) {
            System.out.println("Error: book not found...");
            return;
        }
        book.addQuantity(1);
        book.setLoan(Status.AVAILABLE);
        System.out.println("Book received: " + book.getTitle());
    }

    public void showAll(){
        for(Book book: hashMap.values()){
            System.out.println(book);
        }
    }

}
