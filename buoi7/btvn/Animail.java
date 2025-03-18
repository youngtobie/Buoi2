package vn.com.t3h.buoi7.btvn;

import java.util.Scanner;

public abstract class Animail {

    private String ten;
    private int tuoi;
    private String loaiDongVat;
    private String mauSac;

    public abstract void makeSound();

    public void nhapThongTin(){
        this.ten = Utils.nhap("Nhập tên: ");
        System.out.println("Nhập tuổi: ");
        this.tuoi = new Scanner(System.in).nextInt();
        this.loaiDongVat = Utils.nhap("Loài động vật: ");
        this.mauSac = Utils.nhap("Màu Sắc: ");
    }

    public void hienThiThongTin(){
        System.out.println("------------------");
            System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", loaiDongVat='" + loaiDongVat + '\'' +
                ", mauSac='" + mauSac + '\''
                ;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLoaiDongVat() {
        return loaiDongVat;
    }

    public void setLoaiDongVat(String loaiDongVat) {
        this.loaiDongVat = loaiDongVat;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
}
