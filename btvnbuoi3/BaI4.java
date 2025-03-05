package vn.com.t3h.btvnbuoi3;
/*
Bài 4: Tìm tất cả các phương án có thể để có tổng 200.000đ từ 3 loại giấy bạc 1000đ, 2000đ, và 5000đ

Mô tả: Lập chương trình để tìm tất cả các phương án có thể có tổng 200.000đ với các mệnh giá giấy bạc là 1000đ, 2000đ, và 5000đ.

Test Case:

1. Input: Tổng = 200.000đ, mệnh giá = 1000đ, 2000đ, 5000đ Output: (x1, x2, x3) là số lượng giấy bạc 1000đ, 2000đ, và 5000đ sao cho: x1 * 1000 + x2 * 2000 + x3 * 5000 = 200000

Ví dụ một số kết quả: (x1 = 160, x2 = 20, x3 = 4) (x1 = 100, x2 = 50, x3 = 10) (x1 = 0, x2 = 100, x3 = 30)
 */
public class BaI4 {

    public static void main(String[] args) {

        int tong = 200000;
        int mengGia1 = 1000;
        int mengGia2 = 2000;
        int mengGia3 = 5000;

        int tongSoToMenhGia1 = tong / mengGia1;
        int tongSoToMenhGia2 = tong / mengGia2;
        int tongSoToMenhGia3 = tong / mengGia3;

        for(int i = 0 ; i < tongSoToMenhGia1 ; i++)
        {
            int soToMenhGia1 = i;
            for(int j = 0 ; j < tongSoToMenhGia2 ; j++){
                int soToMenhGia2 = j;
                for(int k = 0 ; k < tongSoToMenhGia3 ; k++){
                    int soToMenhGia3 = k;

                    int tongTienMenhGia1 = soToMenhGia1 * mengGia1;
                    int tongTienMenhGia2 = soToMenhGia2 * mengGia2;
                    int tongTienMenhGia3 = soToMenhGia3 * mengGia3;

                    if(tong == (tongTienMenhGia1 + tongTienMenhGia2 + tongTienMenhGia3))
                    {
                        System.out.println(String.format(""));
                    }
                }
            }
        }
    }
    }

