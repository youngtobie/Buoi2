package vn.com.t3h.buoi9.btvn;

public class CourseAlreadyRegisteredException extends Exception{

    private String courseName;
    public CourseAlreadyRegisteredException(String s)
    {}
    public CourseAlreadyRegisteredException(String courseName,String message){
        super(message);
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "CourseAlreadyRegisteredException: " + getMessage();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
