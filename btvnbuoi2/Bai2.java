package vn.com.t3h.btvnbuoi2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {

        kiemTraLoaiTamGiac();
    }
    public static void kiemTraLoaiTamGiac() {
        System.out.print("Nhập vào cạnh a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào cạnh b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào cạnh c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("KẾT LUẬN: ");
        if((a+b>c) &&  (a+c>b) && (b+c>a)){
            if(a == b && b == c){
                System.out.println("Tam giác đều");
            }else if((a*a + b*b == c*c ) || (a*a + c*c == b*b) || (b*b + c*c == a*a)){
                System.out.println("Tam giác vuông");
            }else if(a == b || a == c || b == c){
                if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                    System.out.println("Tam giác vuông cân");
                }else{
                    System.out.println("Tam giác cân");
                }
            }else{
                System.out.println("Tam giác thường");
            }
        }else{
            System.out.println("Không phải tam giác");
        }
    }
}
