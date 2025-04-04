package vn.com.t3h.buoi10.btvn;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien{

    private int soNgayLamViec;

    public NhanVienVanPhong(){

    }
    public NhanVienVanPhong(String maNV, String ten, int tuoi, int luongCoBan,int soNgayLamViec) {
        super(maNV,ten,tuoi,luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double tinhLuong() {
        return (this.getLuongCoBan() + soNgayLamViec ) * 100000;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập số ngày làm việc: ");
        this.soNgayLamViec = new Scanner(System.in).nextInt();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số Ngày Làm Việc: " + this.soNgayLamViec);
        System.out.println("Lương: " + this.tinhLuong());
    }
}
