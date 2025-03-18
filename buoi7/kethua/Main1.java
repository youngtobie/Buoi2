package vn.com.t3h.buoi7.kethua;

/*
-- Thời điểm chạy trong java
    + compile time:
       + trình biên dịch biên dịch code
    + runtime:
       + thời điểm chương trình đã được chạy
  - override phương thức:
     + xảy ra tại 2 class có mối quan hệ kế thừa
     + khi class con tồn tại 1 method y hết (kiểu dữ liệu trả về, tên , tham số truyền vào)
     ==> method tại subclass đưuọc gọi là override method
  - Được sử dụng khi nào
       + khi subclass muốn viết lại một hành động(phương thức) của supperclass
   -  TỪ khóa super :
      + định nghĩa:
         + Tương tự từ  khóa this , nhưng chỉ được sử dụng để gọi tới các thuộc tính , method của super
   -  instanceOf:
         kiểm tra xem object của superclas tại thời điểm runtime có phải là instance (có được khởi tạo bằng từ khóa new subclass không)
         - Nếu true = > cho phép gọi tới tất cả các thuộc tính , method của subclass


 */
public class Main1 {

    public static void main(String[] args) {

        // khai báo subclass khởi tạo subclass
        Bicycle xeDap1 = new Bicycle();
        //có thể truy cập tới tất cả các phương thức và method của các cả supeclass và cubclass
        xeDap1.setMauSac("Màu đỏ");
        xeDap1.setTen("Tống Nhất");
        xeDap1.setSoLuongBanh(2);
        xeDap1.setNamSanXuat(1998);
        xeDap1.setLoaiXich("thong nhat");
        // khai báo super class khởi tạo bằng subclass
        Vehicle xeDap2 = new Bicycle();
        // ở thời điểm compile time chỉ có thể truy cập tới các method , thuộc tính của superclass
        xeDap2.setMauSac("Màu đỏ");
        xeDap2.setTen("Tống Nhất");
        xeDap2.setSoLuongBanh(2);
        xeDap2.setNamSanXuat(1998);
        // Nếu muốn truy cập tới các thuộc tính mà method của class ==> ép kiểu t superclass -> subclass
        ((Bicycle) xeDap2).setLoaiXich("sich thong nhat");
        //sử dụng từ kháo instenOf
        if(xeDap2 instanceof Bicycle){
            ((Bicycle) xeDap2).setLoaiXich("sich thong nhat2");
        }

        MotoBicycle xeMay1 = new MotoBicycle();
        xeMay1.setMauSac("Dream");
        xeMay1.setTen("Honda");
        xeMay1.setSoLuongBanh(2);
        xeMay1.setNamSanXuat(1998);
        Vehicle xeMay2 = new MotoBicycle();

        Car oTo1 = new Car();
        Vehicle oTo2 = new Car();

        // gọi hàm hiển thị thông tin
        xeDap1.hienThiThongTin();
        xeMay1.hienThiThongTin();
        xeDap2.hienThiThongTin();
    }
}
