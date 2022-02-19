package com.metinkuzey.hackerrank.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryAndMap {
    public static void main(String[] args) {
        /**
         * We try to find the phone information from our phone book.
         * We create our phone book with user input ,and then we check the phone book for our searching phone information.
         * **/
        Map<String,String> phoneBook = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            String result = phoneBook.get(s);
            if(result==null)
            {
                System.out.println("Not found");
            }else
                System.out.println(s+"="+result);
        }
        in.close();
    }
}
