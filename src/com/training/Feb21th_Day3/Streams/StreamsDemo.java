package com.training.Feb21th_Day3.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.out;

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


//        //flatmap usage
//        List<Integer> numList1 = Arrays.asList(1,2,3);
//        List<Integer> numList2 = Arrays.asList(4,5,6);
//        List<Integer> numList3 = Arrays.asList(7,8,9);
//        List<List<Integer>> allNumsList1= Arrays.asList(numList1,numList2,numList3);
//        System.out.println(allNumsList1);
//
//        List<Integer> allNumsList2 = allNumsList1.stream().flatMap(x->x.stream()).collect(Collectors.toList());
//        System.out.println(allNumsList2);
//        //observe both the outputs

        //IntStream
        IntStream.range(0,5).forEach(out::println);
//
//        int[] intArray = IntStream.of(19,13,17,15,16,14,18,12).toArray();
//        out.println(Arrays.toString(intArray));

//        //Unique Id Generator
//        UUID UniqueId = UUID.randomUUID();
//        out.println("Unique Id :"+UniqueId);


    }
}
