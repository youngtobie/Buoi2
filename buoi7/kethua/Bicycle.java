package vn.com.t3h.buoi7.kethua;

public class Bicycle extends Vehicle{

    private String loaiXich;

    public void hienThiThongTin(){
        /* thay v phải viết lại toàn bộ các dùng hiển thị thông tin của superclass
        ==> sủ dụng từ khóa super gọi tới method của superclass để dùng lại
        * */
        super.hienThiThongTin();
        System.out.println("loại xích: " + this.loaiXich);
    }
    public String getLoaiXich() {
        return loaiXich;
    }

    public void setLoaiXich(String loaiXich) {
        this.loaiXich = loaiXich;
    }
}
