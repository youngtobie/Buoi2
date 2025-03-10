package vn.com.t3h.btvnbuoi4;

import java.util.Scanner;
/*
Bài 3: Xử lý mảng số nguyên

Mô tả bài toán: Viết chương trình Java thực hiện các tác vụ:

1. Nhập một mảng các số nguyên.

2. Tính tổng các phần tử chẵn và tổng các phần tử lẻ trong mảng.

3. Tìm và in ra các số nguyên tố có trong mảng.

4. Sắp xếp mảng sao cho:

o Các phần tử chẵn được sắp xếp theo thứ tự giảm dần.

o Các phần tử lẻ được sắp xếp theo thứ tự tăng dần.

5. Chia mảng thành 2 mảng con:

o Mảng 1: Chứa tất cả các phần tử có giá trị nhỏ hơn hoặc bằng trung bình của mảng.

o Mảng 2: Chứa tất cả các phần tử có giá trị lớn hơn trung bình của mảng.

6. Tìm số lượng phần tử trùng lặp trong mảng và in ra các phần tử trùng lặp.

7. Thêm một phần tử vào mảng tại vị trí chỉ định (index).

8. Xoá một phần tử khỏi mảng.

 */
public class Bai3 {
    // là biến globe để tất cả các hàm trong class đều có thể sử dụng , thay đô được value
    public static int soLuongPhanTuCuaMang;

    public static void main(String[] args) {

        System.out.println("Nhập vào mảng số nguyên n: ");
        int n = new Scanner(System.in).nextInt();
        int[] arrayNumber = new int[n];
        //khởi tạo số lượng phần tử của mảng
        soLuongPhanTuCuaMang = arrayNumber.length;
        System.out.println("Nhập phần tử vào mảng");
        nhapDanhSach(arrayNumber);
        int tongSoChan = tongPhanTuChan(arrayNumber);
        System.out.println("Tống các phần tử số chẵn trong mảng: " + tongSoChan);
        int tongSoLe = tongPhanTuLe(arrayNumber);
        System.out.println("Tống các phần tử số lẻ trong mảng: " + tongSoLe);
        System.out.println("Số nguyên tố là: ");
        hienThiSonguyenTo(arrayNumber);
        System.out.println("");
        System.out.println("Danh sách các phần tử số chẵn sắp xếp theo thứ tự giảm dần: ");
        //sapXepGiamDanSochan(arrayNumber);
        //hienthi(arrayNumber);
        System.out.println("");
        System.out.println("Danh sách các phần tử số chẵn sắp xếp theo thứ tự giảm dần: ");
        //sapXepGiamDanSoLe(arrayNumber);
        //hienthi(arrayNumber);
       // System.out.println();
        int trungBinh = arrayNumber[n / 2];
        int[] arrayNumber1 = new int[n];
        int[] arrayNumber2 = new int[n];
        int[] sizes = new int[2];
        tachMang(arrayNumber, trungBinh, arrayNumber1, arrayNumber2, sizes);
        hienThiMangCon1(arrayNumber1, sizes[0]);
        hienThiMangCon2(arrayNumber2, sizes[1]);
        int soLan = soLanlap(arrayNumber);
        System.out.println("So Lan lặp: " + soLan);
        int soXoa = 3;
        xoaPhanTuCuaMang(arrayNumber, soXoa);
        thmPhanTuVaoMang(arrayNumber,3,4);
        hienthi(arrayNumber);
    }

    public static void thmPhanTuVaoMang(int[] arrayNumber,int soThem,int viTriThem) {
        if(soLuongPhanTuCuaMang == arrayNumber.length) {
            System.out.println("Mảng đẫ đầy , không thể thêm được phần tử, đề nghị xóa bot");
            return;
        }
        //thêm tiếp 1 ô nhớ để chứa số thêm vào
        soLuongPhanTuCuaMang = soLuongPhanTuCuaMang + 1;
        for(int i =0; i < soLuongPhanTuCuaMang;i++){
            // if i kh v trí thêm => bỏ qua i
            if (i != viTriThem){
                continue;
            }
            // Nê không vào if ở trên => i chính là vị trí muốn thêm
            // duyệt mảng để lùi tất cả các phâần tử phía sau i
             for (int j = soLuongPhanTuCuaMang - 1; j > i; j--) {
                 arrayNumber[j] = arrayNumber[j - 1];
             }
             // thêm số vào vị trí đã chỉ định
            arrayNumber[viTriThem] = soThem;
             break;
        }
    }
    private static void xoaPhanTuCuaMang(int[] arrayNumber, int soXoa) {
        int soPhanTuDaXoa = 0;
        for(int i = 0; i < soLuongPhanTuCuaMang; i++){
            int soNguyen = arrayNumber[i];
            //duyệt toàn bộ mảng, tìm danh sahcs các số trùng với số can xoa
            if(soXoa == soNguyen){
                //neu tim thay => duyet tư index i đến cuối mảng
               int indexXoa = i;
               for(int j = i; j < soLuongPhanTuCuaMang; j++){
                   if(j == arrayNumber.length - 1){
                       continue;
                   }
                   // lùi lại 1 số cho tất cả phần tử phía sau số cần xóa
                   arrayNumber[j] = arrayNumber[j + 1];
               }
               // lùi lại cả index i phục vụ cho trường hợp 2 số cần xóa cạnh nhau
               soLuongPhanTuCuaMang--;
               i--;
               //lu lại số lượng cần xóa
               soPhanTuDaXoa++;
            }
        }
        //update lại số lượng phần tử của mảng
        soLuongPhanTuCuaMang -= soPhanTuDaXoa;
        hienthi(arrayNumber);
    }

    public static void nhapDanhSach(int[] arrayNumber) {
        for (int i = 0; i < soLuongPhanTuCuaMang; i++) {
            System.out.println("Nhập vào phần tử thứ: " + i);
            int number = new Scanner(System.in).nextInt();
            arrayNumber[i] = number;
        }
    }

    public static int tongPhanTuChan(int[] arrayNumber) {
        int tongSoChan = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            int giaTriPhanTuI = arrayNumber[i];
            if (giaTriPhanTuI % 2 == 0) {
                tongSoChan = tongSoChan + giaTriPhanTuI;
            }
        }
        return tongSoChan;
    }

    public static int tongPhanTuLe(int[] arrayNumber) {
        int tongSoLe = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            int giaTriPhanTuI = arrayNumber[i];
            if (giaTriPhanTuI % 2 != 0) {
                tongSoLe = tongSoLe + giaTriPhanTuI;
            }
        }
        return tongSoLe;
    }

    public static boolean soNguyenTo(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void hienThiSonguyenTo(int[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length; i++) {
            if(soNguyenTo(arrayNumber[i])){
                System.out.print(String.format("%d ", arrayNumber[i]));
            }
        }
    }
   /* public static void sapXepGiamDanSochan(int[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            for(int j = i + 1; j < arrayNumber.length; j++) {
                if(arrayNumber[i] % 2 == 0 && arrayNumber[j] % 2 == 0){
                    if(arrayNumber[i] < arrayNumber[j]){
                        int sapXep = arrayNumber[i];
                        arrayNumber[i] = arrayNumber[j];
                        arrayNumber[j] = sapXep;
                    }
                }
            }
        }
    }*/
    /*public static void sapXepGiamDanSoLe(int[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            for(int j = i + 1; j < arrayNumber.length; j++) {
                if(arrayNumber[i] % 2 != 0 && arrayNumber[j] % 2 != 0){
                    if(arrayNumber[i] > arrayNumber[j]){
                        int sapXep = arrayNumber[i];
                        arrayNumber[i] = arrayNumber[j];
                        arrayNumber[j] = sapXep;
                    }
                }
            }
        }
    }*/
    public static void hienthi(int[] arrayNumber) {
        for (int i = 0; i < soLuongPhanTuCuaMang; i++) {
            int giaTriPhanTuI = arrayNumber[i];
            System.out.print(String.format("%d ", giaTriPhanTuI));
        }
    }
    public static void tachMang(int[] arrayNumber, int trungBinh,int[] arrNumber1, int[] arrNumber2,int[] sizes) {
        int size1 = 0;
        int size2 = 0;
        for(int i = 0; i < arrayNumber.length; i++){
            if(arrayNumber[i] <= trungBinh){
                arrNumber1[size1++] = arrayNumber[i];
            }else{
                arrNumber2[size2++] = arrayNumber[i];
            }
        }
        sizes[0] = size1;
        sizes[1] = size2;
    }
    public static void hienThiMangCon1(int[] arrNumber1, int size1) {
        System.out.println("Mảng con 1 (<= trung bình): ");
        for (int i = 0; i < size1; i++) {
            System.out.print(arrNumber1[i] + " ");
        }
        System.out.println();
    }

    public static void hienThiMangCon2(int[] arrNumber2, int size2) {
        System.out.println("Mảng con 2 (> trung bình): ");
        for (int i = 0; i < size2; i++) {
            System.out.print(arrNumber2[i] + " ");
        }
        System.out.println();
    }
    public static int soLanlap(int[] arrayNumber) {
        int soLan = 0;
        for(int i = 0; i < arrayNumber.length-1; i++){
            for(int j = i + 1; j < arrayNumber.length; j++){
                if(arrayNumber[i] == arrayNumber[j]){
                    soLan++;
                }
            }
        }
        return soLan;
    }
}
