package com.metinkuzey.hackerrank.codes;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

class Result {
    public static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO)==0)
            return BigInteger.ONE;
        else
            return(n.multiply(factorial(n.subtract(BigInteger.ONE))));
    }
}

public class Recursion {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger result = Result.factorial(n);
        System.out.println(n+"! = " + result );

    }
}