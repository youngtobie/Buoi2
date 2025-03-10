package vn.com.t3h.btvnbuoi4;
/*
Bài 2: Kiểm tra số điện thoại

Mô tả bài toán: Viết hàm kiểm tra một chuỗi nhập vào có phải là số điện thoại hợp lệ hay không?

Điều kiện:

· Số điện thoại có 9 chữ số (không bao gồm số 0 ở đầu).

· Có thể có ký tự như "-" hoặc ".".

· Các dạng hợp lệ:

o +84xxxxxxxxx

o 0xxxxxxxxx

o 84xxxxxxxxx

o 0xxx.xxx.xxx

o 0xxx-xxx-xxx
 */
public class Bai2 {

    public static void main(String[] args) {
        String[] data = {"+84912345678","091-234-5678","8481234567","0912.345.aaa"};
        for(int i = 0; i<data.length; i++){
            soDienThoaiHopLe(data[i]);
        }
    }
    public static void soDienThoaiHopLe(String soDienThoai) {
        //B1: kiêm tra chuỗi có bắt đầu bằng +84,0,84 không
        System.out.println("bắt đầu kiểm tra số điện thoai: " + soDienThoai);
        String[] danhSachKyTuBatDau = {"+84", "0", "84"};
        boolean kyTuBatDauHopLe = false;
        String kyTuBatDauCuaSdt = "";
        for (int i = 0; i < danhSachKyTuBatDau.length; i++) {
            String kyTuBatDau = danhSachKyTuBatDau[i];
            if (soDienThoai.startsWith(kyTuBatDau)) { //startWish ktra chuỗi có được bắt đầu bằng chuỗi khác hay không
                kyTuBatDauHopLe = true;
                kyTuBatDauCuaSdt = kyTuBatDau;
                break;
            }
        }
        // ký tự bắt đầu không hợp lệ ==> kết thúc
        if (!kyTuBatDauHopLe) {
            System.out.println("số điện thoại phải bắt đầu bằng \"+84\",\"0\",\"84\" ");
            return;
        }
        // B2: loại bỏ các ký tự "-" và "." trong chuõi
        soDienThoai = soDienThoai.replaceAll("-", "").replaceAll("\\.","");
        //B3: đếm xem ngoại trừ các ký tự bắt đầu
        soDienThoai = soDienThoai.substring(kyTuBatDauCuaSdt.length(),soDienThoai.length());
        if(soDienThoai.length() != 9){
            System.out.println("số điện thoại phải có 9 chữ số");
            return;
        }
        //B4: kiểm tra các text còn lại có phải số hay không
        for (int i = 0; i < soDienThoai.length(); i++) {
            char data =  soDienThoai.charAt(i);
            //Biến chuỗi thành số
            try{
                Integer.parseInt(String.valueOf(data));
            }catch (NumberFormatException e){
                System.out.println("ồn tại 1 ký tự không phải là số");
                return;
            }
        }
        System.out.println("Số điện thoai hợp lệ");
        return;
    }

}
