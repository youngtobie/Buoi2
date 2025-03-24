package vn.com.t3h.buoi8.btvn;

import java.util.Scanner;

public class Library implements ILibrary {

    private Book[] danhSachSach;
    private int soLuongSachHienTai;

    public Library(int n) {
        this.danhSachSach = new Book[n];
        soLuongSachHienTai = 0;
    }

    @Override
    public void addBook(Book book) {
        checkDupliCate(book);
        reSize();
        this.danhSachSach[this.soLuongSachHienTai] = book;
        this.soLuongSachHienTai++;

    }
    public void checkDupliCate(Book book) {
        Book checkDupliCate = Library.this.findById(book.getId());
        while (checkDupliCate != null) {
            findById(book.getId());
            System.out.println("Đề nghị nhập lại id");
            int id = new Scanner(System.in).nextInt();
            book.setId(id);
            checkDupliCate = findById(book.getId());
        }
    }

    private void reSize() {
        if(this.soLuongSachHienTai != this.danhSachSach.length-1) {
            return;
        }
        Book[] danhSachSachMoi = new Book[this.danhSachSach.length*2];
        for (int i = 0; i < this.danhSachSach.length; i++) {
            danhSachSachMoi[i] = this.danhSachSach[i];
        }
        this.danhSachSach = danhSachSachMoi;
    }

    @Override
    public void updateBook(int id, Book book) {
        for (int i = 0; i < this. soLuongSachHienTai; i++) {
            if (this.danhSachSach[i].getId() != id) {
                continue;
            }
            this.danhSachSach[i] = book;
            break;
        }
    }

    @Override
    public void deleteBook(int id) {
        for (int i = 0; i < this.soLuongSachHienTai; i++) {
            if (this.danhSachSach[i].getId() != id) {
                continue;
            }
            System.out.println("bắt đầu xóa sách theo id " + id);
            for (int j = i; j < this.soLuongSachHienTai-1; j++) {
                this.danhSachSach[j] = this.danhSachSach[j+1];
            }
            this.soLuongSachHienTai--;
            break;
        }
    }

    @Override
    public void BsearchBook(String author) {
        Book[] danhSachketQua = new Book[this.danhSachSach.length];
        int soLuongKetQua = 0;
        for (int i = 0; i < this.soLuongSachHienTai; i++) {
            Book book = this.danhSachSach[i];
            if(!author.equals(book.getAuthor())) {
                continue;
            }
            book.displayInfo();
        }
    }

    @Override
    public void displayAllBooks() {
        for (int i = 0; i < this.soLuongSachHienTai; i++) {
            Book book = this.danhSachSach[i];
            book.displayInfo();
        }
    }

    @Override
    public Book findById(int id) {
        for (int i = 0; i < this.soLuongSachHienTai; i++) {
            if (this.danhSachSach[i].getId() == id) {
                return this.danhSachSach[i];
            }
        }
        return null;
    }
}
