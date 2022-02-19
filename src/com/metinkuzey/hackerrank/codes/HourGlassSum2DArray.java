package com.metinkuzey.hackerrank.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HourGlassSum2DArray {
    public static void main(String[] args) throws IOException {
        /**
         * Input 2D array
         * 1 1 1 0 0 0
         * 0 1 0 0 0 0
         * 1 1 1 0 0 0
         * 0 0 2 4 4 0
         * 0 0 0 2 0 0
         * 0 0 1 2 4 0
         *
         * Hourglass Sum Processes
         * 1 1 1   1 1 0   1 0 0   0 0 0
         *   1       0       0       0
         * 1 1 1   1 1 0   1 0 0   0 0 0
         *
         * 0 1 0   1 0 0   0 0 0   0 0 0
         *   1       1       0       0
         * 0 0 2   0 2 4   2 4 4   4 4 0
         *
         * 1 1 1   1 1 0   1 0 0   0 0 0
         *   0       2       4       4
         * 0 0 0   0 0 2   0 2 0   2 0 0
         *
         * 0 0 2   0 2 4   2 4 4   4 4 0
         *   0       0       2       0
         * 0 0 1   0 1 2   1 2 4   2 4 0
         * Result : 19
         * **/
        List<List<Integer>> arr = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int max = Integer.MIN_VALUE,temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) +
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if (temp > max){
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
