package vn.com.t3h.buoi10.btvn;

import java.util.Scanner;

public class KySu extends NhanVien{

    private String chuyenMon;

    public KySu(){
    }
    public KySu(String maNV, String ten, int tuoi, int luongCoBan,String chuyenMon){
        super(maNV,ten,tuoi,luongCoBan);
        this.chuyenMon = chuyenMon;
    }

    @Override
    public double tinhLuong() {
        return (this.getLuongCoBan() ) * 2000000;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Chuyên Môn: ");
        this.chuyenMon = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên Môn: " + this.chuyenMon);
        System.out.println("Lương: " + this.tinhLuong());
    }
}
