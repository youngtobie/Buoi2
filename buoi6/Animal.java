package vn.com.t3h.buoi6;

public class Animal {

    public String mauSac;
    public String ten;

    public void run(){
        System.out.println("Con " + ten + "đang chạy");
    }
    public void hienThi(){
        System.out.println("Tên xe: " + ten);
        System.out.println("màu sắc: "+ mauSac);
    }
}
