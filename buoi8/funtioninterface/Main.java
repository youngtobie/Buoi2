package vn.com.t3h.buoi8.funtioninterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nhập số a: ");
        int soThu1 = new Scanner(System.in).nextInt();
        System.out.println("Nhập số b: ");
        int  soTHu2 =new Scanner(System.in).nextInt();

        //triển khai qua anonymous class
        IPhepToan phepToan = new IPhepToan() {

            @Override
            public float chiahaiSo(int soA, int soB) {
                return soA/ soB;
            }
        };
        System.out.println(phepToan.chiahaiSo(soThu1,soTHu2));

        /*
        thay vì triê khai bằng 2 cach trên rất dài dòng ==> sử dụng lamda expression
        cú pháp :  (parameter1,pẩmeter2,.....) -> {expresion}
         */
        IPhepToan phepToan1 = (a, b) -> a / b;
        System.out.println(phepToan1.chiahaiSo(soThu1,soTHu2));
    }
}
