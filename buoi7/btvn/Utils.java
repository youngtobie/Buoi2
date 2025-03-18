package vn.com.t3h.buoi7.btvn;

import java.util.Scanner;

public class Utils {

    public static String nhap(String text){
        System.out.println(text);
        String data = new Scanner(System.in).nextLine();
        return data;
    }
}
