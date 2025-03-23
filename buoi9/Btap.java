package vn.com.t3h.buoi9;

import java.util.Scanner;

public class Btap {
    public static void main(String[] args) {
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            boolean kiemTra = false;
            while (!kiemTra) {
                try {
                    System.out.println("nhập vào số thứ " + (i+1) + " :");
                    Array[i] = new Scanner(System.in).nextInt();
                    kiemTra = true;
                }catch (Exception e) {
                    System.out.println("Nhaapj sai định dạng . vui lòng nhập lại");
                }

            }
        }
        System.out.println("các số đẫ nhập vào");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(" " + Array[i]);
        }
    }
}
