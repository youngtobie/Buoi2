package vn.com.t3h.buoi6;

// cú pháp để khai báo class Car : tên class
public class Car {

    // khai báo các thuộc tính của class
    /*
    các thuộc tính khi khai báo phải để phạm vi rtruy cập private để bảo vệ dữ liệu của các thuộc tính để tránh sửa đổi 1 cách tùy tiệ, chỉ cho phép sửa đổi giá trị của thuộc tính thông qua các method getted, setter
     */
    private String mauSac;
    private int namSanXuat;
    private String ten;

    /* để set các giá trị cho các thuộc tính đang để phạm vi truy cập private thì phaải tạo caác method getter, setter
       -  các method geter , metter là các thuộc tính thông thường, nhưng chuyên được sử dụng để sua đổi hoặc trả về giá trị của thuộc tính
     */
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen(String ten){
        return ten;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    public int getNamSanXuat(int namSanXuat){
        return namSanXuat;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public String getMauSac(String mauSac){
        return mauSac;
    }
    /*
    khai báo constructor dùng để khai báo đối tượng
    contructor luônd được gọi tới đầu tiên khi được khởi tạo 1 object
     */
    public  Car(){ // contructor không tham số
        System.out.println("constructor được khởi tạo");
    }
    // contructor  có tham  số
    public  Car(String mauSac, int namSanXuat, String ten){
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
        this.ten = ten;
        System.out.println("constructor được khởi tạo");
    }


    // khai báo các phương thức của class
    public void run(){
        System.out.println("Xe " + ten + " đang chạy");
    }
    public void showInfo(){
        System.out.println("Tên xe: " + ten);
        System.out.println("màu sắc: "+ mauSac);
        System.out.println("Năm sản xuất: " + namSanXuat);
    }

}
