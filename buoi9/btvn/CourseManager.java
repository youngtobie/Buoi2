package vn.com.t3h.buoi9.btvn;

public class CourseManager {
    private Student[] student;
    private int numberCurrentStudent;

    public CourseManager() {
        this.student = new Student[15];
        this.numberCurrentStudent = 0;
    }
    public void addStudent(Student student) {
        tangKichThuongMang();
        this.student[this.numberCurrentStudent] = student;
        this.numberCurrentStudent++;
    }
    public void registerStudentForCourse(Student student,String courseName) {
        try{
            student.registerCourse(courseName);
        }catch (CourseAlreadyRegisteredException e){
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("Đăng ký hoàn tât");
        }

    }
    public boolean checkId(int id) {
        for (int i = 0; i < numberCurrentStudent; i++) {
            if (student[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    private void tangKichThuongMang() {
        if(this.student.length != this.numberCurrentStudent) {
            return;
        }
        Student[] newStudent = new Student[this.student.length * 2];
        for(int i = 0; i < this.student.length; i++){
            newStudent[i] = this.student[i];
        }
        this.student = newStudent;
    }
    public void displayStudent() {
        for(int i = 0; i < this.numberCurrentStudent; i++){
            student[i].showInfo();
        }
    }
}
