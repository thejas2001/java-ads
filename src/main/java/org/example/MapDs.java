package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapDs {
    public static void main(String[] args) {
        Map<Integer,Person> map=new HashMap<>();
        Map<Integer,Map<String,Double>> studentMarks=new HashMap<>();
        Map<Integer,Map<String,Double>> studentMarks2=new HashMap<>();
        Map<String,Double> innerMap=new HashMap<>();

        innerMap.put("maths",12.0);
        innerMap.put("science",20.0);
        //Imp reference to org map
        studentMarks.put(1,new HashMap<>(innerMap));
        innerMap.clear();
        innerMap.put("maths",15.0);
        innerMap.put("science",28.0);
        studentMarks.put(2,new HashMap<>(innerMap));

        Map<String,Double> innerMap2=studentMarks2.get(1);
        if(innerMap==null) {
            innerMap2=new HashMap<>();
            studentMarks2.put(1,innerMap2);
        }
        innerMap.put("maths", 12.0);
        innerMap.put("science", 20.0);
        Map<String,Double> innerMap3=studentMarks2.get(2);
        if(innerMap3==null){
            innerMap3=new HashMap<>();
            studentMarks2.put(2,innerMap3);
        }
        innerMap3.put("maths",15.0);
        innerMap3.put("science",28.0);
        studentMarks.forEach((x,y)-> System.out.println(x+" "+y));
        studentMarks.entrySet().stream().flatMap(x->x.getValue().values().stream()).forEach(System.out::println);
        map.put(1,new Person("thejas"));
        map.put(2,new Person("anjaley"));
        map.entrySet().forEach(x-> System.out.println( x.getKey()+ " "+x.getValue()));
        map.forEach((i,j)-> System.out.println(i+" "+j));

        studentMarks2.forEach((x,y)-> System.out.println(x+" "+y));

        Map<Integer,String> comMap=new HashMap<>();
        comMap.computeIfAbsent(1,k->k.toString()+" here is key");
        comMap.computeIfPresent(1,(k,j)->j.toString()+" here is key");
        comMap.forEach((x,y)-> System.out.println(x+" "+y));
        System.out.println(comMap.get(2));
        System.out.println(comMap.getOrDefault(3,"default"));
        System.out.println(studentMarks2.values());
        System.out.println(studentMarks2.keySet());


    }
    record Person(String name){}
}
