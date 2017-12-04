package com.softserve.academy;

public abstract class Employee implements Person {
    protected String employeeld;
    protected int hours;
    protected double averageMontlySalary;

    public Employee(String employeeld, int hours) {
        this.employeeld = employeeld;
        this.hours = hours;
    }

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getAverageMontlySalary() {
        return averageMontlySalary;
    }
}
