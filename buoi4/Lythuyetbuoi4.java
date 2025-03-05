package vn.com.t3h.buoi4;

/*
 BUỔI 4: MẢNG ,STRINGx
 */
public class Lythuyetbuoi4 {

    public static void main(String[] args) {

        //khai báo mảng danh sách các số nguyên
        int [] array = new int[10];

        String [] arrString = {"A","B","C","D","E","F"};

        //cho phép truy cập thông qua index
        String phanTuDau = arrString[0];
        String phanTuCuoi = arrString[5];
        System.out.println(String.format("Phần tử đầu: %s, phần tử cuối: %s",phanTuDau,phanTuCuoi));

        arrString[0] = "K";
        arrString[5] = "H";
        // duyệt danh sách các phần tử
        for(int i = 0; i < arrString.length; i++)
        {
            String str = arrString[i];
            System.out.println(String.format("phần tử thứ %d : %s",i,str));
        }
        // cách tạo ra string
        //c1: khai báo kiểu nguyên thủy literal
        String name = "Java";
        //c2: khai báo kiểu dối tượng
        String name2 = new String("Java");
        String name3 = "Java";
        String name4 = new String("Java");

        name3 = "Java001";
        /*
        Đặc điểm của String:
          + Bất biến: không thể thay đốidđưuọc 1 đối tượng đã tạo ra , nếu muốn thay đổi Java sẽ tạo ra 1 String khác, không thay đổi trên String chính đã được tạo ra
          + Xử lý Strung tương tự mảng kí tự
             Java < = > [J][a][v][a]
          + chỉ tồn tại duy nhất 1 String trong String pool
         - Nơi lưu trữ :
           + Nếu khai báo kiểu literal thì String sẽ được lưu trữ trong String pool
                String pool là 1 vùng nhớ nhở nằm trong Heap chuyên được sử dụng để lưu tữ các String đưuọc khai báo kiu literal
           + Nếu khai báo bằng từ khóa new thì  => String đưuọc lưu tại Heap thông thường
        - So Sánh 2 String
            +(==) or (equarl) áp dụng cho các biến đối tượng , không áp dụng cho các biến nguyên thủy
            + so sánh(==)
                -  So sánh địa chỉ ô nhớ của 2 biến
            + So sánh (equal)
                - so sánh giá trị của 2 biến

         */
        String name5 = "T3h";
        String name6 = new String("T3h");
        String name7 = "T3h";
        String name8 = new String("T3h");
        String name9 = name6;
        System.out.println(name5 == name6);
        System.out.println(name5.equals(name6));
        System.out.println(name5 == name7);
        System.out.println(name8.equals(name6));
        System.out.println(name8 == name6);
        System.out.println(name9 == name6);

        StringBuilder stringBuilder = new StringBuilder("T3h");
        stringBuilder.append("Java");

        StringBuffer stringBuffer = new StringBuffer("T3h");
        stringBuffer.append("Java");
        System.out.println(stringBuilder.toString());
    }
}
