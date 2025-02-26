package vn.com.t3h.buoi2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        System.out.print("Nhập chiều dài:");
        int chieuDai = new Scanner(System.in).nextInt();
        System.out.print("Nhập Chiều rộng:");
        int chieuRong = new Scanner(System.in).nextInt();
        int s = chieuDai * chieuRong;
        System.out.print("diện tích hình chữ nhật: " + s + "\n");
    }
}
