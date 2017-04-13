package com.test2;

/**
 * Created by vikas.e.mishra on 3/23/2017.
 */
public class TestString {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("s1.hashCode() -> "+s1.hashCode());
        System.out.println("s2.hashCode() -> "+s2.hashCode());
        System.out.println("s1.hashcode()==s2.hashcode() -> "+(s1.hashCode() == s2.hashCode()));
        System.out.println("s1 == s2 -> "+(s1==s2));
        System.out.println("s1.equals(s2) ->" +s1.equals(s2));
    }
}
