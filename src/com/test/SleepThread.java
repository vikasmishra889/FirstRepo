package com.test;

/**
 * Created by vikas.e.mishra on 1/5/2017.
 */
public class SleepThread {

    public static void main(String[] args) throws InterruptedException {

        long l = System.currentTimeMillis();
        System.out.println("Current Time is -> "+l);
        Thread.sleep(2000);
        System.out.println("Time after sleep -> "+(System.currentTimeMillis()-l ));

//        long start = System.currentTimeMillis();
//        Thread.sleep(2000);
//        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));

    }
}
