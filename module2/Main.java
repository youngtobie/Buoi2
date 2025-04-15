package vn.com.t3h.module2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Hệ Thống Quản Lý Công Ty ===");
            System.out.println("1. Hiển thị tất cả nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Cập nhật lương nhân viên");
            System.out.println("4. Tìm lương theo tên nhân viên");
            System.out.println("5. Thêm phòng ban mới");
            System.out.println("6. Hiển thị tất cả phòng ban");
            System.out.println("7. Sắp xếp nhân viên theo lương");
            System.out.println("8. Tìm nhân viên theo tên");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng thừa

            switch (choice) {
                case 1:
                    company.displayDanhSachNhanVien(); // Hiển thị danh sách nhân viên
                    break;

                case 2:
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    System.out.print("Nhập lương: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Có phải là quản lý không? (y/n): ");
                    if (sc.nextLine().equalsIgnoreCase("y")) {
                        System.out.print("Nhập tên phòng ban: ");
                        String dept = sc.nextLine();
                        company.addNewEmployee(new Manager(name, age, salary, dept));
                    } else {
                        company.addNewEmployee(new Employee(name, age, salary));
                    }
                    break;

                case 3:
                    System.out.print("Nhập tên nhân viên: ");
                    name = sc.nextLine();
                    System.out.print("Nhập lương mới: ");
                    salary = sc.nextDouble();
                    company.updateSalary(name, salary);
                    break;

                case 4:
                    System.out.print("Nhập tên nhân viên: ");
                    name = sc.nextLine();
                    company.findSalaryByName(name);
                    break;

                case 5:
                    System.out.print("Nhập tên phòng ban: ");
                    String dept = sc.nextLine();
                    company.addDepartment(dept);
                    break;

                case 6:
                    company.displayAllDepartments();
                    break;

                case 7:
                    company.sortEmployeesBySalary();
                    break;

                case 8:
                    System.out.print("Nhập tên nhân viên: ");
                    name = sc.nextLine();
                    company.findEmployeeByName(name);
                    break;

                case 9:
                    System.out.println("Tạm biệt!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        }
    }
}
