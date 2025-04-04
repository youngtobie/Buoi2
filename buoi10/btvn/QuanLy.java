package vn.com.t3h.buoi10.btvn;

import java.util.Scanner;

public class QuanLy extends NhanVien{

    private double heSoChucVu;

    public QuanLy() {}
    public QuanLy(String maNV, String ten, int tuoi, int luongCoBan,double heSoChucVu) {
        super(maNV,ten,tuoi,luongCoBan);
        this.heSoChucVu = heSoChucVu;
    }
    @Override
    public double tinhLuong() {
        return (this.getLuongCoBan() ) * this.heSoChucVu;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Chuyên Môn: ");
        this.heSoChucVu = new Scanner(System.in).nextDouble();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Hệ số chức vụ: " + this.heSoChucVu);
        System.out.println("Lương: " + this.tinhLuong());
    }
}
