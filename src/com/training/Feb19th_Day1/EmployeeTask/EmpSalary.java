package com.training.Feb19th_Day1.EmployeeTask;

public class EmpSalary {
    public static void main(String[] args)
    {
        EmpFactory empFactory = new EmpFactory();
        Employee emp = empFactory.getEmployee("permanent", 20);
        System.out.println(emp.getSalary());
    }
}