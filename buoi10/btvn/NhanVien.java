package vn.com.t3h.buoi10.btvn;

import java.util.Scanner;

public abstract class NhanVien {

    private String maNV;
    private String hoTen;
    private int tuoi;
    private double luongCoBan;

    public NhanVien() {}

    public NhanVien(String maNV, String hoTen, int tuoi, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
    }
    public abstract double tinhLuong();

    public void hienThiThongTin(){
        System.out.println("-------------------------");
        System.out.println(this.toString());
    }
    public String toString() {
        return "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
    public void nhapThongTin()
    {
        System.out.println("Nhập mã nhân viên: ");
        this.maNV = new Scanner(System.in).nextLine();
        System.out.println("Nhập họ tên: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi = new Scanner(System.in).nextInt();
        System.out.println("Nhập lương cơ bản: ");
        this.luongCoBan = new Scanner(System.in).nextDouble();
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }
}
