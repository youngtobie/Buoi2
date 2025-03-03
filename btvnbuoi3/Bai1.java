package vn.com.t3h.btvnbuoi3;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args){

            int n;
            int S = 0;
            Scanner sc = new Scanner(System.in);
            do
            {
                System.out.println("Nhập vào số nguyên dương n: ");
                n = sc.nextInt();
                if(n <= 0){
                    System.out.println("Vui lòng nhập lại n > 0");
                }
            }while(n <= 0);
            System.out.println("S = " + sum(n,S) );
    }
    public static int sum(int n,int S){
        for(int i = 1; i <= n; i++ ) {
            S = S + i * i * i;
        }
        return S;
    }
}
