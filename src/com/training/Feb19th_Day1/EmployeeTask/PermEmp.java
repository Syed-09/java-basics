package com.training.Feb19th_Day1.EmployeeTask;

public class PermEmp implements Employee {

    private final int hoursWorked;

    public PermEmp(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    @Override
    public int getSalary() {
        int baseSalary = 2000;
        return baseSalary + hoursWorked*40;
    }

    @Override
    public String getEmpInfo() {
        return null;
    }
}
