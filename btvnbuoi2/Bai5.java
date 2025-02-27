package vn.com.t3h.btvnbuoi2;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {

        inSoNgayTrongNam();
    }
    public static void inSoNgayTrongNam() {

        System.out.print("Nhập vào số năm a: ");
        int soNam = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào số tháng b: ");
        int soThang = new Scanner(System.in).nextInt();

        if (soThang == 1 || soThang == 3 || soThang == 5 || soThang == 7 || soThang == 8 || soThang == 10 || soThang == 12)
        {
            System.out.println("Tháng " + soThang + " của Năm " + soNam + " có 31 ngày");
        } else if (soThang == 9 || soThang == 4 || soThang == 6 || soThang == 11) {

            System.out.println("Tháng " + soThang + " của Năm " + soNam + " có 30 ngày");
        } else if(soThang == 2){
            if(soNam % 100 == 0 || soNam % 4 == 0) {
                System.out.println("Tháng " + soThang + " của Năm " + soNam + " có 29 ngày");
        }
            else {
                System.out.println("Tháng " + soThang + " của Năm " + soNam + " có 28 ngày");
            }
        }else {
            System.out.println("Tháng không hợp lệ");
        }

    }
}
