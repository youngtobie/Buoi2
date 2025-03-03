package vn.com.t3h.buoi3;

import java.util.Scanner;

public class Bai3
{

    public static void main(String[] args){
        System.out.println("Nhập vào N: ");
        int n = new Scanner(System.in).nextInt();

        int s = sum(n);
        System.out.println(s);
    }
    public static int sum(int n){
        if(n == 1)
            return 1;
        return n + sum(n-1);
    }
}
