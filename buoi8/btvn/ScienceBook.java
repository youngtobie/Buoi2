package vn.com.t3h.buoi8.btvn;

import java.util.Scanner;

public class ScienceBook extends Book{

    private String researchSubject;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Subject: " + this.researchSubject);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập researchSubject: ");
        this.researchSubject = new Scanner(System.in).nextLine();
    }

    public String getResearchSubject() {
        return researchSubject;
    }

    public void setResearchSubject(String researchSubject) {
        this.researchSubject = researchSubject;
    }
}
