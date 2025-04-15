package vn.com.t3h.module2;

public class Manager extends Employee{
    private String department;
    public Manager() {}
    public Manager(String name,int age,double salary,String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("department: " + department);
    }
    public void displayInfo(String format) {
        if (format.equalsIgnoreCase("JSON")) {
            System.out.println("{");
            System.out.println("  \"name\": \"" + getName() + "\",");
            System.out.println("  \"age\": " + getAge() + ",");
            System.out.println("  \"salary\": " + getSalary() + ",");
            System.out.println("  \"department\": \"" + department + "\"");
            System.out.println("}");
        } else {
            // Mặc định hiển thị kiểu bình thường
            displayInfo();
        }
    }

    @Override
    public void work() {
        System.out.println("Managing department");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
