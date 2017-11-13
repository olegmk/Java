package com.sotfserve.academy;

public class Employee implements Comparable {
    private Department department;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(Department department, String name, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;
        if (this.department == null) {
            if (other.department != null) return false;
        } else if (!this.department.equals(other.department)) return false;
        return true;
    }

    public int compareTo(Object obj)
    {
        Employee tmp = (Employee) obj;
        if(this.salary < tmp.salary)
        {
      /* текущее меньше полученного */
            return -1;
        }
        else if(this.salary > tmp.salary)
        {
      /* текущее больше полученного */
            return 1;
        }
    /* текущее равно полученному */
        return 0;
    }
}



