package com.sotfserve.academy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Employee[] array = new Employee[7];

        array[0] = new Employee(Department.IT, "Ivan", 320);
        array[1] = new Employee(Department.CONSTRUCTION, "Petro", 400);
        array[2] = new Employee(Department.HR, "Iryna", 240);
        array[3] = new Employee(Department.SALES, "Bohdan", 620);
        array[4] = new Employee(Department.SALES, "Roman", 520);
        array[5] = new Employee(Department.SALES, "Ihor", 480);
        array[6] = new Employee(Department.IT, "Stepan", 430);

        String department = new Scanner(System.in).nextLine();

//        System.out.println(array[0].getDepartment().toString());
//        System.out.println(department);

        for (int i = 0; i < array.length; i++) {
            if (array[i].getDepartment().toString().equals(department)) {
                System.out.println("Employee " + array[i].getName() + " work in " + array[i].getDepartment() + " department");
//            }else {
//              System.out.println("1");
            }
        }
        // Sorting
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].getName());
        }

        /*Employee arrayTmp = new Employee();
        for (int i =0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i].getSalary() > array[j].getSalary()){
                    arrayTmp = array[i];
                    array[j] = arrayTmp;
                    System.out.println(array[j].getName() + array[j].getDepartment() + array[j].getSalary());
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].getName());
        }*/

    }
}
