package com.test3;

/**
 * Created by vikas.e.mishra on 3/22/2017.
 */
public class Foo {
    private int a = 5;
    protected int b = 6;
    public int c = 7;
    private int d = 8;

    protected int getB() {
        return b;
    }

    /*public int getA() {
        return a;
    }*/
    public void setA(int a) {
        this.a = a;
    }
}