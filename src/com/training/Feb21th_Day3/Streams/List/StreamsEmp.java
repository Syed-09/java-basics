package com.training.Feb21th_Day3.Streams.List;

public class StreamsEmp {

    private int empid;
    private String empName;
    private int empSalary;
    public StreamsEmp(int empid, String empName, int empSalary) {
        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "StreamsEmp{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
