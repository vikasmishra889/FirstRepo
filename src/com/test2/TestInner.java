package com.test2;

/**
 * Created by vikas.e.mishra on 3/15/2017.
 */
public class TestInner {

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1();
        inner1.print();
    }
}
class Outer1{
    private String s1 = "hello";
    class Inner1{
        public void print(){
            System.out.println("This is Inner Class 1-> "+s1);
        }
    }

    class Inner2{
        public void print(){
            System.out.println("This is Inner Class 2-> "+s1);
        }
    }
}