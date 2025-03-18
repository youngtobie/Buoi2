package vn.com.t3h.buoi7.btvn;

import java.util.Scanner;

public class Cat extends Animail{

    private String giongMeo;

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập giống mèo: ");
        this.giongMeo = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        if(getLoaiDongVat().equalsIgnoreCase("cat")) {
            super.hienThiThongTin();
            System.out.println("Breed: " + this.giongMeo);
        }
        else{
            System.out.println("Nhập lại loại động vật hợp lệ");
        }
    }

    public String getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(String giongMeo) {
        this.giongMeo = giongMeo;
    }
}
