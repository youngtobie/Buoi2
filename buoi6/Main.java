package vn.com.t3h.buoi6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // tạo ra các đối tượng xe x1
        Car xe1 = new Car(); // new Car(); constructor khoir tạo ra đối tượng từ class
        // set giá trị cho các thuộc tính của đối tượng
        xe1.setNamSanXuat(2025);
        xe1.setTen("Xe 1");
        xe1.setMauSac("Màu đỏ");
        // gọi các phuương thức của đối tượng xe 1
        xe1.run();
        xe1.showInfo();

        // tạo ra đối tượng xe xe2
        Car xe2 = new Car();
        xe2.setNamSanXuat(2024);
        xe2.setTen("Xe 2");
        xe2.setMauSac("màu vàng");

        // gọi các phuương thức của đối tượng xe 1
        xe2.run();
        xe2.showInfo();

        Scanner scanner = new Scanner(System.in); // khai báo 1 đối tượng scanner, gọi tới constructor truyền tham số System.in
        String a = new String("t3h");

        // khai báo 1 mảng danh sách các đối tượng xe
        Car[] danhSachXe = new Car[6];
        //khai báo 1 vòng for để tạo ra các xe đưa vào mảng
        for (int i = 0; i < 6; i++) {
            // khỏi tạo 1 đối tượng xe
            Car car = new Car();
            //Truy cập vào thuộc tính của đối tượng xe để set value có cac thuộc tính thông qua "."
            car.setTen("xe " + i);
            car.setNamSanXuat(2000 + i);
            car.setMauSac("Màu" + i);
            // gọi tới method của đối tượng xe thong qua"."
            car.run();
            //them xe vào danh sách
            danhSachXe[i] = car;
        }

    }
}
