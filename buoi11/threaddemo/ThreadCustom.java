package vn.com.t3h.buoi11.threaddemo;

public class ThreadCustom extends Thread {

    private String threadName;
    public ThreadCustom(String threadName) {
        super(threadName);
        this.threadName = threadName;
    }
    /*
    // hàm sẽ được chạy khi tạo ra 1 thread mới
    ==> các hành động của thread sẽ ợc viết trong method run này
     */
    @Override
    public void run() {
        System.out.println(String.format("Thread Name ; %s bắt đầu chạy",threadName));
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("End Thread Name: %s bắt đầu chyaj",threadName) );
    }
    public static void main(String[] args) {
        ThreadCustom tc = new ThreadCustom("Thread-1");
        tc.start();
        for (int i = 0; i < 3; i++) {
            tc = new ThreadCustom("Thread" + i);
            tc.start();
        }
    }
}

