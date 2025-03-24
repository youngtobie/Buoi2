package vn.com.t3h.buoi8.btvn;

import vn.com.t3h.buoi7.btvn.Utils;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập vào số lượng sách của thư viện: ");
        int n = new Scanner(System.in).nextInt();
        ILibrary library = new Library(n);
        Book bussinessBook = new BusinessBook(1, "Dạy con làm giàu", 2001, "Robert", "Tiền bạc");
        library.addBook(bussinessBook);
        Book ScienceBook = new ScienceBook(2, "Hố đen", 2001, "Akira", "Vũ trụ");
        library.addBook(ScienceBook);


        //2 xây dựng menu với các chức năng

        int choice = 0;
        do {
            System.out.println("1.Thêm sách");
            System.out.println("2.Cập nhật sách bằng id");
            System.out.println("3.Xóa sách bằng id");
            System.out.println("4.Tìm sách theo tác giả");
            System.out.println("5.Hiên thị toàn bộ sách");
            System.out.println("6.Thoát");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    Book book = getBook();
                    if (book == null) {
                        System.out.println("Loại sách không hơợp lệ");
                        choice = -1;
                        break;
                    }
                    book.inputInfo();
                    library.addBook(book);
                    break;
                case 2:
                    System.out.println("Nhập vào id: ");
                    int id = sc.nextInt();
                    System.out.println("Nhập vào thông tin sách Update: ");
                    Book update = getBook();
                    if (update == null) {
                        System.out.println("Loại sách không hơợp lệ");
                        choice = -1;
                        break;
                    }
                    update.inputInfo();
                    library.updateBook(id, update);
                    break;
                case 3:
                    System.out.println("Nhập vào id xóa: ");
                    int idDelete = sc.nextInt();
                    library.deleteBook(idDelete);
                    break;
                case 4:
                    System.out.println("nhập tên giác giả: ");
                    String author = sc.nextLine();
                    library.BsearchBook(author);
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
                default:
                    choice = -1;
                    System.out.println("Chức năng chọn  không tồn tại");
                    break;
            }
        } while (choice != 6);

    }

    public static Book getBook() {
        System.out.println("Chọn loại sách để thêm: ");
        System.out.println("1. sách khoa học");
        System.out.println("2. Sách kinh doan");
        int typeBook = sc.nextInt();
        Book book = null;
        switch (typeBook) {
            case 1:
                book = new ScienceBook();
                break;
            case 2:
                book = new BusinessBook();
                break;
            default:
                System.out.println("Số nhập không hợp lệ");
        }
        return book;
    }
}