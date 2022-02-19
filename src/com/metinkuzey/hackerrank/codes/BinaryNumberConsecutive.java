package com.metinkuzey.hackerrank.codes;

import java.util.Scanner;

public class BinaryNumberConsecutive {
    public static void main(String[] args) {
        //Find the maximum number of consecutive 1's of the binary number
        /**
         * Sample 5  --> 101   > Result is 1
         * Sample 13 --> 1101  > Result is 2
         * Sample 19 --> 10011 > Result is 2
         * Sample 29 --> 11101 > Result is 3
        **/

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int consecutiveOf1s=0;
        String strBinary = Integer.toString(n, 2);
        // above is binary of given in string
        String[] strparts = strBinary.split("0");
        //above we get all strings of ones, below find max from them
        for(int i=0;i<strparts.length;i++ ){
            if (consecutiveOf1s < strparts[i].length()) {consecutiveOf1s = strparts[i].length();}
        }
        System.out.println(consecutiveOf1s);  //result
    }
}
