package vn.com.t3h.buoi7.kethua;

import java.util.Scanner;

public class Utils {

    public static int nhap(String text){
        System.out.println(text);
        int data = new Scanner(System.in).nextInt();
        return data;
    }
}
