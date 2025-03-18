package vn.com.t3h.buoi7.Truutuong;

public class Main {

    public static void main(String[] args) {
        // khởi tạo abstract class thông qua subclass
        HinhTriuTuong hinhTron = new Hinhtron();
        /* khởi tạo đối tượng hinhTriuTuong bằng annonymous class
        anonymout class:
            + class được trực tiếp trong code thực thi, không đuợc xác định trên class rõ ràng
            + tên class sẽ được jvm ặt cho
            + cách viết ngắn gọn khi không muốn tạo ra class kế thừa từ class abstract
         */
        HinhTriuTuong hinhTriuTuong = new HinhTriuTuong() {
            private int hinhDemo;
            private String ten;
            @Override
            public void tinhChuVi() {

            }

            @Override
            public void tinhDienTich() {

            }
        };


    }
}
