package com.softserve.academy;

public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;

    public SalariedEmployee(String employeeld, int hours, String socialSecurityNumber) {
        super(employeeld, hours);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double calculatePay(){
        averageMontlySalary = rateHorly * hours;
        return averageMontlySalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
