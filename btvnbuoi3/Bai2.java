package vn.com.t3h.btvnbuoi3;

import java.util.Scanner;
/*
Bài 2: Viết lại chữ số đảo ngược

Mô tả: Nhập vào một số nguyên, và in ra số đảo ngược của nó.

Test Case:

1. Input: 1357 Output: 7531

2. Input: 98765 Output: 56789
 */
public class Bai2 {
    public static void main(String[] args) {

        System.out.println("Nhập vào dãy số: ");
        int n= new Scanner(System.in).nextInt();
        int soDaoNguoc = 0;
        while(n != 0){
            int soDu = n % 10;
            soDaoNguoc = soDaoNguoc * 10  + soDu;
            n = n / 10;
        }
        System.out.println("Số đảo ngược là: " + soDaoNguoc);
    }
}
