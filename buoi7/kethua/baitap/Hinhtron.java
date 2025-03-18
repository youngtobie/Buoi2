package vn.com.t3h.buoi7.kethua.baitap;

import vn.com.t3h.buoi7.kethua.Utils;

public class Hinhtron extends Hinh{
    private float banKinh;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        this.banKinh = Utils.nhap("Nhập bán kính");
    }

    @Override
    public void hienThiThongTin() {
        this.tinhChuVi();
        super.hienThiThongTin();
        System.out.println("Bán Kính: " + this.banKinh);
    }

    @Override
    public void tinhChuVi() {
        super.setChuVi((float) (3.14 * 2 * this.banKinh));
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
}
