package javaTry;

import java.util.concurrent.Semaphore;

public class LeetFooBarAlternate {
    public static void main(String[] args) throws InterruptedException {
        LeetFooBarAlternate exa = new LeetFooBarAlternate(5);
        exa.foo(()->{
            System.out.println("foo");
        });
        exa.bar(()->{
            System.out.println("bar");
                }
        );
    }
    private int n;
    private final Semaphore s = new Semaphore(1);
    private final Semaphore s1 = new Semaphore(0);


    public LeetFooBarAlternate(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            s.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            s1.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            s1.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            s.release();
        }
    }
}
