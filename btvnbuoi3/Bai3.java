package vn.com.t3h.btvnbuoi3;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = sc.nextInt();
            if(n <= 0)
            {
                System.out.println("Vui lòng nhập lại n");
            }
        }while(n <= 0);
            System.out.print("Kết quả: ");
            System.out.println(giaiThua(n));
    }
    public static int giaiThua(int n){
        if(n == 1)
            return 1;
        else
            return n + giaiThua(n-1);
    }
}
