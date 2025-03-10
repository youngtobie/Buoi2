package vn.com.t3h.buoi4;

import java.util.Scanner;
/*
Baif1: cho nguười dùng nhập vào n số tự nhiên
+ n do người dùng nhập
+ sau đó chp phép người dùng nhập vào n số tự nhiên
yêu cầu::
1, hiển thị các số người dùng nhập vào
2. tính tổng các số trong mảng
3.tìm số lớn nhất và nhỏ nhất trong mảng
 */
public class Bai1 {

    public static void main(String[] args) {

        //nguoif dùng muốn nhập vào bao nhiêu số tự nhiên
        System.out.println("Nhập vào số lương phần tử tỏng mảnh n: ");
        int n = new Scanner(System.in).nextInt();
        int [] arrayNumber = new int[n];
        System.out.println("Nhập vào các số nguyên dương");
        nhapDachSach(arrayNumber);
        System.out.println("Hiển thị danh sách số vừa nhập");
        for(int i = 0; i < arrayNumber.length;i++){
            int phanTuCuaMang = arrayNumber[i];
            System.out.println("Phần tử tại index số " + i + " là: " + phanTuCuaMang);
        }
        int tong = tinhTong(arrayNumber);

        System.out.println(String.format("Tổng các số trong mảng: %d", tong));
        int soLonNhat = timSoLonNhat(arrayNumber);
        System.out.println(String.format("Số lớn nhất trong mảng là: %d", soLonNhat));
        int soBeNhat = timSoNhoNhat(arrayNumber);
        System.out.println("Số bé nhất: " + soBeNhat);

    }
    public static int tinhTong(int [] arrayNumber){
        int tong = 0;
        for(int i = 0; i < arrayNumber.length;i++){
            // Lấy giá trị phần ử có index thứ i vào mảng
            int giaTriPhanTu = arrayNumber[i];
            // cộng giá trị vào tổng
            tong = tong + giaTriPhanTu;
        }
        return tong;
    }

    public static int timSoNhoNhat(int [] arrayNumber) {
        //Lấy giá trị phần t thứ i cảu mảnh

        int soNhoNhat = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++) {
            int giaTriPhanTuI = arrayNumber[i];
            if (giaTriPhanTuI < soNhoNhat) {
                soNhoNhat = giaTriPhanTuI;
            }
        }
        return soNhoNhat;
    }
    public static int timSoLonNhat(int [] arrayNumber){
        //Lấy giá trị phần t thứ i cảu mảnh

        int soLonNhat = 0;
        for(int i = 0; i < arrayNumber.length;i++){
            int giaTriPhanTuI = arrayNumber[i];
            if(giaTriPhanTuI > arrayNumber[soLonNhat]){
                soLonNhat = giaTriPhanTuI;
            }
        }
        return soLonNhat;
    }
    public static void nhapDachSach(int [] arrayNumber){
        //duyệt amngr để user nhập vào giá trị của các ô nhớ , là danh sách số nguyên
        for(int i = 0; i < arrayNumber.length;i++) {
            System.out.println("Nhập vào giá trị của phần tử thứ: " + i);
            int number = new Scanner(System.in).nextInt();
            // ga giá trị user nhập vào cho array cho vị trí taij index thứ i
            arrayNumber[i] = number;

        }
    }

}
