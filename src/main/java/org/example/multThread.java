package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class multThread {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> intList = Collections.synchronizedList(new ArrayList<>());
        Thread th = new Thread(()->{
            for (int i = 0; i < 1000000; i++) {
                intList.add(i);
            }
        });
        Thread th1 = new Thread(()->{
            for (int i = 0; i < 1000000; i++) {
                intList.add(i);
            }
        });
        th1.start();
        th.start();
        System.out.println(intList.size());
        //th.sleep(500);
        th.join();
        th1.join();
        System.out.println(intList.size());
    }
}
