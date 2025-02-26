package vn.com.t3h.buoi2;

/*
public : có thể truy cập được ở mọi file class khác nhau
private: chỉ c thể truy cập khi cùng thuộc 1 file class
protected: chỉ có thể truy cập khi cùng package, khác package thì phải class con của class cha
default: chỉ được truy cập khi cùng chung package
phạm vi truy cập được sử dụng để bảo v dữ liệu của 1 class, giúp dữ liệu của các class không bị truy cập và sửa đổi trái phép
chưa có lập trình OOP -> hươớng cấu trúc
* Biến trong Java :
    - Là 1 vị trí trong vùng nhớ máy tính được cấp phát khi chương trình bắt đầu chạy
    - Được sử dụng đ lưu trữ dữ liệu của chương trình
    - Mỗi biến sẽ có : tên, kiểu dữ liệu, địa chỉ ô nhớ (nơi biến tồn tại trong ô nớ được cấp phát khi chung trình chạy)
    -Khi khai báo 1 biến trong java tức là đang yêu cầu đang yêu cầu ma ảo java cấp phát
  - Trong lập trình hướng cấu trục có 2 loại biến:
    Biến tham trị , Biến tham chiếu

* Các Kiêu Dữ Liệu Trong Java
   2 kiểu chính:
      -) Kiểu dữ liệu nguyên thủy
          int, char,float,boolean,long,double,.... các kiểu dữ liệu cơ bản được cung cấp sẵn.
      -) Kiểu dữ liệu  đối tượng
          Interge,String, Double,Float,Long , Boolean là Các class được tự định nghĩa ra trong quá trình phát triển ví dụ: Person, Main
      ==> 2 kiểu dữ liệu này khác nhau:
         - No được tạo ra khi khai báo.
          + kểu dữ liệu nguyên thủy năm trong vùng nhớ Stack khi được khai báo.
          + Kiểu dữ liệu đối tượng có 2 phần:
             - p1: biến được khai báo trong stack.
             -p2: vùng nhớ của biến nằm trong vùng nhớ Heap.
         - các miền giá trị có thể chứa được
 - Trong lập trình hướng cấu trúc( cũ trong c) có 2 loại biến:
   + Biến tham trị:
     - khi truyền 1 tham số vào trong 1 hàm ngoài truyền giá trị của biến còn truyền vào cả địa chỉ ô nhớ của biến đó
     => Nếu trong method thay đổi giá trị của biến a vậy khi chương trình chạy qua method đó biến a cũng bị thay đổi giá trị
   + Biến tham chiếu:
     - Khi truyền 1 tham số vào trong 1 hàm chỉ truyền giá trị của biến đó vào method, còn không truyền địa chỉ ô nhớ vào method đó
      => khi method thay dổi gía trị của biến a => Biến ra sẽ không bị thay đổi giá trijchay chạy hết method
  ==> chỉ xảy ra trong lập trình hướng cấu trục đặc biệt là c
  ==> trong java tất cả các biến khi truyền vào method đều được truyền thông qua kiểu tham trị tức là khi tham số (param) được method sử dụng, mothod sẽ phải copy param đó sang 1 cùng nhớ khác và chỉ thay đổi giá trị của

 - Các kiểu biến trong java:
   + Biến local:
      là biến được khai báo trong các method và chỉ cos phạm vi sử dụng nằm trong method đó, khi hết method đó sẽ không sử dụng được nữa.
   + Biến instance (biến tòan cục):
      Được khai báo  tầng class , đóng vai trò là thuộc tính của class, có thể sử dụng ở tất cả các method nằm trong class
      có thể sử dụng thêm phạm vi truy cập, private,public, protected,defalt
   + Biến static:
      Biến đặc biệt được quản lý và truy cập bởi class, là biến dùng chung cho tất cả các đối tượng trong class.
      Biến đặc biệt được khởi tạo trước tiên ngay khi chương trình bắt đầu
            có thể sử dụng thêm phạm vi truy cập, private,public, protected,defalt
 *Toán tử tăng giảm:
 - (++)
   -) Nếu toán tử ++  nằm phía sau 1 biến
     vd: a++
       => Biến a sẽ được tăng lên 1 khi chương trình chạy hết dòng lệnh a++.
      Nếu toán tử ++ nằm phía trước của 1 biến
      vd: ++a
      => Biến a sẽ đưuọc tăng thêm 1 trước khi chương trình chạy dòng lệnh ++a
 - (--)Nếu toán tử --  nằm phía sau 1 biến
      vd: a--;
        => biến a sẽ bị trừ đi 1 giá trị khi chương trình chạy qua dòng lệnh a--;
      Nếu toán tử -- nằm phía trước của 1 biến
        => biêến a sẽ bị từ đi 1 giá trị trước khi chương trình chạy qua dòng lệnh --a  ;
 - cấu trúc rẽ nhánh:
   dạng1:
       if(biểu thức_điều khiện)
       {
         khối lệnh thực thi khi biểu thức điều kiện bằng true
       }else{
         khối lệnh thực thi khi biểu thức điều kiện bằng false
       }
   dạng 2:
       if(biểu thức_điều khiện)
       {
         khối lệnh thực thi khi biểu thức điều kiện1 bằng true
       }else if(biểu thức_điều khiện){
         khối lệnh thực thi khi biểu thức điều kiện2 bằng false
       }else if(biểu thức_điều khiện){
         khối lệnh thực thi khi biểu thức điều kiện3 bằng false
       }... else if(biểu thức_điều khiện){
         khối lệnh thực thi khi biểu thức điều kiệnn bằng false
       } else{
         khối lệnh thực thi khi tất cả các biểu thức điều kiện bằng false
       }
 Toán tử 3 ngôi:
    có dạng:
        biểu_thức_điề_kiện ? statement A : statement B
  * biểu thức điều kiện = 
*/
public class Person {

    // khai bao biến instance
    private String name;
    protected int age;
    String email;

    // khai báo biến static
    public static String address;
    public static void main(String[] args) {
        int soLon = 0;
        double soBe =1;
        // cách khai báo đối tượng thông qua t khóa new
        Person p = new Person();
        System.out.println("Hello World!");
        // gọi hàm cộng hai số
        int tong = congHaiso(2,5);
        //In ra giá trị của tổng
        System.out.println("giá trị của tổng: " + tong);
        // gọi method
        int a = 20;
        thayDoiGiaTriBienNguyenThuy(a);
        System.out.println(a);
        Person giang = new Person();
        giang.age = 20;
        thayDoiGiaTriBienDoiTuong(giang);
        System.out.println(giang.age);

        int demo1 = 10;
        System.out.println(++demo1); //11
        System.out.println(demo1++); //11
        System.out.println(demo1);   //12

        int demo2 = 20;
        System.out.println(--demo2); //19
        System.out.println(demo2--); //19
        System.out.println(demo2);   //18
    }
    public void setName(String name){
        this.name = name;
    }
    public static void thayDoiGiaTriBienNguyenThuy(int a)
    {
        a = 10; //  thay đổi giá trị biến đã được copy sang 1 vùng nhớ khác , và là biến khác
        System.out.println("Đã thay đổi giá trị thành công");
    }
    public static void thayDoiGiaTriBienDoiTuong(Person person)
    {
        person.age = 10;
        System.out.println("Đã thay đổi giá trị thành công");
    }

    public static int congHaiso(int soA,int soB)
    {
        //khai báo biến local
        int tong = soA + soB;
        return tong;
    }
}
