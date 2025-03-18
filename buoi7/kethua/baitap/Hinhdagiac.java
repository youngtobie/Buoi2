package vn.com.t3h.buoi7.kethua.baitap;

import vn.com.t3h.buoi7.kethua.Utils;

public class Hinhdagiac  extends  Hinh{

    private int soLuongGoc;
    private int soCanh;

    @Override
    public void hienThiThongTin() {
        this.tinhChuVi();
        super.hienThiThongTin();
        System.out.println("số cạnh: " + this.soCanh);
        System.out.println("soLuongGoc: " + this.soLuongGoc);
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        this.soCanh = Utils.nhap("Nhập vào số cạnh: ");
        this.soLuongGoc = Utils.nhap("Nhập vào số góc: ");
    }

    @Override
    public void tinhChuVi() {
        this.setChuVi(this.soLuongGoc + this.soCanh);
    }

    public int getSoLuongGoc() {
        return soLuongGoc;
    }

    public void setSoLuongGoc(int soLuongGoc) {
        this.soLuongGoc = soLuongGoc;
    }
}
