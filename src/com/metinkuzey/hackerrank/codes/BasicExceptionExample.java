package com.metinkuzey.hackerrank.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicExceptionExample {
    //this example show how th throw an exception. We add exception signature to method ,and we use try catch structure
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String S = bufferedReader.readLine();
            int input = Integer.parseInt(S);
            System.out.println(input);
        }catch(NumberFormatException | IOException e){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
