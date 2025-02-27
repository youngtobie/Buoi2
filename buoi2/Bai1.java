package vn.com.t3h.buoi2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {


        System.out.print("Nhập họ và tên: ");
        String hoVaten = new Scanner(System.in).nextLine();
        System.out.print("Nhập Ngày tháng năm sinh: ");
        String ngayThangNamSinh = new Scanner(System.in).nextLine();
        System.out.print("Nhập Quê quán: ");
        String queQuan = new Scanner(System.in).nextLine();
        System.out.print("Nhập trường học: ");
        String truongHoc = new Scanner(System.in).nextLine();
        System.out.println("Xin chào " + hoVaten + ", đến từ " + queQuan + ", sinh ngày " + ngayThangNamSinh + ", tại Trường " + truongHoc + ".");

    }
}
