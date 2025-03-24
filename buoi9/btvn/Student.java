package vn.com.t3h.buoi9.btvn;

import java.util.Scanner;

public  abstract class Student {
    public static Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private String[] courses;
    private int soLuongMonHocHientai;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new String[5];
        this.soLuongMonHocHientai = 0;
    }
    public Student() {}

    public void reSize(){
        if(this.soLuongMonHocHientai != this.courses.length){
            return;
        }
        String[] newCourses = new String[this.courses.length * 2];
        for(int i = 0; i < this.courses.length; i++){
            newCourses[i] = this.courses[i];
        }
        this.courses = newCourses;
    }

    public void registerCourse(String courseName) throws CourseAlreadyRegisteredException {
        for (int i = 0; i < soLuongMonHocHientai; i++) {
            if (courses[i].equalsIgnoreCase(courseName)) {
                throw new CourseAlreadyRegisteredException(courseName, "Môn học đã được đăng ký trước đó.");
            }
        }
        if (soLuongMonHocHientai == courses.length) {
            reSize();
        }
        courses[soLuongMonHocHientai++] = courseName;
        System.out.println("Đăng ký môn học " + courseName + " Thành Công");
    }
    public void inputInfo(CourseManager courseManager) {
        boolean kiemTra = false;
        while (!kiemTra) {
            try {
                System.out.print("Nhập ID: ");
                int newId = scanner.nextInt();
                scanner.nextLine();

                if (courseManager.checkId(newId)) {
                    System.out.println(" ID đã tồn tại. Vui lòng nhập lại!");
                } else {
                    this.id = newId;
                    kiemTra = true;
                }
            } catch (Exception e) {
                System.out.println(" ID phải là số nguyên. Vui lòng nhập lại.");
                scanner.nextLine(); // Xóa dữ liệu lỗi trong buffer
            }
        }

        System.out.print("Nhập tên học viên: ");
        this.name = scanner.nextLine();
    }


    public void showInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Học Viên: " + this.name);
        for(int i = 0; i < this.soLuongMonHocHientai; i++){
            System.out.println("Course " + (i + 1) + ": " + this.courses[i]);
        }
    }
    public String[] getCourses() {
        String[] result = new String[this.soLuongMonHocHientai];
        for(int i = 0; i < this.soLuongMonHocHientai; i++){
            result[i] = this.courses[i];
        }
        return result;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuongMonHocHientai() {
        return soLuongMonHocHientai;
    }

    public void setSoLuongMonHocHientai(int soLuongMonHocHientai) {
        this.soLuongMonHocHientai = soLuongMonHocHientai;
    }

}
