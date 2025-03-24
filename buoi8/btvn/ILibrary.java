package vn.com.t3h.buoi8.btvn;

public interface ILibrary {

    void addBook(Book book);
    void updateBook(int id, Book book);
    void deleteBook(int id);
    void BsearchBook(String author);
    void displayAllBooks();
    Book findById(int id);
}
