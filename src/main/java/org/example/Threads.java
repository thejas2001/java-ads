package org.example;

// Running the Threads in Java

import java.io.*;
import java.util.*;

// Method 1 - Thread Class
class ThreadImpl extends Thread
{
    // Method to start Thread
    @Override
    public void run()
    {
        String str = "Thread Class Implementation Thread"
                + " is Running Successfully";
        System.out.println(str);
    }
}

// Method 2 - Runnable Interface
class RunnableThread implements Runnable
{
    // Method to start Thread
    @Override
    public void run()
    {
        String str = "Runnable Interface Implementation Thread"
                + " is Running Successfully";
        System.out.println(str);
    }

}

public class Threads
{
    public static void main(String[] args)
    {
        // Method 1 - Thread Class
        ThreadImpl t1 = new ThreadImpl();
        t1.start();

        // Method 2 - Runnable Interface
        RunnableThread g2 = new RunnableThread();
        Thread t2 = new Thread(g2);
        t2.start();

        // Wait for both threads to finish before printing the final result
        try {
            // Ensures t1 finishes before proceeding
            t1.join();
            // Ensures t2 finishes before proceeding
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
