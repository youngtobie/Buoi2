package vn.com.t3h.btvnbuoi2;

import java.util.Scanner;

public class Bai4
{
    public static void main(String [] args) {

        Menu();
    }
    public static void Menu(){
        while (true) {
            System.out.println("+..........................+");
            System.out.println("1.Tính điểm sinh viên");
            System.out.println("2.Kiểm tra loại tam giác");
            System.out.println("3.TÍnh tiền điện");
            System.out.println("4.Kết thúc");
            System.out.println("+..........................+");
            System.out.print("Chọn Chức năng: ");
            int value = (new Scanner(System.in)).nextInt();
            switch (value) {
                case 1:
                    Bai1.tinhDiemSinhVien();
                    break;
                case 2:
                    Bai2.kiemTraLoaiTamGiac();
                    break;
                case 3:
                    Bai3.tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chuogn trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hơp lệ!!");
            }
        }
    }
}
