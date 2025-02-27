package vn.com.t3h.btvnbuoi2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {

        tinhTienDien();
    }
    public static void tinhTienDien() {
        System.out.print("Nhập số điện của tháng: ");
        int soDien = new Scanner(System.in).nextInt();
        double tienDien;
        if(soDien > 0 && soDien <= 50){
            tienDien = soDien * 1.678;
        }else if(soDien <= 100){
            tienDien = 50 * 1.678 + (soDien - 50) * 1.734;
        } else if (soDien <= 200) {
            tienDien = 50 * 1.678 + 50 * 1.734 + (soDien - 100)*2.014 ;
        } else if(soDien <= 300) {
            tienDien = 50 * 1.678 + 50 * 1.734 + 50 * 2.014 + (soDien - 200) * 2.536;
        } else if (soDien <= 400) {
            tienDien = 50 * 1.678 + 50 * 1.734 + 50 * 2.014 + 50 * 2.536 + (soDien - 300) * 2.834;
        } else{
            tienDien = 50*1.678 + 50 * 1.734 + 50 * 2.014 + 50 * 2.536 + 50 * 2.834 + (soDien - 400) * 2.927;
        }
        System.out.println("TIền điện của tháng là: " + tienDien);
    }
}
