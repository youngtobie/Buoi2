package vn.com.t3h.buoi8.btvn;

public class Library implements ILibrary {

    private Book[] books;
    private int soLuongSachHienTaiTrongDanhSach;
    public Library(int soLuongSachKhoiTao) {
        this.books = new Book[soLuongSachKhoiTao];
        this.soLuongSachHienTaiTrongDanhSach = 0;
    }


    @Override
    public void addBook(Book book) {
        if(this.soLuongSachHienTaiTrongDanhSach == this.books.length - 1){
            Book[] newBooks = new Book[soLuongSachHienTaiTrongDanhSach * 2];
            for(int i = 0; i < this.books.length; i++){
                newBooks[i] = this.books[i];
            }
            this.books = newBooks;
        }
        this.books[this.soLuongSachHienTaiTrongDanhSach] = book;
        this.soLuongSachHienTaiTrongDanhSach++;
    }

    @Override
    public void updateBook(int id, Book bookUpdate) {
        for(int i = 0; i < soLuongSachHienTaiTrongDanhSach; i++){
            if(this.books[i].getId() == id){
                this.books[i] = bookUpdate;
                System.out.println("đã cập nhật danh sách thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy sah có id = " + id);
    }

    @Override
    public void deleteBook(int id) {
        int soPhanTuXoa = 0;
        for (int i = 0; i < soLuongSachHienTaiTrongDanhSach; i++) {
            Book book = this.books[i];
            if(book != null && book.getId() == id){
                for(int j = i; j < soLuongSachHienTaiTrongDanhSach; j++){
                    if(j == soLuongSachHienTaiTrongDanhSach -1){
                        this.books[j] = null;
                    }
                    this.books[j] = this.books[j+1];
                }
                soPhanTuXoa++;
            }
        }
        soLuongSachHienTaiTrongDanhSach -= soPhanTuXoa;
    }
    @Override
    public void searchBook(String author) {
        boolean kiemTra = false;
        for(int i = 0; i < soLuongSachHienTaiTrongDanhSach; i++){
            Book book = this.books[i];
            if(book.getAuthor().equalsIgnoreCase(author)){
                book.displayInfo();
                kiemTra = true;
            }
        }
        if(!kiemTra){
            System.out.println("Không có sách cảu tác giả " + author);
        }
    }

    @Override
    public void displayAllBooks() {
        for(int i = 0; i < this.books.length; i++){
            Book book = this.books[i];
            if(book != null) {
            book.displayInfo();
            }
        }
    }
}
