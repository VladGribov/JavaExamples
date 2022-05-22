package com.java.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnimalTester {
    public static void main(String[] args) {
        new Pig().runThread();
        Pig pig = new Pig(0,20,1);
        Dog dog = new Dog(0, 20, 1);
    }
}
