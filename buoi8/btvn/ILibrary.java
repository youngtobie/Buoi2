package vn.com.t3h.buoi8.btvn;

public interface ILibrary {

    void addBook(Book book);
    void updateBook(int id, Book bookUpdate);
    void deleteBook(int id);
    void searchBook(String author);
    void displayAllBooks();
}
