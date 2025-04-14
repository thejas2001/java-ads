package javaTry;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class leetConcurrency {
    public static void main(String[] args) throws InterruptedException {
    }
}
class Foo {
    private final Semaphore sh=new Semaphore(0);

    public Foo()  {
        try{
            Semaphore s=new Semaphore(1);
            s.acquire();
            first(()->{
                System.out.println("first");
            });
            s.release();
            s.acquire();
            second(()->{
                System.out.println("second");
            });
            s.release();
            s.acquire();
            third(()->{
                System.out.println("third");
            });
            s.release();
        }catch(Exception e){

        }
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}