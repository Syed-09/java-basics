package com.training.Feb21th_Day3.Streams.Map;

public class StreamsEmp2 {
    private String empName;
    private int empSalary;
    public StreamsEmp2(int empid, String empName, int empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
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
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
