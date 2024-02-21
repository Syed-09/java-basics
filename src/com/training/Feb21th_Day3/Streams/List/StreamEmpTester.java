package com.training.Feb21th_Day3.Streams.List;

public class StreamEmpTester {

    public static void main(String... args){
        //Get employee details based on nth max salary
        EmpList empList = new EmpList();
        StreamsEmp emp1 = new StreamsEmp(1,"Syed1", 20000);
        empList.addEmp(emp1);
        StreamsEmp emp2 = new StreamsEmp(2,"Syed2", 25000);
        empList.addEmp(emp2);
        StreamsEmp emp3 = new StreamsEmp(3,"Syed3", 23000);
        empList.addEmp(emp3);
        StreamsEmp emp4 = new StreamsEmp(4,"Syed4", 40000);
        empList.addEmp(emp4);
        
        System.out.println(empList.getEmployeeByNthMaxSalary(1));
    }
}
