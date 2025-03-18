package vn.com.t3h.buoi7.kethua.baitap;

import java.util.Scanner;

public class Hinh {
    private float chuVi;
    private float dienTich;
    private String ten;

    public void hienThiThongTin(){
        System.out.println("----------------------");
        System.out.println(this.toString());
    }
    public void nhapThongTin(){
        System.out.println("Nhập tên: ");
        this.ten = new Scanner(System.in).nextLine();
    }

    public void tinhChuVi()
    {

    }

    public void tinhDienTich()
    {

    }

    @Override
    public String toString() {
        return "chuVi=" + chuVi +
                ", dienTich=" + dienTich +
                ", ten='" + ten + '\'' +
                '}';
    }

    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
