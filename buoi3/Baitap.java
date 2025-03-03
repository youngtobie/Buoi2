package vn.com.t3h.buoi3;

import java.util.Scanner;

public class Baitap {

    public static void main(String[] args) {

        int tongNguyenAm = 0;
        int tongNguyenDuong = 0;
        for (int i=0; i<10; i++){
            System.out.println("Nhập vào số nguyên thứ " + i +" : ");
            int k = new Scanner(System.in).nextInt();
            if( k > 0)
            {
                tongNguyenDuong = tongNguyenDuong + k;
            }else {
                tongNguyenAm = tongNguyenAm + k;
            }
            System.out.println("Tổng số nguyên âm: " + tongNguyenAm);
            System.out.println("Tông số nguyên dương : " + tongNguyenDuong);
        }

    }
}
