package com.training.Feb21th_Day3.Streams.List;

import java.util.*;

public class EmpList {
    List<StreamsEmp> empList = new ArrayList<>();

    public StreamsEmp getEmployeeByNthMaxSalary(int n){
        //StreamsEmp emp1 = empList.stream().max(Comparator.comparingInt(StreamsEmp::getEmpSalary)).get();
        empList.stream().sorted(Comparator.comparingInt(StreamsEmp::getEmpSalary));
        //return emp1;
        return empList.get(empList.size() - n);
    }

    public void addEmp(StreamsEmp emp){
        empList.add(emp);
    }
}
