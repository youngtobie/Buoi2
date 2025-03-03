package vn.com.t3h.buoi3;


import java.util.Scanner;
public class Bai1 {

    public static void main(String[] args) {
        int s = 0;
        System.out.println("Nhập n : ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("S =");
        for(int i=1;i<n;i++) {
            System.out.print(" " + i + "^3");
        }
    }
}
