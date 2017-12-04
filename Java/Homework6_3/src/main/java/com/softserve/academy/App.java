package com.softserve.academy;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Employee employeeSalary1 = new SalariedEmployee("Ivan", 120, "2589");
        Employee employeeSalary2 = new SalariedEmployee("Petro", 160, "6987");
        Employee employeeSalary3 = new SalariedEmployee("Stepan", 140, "4589");

        List<Employee> employeeSalaryList = new ArrayList<Employee>();

        employeeSalaryList.add(employeeSalary1);
        employeeSalaryList.add(employeeSalary2);
        employeeSalaryList.add(employeeSalary3);

        Employee employeeContractEmployee1 = new ContractEmployee("Pavlo", "7452", 360);
        Employee employeeContractEmployee2 = new ContractEmployee("Oksana", "2541", 520);
        Employee employeeContractEmployee3 = new ContractEmployee("Ulyan", "8574", 450);

        List<Employee> employeeContractEmployee = new ArrayList<Employee>();

        employeeContractEmployee.add(employeeContractEmployee1);
        employeeContractEmployee.add(employeeContractEmployee2);
        employeeContractEmployee.add(employeeContractEmployee3);

        for (Employee e:employeeSalaryList) {
            System.out.println("Name - " + e.getEmployeeld() + " the average monthly salary " + e.calculatePay());
        }

        System.out.println(SalariedEmployee.rateHorly);

        for (Employee e:employeeContractEmployee) {
            System.out.println(e.getEmployeeld() + e.calculatePay());
        }

        /*List<Double> employee = new ArrayList<Double>();

        for (Employee e:employeeContractEmployee) {
            employee.add(e.getEmployeeld();
        }
*/

    }
}
