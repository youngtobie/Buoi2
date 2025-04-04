package vn.com.t3h.buoi11;
/*
Deadlock:
   - tình trạng hai thread cùng chờ các tài nguyên của nhau
   và cứ chờ mãi không thể finish được chính thread đó

   ví dụ:
      process thread 1:
         + đag nắm giữ resource 1 để sử lý
         + và đang chờ đợi resource2 được giải phóng để sử dụng xử lý và hoàn tất process
         + chỉ khi hoàn tất process
         --> process thread mới giải phóng resource1
          process thread 2:
         + đag nắm giữ resource 2 để sử lý
         + và đang chờ đợi resource1 được giải phóng để sử dụng xử lý và hoàn tất process
         + chỉ khi hoàn tất process
         --> process thread mới giải phóng resource1
    ==> vậy 2 process đều đang nắm giữ tài nguyên cua process khác và đều đang chwof tài nguyên để hoàn thành process chính nó
    ==> quá trình này sẽ cứ đứng im tại đó gọi là deadlock


    * deadlock xử lý thế nào
       + bắt buộc phải kill 1 trong 2 process
       + 2. restart lại app để kill 2 process


   Bài tập yêu cầu như sau:

Tạo một ứng dụng Java có 3 thread thực hiện đồng thời các tác vụ khác nhau.

Mỗi thread sẽ thực hiện nhiệm vụ:

Thread 1: In ra dãy số từ 1 đến 10.

Thread 2: In ra dãy số từ 11 đến 20.

Thread 3: In ra dãy số từ 21 đến 30.

Sử dụng Runnable Interface để triển khai các thread.

Đảm bảo rằng các thread chạy song song mà không làm gián đoạn quá trình thực thi của nhau.

Mỗi thread cần in ra thông báo khi bắt đầu và kết thúc.
 */
public class Main {
    public static void main(String[] args) {

    }
}
