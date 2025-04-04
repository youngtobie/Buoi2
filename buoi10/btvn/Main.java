package vn.com.t3h.buoi10.btvn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nhập số Lung Nhân viên: ");
        int n = new Scanner(System.in).nextInt();
        IQuanLy quanLy = new QuanLyImpl();
        quanLy.khoiTaoNhanVienMacDinh();

        int choice = 0;
        do {
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Hiển thị danh sách");
            System.out.println("3.Tính Tổng Lương");
            System.out.println("4.Tìm nhân viên lương cao nhất");
            System.out.println("5.Tìm nhân viên theo mã");
            System.out.println("6.Sắp xếp theo lương");
            System.out.println("7.Thoát");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    quanLy.themNhanVien();
                    break;
                case 2:
                    quanLy.hienThiDanhSach();
                    break;
                case 3:
                    System.out.println("Tổng lương phải trả: " + quanLy.tinhTongLuong());
                    break;
                case 4:
                    quanLy.timLuongCaoNhat();
                    break;
                case 5:
                    System.out.println("Nhập mã nhân viên muốn tìm: ");
                    String mNV = new Scanner(System.in).nextLine();
                    quanLy.timTheoMaNV(mNV);
                    break;
                case 6:
                    quanLy.sapXepTheoLuongGiamDan();
                    break;
                case 7:
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");
                    break;
            }
        }while (choice!=7);
    }
}

