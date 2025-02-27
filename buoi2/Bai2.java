package vn.com.t3h.buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Tổng: ");
        System.out.println(a + b);
        System.out.print("Tích: ");
        System.out.println(a * b);
        float d = a / b;
        double e = a % b;
        System.out.println("Thương: " + d);
        System.out.println("Số dư của thương: " + e);

    }
}
