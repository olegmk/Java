package com.softserve.academy;

import java.lang.reflect.Type;

public class ContractEmployee extends Employee {

    private String federalTaxIdmember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeld, String federalTaxIdmember, double fixedMonthlyPayment) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public double calculatePay(){
        averageMontlySalary = fixedMonthlyPayment;
        return averageMontlySalary;
    }

}
