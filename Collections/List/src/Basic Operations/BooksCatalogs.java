package List.src.Search;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalogs {
    private final List<Book> bookList;

    public BooksCatalogs() { this.bookList = new ArrayList<>();}

    public void addBook(String title, String author, int publicationYear){
        bookList.add(new Book(title, author, publicationYear));
    }

    public List<Book> searchForAuthor(String author){
        List<Book> booksPerAuthor = new ArrayList<>();
        
        if(!bookList.isEmpty()){
            for(Book l : bookList) {
                if(l.getAuthor().equalsIgnoreCase(author)) {
                    booksPerAuthor.add(l);
                }
            }
        }
        return booksPerAuthor;
    }

    public List<Book> searchForYearsInterval(int initialYear, int finalYear) {
        List<Book> booksPerYearsInterval = new ArrayList<>();
        
        if(!bookList.isEmpty()){
            for(Book l : bookList) {
                if(l.getPublicationYear() >= initialYear && l.getPublicationYear() <= finalYear) {
                    booksPerYearsInterval.add(l);
                }
            }
        }
        return booksPerYearsInterval;
    }

    public Book searchForTitle(String title) {
        Book bookPerTitle = null;
        if(!bookList.isEmpty()) {
            for(Book l : bookList) {
                if(l.getTitle().equalsIgnoreCase(title)) {
                    bookPerTitle = l;
                    break;
                }
            }

        }
        return bookPerTitle;
    }

    public static void main(String[] args) {
        BooksCatalogs booksCatalog = new BooksCatalogs();

        booksCatalog.addBook("Book 1", "Author 1", 2006);
        booksCatalog.addBook("Book 2", "Author 2", 1998);
        booksCatalog.addBook("Book 3", "Author 3", 2000);
        booksCatalog.addBook("Book 4", "Author 4", 2020);
    
        System.out.println(booksCatalog.searchForAuthor("Author 1"));
        System.out.println(booksCatalog.searchForYearsInterval(2019, 2022));
        System.out.println(booksCatalog.searchForTitle("Book 1"));
    }
}
