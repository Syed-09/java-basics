package com.training.Feb21th_Day3.Streams.Map;

import java.util.*;

public class EmpList2 {
    HashMap<String,Integer> empList2 = new HashMap();

//    public StreamsEmp getEmployeeByMaxSalary(){
//        empList2.entrySet().stream().sorted(Comparator.comparing(entry --> entry.getValue()));
//        return emp1;
//    }

    public void addEmp(String name, int sal){
        empList2.put(name,sal);
    }


}