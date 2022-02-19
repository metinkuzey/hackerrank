package com.metinkuzey.hackerrank.codes;

import java.util.Scanner;

public class StringProcess {
    public static void main(String[] args) {
        /*************************************
         Problem: Take string and return new generated strings,
                  These string generated with odd and even indexes of main string
         Sample Input
         2
         Hacker
         Rank

         Sample Output
         Hce akr
         Rn ak
        ************************************/
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String str;

        for (int i = 0; i < T; i++) {
            str = scan.next();

            for (int j = 0; j < str.length(); j++) {

                if (j % 2 == 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(str.charAt(j));
                }

            }
            System.out.println();
        }
    }
}
