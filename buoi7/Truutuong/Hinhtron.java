package vn.com.t3h.buoi7.Truutuong;

import vn.com.t3h.buoi7.kethua.Utils;

public class Hinhtron extends HinhTriuTuong {
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
    public void tinhDienTich() {
        super.setDienTich((float) (this.banKinh * 2 * 3.14));
    }

    @Override
    public void tinhChuVi() {

    }
}
