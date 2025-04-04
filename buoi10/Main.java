package vn.com.t3h.buoi10;
//COLLECTION

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // khai bao 1 danh sách các số nguyên

        List<Integer> numbers= new ArrayList<>();
        // thêm 1 phaanf tử vào collection
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("tìm ần tử có value = 2");
        for (Integer data : numbers) {
            if(data == 2){
                System.out.println(data);
            }
        }
        System.out.println("Tìm phần tử có value = 2 với stream");
        numbers.stream().filter(data->data.equals(2)).forEach(data-> System.out.println(data));
        // lấy phần tử từ collection thông qua index

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        // khơ tạo 1 sét các pần tử String
        Set<String> setString = new HashSet<String>();
        setString.add("a");
        setString.add("b");
        setString.add("c");
        //Biến set thành Iterrator để duyệt các phần tử của set
        Iterator<String> setI = setString.iterator();
        setI.next();

        while (setI.hasNext()) {//nếu set vẫn còn phần tử
            // lấy phần tử ra từ set
            System.out.println(setI.next());
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // lấy ra các phần tử
        queue.stream().forEach(data -> System.out.println(data));
    }
}
