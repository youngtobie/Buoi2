package vn.com.t3h.btvnbuoi4;

/*
Bài 1: Xử lý chuỗi

Mô tả bài toán:

1. Đếm số lượng từng từ trong đoạn văn (không phân biệt hoa thường).

2. Viết hoa chữ cái đầu trong mỗi từ.

3. Xóa các nguyên âm trong câu.

Đầu vào: Chuỗi văn bản sau:

"Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động."

Các bài toán con cần thực hiện:

a) Đếm số lượng từng từ.

b) Viết hoa chữ cái đầu trong mỗi từ.

c) Xóa các nguyên âm trong câu.
*/
public class Bai1 {
    public static void main(String[] args) {
        //B1: biến string thành mảng sử dụng hàm split, că bỏ toàn bộ khoảng trắng giữa các chữ cái
        String data = "Tôi học lập trình, học lập trình rất hay! hay hay";
        //Chuẩn hóa lọc bỏ các kí tự ặc biệt tồn tại trong chuỗi
        //data = data.replaceAll(",", "").replaceAll("!","").replaceAll("\\.","");
        String[] danhSachKyTuDacBiet = {"\\.",",","!","-",":"};
        data = chuanHoaChuoi(data,danhSachKyTuDacBiet);
        String[] arrayData = data.split(" "); // cắt chuỗi thành mảng bằng câu lệnh split
        //B2: duyệt chuỗi
        for(int i = 0; i < arrayData.length; i++){
            String chuoiCanDem = arrayData[i];
            //Kiểm tra chuỗi đã được đếm chưa bằng cách kiểm tra từ index = 0 đến vị trí hiện tại index = i
            //if đã tồn tại 1 chuỗi tương tự chuooixchuoiCanDem => chuoiCanDem đã được đếm 1 lần, vị trí lặp
            boolean chuoiDaDuocKiemTra = false;
            for(int j = 0; j < i; j++){
                 String chuoiDaDuocDem = arrayData[j];
                if(chuoiCanDem.equalsIgnoreCase(chuoiDaDuocDem)){ // hàm equalsIgnoreCase bỏ qua kí tự viết hoa hay viết thường chỉ so sánh giá trị
                    chuoiDaDuocKiemTra = true;
                    break;
                }
            }
            //nếu thật sữ chuỗi này chuoiCanDem đã đưuọc kiểm tra => bỏ qua không đếm nữa
            if(chuoiDaDuocKiemTra){
                continue;
            }


            int demSoLanXuatHien = 0;
            for(int j = i; j < arrayData.length; j++){
                String chuoiCuaMang = arrayData[j];
                if(chuoiCanDem.equals(chuoiCuaMang)){
                    demSoLanXuatHien++;
                }
            }
            System.out.println("CHuỗi |" + chuoiCanDem + " |xuất hiện| : " + demSoLanXuatHien);
        }
    }
    public static String chuanHoaChuoi(String data,String[] danhSachKyTuDacBiet){
        for(int i = 0; i < danhSachKyTuDacBiet.length; i++){
            String kyTuDacBiet = danhSachKyTuDacBiet[i];
            if(!data.contains(kyTuDacBiet)){ // contains() - chứa các kĩ tự đặc biệt đấy không
                continue;
            }
            data= data.replaceAll(kyTuDacBiet,"");
        }
        return data;

    }
}
