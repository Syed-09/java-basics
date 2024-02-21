package com.training.Feb21th_Day3.Streams.Map;

import java.util.*;

public class StreamsDemo {
    public static void main(String... args) {
        List<Integer> numList = Arrays.asList(19,13,17,15,16,14,18,12);
         ////Streams Intro
         //numList will not be altered with any operation
//        //Oneliner
//        numList.stream().filter(n->n%2 == 0).map(x->x*x).sorted().forEach(t-> System.out.println(t));
//        //Else, we would have used multiple sections in code for each operation

//        //Collect and Collectors
//        List<Integer> evenSqrList = new ArrayList<>();
//        numList.stream().filter(n->n%2 == 0).map(x->x*x).sorted().forEach(t-> evenSqrList.add(t));
//        System.out.println(evenSqrList);
//        //Other form to store Values
//        evenSqrList = numList.stream().filter(n->n%2 == 0).map(x->x*x).sorted().collect(Collectors.toList()));

//Integer var = list.stream().max(Integer::compare).get();
    }
}
