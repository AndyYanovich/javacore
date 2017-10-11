package com.kitcenter.app.homework.lesson11;

public class WhiteCollar extends Human {
    private String company;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public boolean setCompany(String company) {
        if (company.matches("[A-Za-z-\\s,]+")) {
            this.company = company;
            return true;
        } else {
            return false;
        }
    }
}