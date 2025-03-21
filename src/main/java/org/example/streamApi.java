package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class streamApi {
    public static void main(String[] args) {
        List<List<String>> listOfStrings= Arrays.asList(Arrays.asList("hi","hlo"),
                Arrays.asList("thejas","anjaley"));
        listOfStrings.stream().flatMap(Collection::stream).forEach(System.out::println);

        List<Point> aList=new ArrayList<>();
        aList.add(new Point(10, 20));
        aList.add(new Point(5, 10));
        aList.add(new Point(1, 100));
        aList.add(new Point(50, 2000));
        aList.stream().sorted((p1,p2)->p1.x.compareTo(p2.x)).forEach(System.out::println);
    }

}
class Point
{
    Integer x, y;
    Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return this.x + ", "+ this.y;
    }
}

