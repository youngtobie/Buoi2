package vn.com.t3h.buoi8.interfacedemo.demo2;

public class Main {

    public static void main(String[] args) {

        IZoo zoo = new ZooIplmt(3);
        zoo.addAnimal(null);
        zoo.makeAllSoungds();
        zoo.displayAllInfo();
    }
}
