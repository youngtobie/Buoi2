package vn.com.t3h.buoi3;

import java.util.Scanner;

/*
BUỔI 3: 1. Cấu trúc rẽ nhánh - biểu thức điều kiện trong Java
        2. Làm quen với hàm
        3. Vòng lặp trong Java
        4.
*/
public class Lythuyet {

    public static void main(String[] args) {

        System.out.println("nhập vào số câu chào");
        int a = new Scanner(System.in).nextInt();
        // Biê trước số lần lặp
        for(int i = 0 ; i < a ; i++ ){
           System.out.println("Xin chào");
        }
        System.out.println("Kết Thúc");
        int j = 0;
        while(j < a)
        {
            System.out.println("Xien chào while");

            j++;
        }

        int  k = 0;
        /*
        chỉ k = số chẵn mới in ra , còn soos lẻ không in ra
        và chỉ cho phép chào max 5 câu
        */
        do{
            k++;
            if (k == 5)
            {
                break;
            }
            if(k % 2 !=0) {
                continue;
            }
            System.out.println("Xin chào do while");
        }while(k < a);
    }
}
