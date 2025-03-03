package vn.com.t3h.buoi3;

import java.awt.*;
import java.util.Scanner;

/*

bai 2) Viết lại chữ số đảo ngược
 Ví dụ nhập vào số 1357 thì in ra số đảo ngược là 7531
 (Không sử dụng nhập vào chuỗi số là String)

 */
public class Bai2 {

    public static void main(String[] args) {

        System.out.print("Nhập vào chữ số: ");
        int k = new Scanner(System.in).nextInt();
        int soDaoNguoc = 0;
        while(k != 0)
        {
            int soDu = k % 10;
            soDaoNguoc = soDaoNguoc * 10 + soDu;
            k = k / 10;
        }
        System.out.println("Số đảo ngược là: " + soDaoNguoc);
    }
}
