package com.training.Feb21th_Day3;

import java.util.*;

public class CollectionDemo {
    public static void main(String... args){
        Set<Student> studSet = new TreeSet<Student>();
        studSet.add(new Student(101, "David", 21,'A' ));
        studSet.add(new Student(102, "Rafiel", 22,'B' ));
        studSet.add(new Student(103, "Joe", 23,'A' ));
        studSet.add(new Student(101, "Mitchell", 24,'C' ));

        //Collections.sort(studSet);

//Using Iterator
//        Iterator it = studSet.iterator();
//
//        while(it.hasNext()){
//            //if you want to store the value, you cannot it.next() gives an object
//
//            System.out.println(it.next());
//            //it will not display in the same order
//        }

    }
}
