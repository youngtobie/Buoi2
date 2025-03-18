package vn.com.t3h.buoi7.btvn;

import java.util.Scanner;

public class Bird extends Animail{

    private int saiCanh;

    @Override
    public void makeSound() {
        System.out.println("Tweet Tweet !");
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập sải cánh: ");
        this.saiCanh = new Scanner(System.in).nextInt();
    }

    @Override
    public void hienThiThongTin() {
        if(getLoaiDongVat().equalsIgnoreCase("bird")) {
            super.hienThiThongTin();
            System.out.println("Breed: " + this.saiCanh);
        }
        else{
            System.out.println("Nhập lại loại động vật hợp lệ");
        }
    }

    public void fly()
    {
        System.out.println(this.saiCanh + "Đang bay");
    }

    public int getSaiCanh() {
        return saiCanh;
    }

    public void setSaiCanh(int saiCanh) {
        this.saiCanh = saiCanh;
    }
}
