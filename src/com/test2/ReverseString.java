package com.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vikas.e.mishra on 1/10/2017.
 */
public class ReverseString {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "Hello World";

        char[] chararray = input.toCharArray();
        System.out.println("Main "+ chararray.toString());
        char[] chararrayReverse = new char[input.length()];
        String reverse ="";
        for(int i =chararray.length-1; i>=0; i--){
            reverse = reverse + chararray[i];
        }
        System.out.println("Main "+ chararray);
        System.out.println("reverse "+ chararrayReverse);

        System.out.println("Input -> "+ input);
        System.out.println("reverse -> "+ reverse);

        String s3 = new String();
        //s3 = "Vikas";
        System.out.println("Hello "+s3);

    }
}
