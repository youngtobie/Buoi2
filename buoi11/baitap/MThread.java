package vn.com.t3h.buoi11.baitap;

public class MThread extends Thread {

    private Integer start;
    private Integer end;
    private String name;


    MThread(int start, int end,String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(String.format("Custom thread %s Startedat ", name));
        for (int i = start; i <= end; i++) {
            System.out.println(String.format("thread %s print value: %d", name,i));
        }
        System.out.println(String.format("Custom thread %s End ", name));
    }
}
