package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public Person(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public String getFullName() {
        return firstName.concat(" " + lastName);
    }

    public void setchangeAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}


