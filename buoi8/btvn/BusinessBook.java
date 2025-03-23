package vn.com.t3h.buoi8.btvn;

import java.util.Scanner;

public class BusinessBook extends Book {

    private String businessField;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("businessField: " + this.businessField);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập businessField: ");
        this.businessField = new Scanner(System.in).nextLine();
    }

    public String getBusinessField() {
        return businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }
}
