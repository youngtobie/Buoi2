package vn.com.t3h.btvnbuoi3;

import java.util.Scanner;

/*
Bài 5: Đổi sang số nhị phân của một số nguyên dương n

Mô tả: Nhập vào số nguyên dương n và in ra số nhị phân của nó.

Test Case:

1. Input: n = 8 Output: 8 -> 1000

2. Input: n = 7 Output: 7 -> 111

3. Input: n = 9 Output: 9 -> 1001
 */
public class Bai5 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = sc.nextInt();
            if(n <= 0)
            {
                System.out.println("Vui lòng nhập lại n: ");
            }
        }while (n <= 0);

        System.out.println("Giá trị nhị phân của " + n + " là: ");
        System.out.println(Integer.toBinaryString(n));

    }
}
