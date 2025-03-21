package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.random.RandomGenerator;

public class hashTable {
    public static void main(String[] args) {
        var map=new HashMap<>();
        String type="bike";
        int num=switch(type){
            case "car" ->4;
            case "bike" ->2;
            default -> 0;
        };
        int k=0;
        switch(type){
            case "car" : k=4;
            break;
            case "bike":k=2;
            break;
            default:k=0;
        }
        String multiLine = """
                hello
                woeld""";
        System.out.println(multiLine);
        System.out.println(num);
        System.out.println(k);
        //sealed class for making not extended by non permited class

        //java 17 randomGenerator
        RandomGenerator generator= RandomGenerator.getDefault();
        var num2 =generator.nextInt(10);
        System.out.println(num2);

        Map<Integer, Set<String>> jj= new HashMap<>();
        jj.put(12,Set.of("hi","hello"));
        jj.forEach((_,x)-> System.out.println(x));

    }
    record Person(String name){}
}
