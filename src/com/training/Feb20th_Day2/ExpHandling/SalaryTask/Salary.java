package com.training.Feb20th_Day2.ExpHandling.SalaryTask;

public class Salary {

    private String name;
    private int salary;
    public Salary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getDetails(String Name, int salary) {
        System.out.println("Your details are");
        System.out.println(name +":"+salary);
    }

}

