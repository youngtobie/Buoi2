package vn.com.t3h.module2;

public class Employee implements Workable {

    private String name;
    private int age;
    private double salary;
    public Employee(){
    }
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        work();
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    @Override
    public void work() {
        System.out.println("Working as an employee");
    }
    public void updateSalary(double newSalary) {
        if(newSalary < 0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
