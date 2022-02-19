package com.metinkuzey.hackerrank.codes;

import java.util.Scanner;

class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
    }

    public char calculate() {
        int sum = 0, a = 0;
        for (int i = 0; i < testScores.length; i++) {
            a = a + testScores[i];
        }
        a = a / testScores.length;
        if (90 <= a && a <= 100) {
            return 'O';
        } else if (80 <= a && a < 90) {
            return 'E';
        } else if (70 <= a && a < 80) {
            return 'A';
        } else if (55 <= a && a < 70) {
            return 'P';
        } else if (40 <= a && a < 55) {
            return 'D';
        } else if (0 <= a && a < 40) {
            return 'T';
        } else
            return Character.MIN_VALUE;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        /**
         * You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.
         * Complete the Student class by writing the following:
         * A Student class constructor, which has  parameters:
         * A string, firstNane.
         * A string, lastName.
         * An integer, idNumer.
         * An integer array (or vector) of test scores, .
         * A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
         * Letter - Average
         *   O     90<=a<=100
         *   E     80<=a<90
         *   A     70<=a<80
         *   P     55<=a<70
         *   D     40<=a<55
         *   T        a< 40
         * **/
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

