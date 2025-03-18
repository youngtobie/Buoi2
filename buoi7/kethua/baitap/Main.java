package vn.com.t3h.buoi7.kethua.baitap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Số lượng hình muốn nhập: ");
        int n = new Scanner(System.in).nextInt();
        Hinh[] danhSachHinh = nhapThongTinDanhSachHinh(n);

        hienThiThongTinDanhSachHinh(danhSachHinh);

    }

    private static Hinh[] nhapThongTinDanhSachHinh(int n) {
        Hinh[] danhSachHinh = new Hinh[n];
        Hinh hinh = null;
        int loaiHinh = 0;
        for(int i = 0; i < n; i++){
            hinh = getHinh(hinh);
            if(hinh == null){
                continue;
            }
            hinh.nhapThongTin();
            danhSachHinh[i] = hinh;
        }
        return danhSachHinh;
    }

    private static Hinh getHinh(Hinh hinh) {
        int loaiHinh;
        System.out.println("bạn muốn nhập hình gì: ");
        System.out.println("1: Hình Vuông ");
        System.out.println("2: Hình Chữ Nhật ");
        System.out.println("3: Đa giác ");
        System.out.println("4: Hình Tròn ");
        System.out.println("5: Hình Tam Giác");
        loaiHinh = new Scanner(System.in).nextInt();

        switch (loaiHinh)
        {
            case 1:
                hinh = new Hinhvuong();
                break;
            case 2:
                hinh = new Hinhchunhat();
                break;
            case 3:
                hinh = new Hinhdagiac();
                break;
            case 4:
                hinh = new Hinhtron();
                break;
            case 5:
                hinh = new Tamgiac();
                break;
            default:
                System.out.println("Nhập không đúng định dạng");
        }
        return hinh;
    }

    private static void hienThiThongTinDanhSachHinh(Hinh[] danhSachHinh) {
        Hinh hinh;
        System.out.println("hiển thị thông tin tất cả các hình đã nhập");
        for(int i = 0; i < danhSachHinh.length; i++){
            hinh = danhSachHinh[i];
            if(hinh == null){
                continue;
            }
            hinh.hienThiThongTin();
        }
    }
}
