package com.test2;

import java.util.StringTokenizer;

/**
 * Created by vikas.e.mishra on 1/13/2017.
 */
public class CurlyBraces {

    public static void main(String[] args) {
        String input = "{{{{}}{{{{}{{{}}}{{}}}}}";
        System.out.println("input = "+input);
//        StringTokenizer st = new StringTokenizer(input,"");
//        while (st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
        char prev = '{';
        char inputArray[] = input.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<inputArray.length;i++){
            //System.out.println(inputArray[i]);
            if(String.valueOf(inputArray[i]).equalsIgnoreCase("{")){
                sb.append(inputArray[i]);
                //sb.append("}");
            }else if(String.valueOf(inputArray[i]).equalsIgnoreCase("}")){
                sb.append("{");
            }
            prev = inputArray[i];
        }
        System.out.println("Output = "+sb.toString());


    }

}
