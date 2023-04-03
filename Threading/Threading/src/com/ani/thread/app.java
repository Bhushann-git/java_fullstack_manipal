package com.ani.thread;

import com.ani.thread.Sync.GrammerChecker;
import com.ani.thread.Sync.ImpData;
import com.ani.thread.Sync.SpellingChecker;
import com.ani.thread.basic.ExcelReaderTask;
import com.ani.thread.basic.ThreadOne;
import com.ani.thread.basic.ThreadTwo;

public class app {

    public static void demo1() {
        ThreadOne to = new ThreadOne();
        to.start();

        Runnable task1 = new ThreadTwo();
        Thread t1 = new Thread(task1);
        t1.start();

        Runnable task2 = new ExcelReaderTask();
        Thread t2 = new Thread(task2);
        t2.start();
    }

    public static void demo2() {

        ImpData dt = new ImpData();

        Runnable task1 = new SpellingChecker(dt);
        Thread t1 = new Thread(task1);
      
        Runnable task2 = new GrammerChecker(dt);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
           System.out.println("There is a problem");
        }

        dt.currentCount();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 Threading 🔥");
        demo2();
    }
}