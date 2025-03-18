package vn.com.t3h.buoi7.btvn;

import java.util.Scanner;

public class ZooAdvanced extends Zoo {


    public ZooAdvanced(int capacity) {
        super(capacity);
    }

    public void hienThi(){
        System.out.println("Nhập số lượng động vật muốn thêm: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("động vật thứ " + (i + 1) +  " được thêm vào");
            addAnimal();
        }
    }
    @Override
    public void makeAllSounds() {
        super.makeAllSounds();
    }

    @Override
    public void displayAllInfo() {
        super.displayAllInfo();
    }

    @Override
    public void addAnimal(Animail animal) {
        super.addAnimal(animal);
    }

}
