//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("saosk", "George", "Game of thrones", 1);
        Book book2 = new Book("ppol", "Lisa", "Life", 2);
        Book book3 = new Book("asal", "Martin", "True rules", 3);
        Book book4 = new Book("acc", "Oliver", "Olx", 4);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.showAll();

        System.out.println("-------");
        System.out.println("FIND BOOK BY ISBN");
        library.findBookByISBN("ppol");

        System.out.println("-------");
        System.out.println("REMOVE BOOK");
        library.removeBook("acc");

        System.out.println("-------");
        System.out.println("LOAN BOOK");
        library.loanBook("saosk");

        library.showAll();

        library.loanBook("saosk");

        library.backBook("saosk");


    }
}