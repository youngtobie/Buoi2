package vn.com.t3h.buoi7.kethua.baitap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hinhchunhat extends  Hinh{

    private int chieuDai;
    private int chieuRong;

    @Override
    public void nhapThongTin() {
        //nhạp thông tin của lớp superclass
        this.tinhDienTich();
        this.tinhChuVi();
        super.nhapThongTin();
        System.out.println("Nhập chiều dài: ");
        this.chieuDai = new Scanner(System.in).nextInt();
        System.out.println("Nhập chiều rộng: ");
        this.chieuRong = new Scanner(System.in).nextInt();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chiều dài: " + this.chieuDai);
        System.out.println(" Chiều Rộng: " + this.chieuRong);
    }

    @Override
    public void tinhDienTich() {
        float dienTich = chieuDai * chieuRong;
        super.setDienTich(dienTich);
    }
    @Override
    public void tinhChuVi() {
        super.setChuVi((this.chieuDai + this.chieuRong) * 2);

    }


    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
}
