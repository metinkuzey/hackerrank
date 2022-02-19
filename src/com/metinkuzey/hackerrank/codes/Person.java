package com.metinkuzey.hackerrank.codes;

public class Person {
    String firstName;
    String lastName;
    int idNumber;
    public Person(String firstName, String lastName, int id) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=id;
    }
    void printPerson(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Id: " + idNumber);
    }
}
