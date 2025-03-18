package vn.com.t3h.buoi7.btvn;

public class Zoo {

    private Animail[] animails;
    private int n;

    // Constructor để khởi tạo vườn thú với số lượng tối đa động vật
    public Zoo(int capacity) {
        animails = new Animail[capacity]; // Khởi tạo mảng với kích thước cụ thể
        n = 0;
    }

    // Thêm động vật vào vườn thú
    public void addAnimal(Animail animal) {
        if (n < animails.length) {
            animails[n] = animal;
            n++;
            System.out.println("Đã thêm động vật vào vườn thú.");
        } else {
            System.out.println("Vườn thú đã đầy");
        }
    }

    // Phát ra âm thanh của tất cả động vật trong vườn thú
    public void makeAllSounds() {
        System.out.println("Âm thanh của các động vật trong vườn thú:");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < n; i++) {
            animails[i].makeSound();
        }
    }

    // Hiển thị thông tin của tất cả động vật trong vườn thú
    public void displayAllInfo() {
        System.out.println("Thông tin của tất cả động vật trong vườn thú:");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < n; i++) {
            animails[i].hienThiThongTin();
            // Nếu là chim thì gọi phương thức fly()
            if (animails[i] instanceof Bird) {
                ((Bird) animails[i]).fly();
            }
            System.out.println("---------------------------------------------");
        }
    }

    // Getter và Setter cho mảng động vật
    public Animail[] getAnimails() {
        return animails;
    }

    public void setAnimails(Animail[] animails) {
        this.animails = animails;
    }

    // Getter và Setter cho kích thước hiện tại của mảng
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    protected void addAnimal() {
    }
}
