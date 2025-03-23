package vn.com.t3h.buoi8.interfacedemo.demo2;

import vn.com.t3h.buoi7.btvn.Animail;

public class ZooIplmt implements IZoo {

    /*
       Interface IZoo : đã được quy định trước đầu vào , đầu ra của các method
       ==> class ZooIplmt khi triển khai (implement) thì phải ghi đè @Override hoàn chỉnh lại tất cả  các method của interface
     */
    private Animail[] danhsachDongvat;
    private int soLuongDongvatHientaiTronDanhSach;
    public  ZooIplmt(int soLuongDongVatKhoiTao){
        this.danhsachDongvat = new Animail[soLuongDongVatKhoiTao];
        this.soLuongDongvatHientaiTronDanhSach = 0;
    }

    @Override
    public void addAnimal(Animail animail) {
        if(this.soLuongDongvatHientaiTronDanhSach == this.danhsachDongvat.length - 1)
        // cần phải mở rộng
        {

        }
        this.soLuongDongvatHientaiTronDanhSach++;
        this.danhsachDongvat[this.soLuongDongvatHientaiTronDanhSach] = animail;
        System.out.println("đã thêm động vật thành công");
    }
    public void makeAllSoungds() {
        for (int i =0; i < this.soLuongDongvatHientaiTronDanhSach; i++){
            Animail animail = this.danhsachDongvat[i];
            animail.makeSound();
        }
    }
    public void displayAllInfo() {
        System.out.println("displayAllInfo");
    }

}
