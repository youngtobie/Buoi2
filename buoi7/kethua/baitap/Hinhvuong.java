package vn.com.t3h.buoi7.kethua.baitap;

import vn.com.t3h.buoi7.kethua.Utils;

public class Hinhvuong extends Hinh{

    private int canhA;

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cạnh A: " + this.canhA);
    }

    @Override
    public void nhapThongTin() {
        this.tinhChuVi();
        super.nhapThongTin();
        this.canhA = Utils.nhap("Nhập cạnh A");
    }

    @Override
    public void tinhChuVi() {
        super.setChuVi(this.canhA * 4);
    }

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }
}

