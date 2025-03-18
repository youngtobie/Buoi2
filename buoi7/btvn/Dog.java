package vn.com.t3h.buoi7.btvn;

import java.util.Scanner;

public class Dog extends Animail {

    private String giongCho;

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập breed( giống chó): ");
        this.giongCho = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        if(getLoaiDongVat().equalsIgnoreCase("dog")) {
            super.hienThiThongTin();
            System.out.println("Breed: " + this.giongCho);
        }
        else{
            System.out.println("Nhập lại loại động vật hợp lệ");
        }
    }

    public String getGiongCho() {
        return giongCho;
    }

    public void setGiongCho(String giongCho) {
        this.giongCho = giongCho;
    }
}
