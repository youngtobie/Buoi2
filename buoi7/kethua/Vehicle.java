package vn.com.t3h.buoi7.kethua;

public class Vehicle {

    private String ten;
    private String mauSac;
    private int soLuongBanh;
    private int namSanXuat;


    public void hienThiThongTin(){
        System.out.println("------------------------");
        System.out.println("Tên " + this.ten);
        System.out.println("Màu Sắc: " + this.mauSac);
        System.out.println("Số lượng bánh: " + this.soLuongBanh);
        System.out.println("Năm sản xuất: " + this.namSanXuat);
    }
    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoLuongBanh() {
        return soLuongBanh;
    }

    public void setSoLuongBanh(int soLuongBanh) {
        this.soLuongBanh = soLuongBanh;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
