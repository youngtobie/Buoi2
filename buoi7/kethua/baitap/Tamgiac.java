package vn.com.t3h.buoi7.kethua.baitap;

import jdk.jshell.execution.Util;
import vn.com.t3h.buoi7.kethua.Utils;

public class Tamgiac extends Hinh{

    private int canhA;
    private int canhB;
    private int canhC;

    @Override
    public void hienThiThongTin() {
        this.tinhChuVi();
        super.hienThiThongTin();
        System.out.println("Cạnh a: " + this.canhA);
        System.out.println("Cạnh b: " + this.canhB);
        System.out.println("Cạnh c: " + this.canhC);
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        this.canhA = Utils.nhap("Nhập cạnh a: ");
        this.canhB = Utils.nhap("Nhập cạnh b: ");
        this.canhC = Utils.nhap("Nhập cạnh c: ");
    }

    @Override
    public void tinhChuVi() {
        super.setChuVi(this.canhA + this.canhB + this.canhC);
    }
}
