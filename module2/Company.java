package vn.com.t3h.module2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Company {

    private ArrayList<Employee> danhsachnhanvien ;
    private HashMap<String,Double> salaryMap ;
    private HashSet<String> departments ;

    public Company() {
        danhsachnhanvien = new ArrayList<>();
        salaryMap = new HashMap<>();
        departments = new HashSet<>();
        danhsachnhanvien.add(new Employee("Nguyễn Văn A",25,5000));
        danhsachnhanvien.add(new Employee("Lê Văn K",30,1000));
        danhsachnhanvien.add(new Manager("Đỗ Văn B",45,7000,"Kinh Doanh"));
        for (Employee employee : danhsachnhanvien) {
            salaryMap.put(employee.getName(), employee.getSalary());
            if(employee instanceof Manager){
                departments.add(((Manager) employee).getDepartment());
            }
        }
    }

    public void addNewEmployee(Employee employee) {
        danhsachnhanvien.add(employee);
        salaryMap.put(employee.getName(), employee.getSalary());
        if (employee instanceof Manager) {
            departments.add(((Manager) employee).getDepartment());
        }
    }
    // hiển thị tất cả danh sách nhân viên
    public void displayDanhSachNhanVien() {
        System.out.println("Danh sách tất cả nhân viên");
        for (Employee employee : danhsachnhanvien) {
            employee.displayInfo();
            System.out.println("--------------------");
        }
    }
    // update thông tin luowngg nhân viên
    public void updateSalary(String name, double newSalary) {
        for (Employee employee : danhsachnhanvien) {
            if (employee.getName().equals(name)) {
                employee.updateSalary(newSalary);
                System.out.println("Cập nhật thông tin lương thành công");
                return;
            }
            System.out.println("Không tìm thấy nhân viên");
        }
    }
    public void findSalaryByName(String name) {
        Double salary = salaryMap.get(name);
        if(salary != null) {
            System.out.println("Đã tìm thấy nhân viên: " + name + " salary: " + salary);
        }else {
            System.out.println("Không tìm thấy nhân viên với với tên: " + name);
        }
    }
    public void addDepartment(String department) {
        if(departments.add(department)) {
            System.out.println("Thêm phòng ban thành công");
        }else {
            System.out.println("Thêm phòng ban không thành công");
        }
    }
    public void displayAllDepartments() {
        for (String department : departments) {
            System.out.println(department);
        }
    }
    public void sortEmployeesBySalary() {
        danhsachnhanvien.sort((o1,o2) -> Double.compare(o2.getSalary(), o1.getSalary()));
        System.out.println("danh sách nhan viên sau khi được xáp xếp");
        displayDanhSachNhanVien();
    }
    public void findEmployeeByName(String name) {
        for (Employee employee : danhsachnhanvien) {
            if (employee.getName().equals(name)) {
                System.out.println("Đã thìm thấy nhân viên với tên: " + name);
                employee.displayInfo();
                return;
            }
        }
        System.out.println("không tìm thấy nhên viên");
    }




}
