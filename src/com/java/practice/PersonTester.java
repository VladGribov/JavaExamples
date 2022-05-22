package com.java.practice;

public class PersonTester {
    public static void main(String[] args) {
        Person p0 = new Person();
        Person p1 = new Person("Bob", 25);
        Person p2 = new Person("Joe", 50, "9847238576");

        p0.setName("Will");
        p0.setAge(100);
        p0.setPhoneNumber("7777777777");

        p1.setPhoneNumber("1234567890");


        System.out.println(p0.getName() + " is "+ p0.getAge() + " years old and his phone number is: " + p0.getPhoneNumber());
        System.out.println(p1.getName() + " is "+ p1.getAge() + " years old and his phone number is: " + p1.getPhoneNumber());
        System.out.println(p2.getName() + " is "+ p2.getAge() + " years old and his phone number is: " + p2.getPhoneNumber());


    }
}
