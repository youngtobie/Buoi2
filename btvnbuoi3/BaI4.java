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

        long sum = 0;
        for(long  a = 0; a <= 200; a++)
        {
            for(long b = 0; b <=100; b++)
            {
                for(long c = 0;c <= 40; c++)
                {
                    if((a * 1000) + (b * 2000) + (c * 5000) == 200000)
                    {
                        sum++;
                    }
                }
            }
            }
        System.out.println("Các phương án để có tổng 20000đ với 1000đ , 2000đ , 5000đ: " + sum);
        }
    }

