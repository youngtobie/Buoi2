package vn.com.t3h.buoi8.btvn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ILibrary iLibrary = new Library(5);
        System.out.println("nhập số lượng sách:  ");
        int n = new Scanner(System.in).nextInt();
        int loaiSach = 0;
        for (int j = 0; j < n; j++) {
            System.out.println("Bạn muốn chọn loại sách nào ?? ");
            System.out.println("1.BusinessBook");
            System.out.println("2.ScienceBook");
            loaiSach = new Scanner(System.in).nextInt();
            Book book = null;
            switch (loaiSach) {
                case 1:
                    book = new BusinessBook();
                    book.inputInfo();
                    break;
                case 2:
                    book = new ScienceBook();
                    book.inputInfo();
                    break;
                default:
                    System.out.println("Nhập thông tin không đúng định dạng");
            }
            iLibrary.addBook(book);
            System.out.println("Thêm danh sách thành công");
        }
        System.out.println("Danh sách sách trong thư viện");
        iLibrary.displayAllBooks();

        System.out.println("Nhập id sách muốn xóa: ");
        int a = new Scanner(System.in).nextInt();
        iLibrary.deleteBook(a);
        iLibrary.displayAllBooks();
        System.out.println("Nhập tác giả mà bạn muốn tìm kiếm: ");
        String b = new Scanner(System.in).nextLine();
        iLibrary.searchBook(b);
    }
}
