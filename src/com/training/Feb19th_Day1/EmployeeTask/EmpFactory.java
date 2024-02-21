package com.training.Feb19th_Day1.EmployeeTask;

public class EmpFactory {
    public Employee getEmployee(String empType, int hours){
        if (empType.equalsIgnoreCase("Temporary")){
            return new TempEmp(hours);
        }
        return new PermEmp(hours);
    }
}
