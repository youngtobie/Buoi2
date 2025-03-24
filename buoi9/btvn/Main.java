package vn.com.t3h.buoi9.btvn;

public class Main {
    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager();

        Student student1 = new UniversityStudent(1,"Nguyen Van A");
        Student student2 = new UniversityStudent(2,"Nguyen Van B");
        courseManager.addStudent(student1);
        courseManager.addStudent(student2);

        courseManager.registerStudentForCourse(student1,"english");
        courseManager.registerStudentForCourse(student2,"Toan");
        System.out.println("--------------------------");
        Student student3 = new UniversityStudent();
        student3.inputInfo(courseManager);
        courseManager.addStudent(student3);
        courseManager.displayStudent();
        courseManager.registerStudentForCourse(student3,"english");
    }
}
