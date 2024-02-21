package com.training.Feb19th_Day1.EmployeeTask;

public class TempEmp implements Employee {
    private final int hoursWorked;

    public TempEmp(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    @Override
    public int getSalary() {
        return hoursWorked*40;
    }

    @Override
    public String getEmpInfo() {
        return null;
    }
}
