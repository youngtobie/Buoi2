package vn.com.t3h.btvnbuoi2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {

        tinhDiemSinhVien();
    }
    public static void tinhDiemSinhVien() {
        System.out.print("Nhập vào điểm chuyên cần: ");
        int chuyenCan = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào điểm giữa kì: ");
        int giuaKy = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào điểm cuối kì: ");
        int cuoiKy = new Scanner(System.in).nextInt();

        int trungBinh = (chuyenCan + giuaKy + cuoiKy) / 3;

        System.out.println("Điểm trung bình của sinh viên: " + trungBinh);

        if(trungBinh >= 9 )
        {
            System.out.println("Loại A");
        }else if(7 <= trungBinh){
            System.out.println("Loại B");
        }else if(trungBinh >= 5 ){
            System.out.println("Loại C");
        }else{
            System.out.println("Loại D");
        }
    }

}
