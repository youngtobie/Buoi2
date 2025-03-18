package vn.com.t3h.buoi7.btvn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nhập số lượng động vật: ");
        int n = new Scanner(System.in).nextInt();
        Zoo zoo = new Zoo(10);

        xuLyThongTin(n, zoo);

        zoo.displayAllInfo();
        zoo.makeAllSounds();
    }

    private static void xuLyThongTin(int n, Zoo zoo) {
        for (int i = 0; i < n; i++) {
            System.out.println("Bạn muốn chọn loài động vật nào???");
            System.out.println("1.Chó");
            System.out.println("2.Mèo");
            System.out.println("3.Chim");
            int luaChon = new Scanner(System.in).nextInt();
            switch (luaChon) {
                case 1:
                    Dog dog = new Dog();
                    dog.nhapThongTin();
                    zoo.addAnimal(dog);
                    break;
                case 2:
                    Cat cat = new Cat();
                    cat.nhapThongTin();
                    zoo.addAnimal(cat);
                    break;
                case 3:
                    Bird bird = new Bird();
                    bird.nhapThongTin();
                    zoo.addAnimal(bird);
                    break;
                default:
                    System.out.println("Nhập không đúng định dạng");
            }
        }
    }
}
