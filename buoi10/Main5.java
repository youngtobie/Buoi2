package vn.com.t3h.buoi10;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
vd: có 1 danh sách Student với 2 thuộc tính tên,điểm, mục tiêu nhập vào tên và lấy ra điểm của student theo tên
 */
public class Main5 {
    public static void main(String[] args) {
       // List<Student> students = initStudeents();
        String name = "Student 1";
    }

  /* public static List<Student> initStudeents() {
        List<Studeent> danhSachHocSinh = new ArrayList<Studeent>();
        for (int i = 0; i < 10; i++) {
            Studeent student = new Student();
            student.name = "student " + i;
            student.point = (int) (Math.random() * (10 - 1)) + 1;
            danhSachHocSinh.add(student);
        }
    }*/


    class Studeent {
        String name;
        Integer point;

        @Override
        public String toString() {
            return "Studeent{" +
                    "name='" + name + '\'' +
                    ", point=" + point +
                    '}';
        }
    }
}
