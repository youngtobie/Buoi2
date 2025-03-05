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

        int sum = 0;
        int max = 0;
        int min = 0;
        //nguoif dùng muốn nhập vào bao nhiêu số tự nhiên
        System.out.println("Nhập vào số lương phần tử tỏng mảnh n: ");
        int n = new Scanner(System.in).nextInt();
        int [] array = new int[n];

        for(int i = 0; i < array.length;i++){
            System.out.println(String.format("In ra phần tử thứ %d: %d", i,array[i]));
        }
        //hienThi(array);
        int tong = tinhTong(array);

        System.out.println(String.format("Tổng các số trong mảng: %d", sum));

        System.out.println(String.format("Số lớn nất trong mảnh là: %d", array[max]));
        System.out.println(String.format("Số bé nhất trong mảnh là: %d", array[min]));

    }
    public static int tinhTong(int [] array){
        int tong =0;
        for(int i = 0; i < array.length;i++){

            int giaTriPhanTu = array[i];
            tong = tong + array[i];
        }
        return tong;
    }
    /*
    public static int tiSoLonNhat(int [] array){
        //Lấy giá trị phần t thứ i cảu mảnh

        int soLonNhat = 0;
        for(int i = 0; i < array.length;i++){
            int giaTriPhanTu = array[i];
            if(giaTriPhanTu > array[soLonNhat]){
                soLonNhat = i;

            }
        }
    }
    public static int hienThi(int [] array){
        //duyệt amngr để user nhập vào giá trị của các ô nhớ , là danh sách số nguyên
        for(int i = 0; i < array.length;i++){
            System.out.println(String.format("Nhập vào phần tử thứ %d: ", i));
            int number = new Scanner(System.in).nextInt();
            array[i] = number;

        }
    }*/
}
