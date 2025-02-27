package vn.com.t3h.btvnbuoi2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {

        tinhDiemSinhVien();
    }
    public static void tinhDiemSinhVien() {
        System.out.print("Nhập điểm chuyên cần: ");
        int chuyenCan = new Scanner(System.in).nextInt();
        System.out.print("Nhập điểm giữa kì: ");
        int giuaKy = new Scanner(System.in).nextInt();
        System.out.print("Nhập điểm cuối kì: ");
        int cuoiKy = new Scanner(System.in).nextInt();

        double trungBinh = chuyenCan*0.1 + giuaKy* 0.3 + cuoiKy*0.6;

        System.out.println("Điểm trung bình của sinh viên: " + trungBinh);

        if(trungBinh >= 9 )
        {
            System.out.println("Loại A");
        }else if(7 <= trungBinh && trungBinh < 9){
            System.out.println("Loại B");
        }else if(trungBinh >= 5 && trungBinh < 7){
            System.out.println("Loại C");
        }else{
            System.out.println("Loại D");
        }
    }

}
