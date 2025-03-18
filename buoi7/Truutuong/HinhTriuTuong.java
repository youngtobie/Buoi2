package vn.com.t3h.buoi7.Truutuong;

/*
     abstract: biến class thành class trừu tượng(abstract)
     * Đặc điêm:
       - cũng là 1 class thông thường nhưng cũng có thêm các method trừu tươnợng
       - method trừu tượng: là method thông thường nhưng không có thân hàm và thêm từ khóa abstract
       - là class chuyên được dùng để cho các subclass có cùng bản chất kế thừa
       - Nó không thể tạo ra được đối tượng trực tiếp bằng từ khóa new mầ băắt buộc phải được khỏi tạo thông qua subclass
 */

import java.util.Scanner;

public abstract class HinhTriuTuong {

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
    /*
    demo method abstract:
      -không có thân hàm
      - có thể có tham số  truyền vào
      - tất cả các subclass khi kế thừa từ abstract class -> phải ghi đè (override) lại hết tất cả ca method abstract
     */
    public abstract void tinhChuVi();

    public abstract void tinhDienTich();

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
